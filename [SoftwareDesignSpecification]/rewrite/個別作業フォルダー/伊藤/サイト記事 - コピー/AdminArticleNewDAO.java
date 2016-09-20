/**
 *
 */
package com.internousdev.rewrite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import com.internousdev.util.DBConnector;

/**
 * @author internous
 *
 */
public class AdminArticleNewDAO {
	/**
	 * 新規記事作成内容をDBに保存する
	 * @author SANSHIRO KOCHO
	 * @param loginId
	 *             ログインID
	 * @param password
	 *             パスワード
	 * @return result 挿入に成功したら1以上、失敗したら0
	 */

	public int insert(String siteDate,String siteJanre,String siteTitle, String summary, String imageUrl, String siteBanner){

		int count = 0;

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        siteDate = sdf.format(System.currentTimeMillis());


		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","rewrite","root","mysql");
		Connection conn = db.getConnection();
		String sql = "INSERT INTO article (site_date,site_janre, site_title, summary, image_url, site_Banner)VALUES(?, ?, ?, ? ,?, ?)";
		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,siteDate);
			ps.setString(2,siteJanre);
			ps.setString(3,siteTitle);
			ps.setString(4,summary);
			ps.setString(5,imageUrl);
			ps.setString(6,siteBanner);

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
