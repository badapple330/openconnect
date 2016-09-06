package com.internousdev.footprinter.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 管理者用ログインページ遷移クラス
 * @author 田中 賢樹
 * @since  1.0
 * @version 1.0
 */
public class GoAdminLoginAction extends ActionSupport{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -3997809966173531118L;

	/**
	 * 実行メソッド
	 * @return  SUCCESS
	 */
	public String execute(){
		return SUCCESS;
	}
}
