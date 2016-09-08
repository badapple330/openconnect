package com.internousdev.openconnect.students.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

public class StudentsInsertDAO {

	public int insert(String year, String month,String family_name, String given_name,int password,int user_id) {
	 int count = 0;
	 DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
	 Connection con = db.getConnection();
     String sql = "INSERT INTO users(year, month,family_name, given_name,password,user_id)VALUES(?,?,?,?,?,?)";


     try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,year);
			ps.setString(2,month);
			ps.setString(3,family_name);
			ps.setString(4,given_name);
			ps.setInt(5,password);
			ps.setInt(6,user_id);



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