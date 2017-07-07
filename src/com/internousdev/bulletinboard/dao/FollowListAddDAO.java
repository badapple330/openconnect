/**
 *
 */
package com.internousdev.bulletinboard.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.bulletinboard.util.DBConnector;

/**
 * @author internousdev
 *
 */
public class FollowListAddDAO {


	//2重フォローをチェックするメソッド
	public boolean select(int userId, int viewId){

	  boolean followCheckFlag = false;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection con = db.getConnection();

      String sql = "select * from follow where do = ? && done = ?";

		try {

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, userId);
			ps.setInt(2, viewId);

			ResultSet rs = ps.executeQuery();
			while(rs.next()){

				//すでにフォローしていた場合はtrue
				followCheckFlag= true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return followCheckFlag;
	}



	//↑チェックメソッドがtrueだった場合、自分のIDとフォローする側のIDをinsertするメソッド
	public boolean insert(int userId, int viewId){

		  int count = 0;
		  boolean followFlag = false;


			DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
			Connection con = db.getConnection();


	        String sql = "insert into follow (do, done) values (?,?)";

			try {

				PreparedStatement ps = con.prepareStatement(sql);
				ps.setInt(1, userId);
				ps.setInt(2, viewId);

				count = ps.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
			if (count > 0) {
				followFlag = true;
			}
			return followFlag;
		}



	//messagesテーブルに通知を送るメソッド
	public boolean insertString(int userId, int viewId){

		int result=0;
		boolean insertFlag=false;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection con = db.getConnection();

	  String sql = "insert into messages (receiver_id, sender_id, body) values (?,?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, viewId);
			ps.setInt(2, userId);
			ps.setString(3, "フォローしました");

		    result = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
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
	}