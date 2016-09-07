package com.internousdev.openconnect.schedule.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;
import com.mysql.jdbc.Connection;


/**
 * 画面から入力された情報を追加するクラス。
 * @author MASAHIRO KEDSUKA
 * @since 2016/09/07
 */
public class ScheduleInsertDAO {

	/**
	 * 入力された情報をDBに追加するメソッド。
	 * @author MASAHIRO KEDSUKA
	 * @param Start_day
	 * @param Title
	 * @param Content
	 * @return count
	 */
	public int insert (Date Start_day, String Title, String Content){

		int count=0;
		DBConnector db=new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn= (Connection) db.getConnection();
		String sql="INSERT INTO schedule(start_day, title, content) VALUES (?,?,?)";

		try{
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setDate(1,Start_day);
			ps.setString(2,Title);
			ps.setString(3,Content);
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
