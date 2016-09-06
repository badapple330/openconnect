/*
 * タイトル：登録内容変更画面に表示するユーザー情報を格納する為の処理
 * 説明    ：userテーブルの内容を格納する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.dto;

/**
 * 商品一覧情報を格納する為のクラス
 * @author Y.Murakami
 * @version 1.0
 * @since 1.0
 */
public class GoRegistrationChangeDTO {

	/**
	 * ユーザーID
	 */
	private int id;

	/**
	 * メールアドレス
	 */
	private String email;

	/**
	 * パスワード
	 */
	private String password;

	/**
	 * 名前
	 */
	private String name;

	/**
	 * フリガナ
	 */
	private String nameKana;

	/**
	 * 電話番号
	 */
	private String telNumber;

	/**
	 * 郵便番号
	 */
	private String postalCode;

	/**
	 * 住所
	 */
	private String address;

	/**
	 * クレジットカード番号
	 */
	private String cardNumber;

	/**
	 * クレジット用トークン
	 */
	private String cardToken;

	/**
	 * ユーザーIDを取得する為のメソッド
	 * @return id ユーザーID
	 */
	public int getId() {
		return id;
	}

	/**
	 * ユーザーIDを格納する為のメソッド
	 * @param id ユーザーID
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * メールアドレスを取得する為のメソッド
	 * @return email メールアドレス
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * メールアドレスを格納する為のメソッド
	 * @param email メールアドレス
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * パスワードを取得する為のメソッド
	 * @return password パスワード
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * パスワードを格納する為のメソッド
	 * @param password パスワード
	 */
	public void setPassword(String password) {
		this.password = password;
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

	/**
	 * フリガナを取得する為のメソッド
	 * @return nameKana フリガナ
	 */
	public String getNameKana() {
		return nameKana;
	}

	/**
	 * フリガナを格納する為のメソッド
	 * @param nameKana フリガナ
	 */
	public void setNameKana(String nameKana) {
		this.nameKana = nameKana;
	}

	/**
	 * 電話番号を取得する為のメソッド
	 * @return telNumber 電話番号
	 */
	public String getTelNumber() {
		return telNumber;
	}

	/**
	 * 電話番号を格納する為のメソッド
	 * @param telNumber 電話番号
	 */
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	/**
	 * 郵便番号を取得する為のメソッド
	 * @return postalCode 郵便番号
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * 郵便番号を格納する為のメソッド
	 * @param postalCode 郵便番号
	 */
	public void setPostalCode(String postalCode) {
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
	 * クレジットカード番号を取得する為のメソッド
	 * @return cardNumber クレジットカード番号
	 */
	public String getCardNumber() {
		return cardNumber;
	}

	/**
	 * クレジットカード番号を格納する為のメソッド
	 * @param cardNumber クレジットカード番号
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	/**
	 * クレジット用トークンを取得する為のメソッド
	 * @return cardToken クレジット用トークン
	 */
	public String getCardToken() {
		return cardToken;
	}

	/**
	 * クレジット用トークンを格納する為のメソッド
	 * @param cardToken クレジット用トークン
	 */
	public void setCardToken(String cardToken) {
		this.cardToken = cardToken;
	}

}