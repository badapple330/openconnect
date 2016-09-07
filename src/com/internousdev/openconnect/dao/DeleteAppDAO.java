package com.internousdev.openconnect.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

/**
* DeleteAppDAO
* サイトテーブルに接続する為のクラス
* @author MAIKI OKANO
* @since 2016/07/25
* @version 1.0
*/

public class DeleteAppDAO {
	/**
	 * 削除メソッド 指定された情報をDBから削除するメソッド
	 * @param siteId サイトID
	 * @return count 削除に成功したらSUCCESS、失敗したらERROR
	 */
	public int delete(int siteId){
		int count = 0;
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");
		Connection con = db.getConnection();
		String sql = "Delete from site WHERE site_id = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, siteId);
			count = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close(); // DBとの接続終了
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
	}
}
