/*
 * タイトル ：変更完了画面に遷移する為の処理
 * 説明    ：registration_change_completion.jspへ遷移する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kinnosawa.dao.RegistrationChangeCompletionDAO;
import com.internousdev.util.CreditCard;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 変更した登録情報を確定する為のクラス
 * @author Y.Murakami
 * @version 1.0
 * @since 1.0
 */
public class RegistrationChangeCompletionAction extends ActionSupport implements SessionAware  {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 1598457446699889956L;

	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * ユーザーID
	 */
	private int userId;

	/**
	 * 名前
	 */
	private String userName;

	/**
	 * フリガナ
	 */
	private String userNameKana;

	/**
	 * 電話番号
	 */
	private String telNumber;

	/**
	 * メールアドレス
	 */
	private String email;

	/**
	 * パスワード
	 */
	private String password;

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
	 * クレジットカード有効期限
	 */
	private String expiredDate;

	/**
	 * クレジットカード名義
	 */
	private String cardHolder;

	/**
	 * セキュリティコード
	 */
	private String securityCode;

	/**
	 * クレジットカード番号末尾4文字
	 */
	private String cardNumberLastFourCharacters;

	/**
	 * クレジットカードトークン
	 */
	private String creditCardToken;

	/**
	 * 変更した登録情報を確定する為のメソッド
	 * @return result 変更した情報が登録できればSUCCESS、できなければERRORを返す
	 */
	public String execute() throws SQLException {

		String result=ERROR;
		userId=(int)session.get("userId");

		if(!(session.get("updateCardNumber")==null)){
			cardNumber=(String)session.get("updateCardNumber");
			expiredDate=(String)session.get("updateExpirationDate");
			cardHolder=(String)session.get("updateCardHolder");
			securityCode=(String)session.get("updateSecurityCode");
			CreditCard credit = new CreditCard();

			if(credit.add(cardNumber, cardHolder, expiredDate, securityCode, userId)!=1){
				return ERROR;
			}else{
				cardNumberLastFourCharacters= credit.getCreditCardNumber();
				creditCardToken=credit.getToken();
			}
		}
		userName=(String)session.get("updateName");

		if(session.get("updateNameKana")==null){
			userNameKana=null;
		}else{
			userNameKana=(String)session.get("updateNameKana");
		}
		telNumber=(String)session.get("updateTelNumber");
		email=(String)session.get("updateEmail");
		password=(String)session.get("updatePassword");
		postalCode=(String)session.get("updatePostalCode");
		address=((String)session.get("updatePrefecture"))+((String)session.get("updateCityName"));
		RegistrationChangeCompletionDAO dao = new RegistrationChangeCompletionDAO();

		if(!(session.get("updateCardNumber")==null)){
			if (!dao.informationRegistration(userName,userNameKana,telNumber,email,password,postalCode,address,cardNumberLastFourCharacters,creditCardToken,userId)) {
				result=ERROR;
			}else{
				session.put("userName", userName);
				result=SUCCESS;
			}
		}else {
			if (!dao.informationRegistration(userName,userNameKana,telNumber,email,password,postalCode,address,userId)) {
				result=ERROR;
			}else{
				session.put("userName", userName);
				result=SUCCESS;
			}
		}
		session.remove("updateCardNumber");
		session.remove("updateExpirationDate");
		session.remove("updateCardHolder");
		session.remove("updateSecurityCode");
		session.remove("updateTelNumber");
		session.remove("updateEmail");
		session.remove("updatePassword");
		session.remove("updatePostalCode");
		session.remove("updatePrefecture");
		session.remove("updateCityName");
		return result;
	}

	/**
	 * セッションを取得する為のメソッド
	 * @return session セッション
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッションを格納する為のメソッド
	 * @param session セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
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
	 * フリガナを取得する為のメソッド
	 * @return userNameKana フリガナ
	 */
	public String getUserNameKana() {
		return userNameKana;
	}

	/**
	 * フリガナを格納する為のメソッド
	 * @param userNameKana フリガナ
	 */
	public void setUserNameKana(String userNameKana) {
		this.userNameKana = userNameKana;
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
	 * @return cardNumber クレジットカード番号記入
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
	 * クレジットカード有効期限を取得する為のメソッド
	 * @return expiredDate クレジットカード有効期限
	 */
	public String getExpiredDate() {
		return expiredDate;
	}

	/**
	 * クレジットカード有効期限を格納する為のメソッド
	 * @param expiredDate クレジットカード有効期限
	 */
	public void setExpiredDate(String expiredDate) {
		this.expiredDate = expiredDate;
	}

	/**
	 * クレジットカード名義を取得する為のメソッド
	 * @return cardHolder クレジットカード名義
	 */
	public String getCardHolder() {
		return cardHolder;
	}

	/**
	 * クレジットカード名義を格納する為のメソッド
	 * @param cardHolder クレジットカード名義
	 */
	public void setCardHolder(String cardHolder) {
		this.cardHolder = cardHolder;
	}

	/**
	 * セキュリティコードを取得する為のメソッド
	 * @return securityCode セキュリティコード
	 */
	public String getSecurityCode() {
		return securityCode;
	}

	/**
	 * セキュリティコードを格納する為のメソッド
	 * @param securityCode セキュリティコード
	 */
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	/**
	 * クレジットカード番号末尾4文字を取得する為のメソッド
	 * @return cardNumberLastFourCharacters クレジットカード番号末尾4文字
	 */
	public String getCardNumberLastFourCharacters() {
		return cardNumberLastFourCharacters;
	}

	/**
	 * クレジットカード番号末尾4文字を格納する為のメソッド
	 * @param cardNumberLastFourCharacters クレジットカード番号末尾4文字
	 */
	public void setCardNumberLastFourCharacters(String cardNumberLastFourCharacters) {
		this.cardNumberLastFourCharacters = cardNumberLastFourCharacters;
	}

	/**
	 * クレジットカードトークンを取得する為のメソッド
	 * @return creditCardToken クレジットカードトークン
	 */
	public String getCreditCardToken() {
		return creditCardToken;
	}

	/**
	 * クレジットカードトークンを格納する為のメソッド
	 * @param creditCardToken クレジットカードトークン
	 */
	public void setCreditCardToken(String creditCardToken) {
		this.creditCardToken = creditCardToken;
	}

}