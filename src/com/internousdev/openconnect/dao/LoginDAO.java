package com.internousdev.openconnect.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

public class LoginDAO {

	private int flg;

	public boolean select(String email, String password) {

		boolean result = false;
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");
		Connection con = db.getConnection();

		String sql = "SELECT user_flg FROM user WHERE email = ? AND password = ?";
		;

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

	public int getFlg() {
		return flg;
	}

	public void setFlg(int flg) {
		this.flg = flg;
	}

}
