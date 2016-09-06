/*
 * タイトル：管理者ログアウトする為の処理
 * 説明    ：セッションを破棄し、admin_login.jspへ遷移する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
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
* 管理者ログアウトする為のクラス
* @author S.Makino
* @version 1.0
* @since 1.0
*/
public class GoAdminLogInAction extends ActionSupport implements SessionAware {

	/**
	 *シリアルID
	 */
	private static final long serialVersionUID = -6919802164636132645L;

	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * 管理者ログインをクリアにする為のメソッド
	 * @return result DBからのユーザー情報を格納できたらERRORを返す。
	 */
	public String execute() throws SQLException{
		session.clear();
		return SUCCESS;
	}

	/**
	 * ログイン判定のセッションを取得する為のメソッド
	 * @return session ログイン判定のセッション
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * ログイン判定のセッションを格納する為のメソッド
	 * @param session ログイン判定のセッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}

}