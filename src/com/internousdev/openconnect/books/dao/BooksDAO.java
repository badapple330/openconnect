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

import com.internousdev.openconnect.books.dto.BooksDTO;
import com.internousdev.util.DBConnector;

/**
 * 表示したい内容を、DBから取り出しDTOへ転送する為のクラス
 * @author TATSUYA HOSHI
 */
public class BooksDAO {

	private List<BooksDTO>bookList = new ArrayList<BooksDTO>();
	 /**
     * 表示メソッド  表示したい内容を、DBから取り出しDTOへ転送する為のメソッド
     */

	public List<BooksDTO> select() {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
		Connection con = db.getConnection();

		try {
			String sql="SELECT * FROM books";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				BooksDTO dto = new BooksDTO();
				dto.setBookId(rs.getInt("book_id"));
				dto.setTitle(rs.getString("title"));


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
