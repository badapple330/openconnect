package jp.co.internous.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.util.DBConnector;

import jp.co.internous.dto.LoginDTO;

public class LoginDAO {

	private boolean resultDAO = false;

	private String sql;
	private PreparedStatement stmt;
	private ResultSet result;

	public boolean select(String email, String password) {
		try {
			DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
					"mysql");
			Connection con = db.getConnection();

			sql = "SELECT * " + "FROM user " + "WHERE email = \"" + email + "\" " + "AND password = \"" + password
					+ "\"";

			stmt = con.prepareStatement(sql);
			result = stmt.executeQuery();

			while (result.next()) {
				resultDAO = true;
				LoginDTO logindto = new LoginDTO();
				logindto.setEmail(result.getString(1));
				logindto.setPassword(result.getString(2));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return resultDAO;
	}
}
