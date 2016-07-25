package com.internousdev.openconnect.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

	/**
	 * AddAppDAO
	 * サイトテーブルに接続する為のクラス
	 * @author MAIKI OKANO
	 * @since 2016/07/25
	 * @version 1.0
	 */
public class AddAppDAO {

	/**
	 * 挿入メソッド 指定された情報をDBに接続して挿入するメソッド
	 *
	 * @param siteId サイトID
	 * @param siteName サイトの名前
	 * @param siteUrl サイトのURL
	 * @param genre サイトのジャンル
	 * @return count 挿入できたらnull以外、失敗したらnull
	 */
	public int insert(int siteId, String siteName, String siteUrl, String genre) {
		int count = 0;
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");
		Connection con = db.getConnection();
		String sql = "insert into site(site_id, site_name, site_url, genre)values(?,?,?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, siteId);
			ps.setString(2, siteName);
			ps.setString(3, siteUrl);
			ps.setString(4, genre);
			count = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
	}

}
