package com.internousdev.openconnect.schedule.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;
import com.mysql.jdbc.Connection;


public class ScheduleInsertDAO {
	public int insert (Date start_day, String title, String content){
		System.out.println(start_day);
		int count=0;
		DBConnector db=new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn= (Connection) db.getConnection();
		String sql="INSERT INTO schedule(start_day, title, content) VALUES (?,?,?)";

		try{
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setDate(1,start_day);
			ps.setString(2,title);
			ps.setString(3,content);
			count=ps.executeUpdate();

		} catch (SQLException e){
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e){
				e.printStackTrace();
			}
		}
		return count;
		}
}
