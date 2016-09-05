package com.internousdev.openconnect.attendance.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.openconnect.attendance.dto.AttendanceDTO;
import com.internousdev.util.DBConnector;

public class AttendanceUpDAO {

	public int update(AttendanceDTO dto){
		int count=0;

		Connection conn=new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql").getConnection();
		String sql="update attendance set date=?,attendance=?,interview=?";

		try{
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, dto.getDate());
			ps.setInt(2, dto.getAttendance());
			ps.setInt(3, dto.getInterview());

			count = ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return count;
	}
}
