package com.internousdev.openconnect.students.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
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
			String sql = "SELECT * FROM users WHERE family_name LIKE '%" + search + "%'";

			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");

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
				try{ dto.setBirthday(sdf.format( rs.getDate("birthday") ).toString()); }catch(Exception e){}
				try{ dto.setRegisterDay(sdf2.format( rs.getDate("register_day") ).toString()); }catch(Exception e){ e.printStackTrace(); }
				try{ dto.setUpdateDay(sdf2.format( rs.getDate("update_day") ).toString()); }catch(Exception e){ e.printStackTrace(); }
				dto.setUserdelFlg(rs.getBoolean("userdel_flg"));
				dto.setLoginFlg(rs.getBoolean("login_flg"));
				dto.setUserFlg(rs.getInt("user_flg"));
				dto.setYear(rs.getString("year"));
				dto.setMonth(rs.getString("month"));

				System.out.println( dto.getUpdateDay() );

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