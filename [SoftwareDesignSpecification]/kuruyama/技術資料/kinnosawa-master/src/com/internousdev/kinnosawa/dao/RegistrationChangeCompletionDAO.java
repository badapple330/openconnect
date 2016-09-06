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
import java.sql.SQLException;

import com.internousdev.kinnosawa.util.DBConnector;

/**
 * 変更するユーザーの情報をDBに登録する為のクラス
 *
 * @author Y.Murakami
 * @version 1.0
 * @since 1.0
 */
public class RegistrationChangeCompletionDAO {

	/**
	 * クレジットカードの情報と変更するユーザー個人情報をDBに登録する為のメソッド
	 * @param userName 名前
	 * @param userNameKana フリガナ
	 * @param telNumber 電話番号
	 * @param email メールアドレス
	 * @param password パスワード
	 * @param postalCode 郵便番号
	 * @param address 住所
	 * @param cardNumber クレジットカード番号
	 * @param creditToken クレジットカードトークン
	 * @param userId ユーザーID
	 * @return result 登録ができた場合true、できなければfalseを返す
	 */
	public boolean informationRegistration(String userName,String userNameKana,String telNumber,String email,String password,String postalCode,String address,String cardNumber,String creditToken,int userId){

		boolean result=false;
		int count = 0;
		Connection conn = DBConnector.getConnection();
		String sql="UPDATE user SET "
				+"email=? ,password=? ,name=? ,name_kana=? ,tel_num=? ,postal_code=? ,address=? ,card_num=? ,token=? WHERE id=?" ;

		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			ps.setString(3, userName);
			ps.setString(4, userNameKana);
			ps.setString(5, telNumber);
			ps.setString(6, postalCode);
			ps.setString(7, address);
			ps.setString(8, cardNumber);
			ps.setString(9, creditToken);
			ps.setInt(10,userId);
			count=ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		if(count!=0){
			result=true;
		}else{
			result=false;
		}
		return result;
	}

	/**
	 * 変更するユーザー個人情報のみをDBに登録する為のメソッド
	 * @param userName 名前
	 * @param userNameKana フリガナ
	 * @param telNumber 電話番号
	 * @param email メールアドレス
	 * @param password パスワード
	 * @param postalCode 郵便番号
	 * @param address 住所
	 * @param userId ユーザーID
	 * @return result 登録ができた場合true、できなければfalseを返す
	 */
	public boolean informationRegistration(String userName,String userNameKana,String telNumber,String email,String password,String postalCode,String address,int userId){

		boolean result=false;
		int count = 0;
		Connection conn = DBConnector.getConnection();
		String sql="UPDATE user SET "
				+"email=? ,password=? ,name=? ,name_kana=? ,tel_num=? ,postal_code=? ,address=? WHERE id=?" ;

		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			ps.setString(3, userName);
			ps.setString(4, userNameKana);
			ps.setString(5, telNumber);
			ps.setString(6, postalCode);
			ps.setString(7, address);
			ps.setInt(8,userId);
			count=ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		if(count!=0){
			result=true;
		}else{
			result=false;
		}
		return result;
	}

}
