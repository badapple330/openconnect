/**
 *
 */
package com.internousdev.openconnect.booksBorrow.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.booksBorrow.dto.BooksBorrowDTO;
import com.internousdev.util.DBConnector;

/**
 * 表示したい内容を、DBから取り出しDTOへ転送する為のクラス
 * @author Tatsuya Hoshi
 */

public class BooksBorrowDAO {

	private List<BooksBorrowDTO>bookList=new ArrayList<BooksBorrowDTO>();

	 /**
     * 表示メソッド  表示したい内容を、DBから取り出しDTOへ転送する為のメソッド
     */


	public List<BooksBorrowDTO> select() {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
		Connection con = db.getConnection();

		try {
			String sql="SELECT*FROM book_list ";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				BooksBorrowDTO dto = new BooksBorrowDTO();
				dto.setBookId(rs.getInt("book_id"));
				dto.setBorrowStatus(rs.getString("status"));
				dto.setBorrowHuman(rs.getString("borrow_human"));
				dto.setBorrowDay(rs.getString("borrow_day"));

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
