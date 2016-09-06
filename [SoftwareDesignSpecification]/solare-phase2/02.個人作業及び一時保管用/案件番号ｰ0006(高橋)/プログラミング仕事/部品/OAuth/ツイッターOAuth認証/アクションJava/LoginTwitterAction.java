package com.internousdevwork.mackeypark.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.mackeypark.dao.LoginOauthDAO;
import com.internousdevwork.mackeypark.dto.LoginOauthDTO;
import com.internousdevwork.mackeypark.util.TwitterOauth;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Twitterでログインする為のクラス
 * @author Takeshi Banshow
 * @since 1.0
 * @version 1.0
 */

public class LoginTwitterAction extends ActionSupport implements ServletResponseAware,ServletRequestAware,SessionAware{

	/**
	 * 生成されたシリアルナンバー
	 */
	private static final long serialVersionUID = 5267317856658763160L;

	/**
	 * OAuthサービス元の名前を格納している変数
	 */
	static final String OAUTH_NAME = "Twitter";

	/**
	 * レスポンス
	 */
	private HttpServletResponse response;

	/**
	 * リクエスト
	 */
	private HttpServletRequest request;

	/**
	 * セッションに保存する為の変数
	 */
	public Map<String, Object> session;

	/**
	 * <p>Twitterでログインできるか判定する為のメソッド<br>
	 * アクセストークンを取得できたか判定します。<br>
     * また、openconnectデータベースのuserテーブルにユーザー情報が登録されているかを判定します。<br>
     * 初回ログイン時は同テーブルにユーザー情報を登録します。<br>
     * </p>
	 * @return SUCCESS/ERROR <p>ログインに成功したらSUCCESS、アクセストークンがnullまたは初回ログインの場合ERRORを返します。</p>
	 */
	public String execute() {
		TwitterOauth twitterOauth = new TwitterOauth();
		String[] userData = new String[3];
		userData = twitterOauth.getAccessToken(request, response);
		if (userData == null) {
			return ERROR;
		}
		String oauthId = userData[0];
		String userName = userData[1];
		String email = userData[2];
		LoginOauthDAO dao = new LoginOauthDAO();
		if (dao.select(oauthId, OAUTH_NAME)) {
			LoginOauthDTO dto = dao.getLoginOauthDTO();
			session.put("id", dto.getId());
			return SUCCESS;
		}
		if (dao.insert(userName,email, oauthId, OAUTH_NAME) == 0) {
			return ERROR;
		}
		dao.select(oauthId, OAUTH_NAME);
		LoginOauthDTO dto = dao.getLoginOauthDTO();
		session.put("id", dto.getId());
		return SUCCESS;
	}

	/**
	 * レスポンス格納メソッド
	 * @param response レスポンス
	 */
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

	/**
	 * リクエスト格納メソッド
	 * @param request リクエスト
	 */
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	/**
	 * セッション格納メソッド
	 * @param session セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * セッション取得メソッド
	 * @return Session セッション
	 */
	public Map<String, Object> getSession() {
		return session;
	}
}