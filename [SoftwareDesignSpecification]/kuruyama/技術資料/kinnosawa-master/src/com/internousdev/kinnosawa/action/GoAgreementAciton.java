/*
 * タイトル：利用規約へ遷移する為のクラス
 * 説明    ：agreement.jspへ遷移する
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
 * 利用規約へ遷移する為のクラス
 * @author Y.Tashiro
 * @since 1.0
 * @version 1.0
 */
public class GoAgreementAciton extends ActionSupport{

	/**
	 *シリアルID
	 */
	private static final long serialVersionUID = 3009591640913900545L;

	/**
	 * 利用規約へ遷移する為のメソッド
	 * @return 必ずSUCCESSを返す
	 */
	public String execute(){
		return SUCCESS;
	}

}