package com.internousdevwork.mackeypark.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.mackeypark.dao.LoginOauthDAO;
import com.internousdevwork.mackeypark.dto.LoginOauthDTO;
import com.internousdevwork.mackeypark.util.GoogleOauth;
import com.opensymphony.xwork2.ActionSupport;
/**
 * Googleでログインする為のクラス
 * @author Takeshi Banshow
 * @since 1.0
 * @version 1.0
 */
public class LoginGoogleAction extends ActionSupport implements ServletRequestAware, SessionAware {

	/**
	 * 生成されたシリアルナンバー
	 */
	private static final long serialVersionUID = -2061731425003625142L;

	/**
	 *  OAuthサービス元の名前を格納している変数
	 */
	static final String OAUTH_NAME = "google";

	/**
	 * リクエスト
	 */
	private HttpServletRequest request;

	/**
	 * セッションに保存する為の変数
	 */
	private Map<String, Object> session;

	/**
     * <p>googleでログインできるか判定する為のメソッド<br>
	 * アクセストークンを取得できたか判定します。<br>
     * また、openconnectデータベースのuserテーブルにユーザー情報が登録されているかを判定します。<br>
     * 初回ログイン時は同テーブルにユーザー情報を登録します。<br>
     * </p>
     * @return SUCCESS/ERROR <p>ログインに成功したらSUCCESS、アクセストークンがnullまたは初回ログインの場合ERRORを返します。</p>
	 */
	public String execute(){
		GoogleOauth googleOauth = new GoogleOauth();
		Map<String, String> userMap = null;
		userMap = googleOauth.getAccessToken(request);
		if (userMap == null) {
			return ERROR;
		}
		String oauthId = userMap.get("id");
		String userName = userMap.get("name");
		String email = userMap.get("email");
		LoginOauthDAO dao = new LoginOauthDAO();
		if (dao.select(oauthId, OAUTH_NAME)) {
			LoginOauthDTO dto = dao.getLoginOauthDTO();
			session.put("id", dto.getId());
			return SUCCESS;
		}
		if (dao.insert(userName, email, oauthId, OAUTH_NAME) == 0) {
			return ERROR;
		}
		dao.select(oauthId, OAUTH_NAME);
		LoginOauthDTO dto = dao.getLoginOauthDTO();
		session.put("id", dto.getId());
		return SUCCESS;
	}

	 /**
	  *  セッションを格納するためのメソッド
	  *  @param session セッション
	  */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	 /**
	  * セッションを取得するためのメソッド
	  * @return session セッション
	  */
	public Map<String, Object> getSession() {
		return session;
	}

	 /**
	  * リクエストを取得するためのメソッド
	  * @param request リクエスト
	  */
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
}