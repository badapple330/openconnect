/*
 * タイトル：管理者ログインする為の処理
 * 説明    ：ログイン判定をし、成功ならばadmin_user.jspへ遷移する。
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

import com.internousdev.kinnosawa.dao.AdminLogInDAO;
import com.opensymphony.xwork2.ActionSupport;

/** 管理者画面へログインする為のクラス
 * @author S.Makino
 * @version 1.0
 * @since 1.0
 */
public class AdminLogInAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 8148936153278710955L;

	/**
	 * ユーザーID
	 */
	private String id;

	/**
	 * パスワード
	 */
	private String password;

	/**
	 * ログインエラー
	 */
	private String errorLogin;

	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * 管理者画面へログインする為のメソッド
	 * @return result 管理画面へログインできた場合SUCCESS、できなければERRORを返す
	 */
	public String execute() throws SQLException{

		int idInt=0;
		String result = ERROR;
		AdminLogInDAO dao = new AdminLogInDAO();

		try{
			idInt=Integer.parseInt(id);
		}catch(NumberFormatException e){
			errorLogin = (getText("admin_login.error"));
			return result;
		}

		if(dao.Login(idInt,password)){
			session.put("adminId",idInt);
			result = SUCCESS;
		}else{
			errorLogin = (getText("admin_login.error"));
		}
		return result;
	}

	/**
	 * 管理者IDを取得する為のメソッド
	 * @return id 管理者ID
	 */
	public String getId() {
		return id;
	}

	/**
	 * 管理者IDを格納する為のメソッド
	 * @param id 管理者ID
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 管理者パスワードを取得する為のメソッド
	 * @return password 管理者パスワード
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 管理者パスワードを格納する為のメソッド
	 * @param password 管理者パスワード
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * ログインエラーを取得する為のメソッド
	 * @return errorLogin ログインエラー
	 */
	public String getErrorLogin() {
		return errorLogin;
	}

	/**
	 * ログインエラーを格納する為のメソッド
	 * @param errorLogin ログインエラー
	 */
	public void setErrorLogin(String errorLogin) {
		this.errorLogin = errorLogin;
	}

	/**
	 * セッションを取得する為のメソッド
	 * @return session セッション
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 *  セッションを格納する為のメソッド
	 * @param session セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}