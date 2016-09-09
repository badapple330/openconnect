package com.internousdev.openconnect.students.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

public class StudentsUpdateDAO {
	public int select(String year, String month , String familyName, String givenName,int password,int userId) {

		int result= 0;
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");
		Connection con = db.getConnection();

		String sql = "UPDATE users SET(year, month, family_name, given_name,password,user_id) =(?,?,?,?,?,?)";

		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1,year);
			ps.setString(2,month);
			ps.setString(3,familyName);
			ps.setString(4,givenName);
			ps.setInt(5,password);
			ps.setInt(6,userId);
			result =ps.executeUpdate();

		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch (SQLException e){
				e.printStackTrace();
			}
		}

		return result;
	}

}




