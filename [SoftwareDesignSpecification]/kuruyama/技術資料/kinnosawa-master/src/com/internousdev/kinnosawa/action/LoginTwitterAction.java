/*
 * タイトル：Twitterでログインする為のクラス
 * 説明    ：Twitterでログインし、top_page.jsp
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

import com.internousdev.kinnosawa.dao.LoginOauthDAO;
import com.internousdev.kinnosawa.dto.LoginOauthDTO;
import com.internousdev.kinnosawa.util.TwitterOauth;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Twitterでログインする為のクラス
 * @author S.Sugimoto
 * @version 1.0
 * @since 1.0
 */
public class LoginTwitterAction extends ActionSupport implements ServletRequestAware,ServletResponseAware,SessionAware{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 8992530700197401366L;

	/**
	 * ネットワークネーム
	 */
	static final String NETWORK_NAME = "Twitter";

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
	public Map<String, Object> session;

	/**Twitter認証をし、ユーザー情報をセッションする為のメソッド
	 * @return result ログイン成功していたらSUCCESS、失敗ならばERRORを返す
	 */
	public String execute(){

		String result = ERROR;
		TwitterOauth twitterOauth = new TwitterOauth();
		String[] userData = new String[2];
		userData = twitterOauth.getAccessToken(request, response);

		if(userData == null){
			return result;
		}

		String uniqueId = userData[0];
		String userName = userData[1];
		LoginOauthDAO dao = new LoginOauthDAO();

		if(dao.select(uniqueId, NETWORK_NAME)){
			LoginOauthDTO dto = dao.getLoginOauthDTO();
			session.put("userId", dto.getUserId());
			session.put("userName", dto.getUserName());
			result = SUCCESS;
			return result;
		}

		boolean result2 = dao.insert(uniqueId, userName, NETWORK_NAME);

		if(!result2){
			return result;
		}

		dao.select(uniqueId, NETWORK_NAME);
		LoginOauthDTO dto = dao.getLoginOauthDTO();
		session.put("userId", dto.getUserId());
		session.put("userName", dto.getUserName());
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