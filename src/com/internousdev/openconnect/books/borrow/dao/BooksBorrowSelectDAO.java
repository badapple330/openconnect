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
 * ID、タイトルを、DBから取り出しDTOへ転送する為のクラス
 * @author TATSUYA HOSHI
 */


public class BooksBorrowSelectDAO {

	private List<BooksBorrowDTO>bookList = new ArrayList<BooksBorrowDTO>();
	/**
	 * 表示メソッド  表示したい内容を、DBから取り出しDTOへ転送する為のメソッド
	 */
	public List<BooksBorrowDTO> select() {
		DBConnector dbConnector = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
		Connection connection = dbConnector.getConnection();

		try {
			String sql="SELECT * FROM books_borrow inner join books on books_borrow.book_id = books.book_id";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet rsusltSet = preparedStatement.executeQuery();

			while (rsusltSet.next()) {
				BooksBorrowDTO dto = new BooksBorrowDTO();
				dto.setBookId(rsusltSet.getInt("book_id"));
				dto.setBorrowStatus(rsusltSet.getString("borrow_status"));
				dto.setBorrowDay(rsusltSet.getString("borrow_day"));
				dto.setBorrowId(rsusltSet.getInt("borrow_id"));
				dto.setTitle(rsusltSet.getString("title"));

				if( dto.getBorrowStatus().equals("貸出可") ){
					dto.setBorrowId( 0 );
				} else {
					dto.setUserName(this.getUserName(dto.getBorrowId()));
				}


				bookList.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return bookList;
	}


	/**
	 * 本を借りたユーザー名を取得
	 * @author UKYO MATSUZAKI
	 * @param borrowId
	 * @return String 本を借りたユーザー名
	 * @throws SQLException
	 */
	public String getUserName(int borrowId) throws SQLException{
		String userName = "";
		DBConnector dbConnector = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
		Connection connection = dbConnector.getConnection();
		try{
			String sql = "SELECT family_name FROM users WHERE user_id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, borrowId);
			ResultSet rsusltSet = preparedStatement.executeQuery();
			while(rsusltSet.next()){
				userName = rsusltSet.getString("family_name");
			}
		} catch(SQLException e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return userName;

	}

}
