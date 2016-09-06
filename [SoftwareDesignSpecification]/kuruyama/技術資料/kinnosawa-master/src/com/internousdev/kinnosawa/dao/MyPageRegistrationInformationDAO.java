/*
 * タイトル：ユーザーの登録情報を取得する為の処理

 * 説明    ：データベースの会員情報テーブルから登録内容を取得する
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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.kinnosawa.dto.MyPageUserDTO;
import com.internousdev.kinnosawa.util.DBConnector;

	    /**
	     * 会員情報を検索してを登録内容を取得する為のクラス
	     * @author K.Kamijo
	     * @version 1.0
         * @since 1.0
	     */
public class MyPageRegistrationInformationDAO {

	 	/**
	 	 * 会員情報
	 	 */
		private ArrayList<MyPageUserDTO>userList = new ArrayList<MyPageUserDTO>();

	 	/**
		 * 会員情報のテーブルから、会員情報を取得する為のメソッド。
	 	 * @param userId ユーザーID
		 * @return cardNum クレジットカード番号
		 */
	 	public boolean select(int userId){

	 		boolean result = false;
	 		Connection con = DBConnector.getConnection();

	 		try {
	 			String sql = "SELECT user.id,user.email,user.password,user.name,user.name_kana,"
	 					+ "user.tel_num,user.postal_code,user.address,user.card_num from user where id=?";
	 			PreparedStatement ps;
	 			ps = con.prepareStatement(sql);
	 			ps.setInt(1,userId);
	 			ResultSet rs = ps.executeQuery();
	 			while (rs.next()) {
	 				MyPageUserDTO dto = new  MyPageUserDTO();
	 				dto.setEmail(rs.getString("email"));
	 				dto.setPassword(rs.getString("password"));
	 				dto.setName(rs.getString("name"));
	 				dto.setNameKana(rs.getString("name_kana"));
	 				dto.setTelNum(rs.getString("tel_num"));
	 				dto.setPostalCode(rs.getString("postal_code"));
	 				dto.setAddress(rs.getString("address"));
	 				dto.setCardNum(rs.getString("card_num"));
	 				userList.add(dto);
	 				result = true;
	 			}
	 		} catch (Exception e)
	 			{
	 			e.printStackTrace();
	 			}
	 			finally {
	 				try {
	 				con.close();
	 				}
	 					catch (SQLException e) {
	 						e.printStackTrace();
	 					}
	 			}
	 			return result;
	 	}

		/**
		 * 会員情報を取得する為のメソッド
		 * @return userList 会員情報
		 */
		public ArrayList<MyPageUserDTO> getUserList() {
			return userList;
		}

		/**
		 * 会員情報を格納する為のメソッド
		 * @param userList 会員情報
		 */
		public void setUserList(ArrayList<MyPageUserDTO> userList) {
			this.userList = userList;
		}
}
