/*
 * タイトル :ログイン判定をする為にDBと接続する為の処理
 * 説明    ：ログイン判定をする為にDBと接続する
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

import com.internousdev.kinnosawa.util.DBConnector;

/**
 * ログイン判定をする為にDBと接続する為のクラス
 * @author S.Sugimoto
 * @version 1.0
 * @since 1.0
 */
public class GoLoginDAO {

	/**
	 * ユーザーID
	 */
	private int id;

	/**
	 * 名前
	 */
	private String name;

	/**
	 * DBと接続する為のメソッド
	 * @param email メールアドレス
	 * @param password パスワード
	 * @return result DBと照合出来ていればtrue、出来ていなければfalseを返す
	 */
	public boolean select(String email, String password){

		boolean result = false;
		Connection con = DBConnector.getConnection();
		String sql = "SELECT id,name FROM user WHERE email = ? AND password = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2,password);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				id = rs.getInt("id");
				name = rs.getString("name");
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
	 * IDを取得する為のメソッド
	 * @return id ID
	 */
	public int getId() {
		return id;
	}

	/**
	 * IDを格納する為のメソッド
	 * @param id ID
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 名前を取得する為のメソッド
	 * @return name 名前
	 */
	public String getName() {
		return name;
	}

	/**
	 * 名前を格納する為のメソッド
	 * @param name 名前
	 */
	public void setName(String name) {
		this.name = name;
	}

}