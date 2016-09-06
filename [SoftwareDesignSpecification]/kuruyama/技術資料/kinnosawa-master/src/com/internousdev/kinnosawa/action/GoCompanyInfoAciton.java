/*
 * タイトル：会社概要へ遷移する為のクラス
 * 説明    ：compane.jspへ遷移する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 *変更履歴：
 *
 */
package com.internousdev.kinnosawa.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 会社概要へ遷移する為のクラス
 * @author Y.Tashiro
 * @since 1.0
 * @version 1.0
 */
public class GoCompanyInfoAciton extends ActionSupport{

	/**
	 *シリアルID
	 */
	private static final long serialVersionUID = -2825127390356803395L;

	/**
	 * 会社概要へ遷移する為のメソッド
	 * @return SUCCESSを返す
	 */
	public String execute(){
		return SUCCESS;
	}

}