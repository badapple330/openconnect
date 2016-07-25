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
	 * セッション
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
	 * @return result
	 */
	public String execute() {
		result = ERROR;

		LoginDAO dao = new LoginDAO();

		if (dao.select(email, password)) {
			result = SUCCESS;
			session.clear();
			session.put("userFlg", dao.getFlg());
			session.put("user", password);
			session.put("user", email);
		}

		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}