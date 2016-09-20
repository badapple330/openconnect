/**
 *
 */
package com.internousdev.openconnect.decisionDetail.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.openconnect.students.dto.StudentsDTO;
import com.internousdev.util.DBConnector;


public class DecisionLoginDAO {
	public StudentsDTO select(String password){

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
		Connection con = db.getConnection();
		StudentsDTO dto =new StudentsDTO();

		String sql="select*from users where password=?";
		try{
			PreparedStatement ps =con.prepareStatement(sql);
			ps.setString(1,password);

			ResultSet rs=ps.executeQuery();

			if(rs.next()){
				dto.setPassword(rs.getString("password"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return dto;
	}
}



