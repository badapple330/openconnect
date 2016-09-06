/*
 * タイトル :Facebook認証をする為のクラス
 * 説明    ：Facebook認証をする。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 *変更履歴：
 */
package com.internousdev.kinnosawa.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONValue;

import com.opensymphony.xwork2.ActionSupport;

import facebook4j.Facebook;
import facebook4j.FacebookFactory;
import facebook4j.auth.AccessToken;

/**
 * Facebook認証をする為のクラス
 * @author S.Sugimoto
 * @version 1.0
 * @since 1.0
 */
public class FacebookOauth extends ActionSupport{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 8778881364802108061L;

	/**
	 * APP_ID
	 */
	private static final String APP_ID = "1718505845036544";

	/**
	 * レスポンスURL
	 */
	private static final String APP_SECRET = "ad34fe59d4c4e4eef05c2acf7d5380a5";

	/**
	 * コールバックパス
	 */
	private static final String CALLBACK_PATH = "/login-facebook-action";

	/**
	 * ユーザー情報を取得する為のメソッド
	 * @param request リクエスト
	 * @param response レスポンス
	 */
	public void getRequestToken(HttpServletRequest request, HttpServletResponse response){

		Facebook facebook = new FacebookFactory().getInstance();
		request.getSession().setAttribute("facebook", facebook);
		facebook.setOAuthAppId(APP_ID, APP_SECRET);
		String accessTokenString = APP_ID + "|" + APP_SECRET;
		AccessToken at = new AccessToken(accessTokenString);
		facebook.setOAuthAccessToken(at);
		StringBuffer callbackURL = request.getRequestURL();
		int index = callbackURL.lastIndexOf("/");
		callbackURL.replace(index, callbackURL.length(), "").append(CALLBACK_PATH);

		try{
			response.sendRedirect(facebook.getOAuthAuthorizationURL(callbackURL.toString()));
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	/**
	 * アクセストークンを取得する為のメソッド
	 * @param request リクエスト
	 * @param response レスポンス
	 * @return userMap ユーザー情報
	 */
	public Map<String, String> getAccessToken(HttpServletRequest request, HttpServletResponse response){

		final String callbackURL = request.getRequestURL().toString();
		final String code = request.getParameter("code");

		if(code == null){
			try{
				response.sendRedirect(request.getContextPath() + "/login");
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		String accessTokenURL = null;

		try{
			accessTokenURL = "https://graph.facebook.com/oauth/access_token?client_id="
					+ APP_ID
					+ "&redirect_uri="
					+ URLEncoder.encode(callbackURL, "UTF-8")
					+ "&client_secret="
					+ APP_SECRET + "&code=" + URLEncoder.encode(code, "UTF-8");
		}catch(UnsupportedEncodingException e){
			e.printStackTrace();
		}catch(IllegalStateException e) {
			e.printStackTrace();
		}
		String accessTokenResult = null;

		try{
			accessTokenResult = httpRequest(new URL(accessTokenURL));
		}catch(MalformedURLException e){
			e.printStackTrace();
		}
		String accessToken = null;
		String[] pairs = accessTokenResult.split("&");

		for(String pair : pairs){
			String[] kv = pair.split("=");

			if(kv.length != 2){
				throw new RuntimeException("Unexpected auth response");
			}else{
				if(kv[0].equals("access_token")){
					accessToken = kv[1];
				}
			}
		}
		String apiURL = null;

		try{
			apiURL = "https://graph.facebook.com/me?access_token="
					+ URLEncoder.encode(accessToken, "UTF-8")
					+ "&fields=id,email,name";
		}catch(UnsupportedEncodingException e){
			e.printStackTrace();
		}
		String apiResult = null;

		try{
			apiResult = httpRequest(new URL(apiURL));
		}catch(MalformedURLException e){
			e.printStackTrace();
		}
		@SuppressWarnings("unchecked")
		Map<String, String> userMap = (Map<String, String>) JSONValue.parse(apiResult);
		return userMap;
	}

	/**
	 * リクエスト用メソッド
	 * @param url URL
	 * @return response レスポンス
	 */
	private String httpRequest(URL url){

		HttpURLConnection con = null;
		String response = "";

		try{
			con = (HttpURLConnection) url.openConnection();
			con.setDoOutput(true);
			con.setUseCaches(false);
			con.setRequestMethod("GET");
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String line = null;

			while((line = br.readLine()) != null){
				response += line;
			}
			br.close();
		}catch(IOException e){
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
		return response;
	}

}