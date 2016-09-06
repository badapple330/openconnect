package com.internousdev.footprinter.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 新規登録画面へ遷移クラス
 * @author 田原 一樹
 * @version 1.0
 * @since 1.0
 */
public class GoSignUpAction extends ActionSupport {
	/**
	 * 生成されたシリアルナンバー
	 */
	private static final long serialVersionUID = -9181670224480725278L;
	
	/**
	 * 新規登録画面へ遷移させるメソッド
	 * @return SUCCESS
	 */
	public String execute() {
		return SUCCESS;
	}
}
