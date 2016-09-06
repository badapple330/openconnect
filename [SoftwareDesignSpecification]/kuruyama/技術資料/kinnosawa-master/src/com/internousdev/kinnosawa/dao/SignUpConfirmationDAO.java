/*
 * タイトル：新規登録画面で入力されたメールアドレスが既にあるか確認する為の処理
 * 説明    ：MySQLに接続し、メールアドレスを検索
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *        ：
 */
package com.internousdev.kinnosawa.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.kinnosawa.util.DBConnector;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

/**
 * 新規登録画面で入力されたメールアドレスが既にあるか確認する為のクラス
 * @author K.Sugano
 * @version 1.1
 * @since 1.0
 *
 */
public class SignUpConfirmationDAO {

	/**
	 * 新規登録メールアドレスがデータベースにあるか検索する為のメソッド
	 * @param email メールアドレス
	 * @return result 既に存在するか否かを返す
	 */
	public boolean select(String email){

		Connection con=(Connection) DBConnector.getConnection();
		boolean result=false;

		try{
			String sql="SELECT email FROM user WHERE email = ? ";
			PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, email);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				result=true;
			}
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
		return result;
	}
}