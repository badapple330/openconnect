package com.internousdev.openconnect.projectProgress.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;


public class ProjectProgressUpdateDAO {


	public int select(int projectId,String projectDay,String project,String projectPlan,String projectResult,String other) throws SQLException{
		int count = 0;
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");
		Connection con = db.getConnection();

		String sql = "UPDATE project_progress SET project_day=?, project=?, project_plan=?, project_result=?, other=? where project_id=?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,projectDay);
			ps.setString(2,project);
			ps.setString(3,projectPlan);
			ps.setString(4,projectResult);
			ps.setString(5,other);
			ps.setInt(6,projectId);
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

