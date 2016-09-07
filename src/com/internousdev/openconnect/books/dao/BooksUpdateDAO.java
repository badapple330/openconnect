/**
 *
 */
package com.internousdev.openconnect.books.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;
/**
 * 更新情報をDBへ転送する為のクラス
 * @author Tatsuya Hoshi
 */
public class BooksUpdateDAO {

	 /**
     * 更新情報を、DBへ転送し、更新する為のメソッド
     */
	public int select(String title,int book_id) {

		int count = 0;
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");
		Connection con = db.getConnection();

		String sql = "UPDATE books SET title=? where book_id=?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,title);
			ps.setInt(2,book_id);
			count =ps.executeUpdate();

		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch (SQLException e){
				e.printStackTrace();
			}
		}

		return count;
	}

}
