/**
 *
 */
package com.internousdev.openconnect.booksBorrow.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

/**
 * @author internous
 *
 */
public class BooksBorrowNewDAO {

	public int insert(int bookId) {

		int count = 0;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();
		String sql = "INSERT INTO books_borrow(book_id)VALUES(?)";
		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,bookId);


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
