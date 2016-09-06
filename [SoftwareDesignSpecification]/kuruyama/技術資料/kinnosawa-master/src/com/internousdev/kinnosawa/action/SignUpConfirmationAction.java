/*
 * タイトル：登録内容確認画面に表示する情報を取得する為のクラス
 * 説明    ：sign_up_confirmation.jspに表示する情報を取得する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kinnosawa.dao.SignUpConfirmationDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 登録内容確認画面に表示する情報を取得する為のクラス
 * @author K.Sugano
 * @version 1.1
 * @since 1.0
 */
public class SignUpConfirmationAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -257299509616429862L;

	/**
	 *セッション
	 */
	private Map<String, Object>session;

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
	private String tellNum;

	/**
	 * メールアドレス
	 */
	private String email;

	/**
	 * 確認用メールアドレス
	 */
	private String checkEmail;

	/**
	 * パスワード
	 */
	private String password;

	/**
	 * パスワード(確認用)
	 */
	private String checkPassword;

	/**
	 * 郵便番号
	 */
	private String postalCode;

	/**
	 * 都道府県
	 */
	private String addressPrefecture;

	/**
	 * 市区町村
	 */
	private String addressCity;

	/**
	 * 住所(市区町村以降)
	 */
	private String addressOther;

	/**
	 * メールアドレスのエラーメッセージ
	 */
	private String errorEmail;

	/**
	 * 入力に誤りがないか確認し、処理する為のメソッド
	 * @return 既存登録アドレスになければSUCCESS、あればERRORを返す
	 */
	public String execute(){

		boolean result=false;
		SignUpConfirmationDAO dao=new SignUpConfirmationDAO();

		try{
			result= dao.select(email);
				if(result){
					errorEmail=getText("sign_up.errorEmailAlready");
					return ERROR;
				}
		}catch(Exception e){
			e.printStackTrace();
		}
		StringBuilder addreses = new StringBuilder();
		addreses.append(addressPrefecture);
		addreses.append(addressCity);
		addreses.append(addressOther);
		String address=addreses.toString();
		session.put("email", email);
		session.put("password", password);
		session.put("name", name);
		session.put("nameKana", nameKana);
		session.put("tellNum", tellNum);
		session.put("postalCode", postalCode);
		session.put("address", address);
		return SUCCESS;
	}

	/**
	 * セッションを格納をする為のメソッド
	 * @param session セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session=session;
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
	 * @return tellNum 電話番号
	 */
	public String getTellNum() {
		return tellNum;
	}

	/**
	 * 電話番号を格納する為のメソッド
	 * @param tellNum 電話番号
	 */
	public void setTellNum(String tellNum) {
		this.tellNum = tellNum;
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
	 * メールアドレス(確認用)を取得する為のメソッド
	 * @return checkEmail メールアドレス(確認用)
	 */
	public String getCheckEmail() {
		return checkEmail;
	}

	/**
	 * メールアドレス(確認用)を格納する為のメソッド
	 * @param checkEmail メールアドレス(確認用)
	 */
	public void setCheckEmail(String checkEmail) {
		this.checkEmail = checkEmail;
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
	 * パスワード(確認用)を取得する為のメソッド
	 * @return checkPassword パスワード(確認用)
	 */
	public String getCheckPassword() {
		return checkPassword;
	}

	/**
	 * パスワード(確認用)を格納する為のメソッド
	 * @param checkPassword パスワード(確認用)
	 */
	public void setCheckPassword(String checkPassword) {
		this.checkPassword = checkPassword;
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
	 * 都道府県を取得する為のメソッド
	 * @return addressPrefecture 都道府県
	 */
	public String getAddressPrefecture() {
		return addressPrefecture;
	}

	/**
	 * 都道府県を格納する為のメソッド
	 * @param addressPrefecture 都道府県
	 */
	public void setAddressPrefecture(String addressPrefecture) {
		this.addressPrefecture = addressPrefecture;
	}

	/**
	 * 市区町村を取得する為のメソッド
	 * @return addressCity 市区町村
	 */
	public String getAddressCity() {
		return addressCity;
	}

	/**
	 * 市区町村を格納する為のメソッド
	 * @param addressCity 市区町村
	 */
	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	/**
	 * 住所(市区町村以降)を取得する為のメソッド
	 * @return addressOther 住所(都道府県以降)
	 */
	public String getAddressOther() {
		return addressOther;
	}

	/**
	 * 住所(市区町村以降)を格納する為のメソッド
	 * @param addressOther 住所(都道府県以降)
	 */
	public void setAddressOther(String addressOther) {
		this.addressOther = addressOther;
	}

	/**
	 * メールアドレスのエラーメッセージを取得する為のメソッド
	 * @return errorEmail メールアドレスのエラーメッセージ
	 */
	public String getErrorEmail() {
		return errorEmail;
	}

	/**
	 * メールアドレスのエラーメッセージを格納する為のメソッド
	 * @param errorEmail メールアドレスのエラーメッセージ
	 */
	public void setErrorEmail(String errorEmail) {
		this.errorEmail = errorEmail;
	}
}