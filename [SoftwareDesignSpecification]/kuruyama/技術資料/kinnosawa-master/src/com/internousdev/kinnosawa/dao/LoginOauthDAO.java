/*
 * タイトル :SNSを利用したログインをする為の処理
 * 説明    ：OAuthから受け取った値をDBと参照、あるいは追加する
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 *変更履歴：
 */
package com.internousdev.kinnosawa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.kinnosawa.dto.LoginOauthDTO;
import com.internousdev.kinnosawa.util.DBConnector;

/**
 * SNSを利用したログインをする為のクラス
 * @author S.Sugimoto
 * @version 1.0
 * @since 1.0
 */
public class LoginOauthDAO {

	/**
	 * DTO
	 */
	private LoginOauthDTO dto = new LoginOauthDTO();

	/**
	 * 取得したユニークIDを照合する為のメソッド
	 * @param userUniqueId OAuthのサービス先のユニークID
	 * @param oauthName OAuthのサービス名
	 * @return result ユニークIDを照合出来たらtrue、出来ていなければfalseを返す
	 */
	public boolean select(String userUniqueId, String oauthName){

		boolean result = false;
		Connection con = DBConnector.getConnection();
		String sql = "SELECT id,name FROM user WHERE oauth_id = ? AND oauth_name = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userUniqueId);
			ps.setString(2, oauthName);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				dto.setUserId(rs.getInt(1));
				dto.setUserName(rs.getString(2));
				result = true;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * OAuth認証が初めてのだった場合、ユーザー情報として追加する為のメソッド
	 * @param uniqueId OAuthのサービス先のユニークID
	 * @param userName OAuthのサービス先でのユーザー名
	 * @param oauthName OAuthのサービス名
	 * @return result ユニークIDを作成出来ていたらtrue、出来ていなければfalseを返す
	 */
	public boolean insert(String uniqueId, String userName, String oauthName){

		boolean result = false;
		Connection con = DBConnector.getConnection();
		String sql = "INSERT INTO user(name, oauth_id,oauth_name) values(?,?,?)";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userName);
			ps.setString(2, uniqueId);
			ps.setString(3, oauthName);
			int insertCount = ps.executeUpdate();
			if(insertCount > 0){
				result = true;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * DTOを取得する為のメソッド
	 * @return dto DTO
	 */
	public LoginOauthDTO getLoginOauthDTO() {
		return dto;
	}

	/**
	 * DTOを格納する為のメソッド
	 * @param dto DTO
	 */
	public void setLoginOauthDTO(LoginOauthDTO dto) {
		this.dto = dto;
	}

}