package com.internousdev.bulletinboard.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.bulletinboard.dto.UserDTO;
import com.internousdev.bulletinboard.util.DBConnector;
import com.internousdev.util.db.mysql.MySqlConnector;



public class ProfileDAO {


	public ArrayList<UserDTO> select(int userId){
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection con = db.getConnection();
		UserDTO dto = new UserDTO();
		ArrayList<UserDTO> userList = new ArrayList<UserDTO>();

		String sql = "select * from users where user_id=?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,userId);

			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				dto.setUserId(rs.getInt("user_id"));
				dto.setUserImg(rs.getString("user_img"));
				dto.setUserName(rs.getString("user_name"));
				dto.setPoint(rs.getInt("point"));
				dto.setLv(rs.getInt("lv"));
				dto.setProfile(rs.getString("profile"));
				userList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
		try{

			con.close();
		}
			catch(SQLException e){
				e.printStackTrace();
			}
		}return userList;
	}


	public ArrayList<UserDTO> getFollow(int userId){
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection con = db.getConnection();

		ArrayList<UserDTO> profileList = new ArrayList<UserDTO>();

		String sql ="select * from users left join follow on users.user_id = follow.done where do=?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,userId);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				UserDTO dto = new UserDTO();

				dto.setUserId(rs.getInt("user_id"));

				dto.setUserName(rs.getString("user_name"));

				dto.setUserImg(rs.getString("user_img"));

				dto.setPoint(rs.getInt("point"));

				dto.setLv(rs.getInt("lv"));

				dto.setProfile(rs.getString("profile"));

				profileList.add(dto);



			}

			}catch(SQLException e){
				e.printStackTrace();

			}finally{
			try{
				con.close();
			} catch(SQLException e){
				e.printStackTrace();
			}
			}
			return profileList;

	}


	public ArrayList<UserDTO> getFollower(int userId){
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection con = db.getConnection();

		ArrayList<UserDTO> profileList = new ArrayList<UserDTO>();

		String sql ="select * from users left join follow on users.user_id = follow.do where done=?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,userId);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				UserDTO dto = new UserDTO();

				dto.setUserId(rs.getInt("user_id"));

				dto.setUserName(rs.getString("user_name"));

				dto.setUserImg(rs.getString("user_img"));

				dto.setPoint(rs.getInt("point"));

				dto.setLv(rs.getInt("lv"));

				dto.setProfile(rs.getString("profile"));

				profileList.add(dto);



			}

			}catch(SQLException e){
				e.printStackTrace();

			}finally{
			try{
				con.close();
			} catch(SQLException e){
				e.printStackTrace();
			}
			}
			return profileList;

	}


	public int profileSend(int user_id,String profile,String user_img){
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection con = db.getConnection();
		int inserted=0;
		int c=1;

	String sql="";
	int k;



		if(profile.equals("") && user_img.equals("")){
			sql="";
			k=-1;
		}

		if(profile.equals("")){
			sql="update users set user_img=? where user_id=?";
			k=0;
		}else if(user_img.equals("")){
			sql="update users set profile=? where user_id=?";
			k=1;
		}else {
			sql="update users set profile=?,user_img=? where user_id=?";
			k=2;
		}

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			if(k==0){
				ps.setString(c++,user_img);
				ps.setInt(c, user_id);
			}
			if(k==1){
				ps.setString(c++,profile);
				ps.setInt(c, user_id);
			}
			if(k==2){
			ps.setString(c++,profile);
			ps.setString(c++,user_img);
			ps.setInt(c, user_id);
			}


			inserted= ps.executeUpdate();
			ps.close();

			}catch(SQLException e){
				e.printStackTrace();

			}finally{
			try{
				con.close();
			} catch(SQLException e){
				e.printStackTrace();
			}
			}
			return inserted;

	}

	public int insert(int userId,String userImg,String profile){
		DBConnector db=new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
		Connection con=db.getConnection();
		int inserted=0;
		String sql= "insert into img(user_id,user_img,profile)"
				+ "values(?,?,?)";

		try{
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setInt(1,userId);
			ps.setString(2,userImg);
			ps.setString(3,profile);
			inserted=ps.executeUpdate();


			ps.close();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return inserted;
	}

	/**
	 * ユーザー名からユーザーIDを取得するメソッド
	 * @param userName
	 * @return
	 */
	public int viewIdGet(String userName){
		int viewId = 0;
		Connection con = new MySqlConnector("openconnect").getConnection();

		String sql = " select user_id from users where user_name = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,userName);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				viewId = rs.getInt("user_id");
			}

		}catch(SQLException e){
			e.printStackTrace();

		}finally{
			try{
				con.close();
			} catch(SQLException e){
				e.printStackTrace();
			}
		}
		return viewId;
	}

}

