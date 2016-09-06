/*
 * タイトル：セッションを消してログアウトする為のクラス
 * 説明    ：セッションを消してログアウトし、top_page.jspへ遷移する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 *変更履歴：
 */
package com.internousdev.kinnosawa.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * セッションを消してログアウトする為のクラス
 * @author S.Sugimoto
 * @version 1.0
 * @since 1.0
 */
public class GoLogoutAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -3240829287739279621L;

	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * セッションを消す為のメソッド
	 * @return セッションを消しSUCCESSを返す
	 */
	public String execute(){

		session.clear();
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