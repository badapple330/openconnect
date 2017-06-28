/**
 *
 */
package com.internousdev.openconnect.attendance.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

/**
 * @author internousdev
 *
 */
public class AddAttendanceDAO {

	public int insert(int userId,int atYear,int atMonth, int atDay, String attendance, String reason){

		DBConnector db=new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
		Connection con =db.getConnection();
		int ret = 0;
		String sql = "insert into attendance(user_id,at_year,at_month,at_day,attendance,reason) values(?,?,?,?,?,?)";


		try{
	            PreparedStatement ps = con.prepareStatement(sql);
	            ps.setInt(1, userId);
	            ps.setInt(2,atYear);
	            ps.setInt(3,atMonth);
	            ps.setInt(4,atDay);
	            ps.setString(5, attendance);
	            ps.setString(6, reason);

	            ret = ps.executeUpdate();

	        }catch (SQLException e){
	            e.printStackTrace();
	        }finally{
	                try{
	                    con.close();
	                }catch (SQLException e){
	                    e.printStackTrace();
	                }
	            }
		return ret;
	}

}
