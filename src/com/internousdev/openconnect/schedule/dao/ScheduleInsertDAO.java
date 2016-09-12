package com.internousdev.openconnect.schedule.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

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
	 * @param startday
	 * @param title
	 * @param content
	 * @return count
	 */
	public int insert (String startDay, String title, String content){

		int count=0;
		DBConnector db=new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn= (Connection) db.getConnection();
		String sql="INSERT INTO schedule(start_day, title, content) VALUES (?,?,?)";

		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd");
		startDay = sdf.format(System.currentTimeMillis());

		try{
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1,startDay);
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
