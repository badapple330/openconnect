package com.internousdev.bulletinboard.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.bulletinboard.dto.MessageDTO;
import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * チャット取得、格納に関するクラス
 * @author Ryo Maeda
 * @since 2017/06/05
 * @version 1.0
 *
 */
public class ChatDAO {
	public ArrayList<MessageDTO> selectChat(int senderId, int receiverId, int groupId) throws SQLException {
		ArrayList<MessageDTO> chat = new ArrayList<MessageDTO>();
		boolean isGroupChat; /* グループチャットかどうか */
		if (groupId != 0) {
			isGroupChat = true;
		} else if (receiverId != 0) {
			isGroupChat = false;
		} else {
			return null;
		}

		String sql1 = "";
		PreparedStatement ps1;
		String sql2 = "";
		PreparedStatement ps2;

		try (Connection con = new MySqlConnector("openconnect").getConnection();) {
			if (isGroupChat) {
				sql1 = ""
						+"SELECT m.*, user_name, user_icon, stamp, coalesce(is_read, 0) AS is_read from ( "
						+	"SELECT message_id, receiver_id, sender_id, group_id, text, stamp_id, created_at "
						+	"FROM messages WHERE group_id = ? "
						+") AS m "
						+"LEFT JOIN ( "
						+	"SELECT stamp_id, stamp FROM stamps WHERE stamp_id IN ( "
						+		"SELECT stamp_id FROM messages WHERE group_id = ? "
						+	") "
						+") AS s "
						+"ON m.stamp_id = s.stamp_id "
						+"INNER JOIN ( "
						+	"SELECT user_id, user_name, user_icon FROM users WHERE user_id IN ( "
						+		"SELECT sender_id FROM messages WHERE group_id = ? "
						+	") "
						+") AS u "
						+"ON u.user_id = m.sender_id "
						+"LEFT JOIN ( "
						+	"SELECT *, true AS is_read FROM read_flg WHERE user_id = ? "
						+") AS r "
						+"ON m.message_id = r.message_id "
						+"ORDER BY message_id ASC; ";
				ps1 = con.prepareStatement(sql1);
				ps1.setInt(1, groupId);
				ps1.setInt(2, groupId);
				ps1.setInt(3, groupId);
				ps1.setInt(4, senderId);
			} else {
				sql1 = ""
						+"SELECT m.*, user_name, user_icon, stamp, coalesce(is_read, 0) AS is_read FROM ( "
						+	"SELECT message_id, receiver_id, sender_id, group_id, text, stamp_id, created_at FROM messages "
						+	"WHERE receiver_id = ? AND sender_id = ? "
						+	"UNION "
						+	"SELECT message_id, receiver_id, sender_id, group_id, text, stamp_id, created_at FROM messages "
						+	"WHERE receiver_id = ? AND sender_id = ? "
						+") AS m "
						+"LEFT JOIN ( "
						+	"SELECT stamp_id, stamp FROM stamps WHERE stamp_id IN ( "
						+		"SELECT stamp_id FROM messages WHERE receiver_id = ? AND sender_id = ? "
						+		"UNION "
						+		"SELECT stamp_id FROM messages WHERE receiver_id = ? AND sender_id = ? "
						+	") "
						+") AS s "
						+"ON m.stamp_id = s.stamp_id "
						+"INNER JOIN ( "
						+	"SELECT user_id, user_name, user_icon FROM users WHERE user_id = ? OR user_id = ? "
						+") AS u "
						+"ON u.user_id = m.sender_id "
						+"LEFT JOIN ( "
						+	"SELECT *, true AS is_read FROM read_flg WHERE user_id = ? "
						+") AS r "
						+"ON m.message_id = r.message_id "
						+"ORDER BY message_id ASC; ";

				ps1 = con.prepareStatement(sql1);
				ps1.setInt(1, senderId);
				ps1.setInt(2, receiverId);
				ps1.setInt(3, receiverId);
				ps1.setInt(4, senderId);
				ps1.setInt(5, senderId);
				ps1.setInt(6, receiverId);
				ps1.setInt(7, receiverId);
				ps1.setInt(8, senderId);
				ps1.setInt(9, senderId);
				ps1.setInt(10, receiverId);
				ps1.setInt(11, senderId);
			}
			ResultSet rs = ps1.executeQuery();

			while (rs.next()) {
				MessageDTO dto = new MessageDTO();
				dto.setMessageId(rs.getInt("message_id")); //投稿ID
				dto.setReceiverId(rs.getInt("receiver_id")); //受取人ID
				dto.setSenderId(rs.getInt("sender_id")); //送信者ID
				dto.setGroupId(rs.getInt("group_id"));
				dto.setSenderName(rs.getString("user_name"));//送信者名
				dto.setSenderImg(rs.getString("user_icon"));//送信者画像
				dto.setText(rs.getString("text")); //送信内容
				dto.setStampId(rs.getInt("stamp_id")); //スタンプID
				dto.setStamp(rs.getString("stamp")); //スタンプ
				if ((dto.getStamp()) == null) {
					dto.setStamp("");
				}
				dto.setCreatedAt(rs.getTimestamp("created_at")); //投稿日時
				dto.setIsRead(rs.getBoolean("is_read"));//既読情報
				chat.add(dto);
			}

			if (isGroupChat) {
				sql2 = ""
						+"INSERT INTO read_flg "
						+"SELECT m.* FROM ( "
						+	"SELECT message_id, ? AS user_id FROM messages WHERE group_id = ? "
						+") AS m "
						+"LEFT JOIN ( "
						+	"SELECT message_id FROM read_flg WHERE user_id = ? "
						+") AS r "
						+"ON m.message_id = r.message_id "
						+"WHERE r.message_id IS NULL; ";
				ps2 = con.prepareStatement(sql2);
				ps2.setInt(1, senderId);
				ps2.setInt(2, groupId);
				ps2.setInt(3, senderId);
			} else {
				sql2 = ""
						+"INSERT INTO read_flg "
						+"SELECT m.* FROM( "
						+	"SELECT message_id, ? AS user_id FROM messages "
						+	"WHERE sender_id = ? AND receiver_id = ? "
						+") AS m "
						+"LEFT JOIN ( "
						+	"SELECT message_id FROM read_flg WHERE user_id = ? "
						+") AS r "
						+"ON m.message_id = r.message_id "
						+"WHERE r.message_id IS NULL; ";
				ps2 = con.prepareStatement(sql2);
				ps2.setInt(1, senderId);
				ps2.setInt(2, receiverId);
				ps2.setInt(3, senderId);
				ps2.setInt(4, senderId);
			}
			ps2.executeUpdate();
		} catch (SQLException e) {
			throw e;
		}
		return chat;
	}

	public boolean insertMessage(int senderId, int receiverId, int groupId, String text, int stampId) throws SQLException {
		boolean isGroup = false;
		String sql = "";

		if (groupId != 0) {
			sql = "insert into messages (sender_id, group_id, text, stamp_id) values (?, ?, ?, ?)";
			isGroup = true;
		} else if (receiverId != 0) {
			sql = "insert into messages (sender_id, receiver_id, text, stamp_id) values (?, ?, ?, ?) ";
			isGroup = false;
		}

		try (Connection con = new MySqlConnector("openconnect").getConnection();) {
			PreparedStatement ps = con.prepareStatement(sql);

			if (isGroup) {
				ps.setInt(1, senderId);
				ps.setInt(2, groupId);
				ps.setString(3, text);
				ps.setInt(4, stampId);
			} else if(!isGroup) {
				ps.setInt(1, senderId);
				ps.setInt(2, receiverId);
				ps.setString(3, text);
				ps.setInt(4, stampId);
			}
			if (ps.executeUpdate() > 0) {
				return true;
			}
		} catch (SQLException e) {
			throw e;
		}
		return false;
	}
}
