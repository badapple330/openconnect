/*
 * タイトル：お問い合わせを送信する為のクラス
 * 説明    ：お問い合わせをMongDBに送信する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 *変更履歴：2016.02.16 Tuesday
 *        ：新規登録
 */
package com.internousdev.kinnosawa.action;

import com.internousdev.kinnosawa.dao.ContactDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 問い合わせを送信する為のクラス
 * @author Y.Tashiro
 * @since 1.0
 * @version 1.0
 */
public class GoQuestionFromSendAction extends ActionSupport{

	/**
	 *シリアルID
	 */
	private static final long serialVersionUID = 6521613001183101637L;

	/**
	 * ユーザー名
	 */
    private String questionName;

    /**
	 * メールアドレス
	 */
    private String questionEmail;

    /**
	 * 問い合わせ内容
	 */
    private String questionText;

	/**
	 * 問い合わせを送信する為のメソッド
	 * @return 送信成功時SUCCESS、失敗時ERRORを返す
	 */
	public String execute(){

		ContactDAO dao = new ContactDAO();

		if(dao.insert(questionName, questionEmail, questionText)){
			questionName = null;
			questionEmail = null;
			questionText = null;
			addActionMessage(getText("question.text11"));
			return SUCCESS;
		}
		addActionMessage(getText("question.text12"));
		return ERROR;
	}

	/**
	 * ユーザー名を取得する為のメソッド
	 * @return questionName ユーザー名
	 */
	public String getQuestionName() {
		return questionName;
	}

	/**
	 * ユーザー名を格納する為のメソッド
	 * @param questionName ユーザー名
	 */
	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}

	/**
	 * メールアドレスを取得する為のメソッド
	 * @return questionEmail メールアドレス
	 */
	public String getQuestionEmail() {
		return questionEmail;
	}

	/**
	 * メールアドレスを格納する為のメソッド
	 * @param questionEmail メールアドレス
	 */
	public void setQuestionEmail(String questionEmail) {
		this.questionEmail = questionEmail;
	}

	/**
	 * 問い合わせ内容を取得する為のメソッド
	 * @return questionText 問い合わせ内容
	 */
	public String getQuestionText() {
		return questionText;
	}

	/**
	 * 問い合わせ内容を格納する為のメソッド
	 * @param questionText 問い合わせ内容
	 */
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

}