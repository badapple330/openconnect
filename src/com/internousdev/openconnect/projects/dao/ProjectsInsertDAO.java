package com.internousdev.openconnect.projects.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

public class ProjectsInsertDAO {

	public int insert(int projectId,String projectName,int managerId,int subManagerId,String startDate){

		int count = 0;


		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();
		String sql = "INSERT INTO projects(project_id,project_name,manager_id,sub_manager_id,start_date)VALUES(?, ?, ?, ? ,?)";
		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,projectId);
			ps.setString(2,projectName);
			ps.setInt(3,managerId);
			ps.setInt(4,subManagerId);
			ps.setString(5,startDate);


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