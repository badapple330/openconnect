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
	public int insert(String userID, String password, String name, String nameF, String postal, String address,
			String telNumber, String email, String sex, String birthday) {
		int result = 0;
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");
		Connection con = db.getConnection();

		String sql = "insert into user(user_id, password, name, name_f, postal, address,"
				+ "tel_number, email, sex, birthday, register_day, update_day," + "userdel_flg, login_flg, user_flg)"
				+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String registerDay = sdf.format(System.currentTimeMillis());

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userID);
			ps.setString(2, password);
			ps.setString(3, name);
			ps.setString(4, nameF);
			ps.setString(5, postal);
			ps.setString(6, address);
			ps.setString(7, telNumber);
			ps.setString(8, email);
			ps.setString(9, sex);
			ps.setString(10, birthday);
			ps.setString(11, registerDay);
			ps.setString(12, "0000/00/00 00:00:00");
			ps.setBoolean(13, false);
			ps.setBoolean(14, true);
			ps.setInt(15, 1);
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
	public boolean selectByUserId(String userId) {
		boolean result = false;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");
		Connection con = db.getConnection();

		String sql = "select * from user where user_id=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
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
