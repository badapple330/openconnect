package com.internousdev.openconnect.projects.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import com.internousdev.util.DBConnector;

/**
 * 画面で受け取った情報をＤBに格納する
 *
 * @author YUICHI KIRIU
 *
 */
public class ProjectsUpdateDAO {

	public int select(String  projectName,int managerId,int subManagerId,String startDate, String endDate,String note, int projectId){
		int count = 0;
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root", "mysql");
		Connection con = db.getConnection();

		String sql = "UPDATE projects SET project_name=?, manager_id=?,sub_manager_id=? , start_date=? , end_date=? , note=? where  project_id=?";
		SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMdd");
        startDate= sdf.format(System.currentTimeMillis());
        endDate= sdf.format(System.currentTimeMillis());
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,projectName);
			ps.setInt(2,managerId);
			ps.setInt(3,subManagerId);
			System.out.println(projectId);
			ps.setString(4,startDate);
			ps.setString(5,endDate);
			ps.setString(6,note);
			ps.setInt(7,projectId);
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
		System.out.println(count);
		return count;
	}
}

