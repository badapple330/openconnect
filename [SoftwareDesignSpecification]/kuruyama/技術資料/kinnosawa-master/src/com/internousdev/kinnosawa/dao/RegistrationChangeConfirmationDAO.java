/*
 * タイトル  ：登録内容変更確認画面に表示するユーザー情報を取得する為の処理
 * 説明    ：registration_change.jspへ遷移
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
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.kinnosawa.util.DBConnector;

/**
 * DBの内容を取得し、変更する内容を照合する為のクラス
 *
 * @author Y.Murakami
 * @version 1.0
 * @since 1.0
 */
public class RegistrationChangeConfirmationDAO {
	/**
	 * DBの内容を取得し、変更する内容を照合する為のメソッド
	 * @param newEmail 変更するメールアドレス
	 * @return result userテーブルに同一のメールアドレスがあればtrue、なければfalseを返す
	 */
	public boolean selectUserEmail(String newEmail){

		Connection conn = DBConnector.getConnection();
		String sql ="SELECT COUNT(email) AS count FROM user WHERE email =?";
		boolean result = false;

		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, newEmail);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				if(rs.getInt("count")==1){
					result =true;
				}else{
					result =false;
				}
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return result;
	}
}
