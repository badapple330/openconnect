/**
 *
 */
package com.internousdev.openconnect.attendance.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.internousdev.openconnect.attendance.dto.AttendanceDTO;
import com.internousdev.util.DBConnector;

/**
 * @author Kawamura
 * @since 6/29
 * @version 1.0.0
 */
public class AdminAttendanceLeaderDAO {

	/* 勤怠履歴を格納する */
	public ArrayList<AttendanceDTO> searchList  = new ArrayList<AttendanceDTO>();

	/**
	 *
	 * @param atYear
	 * @param atMonth
	 * @param atDay
	 * @param familyNameKanji
	 * @param givenNameKanji
	 * @param attendance
	 * @param teamName
	 * @return searchList
	 */
	public ArrayList<AttendanceDTO> select(int atYear,int atMonth,int atDay,String attendance,String teamName) {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root", "mysql");
		Connection con = db.getConnection();
		Statement statement = null;

		/* 検索結果格納DTO */
		ArrayList<AttendanceDTO> searchList = new ArrayList<AttendanceDTO>();

		String sql = null;
		/* sql文生成に用いるWhere節文字列 */
		String whereState = "";

		/* 自動で日付とチーム名を取得した値をwhereStateに格納 */
		whereState += "at_year="+atYear +" AND at_month="+atMonth +" AND at_day="+atDay +" AND team_name="+teamName;

		/* 勤怠状況を定義した時 */
		if(!((attendance).equals(""))){
			whereState += "AND " +"attendance"+attendance;
		}

		/* sql文定義 */
		if(!((whereState).equals(""))){
		sql = "select * from attendance left join users on attendance.user_id=users.user_id where " +whereState + ";";
		}

	try {
		statement = con.createStatement();
		ResultSet rs = statement.executeQuery(sql); //SQL文の実行インターフェース。

		while (rs.next()) {
			AttendanceDTO dto = new AttendanceDTO();
			dto.setAtDate(rs.getString("at_date"));
			dto.setMonth(rs.getString("month"));
			dto.setFamilyNameKanji(rs.getString("family_name_kanji"));
			dto.setGivenNameKanji(rs.getString("given_name_kanji"));
			dto.setTeamName(rs.getString("team_name"));
			dto.setAttendance(rs.getString("attendance"));
			dto.setReason(rs.getString("reason"));
			searchList.add(dto);
		}

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			/* Close Resouces */
			con.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	return searchList;
}

}
