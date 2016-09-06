/*
 * タイトル  ：売上管理画面へ遷移する為の処理
 * 説明    ：管理者ログインができていることをsessionで確認をし、売上管理画面へ遷移します。
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

import com.opensymphony.xwork2.ActionSupport;

/**売上管理画面へ遷移する為のクラス
 * @author S.Iiduka
 * @version 1.0
 * @since 1.0
 */
public class GoAdminCapacityAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 1214206602804944025L;

	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * 売上管理画面へ遷移する為のメソッド
	 * @return result セッションにadminIdが入っていたらSUCCESS,なかったらLoginErrorを返す
	 */
	public String execute(){

		if(!session.containsKey("adminId")){
			return "LogInError";
		}
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

}