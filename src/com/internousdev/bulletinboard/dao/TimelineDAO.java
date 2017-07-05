package com.internousdev.bulletinboard.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.bulletinboard.dto.TimelineDTO;
import com.internousdev.util.DBConnector;
import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * タイムライン取得、格納に関するクラス
 * 
 * @author Ryo Maeda
 * @since 2017/06/05
 * @version 1.0
 *
 */
public class TimelineDAO {

	int userId;

	/**
	 * タイムラインに必要な情報を取得する
	 * 
	 * @param userId
	 */
	public TimelineDAO(int userId) {
		this.userId = userId;
	}

	/**
	 * タイムライン情報をリスト化する
	 * 
	 * @param userId
	 * @return
	 */
	public ArrayList<TimelineDTO> TimelineGet() {
		Connection con = new MySqlConnector("openconnect").getConnection();
		ArrayList<TimelineDTO> tlList = new ArrayList<TimelineDTO>();
		int senderId;

		String sql = "select done from follow where do = ?";
		String sql2 = "select * from send_timeline join users on send_timeline.sender_id = users.user_id where sender_id=? order by timeline_id desc";
		String sql3 = "select * from send_timeline join users on send_timeline.sender_id = users.user_id where timeline_id = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, userId);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				senderId = rs.getInt("done"); // フォローしてる人のID

				PreparedStatement ps2 = con.prepareStatement(sql2);
				ps2.setInt(1, senderId);
				GoodDAO good = new GoodDAO();
				ResultSet rs2 = ps2.executeQuery();
				while (rs2.next()) {
					TimelineDTO dto = new TimelineDTO();
					dto.setTimelineId(rs2.getInt("timeline_id")); // タイムラインID
					dto.setSenderId(rs2.getInt("sender_id")); // 送信者ID
					dto.setSendContents(rs2.getString("send_contents")); // 送信内容
					dto.setImg(rs2.getString("img")); // 添付画像
					dto.setSendAt(rs2.getString("send_at"));// 送信日時
					dto.setUserName(rs2.getString("user_name")); // 名前
					dto.setUserImg(rs2.getString("user_img")); // 写真
					dto.setPoint(rs2.getInt("good")); // ポイント
					dto.setGoodFlg(good.isGood(userId, rs2.getInt("timeline_id")));// グッドふらぐ
					dto.setReTimelineId(rs2.getInt("re_timeline_id")); // 返信先のタイムラインID
					if (dto.getReTimelineId() != 0) {
						PreparedStatement ps3 = con.prepareStatement(sql3);
						ps3.setInt(1, dto.getReTimelineId());
						ResultSet rs3 = ps3.executeQuery();
						while (rs3.next()) {
							dto.setReUserId(rs3.getInt("user_id")); // 返信先のユーザーID
							dto.setReUserName(rs3.getString("user_name")); // 返信先のユーザー名
							dto.setReSendContents(rs3.getString("send_contents")); // 返信先の送信内容
							dto.setReSendAt(rs3.getString("send_at")); // 返信先の送信日時
							dto.setReImg(rs3.getString("user_img"));
						}
					}
					tlList.add(dto);
				}
			}
			PreparedStatement ps2 = con.prepareStatement(sql2);
			ps2.setInt(1, userId);
			GoodDAO good = new GoodDAO();
			ResultSet rs2 = ps2.executeQuery();
			while (rs2.next()) {
				TimelineDTO dto = new TimelineDTO();
				dto.setTimelineId(rs2.getInt("timeline_id")); // タイムラインID
				dto.setSenderId(rs2.getInt("sender_id")); // 送信者ID
				dto.setSendContents(rs2.getString("send_contents")); // 送信内容
				dto.setImg(rs2.getString("img")); // 添付画像
				dto.setSendAt(rs2.getString("send_at"));// 送信日時
				dto.setUserName(rs2.getString("user_name")); // 名前
				dto.setUserImg(rs2.getString("user_img")); // 写真
				dto.setPoint(rs2.getInt("good")); // ポイント
				dto.setGoodFlg(good.isGood(userId, rs2.getInt("timeline_id")));// グッドふらぐ
				dto.setReTimelineId(rs2.getInt("re_timeline_id")); // 返信先のタイムラインID
				if (dto.getReTimelineId() != 0) {
					PreparedStatement ps3 = con.prepareStatement(sql3);
					ps3.setInt(1, dto.getReTimelineId());
					ResultSet rs3 = ps3.executeQuery();
					while (rs3.next()) {
						dto.setReUserId(rs3.getInt("user_id")); // 返信先のユーザーID
						dto.setReUserName(rs3.getString("user_name")); // 返信先のユーザー名
						dto.setReSendContents(rs3.getString("send_contents")); // 返信先の送信内容
						dto.setReSendAt(rs3.getString("send_at")); // 返信先の送信日時
						dto.setReImg(rs3.getString("user_img"));
					}
				}

				tlList.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return tlList;
	}

	/**
	 * 投稿する情報をタイムライン投稿情報テーブルにインサートするメソッド
	 * 
	 * @param userId
	 * @param sendContents
	 * @param img
	 * @return
	 */
	public int timelineSend(String sendContents, int reTimelineId) {
		int inserted = 0;

		Connection con = new MySqlConnector("openconnect").getConnection();
		String sql = "insert into send_timeline (sender_id, send_contents, re_timeline_id) values (?,?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, userId);
			ps.setString(2, sendContents);
			ps.setInt(3, reTimelineId);

			inserted = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return inserted;
	}

	/**
	 * 投稿するとポイントが50加算するメソッド
	 * 
	 * @param userId
	 * @param
	 */
	public int pointPlus(int userId) {
		int senderId = 0;

		LvDAO Lv = new LvDAO();

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");
		Connection con = db.getConnection();
		int inserted = 0;

		String sql = "update users set point = point+20 where user_id = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, userId);
			inserted = ps.executeUpdate();

			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		// 経験値が1000以上だった場合にレベルUP
		senderId = userId;
		Lv.Lv_up(senderId);
		return inserted;

	}

	/**
	 * タイムラインの投稿を削除するメソッド
	 * 
	 * @param timelineId
	 * @return
	 */
	public int timelineDelete(int timelineId) {
		int deleted = 0;
		Connection con = new MySqlConnector("openconnect").getConnection();

		String sql = "delete from send_timeline where timeline_id=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, timelineId);
			deleted = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return deleted;
	}

	/**
	 * いいね情報を削除するメソッド
	 * 
	 * @param timelineId
	 * @return
	 */
	public int goodDelete(int timelineId) {
		int deleted = 0;
		Connection con = new MySqlConnector("openconnect").getConnection();

		String sql = "delete from good where timeline_id=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, timelineId);
			deleted = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return deleted;
	}

	/**
	 * いいね情報を削除するメソッド
	 * 
	 * @param timelineId
	 * @return
	 */

	/**
	 * 最新のタイムライン投稿情報をDTOにセットするメソッド
	 * 
	 * @param userId
	 * @return
	 */
	public TimelineDTO timelineCheck() {
		TimelineDTO dto = new TimelineDTO();
		Connection con = new MySqlConnector("openconnect").getConnection();

		String sql = "select send_contents from send_timeline where sender_id = ? order by send_at desc limit 1";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, userId);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				dto.setSendContents(rs.getString("send_contents"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dto;

	}

}
