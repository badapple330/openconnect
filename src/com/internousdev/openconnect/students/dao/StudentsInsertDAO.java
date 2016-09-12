package com.internousdev.openconnect.students.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

public class StudentsInsertDAO {

	public int insert(String year, String month,String familyName,String givenName, String familyNameKanji, String givenNameKanji, String password) {
	 int count = 0;
	 DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
	 Connection con = db.getConnection();
     String sql = "INSERT INTO users(password,family_name,given_name, family_name_kanji, given_name_kanji, year, month)VALUES(?,?,?,?,?,?,?)";


     try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,password);
			ps.setString(2,familyName);
			ps.setString(3,givenName);
			ps.setString(4,familyNameKanji);
			ps.setString(5,givenNameKanji);
			ps.setString(6,year);
			ps.setString(7,month);


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