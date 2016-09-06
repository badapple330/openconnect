/*
 * タイトル ：変更内容確認画面に遷移する為の処理
 * 説明    ：registration_change_confirmation.jspへ遷移する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous. Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.action;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

import org.apache.commons.lang.time.DateUtils;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kinnosawa.dao.RegistrationChangeConfirmationDAO;
import com.internousdev.util.CreditCard;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 入力した変更内容を確認画面に表示する為のクラス
 * @author Y.Murakami
 * @version 1.0
 * @since 1.0
 */
public class RegistrationChangeConfirmationAction extends ActionSupport  implements SessionAware  {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 6243647081437966408L;

	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * 現在のメールアドレス
	 */
	private String email;

	/**
	 * 新しいメールアドレス
	 */
	private String newEmail;

	/**
	 * 確認用メールアドレス
	 */
	private String confirmEmail;

	/**
	 * 現在のパスワード
	 */
	private String password;

	/**
	 * パスワード（確認用）
	 */
	private String confirmPassword;

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
	 * 都道府県名
	 */
	private String selectedPrefecture;

	/**
	 * 市区町村以下
	 */
	private String cityName;

	/**
	 * クレジットカード入力選択
	 */
	private int creditInput;

	/**
	 * クレジットカード番号
	 */
	private String creditCardNumber;

	/**
	 * クレジットカード期限（月）
	 */
	private int cardMonth;

	/**
	 * クレジットカード期限（年）
	 */
	private int cardYear;

	/**
	 * クレジットカード有効期限
	 */
	private String expirationDate;

	/**
	 * クレジットカード名義
	 */
	private String creditCardHolder;

	/**
	 * セキュリティコード
	 */
	private String securityCode;

	/**
	 * 入力した変更内容を確認画面に表示する為のメソッド
	 * @return result SUUCESS、ERROR
	 */
	public String execute() throws SQLException  {

		try{
			if(session.get("userId")==null){
				return ERROR;
			}
		}catch(NullPointerException e){
			return ERROR;
		}
		session.remove("updateCardNumber");
		session.remove("updateExpirationDate");
		session.remove("updateCardHolder");
		session.remove("updateSecurityCode");
		setSessionFieldValue();
		return SUCCESS;
	}

	/**
	 * セッションに値を格納する為のメソッド
	 */
	private void setSessionFieldValue(){

		session.put("updateName", name);

		if(!nameKana.isEmpty()){
			session.put("updateNameKana", nameKana);
		}
		session.put("updateTelNumber", telNumber);
		session.put("updatePassword", password);

		if(!newEmail.isEmpty()){
			session.put("updateEmail", newEmail);
		}else if(newEmail.isEmpty()&&!email.isEmpty()){
			session.put("updateEmail", email);
		}
		session.put("updatePostalCode", postalCode);
		session.put("updatePrefecture", selectedPrefecture);
		session.put("updateCityName", cityName);

		if (creditInput==2) {
			session.put("updateCardNumber", creditCardNumber);
			session.put("updateExpirationDate", expirationDate);
			session.put("updateCardHolder", creditCardHolder);
			session.put("updateSecurityCode", securityCode);
		}
	}

	/**
	 * xmlで処理できないvalidationメソッド
	 * @see com.opensymphony.xwork2.ActionSupport#validate()
	 */
	public void validate(){

		if(email.isEmpty()&&(newEmail.isEmpty()||confirmEmail.isEmpty())){
			addFieldError("unsetEmailError", getText("registration_change.unsetEmail"));
		}

		/*
		 * クレジットカード入力時のvalidation
		 * */
		if(creditInput==2){

			if(creditCardNumber.isEmpty()){
				addFieldError("cardNumberError", getText("registration_change.tellRequired"));
			}else if(!creditCardNumber.isEmpty()){
				CreditCard credit = new CreditCard();

				if(!credit.isExists(creditCardNumber)){
					addFieldError("cardNumberError", getText("registration_change.checkCardFormat"));
				}else{
					try {
						if (credit.getCreditCardHolder(creditCardNumber) != null) {
							addFieldError("cardNumberError", getText("registration_change.alreadySomeCard"));
						}
					}catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}

			if(cardMonth==0||cardYear==0){
				addFieldError("checkExpirationDateError", getText("registration_change.tellSelect"));
			}else{
				try {
					Date today = new Date();
					expirationDate =cardMonth+"/"+cardYear;
					SimpleDateFormat sdf = new SimpleDateFormat("MM/yy");
					Date truncMonth = DateUtils.truncate(today, Calendar.MONTH);
					Date checkExpirationDate= sdf.parse(expirationDate);

					if(!(checkExpirationDate.after(truncMonth)||checkExpirationDate.compareTo(truncMonth)==0)){
						addFieldError("checkExpirationDateError", getText("registration_change.oldCard"));
					}
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}

			if(creditCardHolder.isEmpty()){
				addFieldError("cardHolderError", getText("registration_change.tellRequired"));
			}
			if(securityCode.isEmpty()){
				addFieldError("securityCodeError", getText("registration_change.tellRequired"));
			}
		}

		if(!newEmail.isEmpty()){
			RegistrationChangeConfirmationDAO dao = new RegistrationChangeConfirmationDAO();

			if(dao.selectUserEmail(newEmail)){
				addFieldError("emailOverlapError",getText("registration_change.registeredEmail"));
			}
		}
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
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * 現在のメールアドレスを取得する為のメソッド
	 * @return email 現在のメールアドレス
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 現在のメールアドレスを格納する為のメソッド
	 * @param email 現在のメールアドレス
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
	 * パスワード（確認用）を取得する為のメソッド
	 * @return confirmPassword パスワード（確認用）
	 */
	public String getConfirmPassword() {
		return confirmPassword;
	}

	/**
	 * パスワード（確認用）を格納する為のメソッド
	 * @param confirmPassword パスワード（確認用）
	 */
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	/**
	 * 新しいメールアドレスを取得する為のメソッド
	 * @return newEmail 新しいメールアドレス
	 */
	public String getNewEmail() {
		return newEmail;
	}

	/**
	 * 新しいメールアドレスを格納する為のメソッド
	 * @param newEmail 新しいメールアドレス
	 */
	public void setNewEmail(String newEmail) {
		this.newEmail = newEmail;
	}

	/**
	 * 確認用メールアドレスを取得する為のメソッド
	 * @return confirmEmail 確認用メールアドレス
	 */
	public String getConfirmEmail() {
		return confirmEmail;
	}

	/**
	 * 確認用メールアドレスを格納する為のメソッド
	 * @param confirmEmail 確認用メールアドレス
	 */
	public void setConfirmEmail(String confirmEmail) {
		this.confirmEmail = confirmEmail;
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
	 * 都道府県名を取得する為のメソッド
	 * @return selectedPrefecture 都道府県名
	 */
	public String getSelectedPrefecture() {
		return selectedPrefecture;
	}

	/**
	 * 都道府県名を格納する為のメソッド
	 * @param selectedPrefecture 都道府県名
	 */
	public void setSelectedPrefecture(String selectedPrefecture) {
		this.selectedPrefecture = selectedPrefecture;
	}

	/**
	 * 市区町村以下を取得する為のメソッド
	 * @return cityName 市区町村以下
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * 市区町村以下を格納する為のメソッド
	 * @param cityName 市区町村以下
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * クレジットカード入力選択を取得する為のメソッド
	 * @return creditInput クレジットカード入力選択
	 */
	public int getCreditInput() {
		return creditInput;
	}

	/**
	 * クレジットカード入力選択を格納する為のメソッド
	 * @param creditInput クレジットカード入力選択
	 */
	public void setCreditInput(int creditInput) {
		this.creditInput = creditInput;
	}

	/**
	 * クレジットカード番号を取得する為のメソッド
	 * @return creditCardNumber クレジットカード番号
	 */
	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	/**
	 * クレジットカード番号を格納する為のメソッド
	 * @param creditCardNumber クレジットカード番号
	 */
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	/**
	 * クレジットカード期限（月）を取得する為のメソッド
	 * @return cardMonth クレジットカード期限（月）
	 */
	public int getCardMonth() {
		return cardMonth;
	}

	/**
	 * クレジットカード期限（月）を格納する為のメソッド
	 * @param cardMonth クレジットカード期限（月）
	 */
	public void setCardMonth(int cardMonth) {
		this.cardMonth = cardMonth;
	}

	/**
	 * クレジットカード期限（年）を取得する為のメソッド
	 * @return cardYear クレジットカード期限（年）
	 */
	public int getCardYear() {
		return cardYear;
	}

	/**
	 * クレジットカード期限（年）を格納する為のメソッド
	 * @param cardYear クレジットカード期限（年）
	 */
	public void setCardYear(int cardYear) {
		this.cardYear = cardYear;
	}

	/**
	 * クレジットカード有効期限を取得する為のメソッド
	 * @return expirationDate クレジットカード有効期限
	 */
	public String getExpirationDate() {
		return expirationDate;
	}

	/**
	 * クレジットカード有効期限を格納する為のメソッド
	 * @param expirationDate クレジットカード有効期限
	 */
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	/**
	 * クレジットカード名義を取得する為のメソッド
	 * @return creditCardHolder クレジットカード名義
	 */
	public String getCreditCardHolder() {
		return creditCardHolder;
	}

	/**
	 * クレジットカード名義を格納する為のメソッド
	 * @param creditCardHolder クレジットカード名義
	 */
	public void setCreditCardHolder(String creditCardHolder) {
		this.creditCardHolder = creditCardHolder;
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

}