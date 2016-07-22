package jp.co.internous.dao;

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
	public boolean update(int site_id, String site_name, String site_url, String site_group) throws SQLException {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");
		Connection con = db.getConnection();

		try {
			String sql = "update site set site_name=?, site_url=?, site_group=? where site_id=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, site_name);
			ps.setString(2, site_url);
			ps.setString(3, site_group);
			ps.setInt(4, site_id);
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
