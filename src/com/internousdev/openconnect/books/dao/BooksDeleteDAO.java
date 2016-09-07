/**
 *
 */
package com.internousdev.openconnect.books.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;
/**
 * DBからそのIDの情報を削除する為のクラス
 * @author TATSUYA HOSHI
 */

public class BooksDeleteDAO {
	 /**
     * 削除メソッド DBからIDの情報を削除する為のメソッド
     * @author
     */

	public int delete(int bookId){

		int count =0;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();

		String sql = "delete from books where book_Id = ?";

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


