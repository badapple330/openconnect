package com.internousdev.openconnect.students.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

public class StudentsInsertDAO {

	public int insert(String year, String month,String familyName, String givenName,int password, int userId) {
	 int count = 0;
	 DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
	 Connection con = db.getConnection();
     String sql = "INSERT INTO users(year, month, family_name, given_name, password, user_id)VALUES(?,?,?,?,?,?)";


     try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,year);
			ps.setString(2,month);
			ps.setString(3,familyName);
			ps.setString(4,givenName);
			ps.setInt(5,password);
			ps.setInt(6,userId);



			count = ps.executeUpdate();
	}catch(SQLException e){
		e.printStackTrace();
	}finally {
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
  return count;
 }
}