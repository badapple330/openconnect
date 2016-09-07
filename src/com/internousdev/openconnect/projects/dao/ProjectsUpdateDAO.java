package com.internousdev.openconnect.projects.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

/**
 * 画面で受け取った情報をＤＴＯに格納する
 *
 * @author YUICHI KIRIU
 *
 */
public class ProjectsUpdateDAO {

	public int select(String  projectName,String managerName, String subManagerName,String projectStartDate, String projectEndDate,String projectNote,String projectManagerId,String  projectSubManagerId, int projectId){
		int count = 0;
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");
		Connection con = db.getConnection();
		System.out.println(3);
		String sql = "UPDATE projects SET project_name=?, manager_name=?, sub_manager_name=?, start_date=? , end_date=? , note=?,manager_id=?,sub_manager_id=? where  project_id=?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,projectName);
			ps.setString(2,managerName);
			ps.setString(3,subManagerName);
			ps.setString(4,projectStartDate);
			ps.setString(5,projectEndDate);
			ps.setString(6,projectNote);
			ps.setString(7,projectManagerId);
			ps.setString(8,projectSubManagerId);
			ps.setInt(9,projectId);
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
}

