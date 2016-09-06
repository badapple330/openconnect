/*
 * タイトル：取得したお届け先情報のデータを格納する為の処理
 * 説明    ：取得したお届け先情報のデータを格納する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.dto;

/**
 * お届け先情報を格納する為のクラス
 * @author K.Kamijo
 * @version 1.0
 * @since 1.0
 */
public class MyPageSendAddressDTO {

	/**
	 * 住所ID
	 */
	private int id;

	/**
	 * ユーザーID
	 */
	private int userId;

	/**
	 * 郵便番号
	 */
	private int postalCode;

	/**
	 * 住所
	 */
	private String address;

	/**
	 * 作成日時
	 */
	private String createdAt;

	/**
	 * 住所IDを取得する為のメソッド
	 * @return id 住所ID
	 */
	public int getId() {
		return id;
	}

	/**
	 * 住所IDを格納する為のメソッド
	 * @param id 住所ID
	 */
	public void setId(int id) {
		this.id = id;
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

	/**
	 * 郵便番号を取得する為のメソッド
	 * @return postalCode 郵便番号
	 */
	public int getPostalCode() {
		return postalCode;
	}

	/**
	 * 郵便番号を格納する為のメソッド
	 * @param postalCode 郵便番号
	 */
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * 住所を取得する為のメソッド
	 * @return address 住所
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * 住所を格納する為のメソッド
	 * @param address 住所
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 作成日時を取得する為のメソッド
	 * @return createdAt 作成日時
	 */
	public String getCreatedAt() {
		return createdAt;
	}

	/**
	 * 作成日時を格納する為のメソッド
	 * @param createdAt 作成日時
	 */
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

}