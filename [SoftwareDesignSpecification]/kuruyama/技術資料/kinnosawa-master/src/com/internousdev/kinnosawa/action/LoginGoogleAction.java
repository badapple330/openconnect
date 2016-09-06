/*
 * タイトル：Googleでログインする為のクラス
 * 説明    ：Googleでログインし、top_page.jsp
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 *変更履歴：
 */
package com.internousdev.kinnosawa.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kinnosawa.dao.LoginOauthDAO;
import com.internousdev.kinnosawa.dto.LoginOauthDTO;
import com.internousdev.kinnosawa.util.GoogleOauth;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Googleでログインする為のクラス
 * @author S.Sugimoto
 * @version 1.0
 * @since 1.0
 */
public class LoginGoogleAction extends ActionSupport implements ServletRequestAware,SessionAware{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 6169633242433121789L;

	/**
	 * ネットワークネーム
	 */
	static final String NETWORK_NAME = "google";

	/**
	 * リクエスト
	 */
	private HttpServletRequest request;

	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * Google認証をし、ユーザー情報をセッションする為のメソッド
	 * @return result ログイン成功していたらSUCCESS、失敗ならばERRORを返す
	 */
	public String execute(){

		String result = ERROR;
		GoogleOauth googleOauth = new GoogleOauth();
		Map<String, String> userMap = googleOauth.getAccessToken(request);

		if(userMap == null){
			return result;
		}

		String uniqueId = userMap.get("id");
		String userName = userMap.get("name");
		LoginOauthDAO dao = new LoginOauthDAO();

		if(dao.select(uniqueId, NETWORK_NAME)){
			LoginOauthDTO dto = dao.getLoginOauthDTO();
			session.put("userId", dto.getUserId());
			session.put("userName", dto.getUserName());
			result = SUCCESS;
			return result;
		}

		boolean result1 = dao.insert(uniqueId, userName, NETWORK_NAME);

		if(!result1){
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