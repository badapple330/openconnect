package com.internousdev.openconnect.schedule.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;
import com.mysql.jdbc.Connection;

/**
 * DBの情報を更新するクラス。
 * @author MASAHIRO KEDSUKA
 * @since 2016/09/07
 */
public class ScheduleUpdateDAO {

	/**
	 * 更新するメソッド。
	 * @author MASAHIRO KEDSUKA
	 * @param id
	 * @param startDay
	 * @param endDay
	 * @param title
	 * @param content
	 * @return count
	 */
	public int update(int id, String startDay, String endDay, String title, String content){
		int count=0;

		DBConnector db=new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn= (Connection) db.getConnection();

		if( endDay.equals("") ){
			endDay = "0000-00-00";
		}

		String sql = "UPDATE schedule SET start_day=?, end_day=?, title=?, content=? WHERE id=?";

		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,startDay);
			ps.setString(2,endDay);
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
