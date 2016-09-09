/**
 *
 */
package com.internousdev.openconnect.booksBorrow.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

/**
 * @author TATSUYA HOSHI
 *
 */
public class BooksBorrowReturnDAO {

	public int delete(int bookId) {

		int count = 0;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();

		String sql = "delete books_borrow from books_borrow.borrow_day,books_borrow.borrow_id as books_borrow where book_id = ?";

		System.out.println(bookId);

		try{
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setInt(1, bookId);
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
