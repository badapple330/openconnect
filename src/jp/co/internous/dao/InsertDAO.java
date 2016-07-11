package jp.co.internous.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jp.co.internous.util.DBconnector;

/**
 * InsertDAO InsertActionがDBにアクセスするためのDAOクラス
 *
 * @author Arima Genki
 * @since 2015/06/18
 * @version 1.0
 */
public class InsertDAO {
	/**
	 * アプリを追加するメソッド
	 *
	 * @author Arima Genki
	 * @since 2015/06/18
	 * @param siteName
	 * @param url
	 * @return result
	 * @throws SQLException
	 */
	public int insert(String site_id, String site_name, String site_url, String site_group)
     	{
		int result = 0;
		new DBconnector();
		Connection con = DBconnector.getConnection();
		try {
			String sql = "insert into site(site_id, site_name, site_url, site_group )"
					+ "values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, site_id);
			ps.setString(2, site_name);
			ps.setString(3, site_url);
			ps.setString(4, site_group);
			result = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 抽出メソッド 指定されたログインＩＤが存在するかＤＢに接続して調べる
	 *
	 * @author YUKI MAEDA
	 * @param site_id
	 *            ユーザーID
	 * @return 存在したらtrue、存在しなければfalse
	 */
	public boolean selectBySiteId(String site_id) {
		boolean result = false;

		new DBconnector();
		Connection con = DBconnector.getConnection();

		String sql = "select * from site where site_id=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, site_id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				result = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

}
