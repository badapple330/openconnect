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
	 * 検索結果情報をリスト化して抽出し、DTOに格納する
	 */
	public List<BooksDTO> searchList = new ArrayList<BooksDTO>();

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

	public int select( String title ) {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
		Connection con = db.getConnection();

		try {
			String sql="SELECT * FROM books where title = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, title);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				return rs.getInt("book_id");
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
		return 0;
	}

	 /**
     * 更新情報を、DBへ転送し、更新する為のメソッド
     */
	public int select(String title,int book_id) {

		int count = 0;
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");
		Connection con = db.getConnection();

		String sql = "UPDATE books SET title = ? where book_id = ?";

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

	/**
	 * 書籍画面から受け取ったタイトルの追加情報を、DBへ転送し、反映する為のメソッド
	 */
	public int insert(String title) {

		int count = 0 ;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();
		String sql = "INSERT INTO books(title)VALUES(?)";
		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,title);

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



	 /**
     * 削除メソッド DBからIDの情報を削除する為のメソッド
     */
	public int delete(int bookId){

		int count =0 ;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();

		String sql = "delete from books where book_Id = ?";

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
