package com.internousdev.openconnect.schedule.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;
import com.mysql.jdbc.Connection;

public class ScheduleUpdateDAO {
	public int update(int Id, Date Start_day, Date End_day, String Title, String Content){
		int count=0;

		DBConnector db=new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn= (Connection) db.getConnection();

		String sql = "UPDATE schedule SET start_day=?, end_day=?, title=?, content=? WHERE id=?";

    	try{
    		PreparedStatement ps = conn.prepareStatement(sql);
    		ps.setDate(1,Start_day);
    		ps.setDate(2,End_day);
    		ps.setString(3,Title);
    		ps.setString(4,Content);
    		ps.setInt(5,Id);
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
