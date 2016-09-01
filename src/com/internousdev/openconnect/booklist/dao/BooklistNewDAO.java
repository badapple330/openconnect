/**
 *
 */
package com.internousdev.openconnect.booklist.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

/**
 * @author internous
 *
 */
public class BooklistNewDAO {

	public int insert(String title) {

		int count = 0;





		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();
		String sql = "INSERT INTO books(title)VALUES(?)";
		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,title);


			count = ps.executeUpdate();


		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try{
				conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return count;



	}

}
