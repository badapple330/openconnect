/**
 *
 */
package com.internousdev.rewrite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

/**
 * @author internous
 *
 */
public class AdminArticleDeleteDAO {



	/**
	 * 記事をDBから削除する
	 * @author SANSHIRO KOCHO
	 * @param loginId
	 *             ログインID
	 * @param password
	 *             パスワード
	 * @return dto データが存在すればnull以外、存在しなければnull
	 */
	public int delete(String siteTitle){

		int count =0;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","rewrite","root","mysql");
		Connection conn = db.getConnection();

		String sql = "delete from article where site_title = ?";
		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, siteTitle);
			count = ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try{
				conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return count;
	}

}
