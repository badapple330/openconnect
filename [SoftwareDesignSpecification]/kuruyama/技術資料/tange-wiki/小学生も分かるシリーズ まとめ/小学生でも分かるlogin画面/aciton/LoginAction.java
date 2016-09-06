package com.internousdev.footprinter.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.footprinter.dao.LoginDAO;
import com.internousdev.footprinter.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * LoginAction ログイン画面からログインする為のクラス
 * @author 堅田 一成
 * @since 1.0
 * @version 1.0
 */
public class LoginAction extends ActionSupport implements SessionAware {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -625731012515291591L;
	/**
	 * セッション
	 */
	private Map<String,Object> session;
	/**
	 * 名前
	 */
	private String userName;
	/**
	 * ログインID
	 */
	private int loginId;
	/**
	 * メールドレス
	 */
	private String email;
	/**
	 * パスワード
	 */
	private String password;

	/**
	 * エラーメッセージ
	 */
	private String errorMsg;


	/**
	 * メールアドレスとパスワードの照合を行い、DBに登録済みの顧客情報を取得してくるメソッド
	 * @return SUCCESS ERROR
	 */
   public String execute() {
		LoginDAO dao = new LoginDAO();
		LoginDTO dto = new LoginDTO();
		boolean result = dao.select(email,password,dto);
		if (!result) {
			errorMsg = (getText("lang.login.validEmailorpass"));
			return ERROR;
		}
		session.put("loginId",dto.getLoginId());
		session.put("userName", dto.getUserName());
	    return SUCCESS;
   }
	/**
	 * メールアドレスの取得メソッド
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * メールアドレスの格納メソッド
	 * @param email メールアドレス
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * ユーザーの取得メソッド
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * ユーザーの取得格納メソッド
	 * @param userName ユーザー名
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * セッション取得メソッド
	 * @return session セッション
	 */
	public Map<String, Object> getSession() {
		return session;
	}
	/**
	 * セッション格納メソッド
	 * @param session セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	/**
	 * パスワード取得メソッド
	 * @return password パスワード
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * パスワード格納メソッド
	 * @param password パスワード
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * ログインID取得メソッド
	 * @return loginId ログインID
	 */
	public int getLoginId() {
		return loginId;
	}
	/**
	 * ログインID格納メソッド
	 * @param loginId ログインID
	 *
	 */
	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}
	/**
	 * エラーメッセージ格納メソッド
	 * @param errorMsg エラーメッセージ
	 *
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	/**
	 * エラーメッセージ取得メソッド
	 * @return errorMsg エラーメッセージ
	 */
	public String getErrorMsg() {
		return errorMsg;
	}
}
