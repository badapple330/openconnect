/*
 * タイトル：Twitterに接続する為のクラス
 * 説明    ：OAuth認証する為にTwitterに接続する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 *変更履歴：
 */
package com.internousdev.kinnosawa.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kinnosawa.util.TwitterOauth;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Twitterに接続する為のクラス
 * @author S.Sugimoto
 * @version 1.0
 * @since 1.0
 */
public class GoTwitterAction extends ActionSupport implements ServletRequestAware,ServletResponseAware,SessionAware{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 4822592426018043719L;

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
	 * Twitterに接続する為のメソッド
	 * @return result 接続に成功いていたらSUCCESS、していなければERRORを返す
	 */
	public String execute(){

		String result = ERROR;
		TwitterOauth twitterOauth = new TwitterOauth();

		if(!twitterOauth.getRequestToken(request, response)){
			return result;
		}
		result = SUCCESS;
		return result;
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