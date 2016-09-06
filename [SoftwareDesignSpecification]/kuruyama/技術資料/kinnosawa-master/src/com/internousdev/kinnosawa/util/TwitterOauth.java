/*
 * タイトル :Twitter認証をする為のクラス
 * 説明    ：Twitter認証をする。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 *変更履歴：
 */
package com.internousdev.kinnosawa.util;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;

/**
 * Twitter認証をする為のクラス
 * @author S.Sugimoto
 * @version 1.0
 * @since 1.0
 */
public class TwitterOauth {

	/**
	 * 結果
	 */
	private boolean result = false;

	/**
	 * コンシューマーキー
	 */
	private final String CONSUMER_KEY = "rimOnGhkSV47HdV8sylFU2Mos";

	/**
	 * コンシューマーシークレット
	 */
	private final String CONSUMER_SECRET = "RNluIvZB1Wx1yIYWYij5SlwtchHDC69MPgDv1kGV04bIGaXx75";

	/**
	 * ツィッターファクトリー
	 */
	private static TwitterFactory twitterFactory = new TwitterFactory();

	/**
	 * ユーザー情報を取得する為のメソッド
	 * @param request リクエスト
	 * @param response レスポンス
	 * @return result 結果
	 */
	public boolean getRequestToken(HttpServletRequest request, HttpServletResponse response){

		Twitter twitter = twitterFactory.getInstance();
		twitter.setOAuthConsumer(CONSUMER_KEY, CONSUMER_SECRET);

		try{
			RequestToken reqToken = twitter.getOAuthRequestToken();
			HttpSession session = request.getSession();
			session.setAttribute("RequestToken", reqToken);
			session.setAttribute("Twitter", twitter);
			String url = reqToken.getAuthorizationURL();
			response.sendRedirect(url);
		}catch(TwitterException | IOException e){
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * トークンを取得する為のメソッド
	 * @param request リクエスト
	 * @param response レスポンス
	 * @return userData ユーザー情報
	 */
	public String[] getAccessToken(HttpServletRequest request, HttpServletResponse response){

		HttpSession session = request.getSession();
		Twitter twitter = (Twitter) session.getAttribute("Twitter");
		String verifier = request.getParameter("oauth_verifier");

		if(verifier == null){
			try{
				response.sendRedirect(request.getContextPath()+ "/login");
			}catch(Exception e){
				e.printStackTrace();
				return null;
			}
		}

		AccessToken accessToken = null;

		try{
			if(session.getAttribute("RequestToken") != null){
				accessToken = twitter.getOAuthAccessToken( (RequestToken) session.getAttribute("RequestToken"), verifier);
			}else{
				return null;
			}
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}

		if(accessToken != null){
			session.setAttribute("AccessToken", accessToken.getToken());
			session.setAttribute("AccessTokenSecret", accessToken.getTokenSecret());
		}

		User user = null;

		try{
			user = twitter.verifyCredentials();
		}catch(TwitterException e){
			e.printStackTrace();
		}

		String[] userData = new String[2];
		userData[0] = user.getScreenName();
		userData[1] = user.getName();

		return userData;
	}

}