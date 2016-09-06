/*
 * タイトル：Googleに接続する為のクラス
 * 説明    ：OAuth認証する為にGoogleに接続する。
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

import com.internousdev.kinnosawa.util.GoogleOauth;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Googleに接続する為のクラス
 * @author S.Sugimoto
 * @version 1.0
 * @since 1.0
 */
public class GoGoogleAction extends ActionSupport implements ServletRequestAware,ServletResponseAware{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 4607105769843060781L;

	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * リクエスト
	 */
	private HttpServletRequest request;

	/**
	 * レスポンス
	 */
	private HttpServletResponse response;

	/**
	 * Googleに接続する為のメソッド
	 * @return result 接続に成功していたらSUCCESS、出来ていなければERRORを返す
	 */
	public String execute(){

		String result = ERROR;
		GoogleOauth googleOauth = new GoogleOauth();

		if(!googleOauth.getRequestToken(request, response)){
			return result;
		}
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