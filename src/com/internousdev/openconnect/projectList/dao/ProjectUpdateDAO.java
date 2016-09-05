package com.internousdev.openconnect.projectList.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

public class ProjectUpdateDAO {

	public int select(int  projectUserId,String projectName,String projectManager,String projectSubManager, String projectStartDate,String projectEndDate,String projectNote) throws SQLException{
		int count = 0;
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");
		Connection con = db.getConnection();

		String sql = "UPDATE project SET project_name=?, manager=?, sub_manager=?, start_date=?, end_date=? , note=? where  user_id=?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, projectName);
			ps.setString(2,projectManager);
			ps.setString(3,projectSubManager);
			ps.setString(4,projectStartDate);
			ps.setString(5,projectEndDate);
			ps.setString(6,projectNote);
			ps.setInt(7,projectUserId);
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




