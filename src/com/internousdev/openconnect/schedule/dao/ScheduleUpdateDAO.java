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
	 * @param Id
	 * @param Start_day
	 * @param End_day
	 * @param Title
	 * @param Content
	 * @return count
	 */
	public int update(int Id, String Start_day, String End_day, String Title, String Content){
		int count=0;

		DBConnector db=new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn= (Connection) db.getConnection();

		String sql = "UPDATE schedule SET start_day=?, end_day=?, title=?, content=? WHERE id=?";

		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,Start_day);
			ps.setString(2,End_day);
			ps.setString(3,Title);
			ps.setString(4,Content);
			ps.setInt(5,Id);
			count =ps.executeUpdate();
			System.out.println(ps);
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
