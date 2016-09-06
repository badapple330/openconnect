package com.internousdev.footprinter.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * ログイン画面遷移アクションクラス
 * @author 堅田 一成
 * @since 1.0
 * @version 1.0
 */
public class GoLoginAction extends ActionSupport{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -3759769646987555536L;
	
	/**
	 * ログイン画面へ遷移させるメソッド
	 * @return SUCCESS
	 */
	public String execute(){
		return SUCCESS;
	}
}
