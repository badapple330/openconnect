/**
 *
 */
package com.internousdev.openconnect.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import com.internousdev.util.DBConnector;

/**
 * @author internous
 *
 */
public class AdminArticleNewDAO {
	/**
	 * 新規記事作成内容をDBに保存する
	 * @author SANSHIRO KOCHO
	 * @param loginId
	 *             ログインID
	 * @param password
	 *             パスワード
	 * @return result 挿入に成功したら1以上、失敗したら0
	 */

	public int insert(String projectDay,String project,String projectPlan,String projectResult,String other){

		int count = 0;

		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		projectDay = sdf.format(System.currentTimeMillis());


		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();
		String sql = "INSERT INTO project_progress_list(project_day,project,project_plan,project_result,other)VALUES(?, ?, ?, ? ,?)";
		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,projectDay);
			ps.setString(2,project);
			ps.setString(3,projectPlan);
			ps.setString(4,projectResult);
			ps.setString(5,other);

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
