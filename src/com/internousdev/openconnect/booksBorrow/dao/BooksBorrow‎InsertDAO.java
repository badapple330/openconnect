/**
 *
 */
package com.internousdev.openconnect.booksBorrow.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import com.internousdev.util.DBConnector;

/**
 * @author TATSUYA HOSHI
 *
 */
public class BooksBorrow‎InsertDAO {

	public int insert(String borrow‎Insert){

		int count = 0;
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		borrow‎Insert = sdf.format(System.currentTimeMillis());


		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();
		String sql = "INSERT INTO books_borrow(borrow_day,borrow_id)VALUES(?,?)";
		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,borrow‎Insert);


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
