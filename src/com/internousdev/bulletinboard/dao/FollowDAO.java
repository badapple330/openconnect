/**
 *
 */
package com.internousdev.bulletinboard.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.bulletinboard.dto.UserDTO;
import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * @author internousdev
 *
 */
public class FollowDAO {
	public boolean follow(int userId, int followId) {
		boolean ret = false;
		Connection con = new MySqlConnector("openconnect").getConnection();
		String sql = "REPLACE INTO follows (follower_id, followed_id) VALUES (?, ?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, userId);
			ps.setInt(2, followId);
			if (ps.executeUpdate() > 0) {
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return ret;
	}

	//messagesテーブルに通知を送るメソッド
	public boolean insertString(int userId, int viewId) {
		int result = 0;
		boolean insertFlag = false;
		Connection con = new MySqlConnector("openconnect").getConnection();

		String sql = "insert into messages (receiver_id, sender_id, text) values (?,?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, viewId);
			ps.setInt(2, userId);
			ps.setString(3, "フォローしました");

			result = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (result > 0) {
			insertFlag = true;
		}
		return insertFlag;
	}

	public boolean unfollow(int userId, int viewId) {
		Connection con = new MySqlConnector("openconnect").getConnection();
		boolean result = false;
		String sql = "delete from follows where follower_id = ? && followed_id = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, userId);
			ps.setInt(2, viewId);
			if (ps.executeUpdate() > 0) {
				result = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public ArrayList<UserDTO> getFollowList(int userId) {
		Connection con = new MySqlConnector("openconnect").getConnection();
		ArrayList<UserDTO> followList = new ArrayList<UserDTO>();
		String sql = "select * from users left join follows on users.user_id = follows.followed_id where follower_id=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, userId);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				UserDTO dto = new UserDTO();
				dto.setUserId(rs.getInt("user_id"));
				dto.setUserName(rs.getString("user_name"));
				dto.setSnsId(rs.getString("sns_id"));
				dto.setUserIcon(rs.getString("user_icon"));
				dto.setPoint(rs.getInt("point"));
				dto.setUserLevel(rs.getInt("user_level"));
				dto.setProfile(rs.getString("profile"));
				followList.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return followList;
	}

	public ArrayList<UserDTO> getFollowerList(int userId) {
		Connection con = new MySqlConnector("openconnect").getConnection();
		ArrayList<UserDTO> followerList = new ArrayList<UserDTO>();
		String sql = "select * from users left join follows on users.user_id = follows.follower_id where followed_id=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, userId);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				UserDTO dto = new UserDTO();
				dto.setUserId(rs.getInt("user_id"));
				dto.setUserName(rs.getString("user_name"));
				dto.setSnsId(rs.getString("sns_id"));
				dto.setUserIcon(rs.getString("user_icon"));
				dto.setPoint(rs.getInt("point"));
				dto.setUserLevel(rs.getInt("user_level"));
				dto.setProfile(rs.getString("profile"));

				followerList.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return followerList;
	}

	public boolean chaeckIfFollowing(int userId, int viewId) {
		Connection con = new MySqlConnector("openconnect").getConnection();

		boolean result = false;

		String sql = "select followed_id from follows where follower_id=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, userId);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				if (rs.getInt("followed_id") == viewId) {
					result = true;
					break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}