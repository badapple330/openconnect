/*
 * タイトル：取得した会員情報のデータを格納する為の処理
 * 説明    ：取得した会員情報のデータを格納する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.dto;

/**
* 会員情報を格納する為のクラス
* @author K.Kamijo
* @version 1.0
* @since 1.0
*/
public class MyPageUserDTO {

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
	private String telNum;

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
	private String cardNum;

	/**
	 * クレジット用トークン
	 */
	private String token;

	/**
	 * OAuth用ID
	 */
	private String oauthId;

	/**
	 * OAuth名
	 */
	private String oauthName;

	/**
	 * 作成日時
	 */
	private String createdAt;

	/**
	 * 更新日時
	 */
	private String updatedAt;

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
	 * @return telNum 電話番号
	 */
	public String getTelNum() {
		return telNum;
	}

	/**
	 * 電話番号を格納する為のメソッド
	 * @param telNum 電話番号
	 */
	public void setTelNum(String telNum) {
		this.telNum = telNum;
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
	 * @return cardNum クレジットカード番号
	 */
	public String getCardNum() {
		return cardNum;
	}

	/**
	 * クレジットカード番号を格納する為のメソッド
	 * @param cardNum クレジットカード番号
	 */
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	/**
	 * クレジット用トークンを取得する為のメソッド
	 * @return token クレジット用トークン
	 */
	public String getToken() {
		return token;
	}

	/**
	 * クレジット用トークンを格納する為のメソッド
	 * @param token クレジット用トークン
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * OAuth用IDを取得する為のメソッド
	 * @return oauthId OAuth用ID
	 */
	public String getOauthId() {
		return oauthId;
	}

	/**
	 * OAuth用IDを格納する為のメソッド
	 * @param oauthId OAuth用ID
	 */
	public void setOauthId(String oauthId) {
		this.oauthId = oauthId;
	}

	/**
	 * OAuth名を取得する為のメソッド
	 * @return oauthName OAuth名
	 */
	public String getOauthName() {
		return oauthName;
	}

	/**
	 * OAuth名を格納する為のメソッド
	 * @param oauthName OAuth名
	 */
	public void setOauthName(String oauthName) {
		this.oauthName = oauthName;
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

	/**
	 * 更新日時を取得する為のメソッド
	 * @return updatedAt 更新日時
	 */
	public String getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * 更新日時を格納する為のメソッド
	 * @param updatedAt 更新日時
	 */
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

}