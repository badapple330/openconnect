package jp.co.internous.twitter;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.RequestToken;

//参考url：http://yoshihikomuto.hatenablog.jp/entry/20110613/1307949741
//		   http://techbooster.org/gae/13527/

/**
 * TwitterRequestToken
 * ツイッターリクエストトークンクラス
 * @author 北山知輝
 * @since 2015/03/16
 * @version 1.0
 */

public class TwitterRequestToken {
String result="error";

final String CONSUMER_KEY = "7pHJWQBDYptbOyyVV3ciB64Oc";
final String CONSUMER_SECRET = "7vnafqMZgGKHzezg7OmMb3ysuIHEEStG2iv1f5ruKs8eFArSFS";

static TwitterFactory twitterFactory = new TwitterFactory();

/**
 * 認証用トークン取得メソッド
 * @author 北山知輝
 * @since 2015/03/16
 * @return result 結果
 * @throws TwitterException
 * @throws IOException
 */
	public String loginOAuth(HttpServletResponse response,HttpServletRequest request) throws TwitterException, IOException {

	        // Titterオブジェクトの生成
	        Twitter twitter = twitterFactory.getInstance();
	        twitter.setOAuthConsumer(CONSUMER_KEY, CONSUMER_SECRET);

	        try{
	            // リクエストトークンの生成
	            RequestToken reqToken = twitter.getOAuthRequestToken();

	            // RequestTokenとTwitterオブジェクトをセッションに保存
	            HttpSession session = request.getSession();
	            session.setAttribute("RequestToken", reqToken);
	            session.setAttribute("Twitter", twitter);
	            System.out.println(session.getAttribute("RequestToken"));
	            System.out.println(session.getAttribute("Twitter"));



	            // 認証画面にリダイレクトするためのURLを生成
	            String strUrl = reqToken.getAuthorizationURL();
	            response.sendRedirect(strUrl);
	        }catch (TwitterException e){

	        }


		return result;
}


}