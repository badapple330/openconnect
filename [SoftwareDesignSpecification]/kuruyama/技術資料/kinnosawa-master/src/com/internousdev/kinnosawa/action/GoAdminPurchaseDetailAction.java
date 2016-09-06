/*
 * タイトル：売上情報の詳細を取得する為の処理
 * 説明    ：DAOから受けとったデータをリストに格納し admin_purchaser_detail.jspに送る。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kinnosawa.dao.GoAdminPurchaseDetailDAO;
import com.internousdev.kinnosawa.dto.GoAdminPurchaseDetailDTO;
import com.opensymphony.xwork2.ActionSupport;


/**
 * 購入情報詳細画面へ遷移する為のクラス
 * @author K.Hagiwara
 * @version 1.0
 * @since 1.0
 */

public class GoAdminPurchaseDetailAction extends ActionSupport implements SessionAware {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 1933234354140729997L;

	/**
	 * 注文番号
	 */
	private int orderNumber;

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
	 * 購入商品一覧を格納するリスト
	 */
	private ArrayList<GoAdminPurchaseDetailDTO> goodsList = new ArrayList<GoAdminPurchaseDetailDTO>();

	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * 購入詳細情報を表示する情報があるか判定する為のメソッド
	 * @return 表示する情報があればSUCCESS 無ければERROR
	 */
	public String execute(){

		String result =ERROR;

		if(session.containsKey("adminId")){
		GoAdminPurchaseDetailDAO dao = new GoAdminPurchaseDetailDAO();

			if(dao.select(orderNumber)){
				goodsList = dao.getGoodsList();
				userName = goodsList.get(0).getUserName();
				address = goodsList.get(0).getAddress();
				telNumber = goodsList.get(0).getTelNumber();
				mail = goodsList.get(0).getMail();
				buyDate = goodsList.get(0).getBuyDate();

				if(session.containsKey("searchKey")){
					session.remove("searchKey");
				}
				result = SUCCESS;

			}else{
				addActionMessage(getText("admin_purchase_detail.error"));
			}

		}else{
			result="LogInError";
		}
		return result;
	}

	/**
	 * 注文者名 を取得する為のメソッド
	 * @return userName 注文者名
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 注文者名 を格納する為のメソッド
	 * @param userName 注文者名
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * お届け先住所 を取得する為のメソッド
	 * @return address お届け先住所
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * お届け先住所 を格納する為のメソッド
	 * @param address お届け先住所
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 注文者電話番号 を取得する為のメソッド
	 * @return telNumber 注文者電話番号
	 */
	public String getTelNumber() {
		return telNumber;
	}

	/**
	 * 注文者電話番号 を格納する為のメソッド
	 * @param telNumber 注文者電話番号
	 */
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	/**
	 * 注文者メールアドレス を取得する為のメソッド
	 * @return mail 注文者メールアドレス
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * 注文者メールアドレス を格納する為のメソッド
	 * @param mail 注文者メールアドレス
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * 注文商品名 を取得する為のメソッド
	 * @return goodsName注文商品名
	 */
	public String getGoodsName() {
		return goodsName;
	}

	/**
	 * 注文商品名 を格納する為のメソッド
	 * @param goodsName 注文商品名
	 */
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	/**
	 * 注文個数 を取得する為のメソッド
	 * @return buyNumber 注文個数
	 */
	public int getBuyNumber() {
		return buyNumber;
	}

	/**
	 * 注文個数 を格納する為のメソッド
	 * @param buyNumber 注文個数
	 */
	public void setBuyNumber(int buyNumber) {
		this.buyNumber = buyNumber;
	}

	/**
	 * 注文日 を取得する為のメソッド
	 * @return buyDate 注文日
	 */
	public String getBuyDate() {
		return buyDate;
	}

	/**
	 * 注文日 を格納する為のメソッド
	 * @param buyDate 注文日
	 */
	public void setBuyDate(String buyDate) {
		this.buyDate = buyDate;
	}

	/**
	 * 注文番号 を取得する為のメソッド
	 * @return orderNumber 注文番号
	 */
	public int getOrderNumber() {
		return orderNumber;
	}

	/**
	 * 注文番号 を格納する為のメソッド
	 * @param orderNumber 注文番号
	 */
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	/**
	 * 購入商品一覧 を取得する為のメソッド
	 * @return goodsList 購入商品一覧
	 */
	public ArrayList<GoAdminPurchaseDetailDTO> getGoodsList() {
		return goodsList;
	}

	/**
	 * 購入商品一覧 を格納する為のメソッド
	 * @param goodsList 購入商品一覧
	 */
	public void setGoodsList(ArrayList<GoAdminPurchaseDetailDTO> goodsList) {
		this.goodsList = goodsList;
	}

	/**
	 * セッション を取得する為のメソッド
	 * @return session セッション
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッション を格納する為のメソッド
	 * @param session セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}