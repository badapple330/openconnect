/**
 *
 */
package com.internousdev.openconnect.booklist.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;


public class BooklistDeleteDAO {

	public int delete(int bookListId){

		int count =0;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();

		String sql = "delete from book_list where book_Id = ?";

		System.out.println(bookListId);
		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, bookListId);
			count = ps.executeUpdate();
			System.out.println(count);
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try{
				conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		System.out.println("last:" + count);
		return count;
	}

}


