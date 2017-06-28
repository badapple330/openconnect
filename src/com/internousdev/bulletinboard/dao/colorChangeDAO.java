/**
 *
 */
package com.internousdev.bulletinboard.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

/**
 * @author internousdev
 *
 */
public class colorChangeDAO {

	public boolean colorChange(int userId,String color){

		DBConnector db=new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");

		Connection con=db.getConnection();
		String sql2 = "update users set color =? where user_id =?";


		int count = 0;

		try{
			PreparedStatement ps = con.prepareStatement(sql2);
			ps.setInt(1, userId);
			ps.setString(2, color);
			count = ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try{
				con.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		if(count > 0){
			return true;
		} else {
			return false;
		}
	}

}