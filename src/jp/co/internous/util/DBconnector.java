package jp.co.internous.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DBconnector {
public Connection getConnection(){
	String driverName = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost/openconnect";
	String user = "root";
	String pass = "mysql";
	Connection con = null;

		try {
			Class.forName(driverName);
			con = DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}