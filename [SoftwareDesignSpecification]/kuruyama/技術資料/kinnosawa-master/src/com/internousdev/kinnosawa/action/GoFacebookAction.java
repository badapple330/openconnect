/*
 * タイトル：Facebookに接続する為のクラス
 * 説明    ：OAuth認証する為にFacebookに接続する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kinnosawa.util.FacebookOauth;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Facebookに接続する為のクラス
 * @author S.Sugimoto
 * @version 1.0
 * @since 1.0
 */
public class GoFacebookAction extends ActionSupport implements ServletRequestAware,ServletResponseAware,SessionAware{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -1018540901960425125L;

	/**
	 * リクエスト
	 */
	private HttpServletRequest request;

	/**
	 * レスポンス
	 */
	private HttpServletResponse response;

	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * Facebookに接続する為のメソッド
	 * @return 必ずSUCCESSを返す
	 */
	public String execute(){

		FacebookOauth oauth = new FacebookOauth();
		oauth.getRequestToken(request, response);
		return SUCCESS;
	}

	/**
	 * レスポンスを格納する為のメソッド
	 * @param response レスポンス
	 */
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;

	}

	/**
	 * リクエストを格納する為のメソッド
	 * @param request リクエスト
	 */
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;

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