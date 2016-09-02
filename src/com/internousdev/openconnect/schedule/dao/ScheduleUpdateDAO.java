package com.internousdev.openconnect.schedule.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;
import com.mysql.jdbc.Connection;

public class ScheduleUpdateDAO {
	public int update(int id, String Startdate, String Enddate, String title, String content){
		int count=0;

		DBConnector db=new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn= (Connection) db.getConnection();

		String sql = "UPDATE schedule SET Startdate=?, Enddate=?, title=?, content=? WHERE id=?";
		System.out.println(id);
		System.out.println(Startdate);
		System.out.println(Enddate);
		System.out.println(title);
		System.out.println(content);
    	try{
    		PreparedStatement ps = conn.prepareStatement(sql);
    		ps.setString(1,Startdate);
    		ps.setString(2,Enddate);
    		ps.setString(3,title);
    		ps.setString(4,content);
    		ps.setInt(5,id);
    		count =ps.executeUpdate();

    	}catch (SQLException e) {
    		e.printStackTrace();
    	}finally{
    		try{
    			conn.close();
    		}catch (SQLException e){
    			e.printStackTrace();
    		}
    	}
    	return count;

	}
}
