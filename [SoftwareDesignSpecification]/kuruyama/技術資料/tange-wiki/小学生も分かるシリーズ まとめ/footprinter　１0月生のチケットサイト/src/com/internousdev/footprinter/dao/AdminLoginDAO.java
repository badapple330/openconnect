package com.internousdev.footprinter.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.footprinter.util.DBConnector;

/**
 * 管理者ログイン処理用DAO
 * @author 田中 賢樹
 * @since 1.0
 * @version 1.0
 */
public class AdminLoginDAO {

	/**
	 * DBConnectorのインスタンス
	 */
	private DBConnector dbCon = new DBConnector("footprinter");
	
	/**
	 * コネクション
	 */
	private Connection con = null;
	
	/**
	 * IDとPASSからの認証メソッド
	 * @param adminId 管理者用ログインID
	 * @param password 管理者用ログインパスワード
	 * @return result
	 */
	public boolean select(String adminId, String password) {
		boolean result = false;
		con = dbCon.getConnection();
		String sql = "SELECT * FROM admin WHERE admin_id = ? AND password = ?";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, adminId);
			stmt.setString(2, password);
			ResultSet resultSet = stmt.executeQuery();
			if (resultSet.next()) {
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
