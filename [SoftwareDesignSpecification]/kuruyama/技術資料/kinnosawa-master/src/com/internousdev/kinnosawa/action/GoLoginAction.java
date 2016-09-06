/*
 * タイトル：ログインをする為のクラス
 * 説明    ：モーダルでログイン判定し、top_page.jspへ遷移する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 *変更履歴：
 */
package com.internousdev.kinnosawa.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kinnosawa.dao.GoLoginDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ログインをする為のクラス
 * @author S.Sugimoto
 * @version 1.0
 * @since 1.0
 */
public class GoLoginAction extends ActionSupport implements SessionAware {


	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -4315561256557134109L;

	/**
	 * メールアドレス
	 */
	private String email;

	/**
	 * パスワード
	 */
	private String password;

	/**
	 * ログインエラーメッセージ
	 */
	private String errorMessage;

	/**
	 * ログインチェック画面での「ログイン」ボタン
	 */
	private String loginCheck;

	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * ログイン判定をする為のメソッド
	 * @return result ログイン判定が出来ていたらSUCCESS、トップページで出来ていない場合ERROR、ログインチェックページで出来ていない場合checkErrorを返す
	 */
	public String execute() {

		String result;
		int id = 0;
		String name = null;
		GoLoginDAO dao = new GoLoginDAO();

		if(!(loginCheck==null)){
			result="checkError";

			if(dao.select(email,password)){
				id = dao.getId();
				name = dao.getName();
			}else{
				errorMessage = getText("side_bar.ErrorMessage");
				return "checkError";
			}
			if(id == 0 || (name.equals(""))){
				errorMessage = getText("side_bar.ErrorMessage");
				return "checkError";
			}
			result =SUCCESS;
			session.put("userId", id);
			session.put("userName", name);
			return result;

		}else{
			result=ERROR;

			if(dao.select(email,password)){
				id = dao.getId();
				name = dao.getName();
			}else{
				errorMessage = getText("side_bar.ErrorMessage");
				return result;
			}
			if(id == 0 || (name.equals(""))){
				errorMessage = getText("side_bar.ErrorMessage");
				return result;
			}
			result =SUCCESS;
			session.put("userId", id);
			session.put("userName", name);
			return result;
			}
		}

	/**
	 * メールアドレスを取得する為のメソッド
	 * @return email メールアドレス
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * メールアドレスを格納する為のメソッド
	 * @param email メールアドレス
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * パスワードを取得する為のメソッド
	 * @return password パスワード
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * パスワードを格納する為のメソッド
	 * @param password パスワード
	 */
	public void setPassword(String password) {
		this.password = password;
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
	 * エラーメッセージを取得する為のメソッド
	 * @return errorMessage エラーメッセージ
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * エラーメッセージを格納する為のメソッド
	 * @param errorMessage エラーメッセージ
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	/**
	 * ログインチェック画面での「ログイン」ボタンを取得する為のメソッド
	 * @return loginCheck ログインチェック画面での「ログイン」ボタン
	 */
	public String getLoginCheck() {
		return loginCheck;
	}

	/**
	 * ログインチェック画面での「ログイン」ボタンを格納する為のメソッド
	 * @param loginCheck ログインチェック画面での「ログイン」ボタン
	 */
	public void setLoginCheck(String loginCheck) {
		this.loginCheck = loginCheck;
	}

}