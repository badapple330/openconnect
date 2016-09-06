/*
 * タイトル：ユーザー情報をデータベースから検索する為の処理
 * 説明    ：ユーザー情報をデータベースから検索する
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

import com.internousdev.kinnosawa.dto.GoAdminUserDTO;
import com.internousdev.kinnosawa.util.DBConnector;

/**
 * ユーザー検索する際、データベース内を検索する為のクラス
 * @author S.Makino
 * @version 1.0
 * @since 1.0
 */
public class AdminUserSearchDAO{

	/**
	 * ユーザー一覧情報を格納する為のリスト
	 */
	ArrayList<GoAdminUserDTO> userList = new ArrayList<GoAdminUserDTO>();

	/**
	 * データベースから検索する為のメソッド
	 * @param user ユーザーID
	 * @return result データが引き出せればtrue,失敗すればfalseを返す
	 */
	public boolean userSearchSelect(String user){

		boolean result = false;
		Connection con=DBConnector.getConnection();
		String sql = "SELECT * FROM user WHERE name LIKE '%"+user+"%' ORDER BY id desc";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				GoAdminUserDTO dto = new GoAdminUserDTO();
				dto.setId(rs.getInt("id"));
				dto.setUserName(rs.getString("name"));
				dto.setTel(rs.getString("tel_num"));
				dto.setAddress(rs.getString("address"));
				userList.add(dto);
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
	 * ユーザー情報を取得する為のメソッド
	 * @return userList ユーザー情報を格納するリスト
	 */
	public ArrayList<GoAdminUserDTO> getUserList() {
		return userList;
	}

	/**
	 * ユーザー情報を格納する為のメソッド
	 * @param userList ユーザー情報を格納するリスト
	 */
	public void setUserList(ArrayList<GoAdminUserDTO> userList) {
		this.userList = userList;
	}

}