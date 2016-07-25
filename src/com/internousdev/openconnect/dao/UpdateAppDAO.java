package com.internousdev.openconnect.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

/**
 * UpdateAppDAO UpdateAppActionがDBにアクセスするためのDAOクラス
 *
 * @author Arima Genki
 * @since 2015/06/18
 * @version 1.0
 */
public class UpdateAppDAO {

	Connection con = null;

	PreparedStatement ps = null;

	boolean result = false;

	/**
	 * アプリを編集するメソッド
	 *
	 * @author Arima Genki
	 * @since 2015/06/18
	 * @param id
	 * @param siteName
	 * @param url
	 * @param add_group
	 * @return result
	 * @throws SQLException
	 */
	public boolean update(int siteId, String siteName, String siteUrl, String siteGroup) throws SQLException {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");
		Connection con = db.getConnection();

		try {
			String sql = "update site set site_name=?, site_url=?, site_group=? where site_id=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, siteName);
			ps.setString(2, siteUrl);
			ps.setString(3, siteGroup);
			ps.setInt(4, siteId);
			int rsCount = ps.executeUpdate();
			if (rsCount > 0) {
				result = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return result;
	}
}
