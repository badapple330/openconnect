package com.internousdev.openconnect.projects.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

public class ProjectsDeleteDAO {

	/**
	 * 削除メソッド  画面で受け取ったプロジェクトIDを元にして、DBからそのIDの情報を削除する為のメソッド
	 * @author TATUHUMI ITOU
	 */
	public int delete(int projectId){

		int count =0;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();

		String sql = "delete from projects where project_id= ?";


		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, projectId);
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