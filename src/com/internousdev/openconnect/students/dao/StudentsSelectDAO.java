package com.internousdev.openconnect.students.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.students.dto.StudentsDTO;
import com.internousdev.util.DBConnector;


public class StudentsSelectDAO {

	public List<StudentsDTO> searchList = new ArrayList<StudentsDTO>();

	public List<StudentsDTO> select(String search) {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root", "mysql");
		Connection con = db.getConnection();

		try {
//			String sql = "SELECT*FROM users WHERE family_name = ?";
			String sql = "SELECT * FROM users WHERE family_name LIKE '%" + search + "%'";

			PreparedStatement ps = con.prepareStatement(sql);
//			ps.setString(1, search);
			ResultSet rs = ps.executeQuery();


			while (rs.next()) {
				StudentsDTO dto = new StudentsDTO();
				dto.setUserId(rs.getInt("user_id"));
				dto.setPassword(rs.getString("password"));
				dto.setFamilyName(rs.getString("family_name"));
				dto.setGivenName(rs.getString("given_name"));
				dto.setFamilyNameKanji(rs.getString("family_name_kanji"));
				dto.setFamilyNameKana(rs.getString("family_name_kana"));
				dto.setGivenNameKanji(rs.getString("given_name_kanji"));
				dto.setGivenNameKana(rs.getString("given_name_kana"));
				dto.setPostal(rs.getString("postal"));
				dto.setAddress(rs.getString("address"));
				dto.setPhoneNumber(rs.getString("phone_number"));
				dto.setPhoneEmail(rs.getString("phone_email"));
				dto.setMobileNumber(rs.getString("mobile_number"));
				dto.setMobileEmail(rs.getString("mobile_email"));
				dto.setSex(rs.getString("sex"));
				dto.setBirthday(rs.getString("birthday"));
				dto.setRegisterDay(rs.getString("register_day"));
				dto.setUpdateDay(rs.getString("update_day"));
				dto.setUserdelFlg(rs.getBoolean("userdel_flg"));
				dto.setLoginFlg(rs.getBoolean("login_flg"));
				dto.setUserFlg(rs.getInt("user_flg"));
				dto.setYear(rs.getString("year"));
				dto.setMonth(rs.getString("month"));

				searchList.add(dto);
			}

		}  catch (SQLException e) {
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