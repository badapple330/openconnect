/*
 * タイトル：ユーザーの会員情報をNULLにする為のクラス
 *
 * 説明    ：退会の際、購入履歴を残すために会員情報をNULLにする処理
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
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
 * ユーザーの会員情報をNULLにする為のクラス
 * @author K.Kamijo
 * @version 1.0
 * @since 1.0
 */

public class WithdrawalDAO {

	/**
     * メールアドレス、パスワード、電話番号、郵便番号、住所、クレジットカード番号、クレジット用トークン、
     * OAuth用ID、OAuth名、名前、フリガナ情報をNULLにする為のメソッド。
     * @param id ユーザーID
     * @return count 処理が成功すれば1、失敗すれば0を返す
	 */
	public int update(int id) {

		Connection con = DBConnector.getConnection();
		int count = 0;

		try{
			String sql ="UPDATE user SET email=NULL,password=NULL,name=NULL,name_kana=NULL,tel_num=NULL,postal_code=NULL,"
					+ "address=NULL,card_num=NULL,token=NULL,oauth_id=NULL,oauth_name=NULL  WHERE id =?";
			PreparedStatement ps;
			ps = con.prepareStatement(sql);
			ps.setInt(1,id);
			count = ps.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try{
				con.close();
			}
			catch(SQLException e){
				e.printStackTrace();
			}
		}
		return count;
	}
}