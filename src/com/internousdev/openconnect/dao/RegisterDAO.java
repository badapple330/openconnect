package com.internousdev.openconnect.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import com.internousdev.util.DBConnector;

/**
 * 新規登録情報を格納するためのDAO
 *
 * @author YUKI MAEDA
 * @since 2016/07/11
 */
public class RegisterDAO {

	/**
	 * 挿入メソッド 指定された情報をDBに接続して挿入するメソッド
	 *
	 * @author YUKI MAEDA
	 * @param userID
	 *            ユーザーID
	 * @param password
	 *            パスワード
	 * @param name
	 *            名前
	 * @param nameF
	 *            名前(ふりがな)
	 * @param postal
	 *            郵便番号
	 * @param address
	 *            住所
	 * @param telNumber
	 *            代表者
	 * @param email
	 *            メールアドレス
	 * @param sex
	 *            性別
	 * @param birthday
	 *            誕生日
	 *
	 * @return result 挿入に成功したら1以上、失敗したら0
	 */
	public int insert(int userId, String password, String familyName, String givenName, String familyNameKanji, String familyNameKana,
			String givenNameKanji, String givenNameKana, String zip, String address, String telNumber, String email, String mobileNumber,
			String mobileEmail, String sex, String birthday, int year, String month) {
		int result = 0;
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");
		Connection con = db.getConnection();

//		String sql = "insert into user(user_id, password, name, name_f, postal, address,"
//				+ "tel_number, email, sex, birthday, register_day, update_day," + "userdel_flg, login_flg, user_flg)"
//				+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		String sql = "insert into users(user_id, password, family_name, given_name, family_name_kanji, given_name_kanji,"
+" family_name_kana, given_name_kana, postal, address, phone_number, phone_email, mobile_number, mobile_email, sex,"
+" birthday, register_day, login_flg, user_flg, year, month)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String registerDay = sdf.format(System.currentTimeMillis());

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, userId);
			ps.setString(2, password);
			ps.setString(3, familyName);
			ps.setString(4, givenName);
			ps.setString(5, familyNameKanji);
			ps.setString(6, givenNameKanji);
			ps.setString(7, familyNameKana);
			ps.setString(8, givenNameKana);
			ps.setString(9, zip);
			ps.setString(10, address);
			ps.setString(11, telNumber);
			ps.setString(12, email);
			ps.setString(13, mobileNumber);
			ps.setString(14, mobileEmail);
			ps.setString(15, sex);
			ps.setString(16, birthday);
			ps.setString(17, registerDay);
			ps.setBoolean(18, true);
			ps.setInt(19, 1);
			ps.setInt(20, year);
			ps.setString(21, month);
			result = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		 }finally {
	            try{
	                con.close();
	            }catch(SQLException e){
	                e.printStackTrace();
	            }
	        }
		return result;
	}

	/**
	 *
	 * 指定されたユーザーＩＤが存在するかＤＢに接続して調べるメソッド
	 *
	 * @author YUKI MAEDA
	 * @param userId
	 *            ユーザーID
	 * @return 存在したらtrue、存在しなければfalse
	 */
	public boolean select(String email) {
		boolean result = false;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");
		Connection con = db.getConnection();

		String sql = "select * from user where email=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, email);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				result = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

}
