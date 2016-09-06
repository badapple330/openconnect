package com.internousdev.footprinter.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * ログアウトアクションクラス
 * @author 田中 賢樹
 * @since 1.0
 * @version 1.0
 */
public class AdminLogoutAction extends ActionSupport implements SessionAware{
	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 165762341695129789L;
	
	/**
	 * セッション
	 */
	private Map<String, Object> session;
	
	/**
	 * ログアウト実行アクション
	 * @return SUCCESS
	 */
	public String execute(){
		session.clear();
		return SUCCESS;
	}
	
	/**
	 * sessionのセッターメソッド
	 * @param session セッション
	 */
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
		
	}
}
