/**
 *
 */
package com.internousdev.openconnect.books.borrow.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.books.borrow.dto.BooksBorrowDTO;
import com.internousdev.util.DBConnector;

/**
 * 表示したい内容を、DBから取り出しDTOへ転送する為のクラス
 * @author TATSUYA HOSHI
 */

public class BooksBorrowSelectDAO {

	private List<BooksBorrowDTO>bookList = new ArrayList<BooksBorrowDTO>();

	/**
	 * 表示メソッド  表示したい内容を、DBから取り出しDTOへ転送する為のメソッド
	 */


	public List<BooksBorrowDTO> select() {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
		Connection con = db.getConnection();


		try {
			String sql="SELECT * FROM books_borrow inner join books on books_borrow.book_id = books.book_id";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				BooksBorrowDTO dto = new BooksBorrowDTO();
				dto.setBookId(rs.getInt("book_id"));
				dto.setBorrowStatus(rs.getString("borrow_status"));
				dto.setBorrowDay(rs.getString("borrow_day"));
				dto.setBorrowId(rs.getInt("borrow_id"));
				dto.setTitle(rs.getString("title"));

				if( dto.getBorrowStatus().equals("貸出可") ){
					dto.setBorrowId( 0 );
				}

				bookList.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return bookList;
	}


}
