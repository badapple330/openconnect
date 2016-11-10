/**
 *
 */
package com.internousdev.prototype1607.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author internous
 *
 */
public class DBConnector {

	/**
	 * @param args
	 */
	private static String driverName ="com.mysql.jdbc.Driver";
	private static String url="jdbc:mysql://localhost/prototype1607";
	private static String user="root";
	private static String password ="mysql";

	public Connection getConnection(){
		Connection con =null;

		try{
			Class.forName(driverName);
			con=(Connection)DriverManager.getConnection(url, user, password);

		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return con;
	}

}
