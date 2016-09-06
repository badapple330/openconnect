/*
 * タイトル :ユーザー情報を格納する為のクラス
 * 説明    ：ユーザー情報を格納する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 *　変更履歴：
 */
package com.internousdev.kinnosawa.dto;

/**
 * ユーザー情報を格納する為のクラス
 * @author S.Sugimto
 * @version 1.0
 * @since 1.0
 */
public class LoginOauthDTO {

	/**
	 * ユーザー名
	 */
	private String userName;

	/**
	 * ユーザーID
	 */
	private int userId;

	/**
	 * ユーザー名を取得する為のメソッド
	 * @return userName ユーザー名
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * ユーザー名を格納する為のメソッド
	 * @param userName ユーザー名
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * ユーザーIDを取得する為のメソッド
	 * @return userId ユーザーID
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * ユーザーIDを格納する為のメソッド
	 * @param userId ユーザーID
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

}