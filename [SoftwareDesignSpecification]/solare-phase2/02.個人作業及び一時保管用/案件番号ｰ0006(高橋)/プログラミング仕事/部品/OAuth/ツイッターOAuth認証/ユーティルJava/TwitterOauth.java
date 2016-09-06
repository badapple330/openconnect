package com.internousdevwork.mackeypark.util;
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
 * TwitterOAuthでトークンを取得する為のutilクラス
 * @author Takeshi Banshow
 * @since 1.0
 * @version 1.0
 */
public class TwitterOauth {

    /**
     * コンシューマーキー
     */
    private final String CONSUMER_KEY = "5cVQMPr54rvV8GHjnq5Yd0OTB";

    /**
     * コンシューマーシークレット
     */
    private final String CONSUMER_SECRET = "sCyeqekooBwFlXMo7LxeHVRF3PA92Li3ys8myCbOOO855e0v29";

    /**
     * リクエストトークンを取得する為のメソッド
     * @param request リクエスト
     * @param response  レスポンス
     * @return true/false リクエストトークンが取得できた場合はtrueを、そうでない場合はfalseを返します。
     */
    public boolean getRequestToken(HttpServletRequest request, HttpServletResponse response) {
        TwitterFactory twitterFactory = new TwitterFactory();
        Twitter twitter = twitterFactory.getInstance();
        twitter.setOAuthConsumer(CONSUMER_KEY, CONSUMER_SECRET);
        try{
            RequestToken reqToken = twitter.getOAuthRequestToken();
            HttpSession session = request.getSession();
            session.setAttribute("RequestToken", reqToken);
            session.setAttribute("Twitter", twitter);
            String strUrl = reqToken.getAuthorizationURL();
            response.sendRedirect(strUrl);
        }catch (TwitterException | IOException e){
            e.printStackTrace();
        }
        return false;
    }

    /**
     * アクセストークンを取得する為のメソッド
     * @param request リクエスト
     * @param response レスポンス
     * @return userData/null ユーザー情報が取得できれば値をuserDataに返します。そうでない場合はnullを返します。
     */
    public String[] getAccessToken(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        Twitter twitter = (Twitter) session.getAttribute("Twitter");
        String verifier = request.getParameter("oauth_verifier");
        if(verifier == null){
            try {
                response.sendRedirect(request.getContextPath()+ "/login");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        AccessToken accessToken = null;
        try {
            if (session.getAttribute("RequestToken") != null) {
                accessToken = twitter.getOAuthAccessToken( (RequestToken) session.getAttribute("RequestToken"), verifier);
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }
        if (accessToken != null) {
            session.setAttribute("AccessToken", accessToken.getToken());
            session.setAttribute("AccessTokenSecret", accessToken.getTokenSecret());
        }
        User user = null;
        try {
            user = twitter.verifyCredentials();
        } catch (TwitterException e) {
            e.printStackTrace();
        }
        String[] userData = new String[2];
        userData[0] = user.getScreenName();
        userData[1] = user.getName();
        return userData;
    }

}