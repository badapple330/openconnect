package com.internousdev.openconnect.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;


/**
 * LogoutDAO
 * ログアウト時にログインフラグを変更するクラス
 *
 * @author MITSUHASHI RYOTA
 * @since 2016/10/04
 * @version 1.0
 */
public class LogoutDAO {

	/**
	 * DataBaseConnector
	 */
	private DBConnector dbConnector;

	/**
	 * Connection
	 */
	private Connection connection;

	public  LogoutDAO() {
		dbConnector = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");
		connection = dbConnector.getConnection();
	}

	public void logoutAction(Integer userId) {
		String sql = "UPDATE users SET login_flg = ? WHERE user_id = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, 0);
			preparedStatement.setInt(2, userId);
			preparedStatement.executeUpdate();
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
	}
}
