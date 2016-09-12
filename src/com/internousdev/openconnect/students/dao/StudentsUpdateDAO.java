package com.internousdev.openconnect.students.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

public class StudentsUpdateDAO {
	public int update(
			int userId, String password, String familyName, String givenName, String familyNameKanji, String familyNameKana,
			String givenNameKanji, String givenNameKana, String postal, String address, String phoneNumber, String phoneEmail,
			String mobileNumber, String mobileEmail, String sex, String birthday, String registerDay, String updateDay,
			boolean userdelFlg, boolean loginFlg, int userFlg, int year, String month){

		int result= 0;
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");
		Connection con = db.getConnection();

		String sql = "UPDATE users SET "
				+ "password=?, family_name=?, given_name=?, family_name_kanji=?, family_name_kana=?, given_name_kanji=?,"
				+ " given_name_kana=?, postal=?, address=?, phone_number=?, phone_email=?, mobile_number=?, mobile_email=?, "
				+ "sex=?, birthday=?, register_day=?, update_day=?, userdel_flg=?, login_flg=?, user_flg=?, year=?, month=? "
				+ "where user_id=?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1,password);
			ps.setString(2,familyName);
			ps.setString(3,givenName);
			ps.setString(4,familyNameKanji);
			ps.setString(5,familyNameKana);
			ps.setString(6,givenNameKanji);
			ps.setString(7,givenNameKana);
			ps.setString(8,postal);
			ps.setString(9,address);
			ps.setString(10,phoneNumber);
			ps.setString(11,phoneEmail);
			ps.setString(12,mobileNumber);
			ps.setString(13,mobileEmail);
			ps.setString(14,sex);
			ps.setString(15,birthday);
			ps.setString(16,registerDay);
			ps.setString(17,updateDay);
			ps.setBoolean(18,userdelFlg);
			ps.setBoolean(19,loginFlg);
			ps.setInt(20,userFlg);
			ps.setInt(21,year);
			ps.setString(22,month);
			ps.setInt(23,userId);

			result =ps.executeUpdate();

		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch (SQLException e){
				e.printStackTrace();
			}
		}

		return result;
	}

}




