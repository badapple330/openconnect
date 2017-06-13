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

	/**
	 * ユーザーフラグ
	 */
	private int userFlg;

	/**
	 * ログインアクションフラグ
	 */
	private int loginActionFlg;

	/**
	 * ユーザーデリートフラグ
	 */
	private int userDelFlg;

	/**
	 * ユーザーID
	 */
	private int userId;

	/**
	 * DataBaseConnector
	 */
	private DBConnector dbConnector;

	/**
	 * Connection
	 */
	private Connection connection;

	public LoginDAO() {
		dbConnector = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");
		connection = dbConnector.getConnection();
	}

	/**
	 * 指定された情報をDBの情報と照合するメソッド
	 * @param email メールアドレス
	 * @param password パスワード
	 * @return flg 照合に成功したらSUCCESS、失敗したらERROR
	 */
	public boolean select(String email, String password, String sql) {
		boolean result = false;

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password);
			ResultSet rs = preparedStatement.executeQuery();

			if (rs.next()) {
				userId = rs.getInt("user_id");
				userFlg = rs.getInt("user_flg");
				userDelFlg = rs.getInt("userdel_flg");
				loginActionFlg = rs.getInt("login_flg");
			}

			// ログイン可能な状態であるかをチェック
			if(loginActionFlg <= 0 && userFlg != 0 && userDelFlg == 0) {
				if(this.changeLoginFlg(userId, 1)) {
					result = true;
				}
			}
			if(loginActionFlg > 0 && userFlg != 0) {
				// タイムアウト等でログアウトした場合にログイン状態を戻す
				this.changeLoginFlg(userId, 0);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	/**
	 * ログインユーザーを対象にログインフラグを変更
	 * @param userId
	 * @return blooean
	 * @throws SQLException
	 */
	public boolean changeLoginFlg(int userId, int changeLoginFlg) throws SQLException {
		String sql = "UPDATE users SET login_flg = ? WHERE user_id = ?";
		boolean result = false;

		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, changeLoginFlg);
			ps.setInt(2, userId);
			ps.executeUpdate();

			result = true;
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			connection.close();
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
		return userFlg;
	}
	/**
	 * ユーザーフラグを格納するメソッド
	 *
	 * @author YUKI MAEDA
	 * @param flg
	 *            格納するユーザーフラグ
	 */
	public void setFlg(int userFlg) {
		this.userFlg = userFlg;
	}

	/**
	 * 対象ユーザーのIDを取得
	 *
	 * @author RYOTA MITSUHASHI
	 * @return userId 登録されたユーザーのPrimaryKey
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * 対象ユーザーのIDを格納
	 *
	 * @author RYOTA MITSUHASHI
	 * @param userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

}
