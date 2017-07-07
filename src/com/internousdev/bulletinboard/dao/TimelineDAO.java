package com.internousdev.bulletinboard.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.bulletinboard.dto.PostDTO;
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

	public TimelineDAO(int userId) {
		this.userId = userId;
	}

	public ArrayList<PostDTO> selectTimeline() {
		Connection con = new MySqlConnector("openconnect").getConnection();
		ArrayList<PostDTO> timeline = new ArrayList<PostDTO>();
		int senderId;

		String sql = "select done from follow where do = ?";
		String sql2 = "select * from posts join users on posts.sender_id = users.user_id where sender_id=? order by post_id desc";
		String sql3 = "select * from posts join users on posts.sender_id = users.user_id where post_id = ?";

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
					PostDTO dto = new PostDTO();
					dto.setPostId(rs2.getInt("post_id")); // タイムラインID
					dto.setSenderId(rs2.getInt("sender_id")); // 送信者ID
					dto.setText(rs2.getString("text")); // 送信内容
					dto.setImg(rs2.getString("img")); // 添付画像
					dto.setCreatedAt(rs2.getString("created_at"));// 送信日時
					dto.setUserName(rs2.getString("user_name")); // 名前
					dto.setUserImg(rs2.getString("user_img")); // 写真
					dto.setPoint(rs2.getInt("good")); // ポイント
					dto.setGoodFlg(good.isGood(userId, rs2.getInt("post_id")));// グッドふらぐ
					dto.setRePostId(rs2.getInt("re_post_id")); // 返信先のタイムラインID
					if (dto.getRePostId() != 0) {
						PreparedStatement ps3 = con.prepareStatement(sql3);
						ps3.setInt(1, dto.getRePostId());
						ResultSet rs3 = ps3.executeQuery();
						while (rs3.next()) {
							dto.setReUserId(rs3.getInt("user_id")); // 返信先のユーザーID
							dto.setReUserName(rs3.getString("user_name")); // 返信先のユーザー名
							dto.setReText(rs3.getString("text")); // 返信先の送信内容
							dto.setReCreatedAt(rs3.getString("created_at")); // 返信先の送信日時
							dto.setReImg(rs3.getString("user_img"));
						}
					}
					timeline.add(dto);
				}
			}
			PreparedStatement ps2 = con.prepareStatement(sql2);
			ps2.setInt(1, userId);
			GoodDAO good = new GoodDAO();
			ResultSet rs2 = ps2.executeQuery();
			while (rs2.next()) {
				PostDTO dto = new PostDTO();
				dto.setPostId(rs2.getInt("post_id")); // タイムラインID
				dto.setSenderId(rs2.getInt("sender_id")); // 送信者ID
				dto.setText(rs2.getString("text")); // 送信内容
				dto.setImg(rs2.getString("img")); // 添付画像
				dto.setCreatedAt(rs2.getString("created_at"));// 送信日時
				dto.setUserName(rs2.getString("user_name")); // 名前
				dto.setUserImg(rs2.getString("user_img")); // 写真
				dto.setPoint(rs2.getInt("good")); // ポイント
				dto.setGoodFlg(good.isGood(userId, rs2.getInt("post_id")));// グッドふらぐ
				dto.setRePostId(rs2.getInt("re_post_id")); // 返信先のタイムラインID
				if (dto.getRePostId() != 0) {
					PreparedStatement ps3 = con.prepareStatement(sql3);
					ps3.setInt(1, dto.getRePostId());
					ResultSet rs3 = ps3.executeQuery();
					while (rs3.next()) {
						dto.setReUserId(rs3.getInt("user_id")); // 返信先のユーザーID
						dto.setReUserName(rs3.getString("user_name")); // 返信先のユーザー名
						dto.setReText(rs3.getString("text")); // 返信先の送信内容
						dto.setReCreatedAt(rs3.getString("created_at")); // 返信先の送信日時
						dto.setReImg(rs3.getString("user_img"));
					}
				}

				timeline.add(dto);
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
		return timeline;
	}

	/**
	 * 投稿する情報をタイムライン投稿情報テーブルにインサートするメソッド
	 *
	 * @param userId
	 * @param text
	 * @param img
	 * @return
	 */
	public int insertPost(String text, int rePostId) {
		int inserted = 0;

		Connection con = new MySqlConnector("openconnect").getConnection();
		String sql = "insert into posts (sender_id, text, re_post_id) values (?,?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, userId);
			ps.setString(2, text);
			ps.setInt(3, rePostId);

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
	 * @param postId
	 * @return
	 */
	public int deletePost(int postId) {
		int deleted = 0;
		Connection con = new MySqlConnector("openconnect").getConnection();

		String sql = "delete from posts where post_id=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, postId);
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
	 * @param postId
	 * @return
	 */
	public int goodDelete(int postId) {
		int deleted = 0;
		Connection con = new MySqlConnector("openconnect").getConnection();

		String sql = "delete from good where post_id=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, postId);
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
	 * @param postId
	 * @return
	 */

	/**
	 * 最新のタイムライン投稿情報をDTOにセットするメソッド
	 *
	 * @param userId
	 * @return
	 */
	public PostDTO selectLastPost() {
		PostDTO dto = new PostDTO();
		Connection con = new MySqlConnector("openconnect").getConnection();

		String sql = "select text from posts where sender_id = ? order by created_at desc limit 1";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, userId);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				dto.setText(rs.getString("text"));
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
