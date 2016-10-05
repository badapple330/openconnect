package com.internousdev.openconnect.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.openconnect.dao.LoginDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * LoginAction アプリ一覧画面に遷移するクラス
 *
 * @author MAIKI OKANO
 * @since 2016/07/22
 * @version 1.1
 */
public class LoginAction extends ActionSupport implements SessionAware {

	/**
	 * シリアルバージョンUID
	 */
	private static final long serialVersionUID = 1422381634250534884L;

	/**
	 * セッションマップ
	 */
	public Map<String, Object> session;
	/**
	 * メールアドレス
	 */
	private String email;
	/**
	 * パスワード
	 */
	private String password;

	/**
	 * 結果文字
	 */
	private String resultString = "";

	/**
	 * DAOに入力情報を渡し、結果を返す
	 *
	 * @author MAIKI OKANO
	 * @return result データベースの情報と照合できたらSUCCESS、失敗したらERROR
	 */
	public String execute() {
		String result = ERROR;

		String sql = "SELECT user_id, userdel_flg, user_flg, login_flg FROM users WHERE phone_email = ? OR "
				+ "mobile_email = ? AND password = ?";

		LoginDAO loginDao = new LoginDAO();
		if (loginDao.select(email, password, sql)) {
			result = SUCCESS;
			resultString = "";
			session.clear();
			session.put("userFlg", loginDao.getFlg());
			session.put("user", password);
			session.put("user", email);
			session.put("userId", loginDao.getUserId());
		} else {
			resultString = "メールアドレスまたはパスワードが正しく入力されていません";
		}

		return result;
	}

	/**
	 * セッションを取得するためのメソッド
	 *
	 * @author MAIKI OKANO
	 * @return session 取得するセッション
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッションを格納するためのメソッド
	 *
	 * @author MAIKI OKANO
	 * @param session
	 *            格納するセッション
	 */
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * メールアドレスを取得するためのメソッド
	 *
	 * @author MAIKI OKANO0 0 * @return email 取得するメールアドレス
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * メールアドレスを格納するためのメソッド
	 *
	 * @author MAIKI OKANO
	 * @param email
	 *            格納するメールアドレス
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * パスワードを取得するためのメソッド
	 *
	 * @author MAIKI OKANO
	 * @return password 取得するパスワード
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * パスワードを格納するためのメソッド
	 *
	 * @author MAIKI OKANO
	 * @param password
	 *            格納するパスワード
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 取得メソッド 結果文字を取得
	 *
	 * @author YUICHI KIRIU
	 * @return resultString
	 */
	public String getResultString() {
		return resultString;
	}

	/**
	 * 設定メソッド 結果文字を設定
	 *
	 * @author YUICHI KIRIU
	 * @param resultString
	 */
	public void setResultString(String resultString) {
		this.resultString = resultString;
	}

}