package com.internousdev.openconnect.attendance.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.openconnect.attendance.dto.AttendanceDTO;
import com.internousdev.util.DBConnector;

public class AdminAttendanceDAO {

	public ArrayList<AttendanceDTO> searchList = new ArrayList<AttendanceDTO>();

	/**
	 * 勤怠状況およびを取得し検索するメソッド(ユーザーIDで検索)
	 *
	 * @param userId
	 *            顧客番号
	 * @return searchList
	 */
	public ArrayList<AttendanceDTO> select(String atDate) {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");
		Connection con = db.getConnection();

		String sql = "select * from attendance";
		int ck=1;

		// ユーザーID検索
		if (atDate !="null") {
			sql = "select * from attendance left join users on attendance.user_id = users.user_id where attendance.at_date = ?";
			ck = 1;
			// 空で検索
		} else if (atDate == "null") {
			sql = "select * from attendance left join users on attendance.user_id = users.user_id";
		}
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			switch (ck) {
			case 1:
				ps.setString(1, atDate);
				break;
			}

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				AttendanceDTO dto = new AttendanceDTO();
				dto.setAtDate(rs.getString("at_date"));
				dto.setMonth(rs.getString("month"));
				dto.setFamilyNameKanji(rs.getString("family_name_kanji"));
				dto.setGivenNameKanji(rs.getString("given_name_kanji"));
				dto.setAttendance(rs.getInt("attendance"));
				dto.setReason(rs.getString("reason"));
				searchList.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return searchList;

	}

}
