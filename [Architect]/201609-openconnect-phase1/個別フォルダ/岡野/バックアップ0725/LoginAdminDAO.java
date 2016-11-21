package com.internousdev.openconnect.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.openconnect.util.DaoClass;
import com.internousdev.util.DBConnector;

/**
 * LoginAdminDAO ログイン情報を照会するためのDAOクラス
 *
 * @author Sakai Shinya
 * @since 2015/06/16
 * @version 1.0
 */
public class LoginAdminDAO extends DaoClass {

	private boolean res;

	private String sql;

	private PreparedStatement ps;

	private ResultSet rs;

	/**
	 * 入力された情報とDB内の情報を照合するためのメソッド
	 *
	 * @author Sakai Shinya
	 *
	 * @param admin_name
	 * @param admin_pass
	 * @return res
	 * @throws SQLException
	 * @see DBconnector
	 */
	public boolean select(String adminName, String adminPass) {
		res = false;
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");
		Connection con = db.getConnection();

		sql = "SELECT * FROM admin WHERE admin_name = ? AND admin_pass = ?;";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, adminName);
			ps.setString(2, adminPass);
			rs = ps.executeQuery();
			while (rs.next()) {
				res = true;
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
}
