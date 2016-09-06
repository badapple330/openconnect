/*
 * タイトル  ：登録内容変更画面に表示するユーザー情報を取得する為の処理
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

import com.internousdev.kinnosawa.dto.GoRegistrationChangeDTO;
import com.internousdev.kinnosawa.util.DBConnector;

/**
 * 登録内容変更画面に表示するユーザー情報を取得する為のクラス
 *
 * @author Y.Murakami
 * @version 1.0
 * @since 1.0
 */
public class GoRegistrationChangeDAO {

	/**
	 * 登録内容変更画面に表示するユーザー情報を取得する為のメソッド
	 * @param userId ユーザーID
	 * @param dto インスタンス化した商品一覧情報を格納するためのdto
	 * @return result ユーザー情報が取得できればtrue、できなければfalseを返す
	 */
	public boolean registrationChange(int userId,GoRegistrationChangeDTO dto) {

		boolean result = false;
		Connection conn = DBConnector.getConnection();
		String sql ="SELECT email,password,name,name_kana,tel_num,postal_code,address FROM user WHERE id =?";

		try {
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setInt(1, userId);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				dto.setEmail(rs.getString("email"));
				dto.setPassword(rs.getString("password"));
				dto.setName(rs.getString("name"));
				dto.setNameKana(rs.getString("name_kana"));
				dto.setTelNumber(rs.getString("tel_num"));
				dto.setPostalCode(rs.getString("postal_code"));
				dto.setAddress(rs.getString("address"));
				result = true;
			}
		} catch (SQLException e) {
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
