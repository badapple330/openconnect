/*
 * タイトル :Google認証をする為のクラス
 * 説明    ：Google認証をする。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 *変更履歴：
 */
package com.internousdev.kinnosawa.util;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.scribe.builder.ServiceBuilder;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.model.Verifier;
import org.scribe.oauth.OAuthService;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.opensymphony.xwork2.ActionSupport;


/**
 * Google認証をする為のクラス
 * @author S.Sugimoto
 * @version 1.0
 * @since 1.0
 */
public class GoogleOauth extends ActionSupport{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -223159615278395075L;

	/**
	 * スコープURL
	 */
	private static final String SCOPE = "https://www.googleapis.com/auth/userinfo.email";

	/**
	 * レスポンスURL
	 */
	private static final String PROTECTED_RESOURCE_URL = "https://www.googleapis.com/oauth2/v1/userinfo";

	/**
	 * 空のトークン
	 */
	private static final Token EMPTY_TOKEN = null;

	/**
	 * ユーザー情報を取得する為のメソッド
	 * @param request リクエスト
	 * @param response レスポンス
	 * @return result ユーザー情報を取得出来ていたらtrue、出来てなければfalseを返す
	 */
	public boolean getRequestToken (HttpServletRequest request, HttpServletResponse response){

		boolean result = false;

		try{
			String apiKey = "98772569845-natr2koojoratou6trnc7d3hjvocqvjf.apps.googleusercontent.com";
			String apiSecret = "TImwnKV92-Sv1oz8aGBkgBlq";
			String callbackUrl = "http://www.internousdev.com/kinnosawa/login-google-action";
			//String callbackUrl = "http://localhost:8080/kinnosawa/login-google-action";
			OAuthService service = new ServiceBuilder()
										.provider(GoogleApi.class)
										.apiKey(apiKey)
										.apiSecret(apiSecret)
										.callback(callbackUrl)
										.scope(SCOPE)
										.build();

			@SuppressWarnings("unused")
			Token accessToken = new Token("ACCESS_TOKEN", "REFRESH_TOKEN");
			String authorizationUrl = service.getAuthorizationUrl(EMPTY_TOKEN);
			HttpSession session = request.getSession();
			session.setAttribute("SERVICE", service);
			response.sendRedirect(authorizationUrl);
		}catch(Exception e){
			e.printStackTrace();
			return result;
		}
		result = true;
		return result;
	}

	/**
	 * ユーザー情報のMAPを取得する為のメソッド
	 * @param request リクエスト
	 * @return map マップ
	 */
	public Map<String, String> getAccessToken(HttpServletRequest request){

		Map<String, String> map;

		try{
			String verifier1 = request.getParameter("code");
			Verifier verifier = new Verifier(verifier1);
			Token accessToken = new Token("ACCESS_TOKEN", "REFRESH_TOKEN");
			HttpSession session = request.getSession();
			OAuthService service = (OAuthService) session.getAttribute("SERVICE");
			accessToken = service.getAccessToken(EMPTY_TOKEN, verifier);
			OAuthRequest requestOauth = new OAuthRequest(Verb.GET, PROTECTED_RESOURCE_URL);
			service.signRequest(accessToken, requestOauth);
			Response response = requestOauth.send();
			map = new LinkedHashMap<>();
			ObjectMapper mapper = new ObjectMapper();

			map = mapper.readValue(response.getBody(), new TypeReference<LinkedHashMap<String, String>>(){});
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return map;
	}

}