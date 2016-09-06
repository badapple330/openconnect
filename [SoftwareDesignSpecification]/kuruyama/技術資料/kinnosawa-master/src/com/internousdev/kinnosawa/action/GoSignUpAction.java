/*
 * タイトル：新規登録画面へ遷移する為のクラス
 * 説明    ：sign_up.jspへ遷移する。
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

/**
 * 新規登録画面へ遷移する為のクラス
 * @author K.Sugano
 * @version 1.0
 * @since 1.0
 */
public class GoSignUpAction extends ActionSupport implements SessionAware{

	/**
	 *シリアルID
	 */
	private static final long serialVersionUID = 8978737241443423814L;

	/**
	 * セッション
	 */
	private Map<String, Object>session;

	/**
	 * 新規登録画面へ遷移する為のメソッド
	 * @return 必ずsuccessを返す
	 */
	public String execute(){
		session.clear();
		return SUCCESS;
	}

	/**
	 * セッションを格納する為のメソッド
	 * @param session セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}

}