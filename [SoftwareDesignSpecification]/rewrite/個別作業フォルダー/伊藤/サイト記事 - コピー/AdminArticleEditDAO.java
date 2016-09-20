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
public class AdminArticleEditDAO {
	/**
	 * 新規記事作成内容をDBに保存する
	 * @author SANSHIRO KOCHO
	 * @param siteTitle
	 *             記事タイトル
	 * @param summery
	 *             まとめ本文
	 * @param url
	 *          画像URL
	 * @param siteBanner
	 *          外部サイトURL
	 * @param siteId
	 *          サイトID
	 * @return result 編集に成功したら1以上、失敗したら0
	 */
	public int update(String siteDate,String siteTitle,String newSiteTitle,String siteJanre,String imageUrl,String summary,String siteBanner){

		int count = 0;

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        siteDate = sdf.format(System.currentTimeMillis());

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","rewrite","root","mysql");
		Connection conn = db.getConnection();

		String sql = "Update article set site_date =?,site_title =?, site_janre =?,summary =?, image_url=?, site_Banner=? where site_title =?";
		try{

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, siteDate);
			ps.setString(2, newSiteTitle);
			ps.setString(3, siteJanre);
			ps.setString(4, summary);
			ps.setString(5, imageUrl);
			ps.setString(6, siteBanner);
			ps.setString(7, siteTitle);
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


//	/** 日付フォーマット */
//	static public final String DATE_PATTERN ="yyyy/MM/dd HH:mm:ss";
//	/**
//     * [概 要] Date型⇒String型への変換処理
//     * @author SANSHIRO KOCHO
//     * @param  date 変換前日付オブジェクト
//     * @return String型オブジェクト,変換に失敗した場合はnullを返す
//     */
//	public String parseDateToString(SimpleDateFormat date){
//		String  str;
//		if(date == null) {
//			str = null;
//		} else {
//			str = new SimpleDateFormat(DATE_PATTERN).format(date);
//		}
//		return str;
//	}


}
