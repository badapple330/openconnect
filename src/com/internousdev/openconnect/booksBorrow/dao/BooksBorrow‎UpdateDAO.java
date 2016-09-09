/**
 *
 */
package com.internousdev.openconnect.booksBorrow.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import com.internousdev.util.DBConnector;

/**
 * @author internous
 *
 */
public class BooksBorrow‎UpdateDAO {

	public int update(int bookId , int borrowId){

		int count = 0;
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		String borrowDay = sdf.format(System.currentTimeMillis());
		String borrowStatus = "貸出不可";

		if(borrowId == 0){
			borrowStatus = "貸出可";
			borrowDay = null;
			borrowId = 1;
		}
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();
		String sql = "UPDATE books_borrow SET borrow_status = ? , borrow_day = ? , borrow_id = ? where book_id = ?";
		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,borrowStatus);
			ps.setString(2,borrowDay);
			System.out.println("日付");
			ps.setInt(3,borrowId);
			ps.setInt(4,bookId);


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
