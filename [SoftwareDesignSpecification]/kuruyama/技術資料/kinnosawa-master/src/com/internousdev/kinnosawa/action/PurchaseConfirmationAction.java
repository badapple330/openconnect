/*
 * タイトル ：購入確認画面に表示する情報を取得する為の処理
 * 説明    ：purchase_confirmation.jspへ遷移する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.action;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.regex.Pattern;

import org.apache.commons.lang.time.DateUtils;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kinnosawa.dao.PurchaseConfirmationSendDAO;
import com.internousdev.kinnosawa.dto.PurchaseConfirmationDTO;
import com.internousdev.util.CreditCard;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 購入手続き画面の情報を取得して購入確認画面に表示する為のクラス
 * @author K.Kamijo
 * @version 1.0
 * @since 1.0
 */
public class PurchaseConfirmationAction extends ActionSupport implements SessionAware {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -6655898976649849519L;

	/**
	 * ユーザーID
	 */
	private int userId;

	/**
	 * 金額
	 */
	private int subTotal;

	/**
	 * 数量
	 */
	private int subNumber;

	/**
	 * 消費税
	 */
	private int tax;

	/**
	 * 住所
	 */
	private String streetAddress;

	/**
	 * 送料
	 */
	private int sendPrice;

	/**
	 * 合計金額
	 */
	private int totalPrice;

	/**
	 * 購入情報のリスト
	 */
	private ArrayList<PurchaseConfirmationDTO> list = new ArrayList<PurchaseConfirmationDTO>();

	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * ユーザー名
	 */
	private String userName;

	/**
	 * 電話番号
	 */
	private String phoneNumber;

	/**
	 * 郵便番号
	 */
	private String postalCode;

	/**
	 * 送り先ユーザー名
	 */
	private String newUserName;

	/**
	 *送り先電話番号
	 */
	private String newPhoneNumber;

	/**
	 * 送り先郵便番号
	 */
	private String newPostalCode;

	/**
	 * 送り先住所
	 */
	private String newStreetAddress;

	/**
	 * クレジットカード番号
	 */
	private String cardNumber;

	/**
	 * クレジットカード名義
	 */
	private String cardName;

	/**
	 * 新しいクレジットカード番号
	 */
	private String NewCardNumber;

	/**
	 * 暗証番号
	 */
	private String securityCode;

	/**
	 * 有効期限の月
	 */
	private String limitMonth;

	/**
	 * 有効期限の年
	 */
	private String limitYear;

	/**
	 * 住所の種類
	 */
	private String sendAddress;

	/**
	 * クレジットカードの種類
	 */
	private String creditRadio;

	/**
	 * エラーメッセージ
	 */
	private String error;


	/**
	 * 購入手続き画面の情報を取得して購入確認画面に表示する為のメソッド
	 * @return result 購入情報を取得できたらSUCCESS、ログインできてなかった場合はlogincheck、それ以外の場合はERRORを返す
	 */
	public String execute(){

		if(session.containsKey("userId")){
			userId = (int) session.get("userId");
		}else{
			return "logincheck";
		}

		if(sendAddress.equals("2")){
			if(check("^[ぁ-んァ-ヶ一-龠一-十]+$",newUserName)){
				error=(getText("purchase_confirmation.check_name"));
				return ERROR;
			}else if(check("^[0-9]{10,11}$",newPhoneNumber)){
				error=(getText("purchase_confirmation.check_tell"));
				return ERROR;
			}else if(check("^[0-9]{7}$",newPostalCode)){
				error=(getText("purchase_confirmation.check_postal"));
				return ERROR;
			}else if(check("^[一-龠]+[都道府県]+[ぁ-ゞァ-ヶ一-龠]+[市区町村]+[ぁ-ゞァ-ヶ一-龠0-9０-９-－ーa-zA-Z]+$", newStreetAddress)){
				error=(getText("purchase_confirmation.check_adress"));
				return ERROR;
			}
			userName = newUserName;
			phoneNumber = newPhoneNumber;
			postalCode = newPostalCode;
			streetAddress = newStreetAddress;
		}

		if(creditRadio.equals("2")){

			CreditCard creditCard = new CreditCard();

			if(!creditCard.isExists(NewCardNumber)){
				error=(getText("purchase_confirmation.check_card_number"));
				return ERROR;
			}else{
				try {
					if(creditCard.getCreditCardHolder(NewCardNumber)!=null){
						error=(getText("purchase_confirmation.check_card_user"));
						return ERROR;
					}
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}

			if(check("~[0-12]$",limitMonth) && check("^[0-9]{2}$",limitYear)){
				error=(getText("purchase_confirmation.check_card_limit1"));
				return ERROR;
			}

			if(limitMonth.equals("")||limitYear.equals("")){
				error=(getText("purchase_confirmation.check_card_limit1"));
			}else{
				try {
					Date today = new Date();
					String expirationDate =limitMonth+"/"+limitYear;
					SimpleDateFormat sdf = new SimpleDateFormat("MM/yy");
					Date truncMonth = DateUtils.truncate(today, Calendar.MONTH);
					Date checkExpirationDate= sdf.parse(expirationDate);
					if(!(checkExpirationDate.after(truncMonth) || (checkExpirationDate.compareTo(truncMonth)==0))){
						error=(getText("purchase_confirmation.check_card_limit2"));
						return ERROR;
					}
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}

			if(check("^[A-Z]+$",cardName)){
				error=(getText("purchase_confirmation.check_card_name"));
				return ERROR;
			}else if(check("^[0-9]{3,4}$",securityCode)){
				error=(getText("purchase_confirmation.check_card_code"));
				return ERROR;
			}

		}
		PurchaseConfirmationSendDAO dao = new PurchaseConfirmationSendDAO();
		String daoMessage = dao.search(userId, streetAddress, list);
		subTotal = dao.getSubTotal();
		subNumber = dao.getSubNumber();
		tax = dao.getTax();
		sendPrice = dao.getSendPrice();
		totalPrice = dao.getTotalPrice();

		if(daoMessage.equals("error")){
			System.out.println("aaa");
			return ERROR;
		}else if(!daoMessage.equals("success")){
			error=(daoMessage);
			System.out.println("aaa");
			return ERROR;
		}
		session.remove("userNameAddress");
		session.remove("cardNumber");
		return SUCCESS;
	}

	/**
	 * 正規表現をチェックする為のメソッド
	 * @param pattern 正規表現
	 * @param str 対象文字
	 * @return result パターンに合致したらfalse、合致しなかったらtrue
	 */
	private boolean check(String pattern, String str){

		return !Pattern.compile(pattern).matcher(str).find();
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
	 * 金額を取得する為のメソッド
	 * @return subTotal 金額
	 */
	public int getSubTotal() {
		return subTotal;
	}

	/**
	 * 金額を格納する為のメソッド
	 * @param subTotal 金額
	 */
	public void setSubTotal(int subTotal) {
		this.subTotal = subTotal;
	}

	/**
	 * 数量を取得する為のメソッド
	 * @return subNumber 数量
	 */
	public int getSubNumber() {
		return subNumber;
	}

	/**
	 * 数量を格納する為のメソッド
	 * @param subNumber 数量
	 */
	public void setSubNumber(int subNumber) {
		this.subNumber = subNumber;
	}

	/**
	 * 消費税を取得する為のメソッド
	 * @return tax 消費税
	 */
	public int getTax() {
		return tax;
	}

	/**
	 * 消費税を格納する為のメソッド
	 * @param tax 消費税
	 */
	public void setTax(int tax) {
		this.tax = tax;
	}

	/**
	 * 住所を取得する為のメソッド
	 * @return streetAddress 住所
	 */
	public String getStreetAddress() {
		return streetAddress;
	}

	/**
	 * 住所を格納する為のメソッド
	 * @param streetAddress 住所
	 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	/**
	 * 送料を取得する為のメソッド
	 * @return sendPrice 送料
	 */
	public int getSendPrice() {
		return sendPrice;
	}

	/**
	 * 送料を格納する為のメソッド
	 * @param sendPrice 送料
	 */
	public void setSendPrice(int sendPrice) {
		this.sendPrice = sendPrice;
	}

	/**
	 * 合計金額を取得する為のメソッド
	 * @return totalPrice 合計金額
	 */
	public int getTotalPrice() {
		return totalPrice;
	}

	/**
	 * 合計金額を格納する為のメソッド
	 * @param totalPrice 合計金額
	 */
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	/**
	 *  購入情報のリストを取得する為のメソッド
	 * @return list  購入情報のリスト
	 */
	public ArrayList<PurchaseConfirmationDTO> getList() {
		return list;
	}

	/**
	 *  購入情報のリストを格納する為のメソッド
	 * @param list  購入情報のリスト
	 */
	public void setList(ArrayList<PurchaseConfirmationDTO> list) {
		this.list = list;
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
	 * 電話番号を取得する為のメソッド
	 * @return phoneNumber 電話番号
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * 電話番号を格納する為のメソッド
	 * @param phoneNumber 電話番号
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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
	 * 送り先ユーザー名を取得する為のメソッド
	 * @return newUserName 送り先ユーザー名
	 */
	public String getNewUserName() {
		return newUserName;
	}

	/**
	 * 送り先ユーザー名を格納する為のメソッド
	 * @param newUserName 送り先ユーザー名
	 */
	public void setNewUserName(String newUserName) {
		this.newUserName = newUserName;
	}

	/**
	 * 送り先電話番号を取得する為のメソッド
	 * @return newPhoneNumber 送り先電話番号
	 */
	public String getNewPhoneNumber() {
		return newPhoneNumber;
	}

	/**
	 * 送り先電話番号を格納する為のメソッド
	 * @param newPhoneNumber 送り先電話番号
	 */
	public void setNewPhoneNumber(String newPhoneNumber) {
		this.newPhoneNumber = newPhoneNumber;
	}

	/**
	 * 送り先郵便番号を取得する為のメソッド
	 * @return newPostalCode 送り先郵便番号
	 */
	public String getNewPostalCode() {
		return newPostalCode;
	}

	/**
	 * 送り先郵便番号を格納する為のメソッド
	 * @param newPostalCode 送り先郵便番号
	 */
	public void setNewPostalCode(String newPostalCode) {
		this.newPostalCode=newPostalCode;
	}

	/**
	 * 送り先住所を取得する為のメソッド
	 * @return newStreetAddress 送り先住所
	 */
	public String getNewStreetAddress() {
		return newStreetAddress;
	}

	/**
	 * 送り先住所を格納する為のメソッド
	 * @param newStreetAddress 送り先住所
	 */
	public void setNewStreetAddress(String newStreetAddress) {
		this.newStreetAddress = newStreetAddress;
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
	 * クレジットカード名義を取得する為のメソッド
	 * @return cardName クレジットカード名義
	 */
	public String getCardName() {
		return cardName;
	}

	/**
	 * クレジットカード名義を格納する為のメソッド
	 * @param cardName クレジットカード名義
	 */
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	/**
	 * 新しいクレジットカード番号を取得する為のメソッド
	 * @return newCardNumber 新しいクレジットカード番号
	 */
	public String getNewCardNumber() {
		return NewCardNumber;
	}

	/**
	 * 新しいクレジットカード番号を格納する為のメソッド
	 * @param newCardNumber 新しいクレジットカード番号
	 */
	public void setNewCardNumber(String newCardNumber) {
		NewCardNumber = newCardNumber;
	}

	/**
	 * 暗証番号を取得する為のメソッド
	 * @return securityCode 暗証番号
	 */
	public String getSecurityCode() {
		return securityCode;
	}

	/**
	 * 暗証番号を格納する為のメソッド
	 * @param securityCode 暗証番号
	 */
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	/**
	 * 有効期限の月を取得する為のメソッド
	 * @return limitMonth 有効期限の月
	 */
	public String getLimitMonth() {
		return limitMonth;
	}

	/**
	 * 有効期限の月を格納する為のメソッド
	 * @param limitMonth 有効期限の月
	 */
	public void setLimitMonth(String limitMonth) {
		this.limitMonth = limitMonth;
	}

	/**
	 * 有効期限の年を取得する為のメソッド
	 * @return limitYear 有効期限の年
	 */
	public String getLimitYear() {
		return limitYear;
	}

	/**
	 * 有効期限の年を格納する為のメソッド
	 * @param limitYear 有効期限の年
	 */
	public void setLimitYear(String limitYear) {
		this.limitYear = limitYear;
	}

	/**
	 * 住所の種類を取得する為のメソッド
	 * @return sendAddress 住所の種類
	 */
	public String getSendAddress() {
		return sendAddress;
	}

	/**
	 * 住所の種類を格納する為のメソッド
	 * @param sendAddress 住所の種類
	 */
	public void setSendAddress(String sendAddress) {
		this.sendAddress = sendAddress;
	}

	/**
	 * クレジットカードの種類を取得する為のメソッド
	 * @return creditRadio クレジットカードの種類
	 */
	public String getCreditRadio() {
		return creditRadio;
	}

	/**
	 * クレジットカードの種類を格納する為のメソッド
	 * @param creditRadio クレジットカードの種類
	 */
	public void setCreditRadio(String creditRadio) {
		this.creditRadio = creditRadio;
	}

	/**
	 * エラーメッセージを取得する為のメソッド
	 * @return error エラーメッセージ
	 */
	public String getError() {
		return error;
	}

	/**
	 * エラーメッセージを格納する為のメソッド
	 * @param error エラーメッセージ
	 */
	public void setError(String error) {
		this.error = error;
	}

}