/**
 *
 */
package com.internousdev.openconnect.attendance_test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.openconnect.attendance.dto.AttendanceDTO;
import com.internousdev.util.DBConnector;

/**
 * 勤怠の検索に関するDAO
 * @author Kawamura
 * @since6/19
 * @version1.0.0
 */
public class AttendanceDao {

	/**
	 * 勤怠履歴を格納する
	 */
	public ArrayList<AttendanceDTO> searchList = new ArrayList<AttendanceDTO>();

	/**
	 * 勤怠状況で名前を取得するメソッド
	 * @param attendance 勤怠
	 * @return adminhistorylist 勤怠登録履歴
	 */
	public ArrayList<AttendanceDTO> select(int atYear, int atMonth, int atDay, String attendance) {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root", "mysql");
		Connection con = db.getConnection();

		ArrayList<AttendanceDTO> searchList = new ArrayList<AttendanceDTO>();

		int k = 0;
		String sql = null;


		if(atYear != 0 && atMonth != 0 && atDay != 0){
			sql ="select * from attendance left join users on attendance.user_id=users.user_id where at_year=? AND at_month=? AND at_day=?";
			k = 1;
		}else if( !((attendance).equals(""))){
			sql ="select * from attendance left join users on attendance.user_id=users.user_id where attendance=?";
			k = 2;
		}

		try {
			PreparedStatement ps = con.prepareStatement(sql); //「?」のパラメーターを持つSQLを実行するためのインターフェイス。SQLコンテナ

			if(k == 1){
				ps.setInt(1,atYear);
				ps.setInt(2,atMonth);
				ps.setInt(3,atDay);

			}else if(k == 2){
				ps.setString(1, attendance);

			}

			ResultSet rs = ps.executeQuery(); //SQL文の実行インターフェース。

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
			rs.close();
			ps.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return searchList;
	}

}
