package com.internousdev.bulletinboard.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.bulletinboard.dto.UserDTO;
import com.internousdev.bulletinboard.util.DBConnector;

public class FollowListDAO {

	public ArrayList<UserDTO> getFollow(int userId){
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection con = db.getConnection();

		ArrayList<UserDTO> followList = new ArrayList<UserDTO>();

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

				followList.add(dto);



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
			return followList;

	}

}
