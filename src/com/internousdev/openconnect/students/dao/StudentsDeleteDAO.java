package com.internousdev.openconnect.students.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

public class StudentsDeleteDAO {
  public int delete(int users_id){
	  int count =0;
	  DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection con = db.getConnection();
		String sql = "delete from users where user_id = ?";

	 System.out.println(users_id);

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,users_id);
			count = ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}


	  return count;
  }
}
