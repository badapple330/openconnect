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

import com.internousdev.openconnect.books.dto.BooksSearchDTO;
import com.internousdev.util.DBConnector;
/**
 * キーワードをDBから検索する為のクラス
 *
 * @author TATSUYA HOSHI
 */
public class BooksSearchDAO {

	/**
	 * 検索結果情報をリスト化して抽出し、DTOに格納する
	 * @return  searchList 抽出に成功したらSUCCESS、失敗したらERROR
	 */


	public List<BooksSearchDTO> searchList = new ArrayList<BooksSearchDTO>();



	public List<BooksSearchDTO> select(String search) {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");
		Connection con = db.getConnection();

		try {
			String sql = "SELECT * FROM books WHERE title LIKE '%" + search + "%'";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				BooksSearchDTO dto = new BooksSearchDTO();

				dto.setBookId(rs.getInt("book_id"));
				dto.setTitle(rs.getString("title"));

				searchList.add(dto);
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
		return searchList;
	}



}
