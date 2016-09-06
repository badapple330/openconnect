/*
 * タイトル：取得した購入情報を格納する為の処理
 * 説明    ：取得した購入情報を格納する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.dto;

/**
 * 購入履歴情報を格納する為のクラス
 * @author K.Hagiwara
 * @version 1.0
 * @since 1.0
 */
public class AdminPurchaseDTO {

	/**
	 * ユーザーID
	 */
	private int userId;

	/**
	 * 届け先ID
	 */
	private int addressId;

	/**
	 * 注文番号
	 */
	private int orderNumber;

	/**
	 * ユーザー名
	 */
	private String userName;

	/**
	 * 購入日時
	 */
	private String buyDate;

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
	 * 届け先IDを取得する為のメソッド
	 * @return addressId 届け先ID
	 */
	public int getAddressId() {
		return addressId;
	}

	/**
	 * 届け先IDを格納する為のメソッド
	 * @param addressId 届け先ID
	 */
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	/**
	 * 注文番号を取得する為のメソッド
	 * @return orderNumber 注文番号
	 */
	public int getOrderNumber() {
		return orderNumber;
	}

	/**
	 * 注文番号を格納する為のメソッド
	 * @param orderNumber 注文番号
	 */
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

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
	 * 購入日時を取得する為のメソッド
	 * @return buyDate 購入日時
	 */
	public String getBuyDate() {
		return buyDate;
	}

	/**
	 * 購入日時を格納する為のメソッド
	 * @param buyDate 購入日時
	 */
	public void setBuyDate(String buyDate) {
		this.buyDate = buyDate;
	}

}