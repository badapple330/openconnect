/**
 *
 */
package com.internousdev.openconnect.attendance.dao;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

import com.internousdev.util.DBConnector;

/**
 * 出席状況についてデータベースに問い合わせをおこないます。
 * @author Matsumoto Teppei
 * @since 2017/06/02
 * @version 1.0
 */
public class AttendanceDAO {

	/**
	 *@param user_id 	ユーザー番号
	 *@param attendance 出欠状況
	 *@param reason		備考
	 *@return ret
	 */

	public int insert(int user_id,int attendance,String reason){

		DBConnector db=new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
		Connection con =db.getConnection();
		int count = 0;

		/* 管理者が日本人であることを想定しているため、
		   日本のタイムゾーンで現在の日付を取得 */
		Calendar cal = Calendar.getInstance();
		TimeZone tz = TimeZone.getTimeZone("Asia/Tokyo");
		cal.setTimeZone(tz);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		String dt = sdf.format(cal.getTime());


	}

}
