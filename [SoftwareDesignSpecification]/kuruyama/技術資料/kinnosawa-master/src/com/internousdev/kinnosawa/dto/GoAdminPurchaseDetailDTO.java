/*
 * タイトル：取得した購入詳細情報のデータを格納する為の処理
 * 説明    ：取得した購入詳細情報のデータを格納する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.dto;

/**
 * 購入詳細情報を格納する為のクラス
 * @author K.Hagiwara
 * @version 1.0
 * @since 1.0
 */
public class GoAdminPurchaseDetailDTO {

	/**
	 * 注文者名
	 */
	private String userName;

	/**
	 * お届け先住所
	 */
	private String address;

	/**
	 * 注文者電話番号
	 */
	private String telNumber;

	/**
	 * 注文者メールアドレス
	 */

	private String mail;

	/**
	 * 注文商品名
	 */
	private String goodsName;

	/**
	 * 注文個数
	 */
	private int buyNumber;

	/**
	 * 注文日
	 */
	private String buyDate;

	/**
	 * 注文者名を取得する為のメソッド
	 * @return userName 注文者名
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 注文者名を格納する為のメソッド
	 * @param userName 注文者名
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * お届け先住所を取得する為のメソッド
	 * @return address お届け先住所
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * お届け先住所を格納する為のメソッド
	 * @param address お届け先住所
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 注文者電話番号を取得する為のメソッド
	 * @return telNumber 注文者電話番号
	 */
	public String getTelNumber() {
		return telNumber;
	}

	/**
	 * 注文者電話番号を格納する為のメソッド
	 * @param telNumber 注文者電話番号
	 */
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	/**
	 * 注文者メールアドレスを取得する為のメソッド
	 * @return mail 注文者メールアドレス
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * 注文者メールアドレスを格納する為のメソッド
	 * @param mail 注文者メールアドレス
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * 注文商品名を取得する為のメソッド
	 * @return goodsName 注文商品名
	 */
	public String getGoodsName() {
		return goodsName;
	}

	/**
	 * 注文商品名を格納する為のメソッド
	 * @param goodsName 注文商品名
	 */
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	/**
	 * 注文個数を取得する為のメソッド
	 * @return buyNumber 注文個数
	 */
	public int getBuyNumber() {
		return buyNumber;
	}

	/**
	 * 注文個数を格納する為のメソッド
	 * @param buyNumber 注文個数
	 */
	public void setBuyNumber(int buyNumber) {
		this.buyNumber = buyNumber;
	}

	/**
	 * 注文日を取得する為のメソッド
	 * @return buyDate 注文日
	 */
	public String getBuyDate() {
		return buyDate;
	}

	/**
	 * 注文日を格納する為のメソッド
	 * @param buyDate 注文日
	 */
	public void setBuyDate(String buyDate) {
		this.buyDate = buyDate;
	}

}