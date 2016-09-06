/*
 * タイトル：ユーザーから入力された商品データを追加する為の処理
 * 説明    ：ユーザーから入力された商品データを追加する
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.kinnosawa.util.DBConnector;

/**
 * 商品情報を追加する為のクラス
 * @author K.Hagiwara
 * @version 1.0
 * @since 1.0
 */
public class AdminItemInsertDAO {

	/**
	 * データベースに商品情報を追加する為のメソッド
	 * @param name 商品名
	 * @param price 価格
	 * @param imgPath 画像パス
	 * @param setImgPath セット画像パス
	 * @param allergie アレルギー
	 * @param category カテゴリー
	 * @param closeUp イチオシ
	 * @param detail 諸品詳細
	 * @param topPage トップページ表示
	 * @return count 処理が成功したら1、失敗なら0を返す
	 */
	public int insert(String name, float price, String imgPath, String setImgPath, String allergie, String category, boolean closeUp, String detail, boolean topPage){

		int count = 0;
		Connection conn = DBConnector.getConnection();
		String sql = "INSERT INTO goods"
				+ "(name,price,detail,img_path,set_img_path,allergie,top_page,category,close_up)"
				+ "VALUES(?,?,?,?,?,?,?,?,?)";

		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,name);
			ps.setFloat(2,price);
			ps.setString(3,detail);
			ps.setString(4,imgPath);
			ps.setString(5,setImgPath);
			ps.setString(6,allergie);
			ps.setBoolean(7,topPage);
			ps.setString(8,category);
			ps.setBoolean(9,closeUp);
			count = ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return count;
	}
}
