/*
 * タイトル：商品管理画面へ遷移する為の処理
 * 説明    ：adimin\jspへ遷移する。
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

import com.opensymphony.xwork2.ActionSupport;

/**
 * 商品管理画面へ遷移する為のクラス
 * @author K.Hagiwara
 * @version 1.0
 * @since 1.0
 */
public class GoAdminItemAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -185105977628231005L;

	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	* 商品管理画面へ遷移する為のメソッド
	* @return 必ずSUCCESSを返す
	*/
  	public String execute() throws SQLException {

  		String  result=SUCCESS;

		if(session.containsKey("adminId")){
			return SUCCESS;
		}else{
			result="LogInError";
		}
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

}