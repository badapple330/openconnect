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
public class BooksBorrow‎ConfirmationDAO {

	public int insert(String borrow‎Confirmation){

		int count = 0;
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		borrow‎Confirmation = sdf.format(System.currentTimeMillis());


		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();
		String sql = "INSERT INTO books_borrow(borrow_day)VALUES(?)";
		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,borrow‎Confirmation);


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
