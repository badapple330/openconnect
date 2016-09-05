/**
 *
 */
package com.internousdev.openconnect.projectProgress.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

/**
 * 画面で受け取ったプロジェクトIDを元にして、DBからそのIDの情報を削除する為のクラス
 * @author TATUHUMI ITOU
 * @since 2016/09/04
 * @version 1.0
 */
public class ProjectProgressDeleteDAO {
	 /**
     * 削除メソッド  画面で受け取ったプロジェクトIDを元にして、DBからそのIDの情報を削除する為のメソッド
     * @author TATUHUMI ITOU
     */
	public int delete(int projectId){

		int count =0;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();

		String sql = "delete from project_progress where project_Id = ?";

		System.out.println(projectId);
		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, projectId);
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
