package com.internousdev.openconnect.projects.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

/**
 * 画面から追加された情報をＤＢに追加するクラス
 * @author YUICHI KIRIU
 * @since 2016/09/07
 */
public class ProjectsInsertDAO {

	/**
	 * 追加された情報をＤＢに追加するメソッド
	 * @author YUICHI KIRIU
	 *  @param projectName
	 *  @param managerId
	 *  @param subManagerId
	 *  @param  startDate
	 *  @return   count
	 */

	public int insert(String projectName,int managerId,int subManagerId,String startDate){

		int count = 0;


		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();
		String sql = "INSERT INTO projects(project_name,manager_id,sub_manager_id,start_date)VALUES(?, ?, ? ,?)";
		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,projectName);
			ps.setInt(2,managerId);
			ps.setInt(3,subManagerId);
			ps.setString(4,startDate);


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
