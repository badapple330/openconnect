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
	 * 戻り値
	 */
	private String result;

	/**
	 * DAOに入力情報を渡し、結果を返す
	 *
	 * @author MAIKI OKANO
	 * @return result データベースの情報と照合できたらSUCCESS、失敗したらERROR
	 */
	public String execute() {
		result = ERROR;

		String sql1 = "SELECT user_flg FROM users WHERE phone_email = ? AND password = ?";
		String sql2 = "SELECT user_flg FROM users WHERE mobile_email = ? AND password = ?";

		LoginDAO dao = new LoginDAO();
		if (dao.select(email, password, sql1) || dao.select(email, password, sql2)) {
			result = SUCCESS;
			session.clear();
			session.put("userFlg",dao.getFlg());
			session.put("user", password);
			session.put("user", email);
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
	 * @param session 格納するセッション
	 */
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	/**
	 * メールアドレスを取得するためのメソッド
	 *
	 * @author MAIKI OKANO
	 * @return email 取得するメールアドレス
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * メールアドレスを格納するためのメソッド
	 *
	 * @author MAIKI OKANO
	 * @param email 格納するメールアドレス
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
	 * @param password 格納するパスワード
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}