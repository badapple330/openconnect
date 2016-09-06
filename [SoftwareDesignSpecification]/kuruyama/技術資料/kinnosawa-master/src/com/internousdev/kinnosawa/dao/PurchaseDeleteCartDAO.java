/*
 * タイトル  ：購入完了時にカートの情報を削除する為の処理
 * 説明    ：購入完了時にカートの情報を削除する
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.dao;

import java.sql.SQLException;

import com.internousdev.kinnosawa.util.DBConnector;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

/**
 * 購入完了時にカートの情報を削除する為のクラス
 * @author k.Sugano
 * @version 1.1
 * @since 1.0
 */
public class PurchaseDeleteCartDAO {

	/**
	 * カートのデータベースに接続し、情報を削除する為のメソッド
	 * @param userId ユーザーID
	 * @return count 処理が成功すれば1、失敗すれば0を返す
	 */
	public int delete(int userId){
		int count=0;
		Connection con=(Connection) DBConnector.getConnection();
		String sql="DELETE FROM cart WHERE user_id = ?";
		try{
			PreparedStatement ps=(PreparedStatement)con.prepareStatement(sql);
			ps.setInt(1, userId);
			count=ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			if(con!=null){
				try{
					con.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
		return count;
	}
}

