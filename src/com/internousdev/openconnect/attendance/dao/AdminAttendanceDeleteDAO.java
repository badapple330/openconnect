/**
 *
 */
package com.internousdev.openconnect.attendance.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

/**
 * 月の情報を管理者が削除するクラス
 * @author Kawamura
 * @since 6/23
 * @version 1.0.0
 */
public class AdminAttendanceDeleteDAO {

	/**
	 * 月が一致するデータを全件削除するメソッド
	 * @param at_month
	 * @return list
	 */
	public int delete(int at_month){
		int list = 0;
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");
		Connection con = db.getConnection();
		String sql = "delete from attendance where at_month = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,at_month);
			list = ps.executeUpdate();

		} catch(SQLException e){
			e.printStackTrace();
		} finally {
			try{
				con.close();
			} catch(SQLException e){
				e.printStackTrace();
			}
		}
		return list;
	}
}
