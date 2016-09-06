package com.internousdev.footprinter.action;


import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.internousdev.util.CreditCard;
import com.opensymphony.xwork2.ActionSupport;

/** 
 * 購入者情報を確認するためのアクションクラス
 * @author 田原 一樹
 * @since 1.0
 * @version 1.0
 */
public class PaymentConfirmAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -3292549269763936240L;
	/**
	 * セッション
	 */
	private Map<String, Object> session;
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
	private String creditNum;
	/**
	 * クレジットカード有効期限年
	 */
	private String expirationYear;
	/**
	 * クレジットカード有効期限月
	 */
	private String expirationMonth;
	/**
	 * クレジットカード有効期限
	 */
	private String expiredDate;
	/**
	 * セキュリティコード
	 */
	private String securityCode;
	/**
	 * クレジットカード番号末尾4桁
	 */
	private String creditNum4;

	/**
	 * エラーメッセージ
	 */
	private String errorMsg;

	/**
	 * 顧客情報をクレジッドカードDAOに渡すメソッド
	 * @return SUCCESS ERROR
	 */
	public String execute() {
		if (!session.containsKey("tourId") ) {
			return ERROR;
		}
		int tourId = (int) session.get("tourId");
		if(tourId == 0){
			return ERROR;
		}

		if (!session.containsKey("loginId") ) {
			return "nologin";
		}
		int loginId = (int) session.get("loginId");
		if (loginId == 0) {
			return "nologin";
		}
		CreditCard credit = new CreditCard();

		boolean result = credit.isExists(creditNum);

		if (result == false) {
			errorMsg = (getText("lang.login.validCreditCardNumbver"));
			return "input";
		}else{

			creditNum4 = credit.getCardNumber();
			expiredDate = expirationMonth + "/" + expirationYear;

			session.put("postalCode", postalCode);
			session.put("address", address);
			session.put("creditNum", creditNum);
			session.put("creditNum4",creditNum4);
			session.put("expiredDate", expiredDate);
			session.put("securityCode",securityCode);
		}
		return SUCCESS;
	}

	/**
	 * 住所取得メソッド
	 * @return address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 住所格納メソッド
	 * @param address 住所
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 郵便番号取得メソッド
	 * @return postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}
	/**
	 * 郵便番号格納メソッド
	 * @param postalCode 郵便番号
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	/**
	 * クレジットカード番号取得メソッド
	 * @return creditNum 
	 */
	public String getCreditNum() {
		return creditNum;
	}
	/**
	 * クレジットカード番号格納メソッド
	 * @param creditNum クレジット番号
	 */
	public void setCreditNum(String creditNum) {
		this.creditNum = creditNum;
	}
	
	/**
	 * セッション格納メソッド
	 * @param session セッション
	 */
	@Override
	public void setSession(Map<String, Object> session) {
		
		this.session = session;
	}
	/**
	 * クレジットカード有効期限月取得メソッド
	 * @return expirationMonth
	 */
	public String getExpirationMonth() {
		return expirationMonth;
	}
	/**
	 * クレジットカード有効期限月格納メソッド
	 * @param expirationMonth クレジットカード有効期限月
	 */
	public void setExpirationMonth(String expirationMonth) {
		this.expirationMonth = expirationMonth;
	}
	/**
	 * クレジットカード有効期限年取得メソッド
	 * @return expirationYear 
	 */
	public String getExpirationYear() {
		return expirationYear;
	}
	/**
	 * クレジットカード有効期限年格納メソッド
	 * @param expirationYear クレジットカード有効期限年
	 */
	public void setExpirationYear(String expirationYear) {
		this.expirationYear = expirationYear;
	}
	/**
	 * クレジットカード番号末尾4桁取得メソッド
	 * @return creditNum4
	 */
	public String getCreditNum4() {
		return creditNum4;
	}
	/**
	 * クレジットカード番号末尾4桁格納メソッド
	 * @param creditNum4 クレジットカード番号末尾4
	 */
	public void setCreditNum4(String creditNum4) {
		this.creditNum4 = creditNum4;
	}
	/**
	 * クレジットカード有効期限取得メソッド
	 * @return expiredDate
	 */
	public String getExpiredDate() {
		return expiredDate;
	}
	/**
	 * クレジットカード有効期限格納メソッド
	 * @param expiredDate クレジットカード有効期限
	 */
	public void setExpiredDate(String expiredDate) {
		this.expiredDate = expiredDate;
	}
	/**
	 * セキュリティコード取得メソッド
	 * @return securityCode
	 */
	public String getSecurityCode() {
		return securityCode;
	}
	/**
	 * セキュリティコード格納メソッド
	 * @param securityCode セキュリティコード
	 */
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	/**
	 * エラーメッセージを取得するメソッド
	 * @return errorMsg
	 */
	public String getErrorMsg() {
		return errorMsg;
	}

	/**
	 * エラーメッセージを設定するメソッド
	 * @param errorMsg エラーメッセージ
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
}
