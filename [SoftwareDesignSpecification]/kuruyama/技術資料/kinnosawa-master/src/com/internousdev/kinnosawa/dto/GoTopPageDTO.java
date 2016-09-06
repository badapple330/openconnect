/*
 * タイトル :DBから取得した一覧を格納する為のクラス
 * 説明    ：DBから取得した一覧を格納する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 *変更履歴：
 */
package com.internousdev.kinnosawa.dto;

/**
 * DBから取得した一覧を格納する為のクラス
 * @author S.Sugimoto
 * @version 1.0
 * @since 1.0
 */
public class GoTopPageDTO {

	/**
	 * 名前
	 */
	private String name;

	/**
	 * 画像パス
	 */
	private String imgPath;

	/**
	 * 名前を取得する為のメソッド
	 * @return name 名前
	 */
	public String getName() {
		return name;
	}

	/**
	 * 名前を格納する為のメソッド
	 * @param name 名前
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 画像パスを取得する為のメソッド
	 * @return imgPath 画像パス
	 */
	public String getImgPath() {
		return imgPath;
	}

	/**
	 * 画像パスを格納する為のメソッド
	 * @param imgPath 画像パス
	 */
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

}