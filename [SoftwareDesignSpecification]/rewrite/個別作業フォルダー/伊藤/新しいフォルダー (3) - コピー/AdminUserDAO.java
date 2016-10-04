package com.internousdev.rewrite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.rewrite.dto.AdminUserDTO;
import com.internousdev.util.DBConnector;

public class AdminUserDAO {

	private List<AdminUserDTO>UserList=new ArrayList<AdminUserDTO>();

	public List<AdminUserDTO> select() {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "rewrite", "root","z2789c6981");
		Connection con = db.getConnection();

		try {
			String sql="SELECT user_id,name,email FROM user ";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				AdminUserDTO dto = new AdminUserDTO();
				dto.setUser_id(rs.getInt("user_id"));
				dto.setName(rs.getString("name"));
				dto.setEmail(rs.getString("email"));

				UserList.add(dto);
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
		return UserList;
	}

	public List<AdminUserDTO> getUserList() {
		return UserList;
	}

	public void setUserList(List<AdminUserDTO> userList) {
		UserList = userList;
	}


}