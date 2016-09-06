/*
 * タイトル：お問い合わせページへ遷移する為のクラス
 * 説明    ：question.jspへ遷移する。
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
 * 問い合わせページへ遷移する為のクラス
 * @author Y.Tashiro
 * @since 1.0
 * @version 1.0
 */
public class GoQuestionAction extends ActionSupport{

	/**
	 *シリアルID
	 */
	private static final long serialVersionUID = -7756470432186521463L;

	/**
	 * 問い合わせページへ遷移する為のメソッド
	 * @return SUCCESSを返します。
	 */
	public String execute(){
		return SUCCESS;
	}

}
