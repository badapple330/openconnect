/**
 *
 */
package com.internousdev.openconnect.books.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.books.dto.BooklistDTO;
import com.internousdev.util.DBConnector;

public class BooklistDAO {

	private List<BooklistDTO>bookList=new ArrayList<BooklistDTO>();

	public List<BooklistDTO> select() {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
		Connection con = db.getConnection();

		try {
			String sql="SELECT*FROM book_list ";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				BooklistDTO dto = new BooklistDTO();
				dto.setBookId(rs.getInt("book_id"));
				dto.setTitle(rs.getString("title"));
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
