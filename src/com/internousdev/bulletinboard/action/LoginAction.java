package com.internousdev.bulletinboard.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;



    /**
     * ログインボタンからログインするクラス
     * @author Miyauchi Akitomo
     * @since 2017/5/11
     * @version 1.0
     */
public class LoginAction extends ActionSupport implements SessionAware {




	/**
	 * シリアルID
	 */
		private static final long serialVersionUID = 1960678948564666991L;

	private int userId;
	/**
	 * セッション情報（ユーザーID）
	 */
	private Map<String, Object> session;

	/**
	 * ログインするための実行メソッド
	 * @return ログイン成功 =SUCCESS 失敗 =ERROR 	 */
	public String execute() {
		String ret = SUCCESS;

					session.put("userId", userId);

		return ret;

	}



	/**
	 * セッション情報を取得するメソッド
	 * @return session　セッション情報
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッション情報を格納するメソッド
	 * @param session セットする session
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}



	/**
	 * @return userId
	 */
	public int getUserId() {
		return userId;
	}



	/**
	 * @param userId セットする userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}



}
