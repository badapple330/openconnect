package com.internousdev.rewrite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

public class AdminUserDeleteDAO {
	public int delete(int check) throws SQLException{
		int count = 0;
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "rewrite", "root","z2789c6981");;
        Connection conn =  db.getConnection();
        String sql = "Delete from user WHERE user_id= ?";

         try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,check);
            count =ps.executeUpdate();

         }catch (SQLException e) {
 	           e.printStackTrace();
 	     }finally{
 	           try{
 	        	   conn.close();
 	           }catch (SQLException e){
 	        	   e.printStackTrace();
 	           }
 	     }
         return count;
     }


}