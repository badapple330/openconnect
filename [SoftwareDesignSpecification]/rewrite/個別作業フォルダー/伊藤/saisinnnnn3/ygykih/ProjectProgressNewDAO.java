/**
 *
 */
package com.internousdev.openconnect.projectProgress.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import com.internousdev.util.DBConnector;
/**
 * 画面で追加した一覧情報をDBへ転送する為のクラス
 * @author TATUHUMI ITOU
 * @since 2016/09/04
 * @version 1.0
 */
public class ProjectProgressNewDAO {
	 /**
     * 挿入メソッド  画面で受け取った追加情報を、DBへ転送し、追加する為のメソッド
     * @author TATUHUMI ITOU
     */
	public int insert(int projectId,String projectDay,String projectPlan,String projectResult,String other){

		int count = 0;
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		projectDay = sdf.format(System.currentTimeMillis());


		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();
		String sql = "INSERT INTO project_progress(project_id,project_day,project_plan,project_result,other)VALUES(?, ?, ?, ? ,?)";
		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,projectId);
			ps.setString(2,projectDay);
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
