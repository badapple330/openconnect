package com.internousdev.rewrite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;



public class AdminUserEditDAO {

	public int update(String name, String email,int check) throws SQLException{
	int count = 0;
	DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "rewrite", "root","z2789c6981");
	Connection con = db.getConnection();
    String sql = "UPDATE user SET name=?, email=? WHERE user_id=?";

    	try{
    		PreparedStatement ps = con.prepareStatement(sql);
    		ps.setString(1,name);
    		ps.setString(2,email);
    		ps.setInt(3,check);
    		count =ps.executeUpdate();

    	}catch (SQLException e) {
    		e.printStackTrace();
    	}finally{
    		try{
    			con.close();
    		}catch (SQLException e){
    			e.printStackTrace();
    		}
    	}
    	return count;
	}


}
