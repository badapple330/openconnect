/*
 * タイトル：ユーザーから指定された商品データを削除する為の処理
 * 説明    ：ユーザーから指定された商品IDを元に商品データを削除する
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
 * 商品情報をデータベースから削除する為のクラス
 * @author K.Hagiwara
 * @version 1.0
 * @since 1.0
 */
public class AdminItemDeleteDAO {

	/**
	 * 商品情報を削除する為のメソッド
	 * @param id 商品ID
	 * @return count 削除できれば1、できなければ0を返す
	 */
	public int delete(int id) {

		int count = 0;
		Connection conn = DBConnector.getConnection();
		String sql = "Delete from goods WHERE id = ?";

		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,id);
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
