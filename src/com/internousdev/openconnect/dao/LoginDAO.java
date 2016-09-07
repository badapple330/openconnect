package com.internousdev.openconnect.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

/**
* LoginDAO
* ユーザーテーブルに接続する為のクラス
* @author MAIKI OKANO
* @since 2016/07/25
* @version 1.0
*/
public class LoginDAO {

	private int flg = 0;

	/**
	 * 指定された情報をDBの情報と照合するメソッド
	 * @param email メールアドレス
	 * @param password パスワード
	 * @return flg 照合に成功したらSUCCESS、失敗したらERROR
	 */
	public boolean select(String email, String password, String sql) {
		boolean result = false;
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");
		Connection con = db.getConnection();

		try {

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				flg = rs.getInt("user_flg");
				result = true;
			}


		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	/**
	 * ユーザーフラグを取得メソッド
	 *
	 * @author YUKI MAEDA
	 * @return flg 取得するユーザーフラグ
	 */
	public int getFlg() {
		return flg;
	}
	/**
	 * ユーザーフラグを格納するメソッド
	 *
	 * @author YUKI MAEDA
	 * @param flg
	 *            格納するユーザーフラグ
	 */
	public void setFlg(int flg) {
		this.flg = flg;
	}

}
