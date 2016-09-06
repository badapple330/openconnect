/*
 * タイトル：購入情報を検索する為の処理
 * 説明    ：DAOから受けとったデータをリストに格納し admin_purchaser.jspに送る。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kinnosawa.dao.AdminPurchaseDAO;
import com.internousdev.kinnosawa.dto.AdminPurchaseDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 購入情報管理画面へ遷移する為のクラス
 * @author K.Hagiwara
 * @version 1.0
 * @since 1.0
 */
public class GoAdminPurchaseAction extends ActionSupport implements SessionAware{

	/**
	 *シリアルID
	 */
	private static final long serialVersionUID = 1753359201522505800L;

	/**
	 * 購入情報を格納するリスト
	 */
	private ArrayList<AdminPurchaseDTO> purchaseList = new ArrayList<AdminPurchaseDTO>();

	/**
	 * 検索するユーザー名
	 */
	private String purchaseName;

	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * 検索結果を表示する為のメソッド
	 * @return result 検索結果の表示に成功したらSUCCESS、失敗したらERRORを返す
	 */
	public String execute() throws SQLException{

		if(purchaseName == null){
			purchaseName = "";
		}
		String result = ERROR;

		if(session.containsKey("adminId")){
			AdminPurchaseDAO dao = new AdminPurchaseDAO();

			if(dao.AdminPurchaseSearch(purchaseName)){
				purchaseList = dao.getPurchaseList();
				if ( purchaseName.length() == 0 ) {
					addActionMessage (getText("admin_purchase.searchComment") +" "+ purchaseList.size()+ " " + getText("admin_purchase.searchMessage"));
					return result;
				}
				if ( purchaseName.length() > 0 ) {
					addActionMessage(getText("admin_purchase.searchComment" )+ " " + purchaseList.size() + getText("admin_purchase.searchResult"));
					return result;
				}
				result = SUCCESS;

			}else{
				addActionMessage(getText("admin_purchase.error"));
			}

		}else{
		result="LogInError";
		}
		return result;
	}

	/**
	 * 購入情報リストを取得する為のメソッド
	 * @return purchaseList 購入情報リスト
	 */
	public ArrayList<AdminPurchaseDTO> getPurchaseList() {
		return purchaseList;
	}

	/**
	 * 購入情報リストを格納する為のメソッド
	 * @param purchaseList 購入情報リスト
	 */
	public void setPurchaseList(ArrayList<AdminPurchaseDTO> purchaseList) {
		this.purchaseList = purchaseList;
	}

	/**
	 * 検索するユーザー名を取得する為のメソッド
	 * @return goodsName 検索するユーザー名
	 */
	public String getPurchaseName() {
		return purchaseName;
	}

	/**
	 * 検索するユーザー名を格納する為のメソッド
	 * @param purchaseName 検索するユーザー名
	 */
	public void setPurchaseName(String purchaseName) {
		this.purchaseName = purchaseName;
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