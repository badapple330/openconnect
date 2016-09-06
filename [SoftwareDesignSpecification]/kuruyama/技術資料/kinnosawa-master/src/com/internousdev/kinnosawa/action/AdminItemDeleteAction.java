/*
 * タイトル：商品データを削除する為の処理
 * 説明    ：admin_item.jspから受け取った商品IDのデータをDAOに引渡しデータベースから削除する。
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

import com.internousdev.kinnosawa.dao.AdminItemDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 商品情報をデータベースから削除する為のクラス
 * @author K.Hagiwara
 * @version 1.0
 * @since 1.0
 */
public class AdminItemDeleteAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -1823598387796212627L;

	/**
	 * 商品ID
	 */
	private int id;

	/**
	 * 削除する商品のID
	 */
	private String itemId;

	/**
	 * エラーメッセージ
	 */
	private String message;

	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * 商品情報を削除する為のメソッド
	 * @return result 成功したらSUCCESS、失敗したら ERRORを返す
	 */
	public String execute() {

		String result = ERROR;

		if(session.containsKey("adminId")){
			try{
				id = Integer.parseInt(itemId);
				AdminItemDeleteDAO dao = new AdminItemDeleteDAO();
				int count = 0;
				count = dao.delete(id);

				if(count == 0){
					message =(getText("admin_item.deleteError"));
				}
				else if(count == 1){
					message =(getText("admin_item.deleteSuccess"));
					result = SUCCESS;
				}else{
					addActionMessage(getText("admin_item.deleteError"));
				}

			}catch(NumberFormatException e){
				message = (getText("admin_item.deleteError"));
			}
		}else{
			result="LogInError";
		}
		return result;
}

	/**
	 * 商品IDを取得する為のメソッド
	 * @return id 商品ID
	 */
	public int getId() {
		return id;
	}

	/**
	 * 商品IDを格納する為のメソッド
	 * @param id 商品ID
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 削除する商品を取得する為のメソッド
	 * @return itemId 削除する商品
	 */
	public String getItemId() {
		return itemId;
	}

	/**
	 * 削除する商品を格納する為のメソッド
	 * @param itemId 削除する商品
	 */
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	/**
	 * エラーメッセージを取得する為のメソッド
	 * @return messageエラーメッセージ
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * エラーメッセージを格納する為のメソッド
	 * @param message エラーメッセージ
	 */
	public void setMessage(String message) {
		this.message = message;
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

}