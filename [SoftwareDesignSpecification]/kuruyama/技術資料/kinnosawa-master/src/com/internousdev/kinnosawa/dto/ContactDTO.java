/*
 * タイトル：MongoDBから取得したデータを格納する為のクラス
 * 説明    ：MongoDBから取得したデータを格納する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 *変更履歴：2016.02.16 Tuesday
 *        ：新規登録
 */
package com.internousdev.kinnosawa.dto;

/**
 * MongoDBから取得したデータを格納する為のクラス
 * @author Y.Tashiro
 * @since 1.0
 * @version 1.0
 */
public class ContactDTO {

	/**
	 * id
	 */
	private int id;
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
	 * 問い合わせ日時
	 */
    private String createdAt;

	/**
	 * idを取得する為のメソッド
	 * @return id id
	 */
	public int getId() {
		return id;
	}

	/**
	 * idを格納する為のメソッド
	 * @param id id
	 */
	public void setId(int id) {
		this.id = id;
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

	/**
	 * 問い合わせ日時を取得する為のメソッド
	 * @return createdAt 問い合わせ日時
	 */
	public String getCreatedAt() {
		return createdAt;
	}

	/**
	 * 問い合わせ日時を格納する為のメソッド
	 * @param createdAt 問い合わせ日時
	 */
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

}