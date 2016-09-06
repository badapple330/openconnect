/*
 * タイトル：カート内の情報を取得して購入手続き画面に表示する為の処理
 * 説明    ：DAOから受けとったデータを格納をして、purchase_confirmation.jspに遷移する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *        
 */
package com.internousdev.kinnosawa.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kinnosawa.dao.GoPurchaseDAO;
import com.internousdev.kinnosawa.dto.GoPurchaseDTO;
import com.internousdev.kinnosawa.util.Register;
import com.opensymphony.xwork2.ActionSupport;

/**
 * カート内の情報を取得して購入手続き画面に表示する為のクラス
 * @author K.Abe
 * @version 1.0
 * @since 1.0
 */
public class PurchaseAction extends ActionSupport implements SessionAware {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 4309459605763811399L;

	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * 購入手続き画面に表示する商品のリスト
	 */
	private List<GoPurchaseDTO> kinnosawaList = new ArrayList<GoPurchaseDTO>();

	/**
     * ユーザーID
     */
    private int userId;

	/**
	 * 商品の数(小計)
	 */
	private int subTotalNumber;

	/**
	 * 小計金額
	 */
	private int subTotalPrice;

	/**
	 * 消費税
	 */
	private int tax;

	/**
	 * 商品の数(合計)
	 */
	private int totalNumber;

	/**
	 * 合計金額
	 */
	private int totalPrice;

	/**
	 * 登録している名前
	 */
	private String userName;

	/**
	 * 登録している電話番号
	 */
	private String phoneNumber;

	/**
	 * 登録している郵便番号
	 */
	private String postalCode;

	/**
	 * 登録している住所
	 */
	private String streetAddress;

    /**
     * クレジットカード番号
     */
    private String cardNumber;

	/**
	 * カート画面に表示する情報を取得する為のメソッド
	 * @return result データベースから必要な値が取得できたらSUCCESS、取得できなければERRORを返す
	 */
	public String execute(){

		if(session.containsKey("userId")){
			userId = (int)session.get("userId");
		}

		GoPurchaseDAO dao = new GoPurchaseDAO();

		if(dao.selectCart(userId)){
			kinnosawaList = dao.getKinnosawaList();


		}
		int[] price=new int[kinnosawaList.size()];
		int[] number= new int[kinnosawaList.size()];

		for(int i=0; i<kinnosawaList.size(); i++){
			price[i]= kinnosawaList.get(i).getGoodsPrice();
			number[i]= kinnosawaList.get(i).getGoodsNumber();
		}

		Register register = new Register();
		register.taxCalculation(price, number);
		tax=register.getTax();
		subTotalPrice=register.getSubtotal();
		totalPrice=register.getTotal();
		subTotalNumber=register.getTotalNumber();
		totalNumber = register.getTotalNumber();
		if(dao.selectUser(userId)){
			try{
				userName = dao.getUserName();
				phoneNumber = String.format("%011d", Long.parseLong(dao.getPhoneNumber()));
				postalCode = String.format("%06d",Long.parseLong(dao.getPostalCode()));
				streetAddress = dao.getStreetAddress();
			} catch (Exception e) {
				userName = "";
				phoneNumber = "";
				postalCode = "";
				streetAddress ="";
			}
		}
		session.put("userNameAddress", userName);

		try{
			cardNumber = String.format("%04d",Long.parseLong(dao.getCardNumber()));
		} catch (Exception e) {
			cardNumber = "";
		}
		session.put("cardNumber", cardNumber);
		return SUCCESS;
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
	 * 購入手続き画面に表示する商品のリストを取得する為のメソッド
	 * @return kinnosawaList 購入手続き画面に表示する商品のリスト
	 */
	public List<GoPurchaseDTO> getKinnosawaList() {
		return kinnosawaList;
	}

	/**
	 * 購入手続き画面に表示する商品のリストを格納する為のメソッド
	 * @param kinnosawaList 購入手続き画面に表示する商品のリスト
	 */
	public void setKinnosawaList(List<GoPurchaseDTO> kinnosawaList) {
		this.kinnosawaList = kinnosawaList;
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
	 * 商品の数(小計)を取得する為のメソッド
	 * @return subTotalNumber 商品の数(小計)
	 */
	public int getSubTotalNumber() {
		return subTotalNumber;
	}

	/**
	 * 商品の数(小計)を格納する為のメソッド
	 * @param subTotalNumber 商品の数(小計)
	 */
	public void setSubTotalNumber(int subTotalNumber) {
		this.subTotalNumber = subTotalNumber;
	}

	/**
	 * 小計金額を取得する為のメソッド
	 * @return subTotalPrice 小計金額
	 */
	public int getSubTotalPrice() {
		return subTotalPrice;
	}

	/**
	 * 小計金額を格納する為のメソッド
	 * @param subTotalPrice 小計金額
	 */
	public void setSubTotalPrice(int subTotalPrice) {
		this.subTotalPrice = subTotalPrice;
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
	 * 商品の数(合計)を取得する為のメソッド
	 * @return totalNumber 商品の数(合計)
	 */
	public int getTotalNumber() {
		return totalNumber;
	}

	/**
	 * 商品の数(合計)を格納する為のメソッド
	 * @param totalNumber 商品の数(合計)
	 */
	public void setTotalNumber(int totalNumber) {
		this.totalNumber = totalNumber;
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
	 * 登録している名前を取得する為のメソッド
	 * @return userName 登録している名前
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 登録している名前を格納する為のメソッド
	 * @param userName 登録している名前
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * 登録している電話番号を取得する為のメソッド
	 * @return phoneNumber 登録している電話番号
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * 登録している電話番号を格納する為のメソッド
	 * @param phoneNumber 登録している電話番号
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * 登録している郵便番号を取得する為のメソッド
	 * @return postalCode 登録している郵便番号
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * 登録している郵便番号を格納する為のメソッド
	 * @param postalCode 登録している郵便番号
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * 登録している住所を取得する為のメソッド
	 * @return streetAddress 登録している住所
	 */
	public String getStreetAddress() {
		return streetAddress;
	}

	/**
	 * 登録している住所を格納する為のメソッド
	 * @param streetAddress 登録している住所
	 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
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


}