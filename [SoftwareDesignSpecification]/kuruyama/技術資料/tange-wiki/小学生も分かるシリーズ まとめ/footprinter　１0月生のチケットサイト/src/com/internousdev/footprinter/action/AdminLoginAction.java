package com.internousdev.footprinter.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.footprinter.dao.AdminLoginDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 管理者ログイン処理クラス
 * @author 田中 賢樹
 * @since 1.0
 * @version 1.0
 */
public class AdminLoginAction extends ActionSupport implements SessionAware{
	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -422937717479901171L;
	/**
	 * セッション
	 */
	private Map<String, Object> session;
	/**
	 * 管理者ID
	 */
	private String adminId;
	/**
	 * パスワード
	 */
	private String password;
	/**
	 * エラーメッセージ
	 */
	private String errorMsg;

	/**
	 * ログインアクションメソッド
	 * @return String
	 */
	public String execute(){
		AdminLoginDAO dao = new AdminLoginDAO();
		boolean result = dao.select(adminId, password);
		if(!result) {
			errorMsg = (getText("lang.login.validEmailorpass"));
			System.out.println(errorMsg);
			return INPUT;
		}
		session.put("adminId", adminId);
		return SUCCESS;
	}

	/**
	 * adminIdのゲッターメソッド
	 * @return adminId
	 */
	public String getAdminId() {
		return adminId;
	}

	/**
	 * adminIdのセッターメソッド
	 * @param adminId 管理者用ログインId
	 */
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	/**
	 * passwordのゲッターメソッド
	 * @return password 
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * passwordのセッターメソッド
	 * @param password 管理者用パスワード
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * sessionのセッターメソッド
	 * @param session セッション
	 */
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * sessionのゲッターメソッド
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
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
