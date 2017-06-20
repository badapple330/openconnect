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
	public ArrayList<AttendanceDTO> displayList = new ArrayList<AttendanceDTO>();

	/**
	 * 勤怠状況で名前を取得するメソッド
	 * @param attendance 勤怠
	 * @return adminhistorylist 勤怠登録履歴
	 */
	public ArrayList<AttendanceDTO> select(String attendance,String familyNameKanji) {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root", "mysql");
		Connection con = db.getConnection();

		ArrayList<AttendanceDTO> searchList = new ArrayList<AttendanceDTO>();

		int k=0;
		String sql = null;


		if(!((attendance).equals(""))){
			sql ="select * from attendance left join users on attendance.user_id=users.user_id where attendance=?";
			k=1;
		}

		try {
			PreparedStatement ps = con.prepareStatement(sql); //「?」のパラメーターを持つSQLを実行するためのインターフェイス。SQLコンテナ

			if(k==1){
				ps.setString(1, attendance);
			}

			ResultSet rs = ps.executeQuery(); //SQL文の実行インターフェース。

			while (rs.next()) {
				AttendanceDTO dto = new AttendanceDTO();

				dto.setFamilyNameKanji(rs.getString("family_name_kanji"));
				dto.setAttendance(rs.getString("attendance"));
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

	/**
	 * @param attendance
	 * @return
	 */


}
