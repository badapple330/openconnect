package com.internousdev.footprinter.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import com.internousdev.footprinter.util.DBConnector;

/**
 * 新規顧客情報をデータベースに登録するDAOクラス
 * @author 田原 一樹
 * @since 1.0
 * @version 1.0
 */
public class NewMemSuccessDAO {
	/**
	 * データベースへ新規顧客情報をインサートするためのメソッド
	 * @param email メールアドレス
	 * @param password パスワード
	 * @param name 名前
	 * @param nameKana フリガナ
	 * @param tel 電話番号
	 * @return result
	 */
	public int insert(String email, String password, String name, String nameKana, String tel){
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String sdfTime = sdf.format(c.getTime());
		int result = 0;
		Connection con = null;
		DBConnector dbCon = new DBConnector("footprinter");
		con = dbCon.getConnection();
		String sql = "INSERT INTO user (email,password,name,name_kana,tel,created_at,updated_at)value(?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,email);
			ps.setString(2,password);
			ps.setString(3,name);
			ps.setString(4,nameKana);
			ps.setString(5,tel);
			ps.setString(6,sdfTime);
			ps.setString(7,sdfTime);

			result = ps.executeUpdate();
		} catch (Exception e){
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