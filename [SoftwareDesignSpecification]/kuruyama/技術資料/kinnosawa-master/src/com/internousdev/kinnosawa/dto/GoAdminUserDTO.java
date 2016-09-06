/*
 * タイトル：データベースから取得したデータを格納する為のクラス
 * 説明    ：データベースから取得したデータを格納する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 *変更履歴：2016.02.16 Tuesday
 *        :
 */
package com.internousdev.kinnosawa.dto;

/**ユーザー情報を格納する為のクラス
 * @author S.Makino
 * @version 1.0
 * @since 1.0
 */
public class GoAdminUserDTO {

	/**
	 * ID
	 */
	private int id;

	/**
	 * ユーザー名
	 */
	private String userName;

	/**
	 * 電話番号
	 */
	private String tel;

	/**
	 * Eメールアドレス
	 */
	private String address;

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
	 * @return userName 名前
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 名前を格納する為のメソッド
	 * @param userName 名前
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * アドレスを取得する為のメソッド
	 * @return address アドレス
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * アドレスを格納する為のメソッド
	 * @param address アドレス
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 電話番号を取得する為のメソッド
	 * @return tel 電話番号
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * 電話番号を格納する為のメソッド
	 * @param tel 電話番号
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}

}