/*
 * タイトル：取得した商品一覧情報のデータを格納する為の処理
 * 説明    ：取得した商品一覧情報のデータを格納する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.dto;

/**
 * 商品一覧情報を格納する為のクラス
 * @author S.Kobata
 * @version 1.0
 * @since 1.0
 */
public class GoItemDTO {

	/**
	 * 商品名
	 */
	private String name;

	/**
	 * 値段
	 */
	private int price;

	/**
	 * 画像パス
	 */
	private String imgPath;

	/**
	 * 商品名を取得する為のメソッド
	 * @return name 商品名
	 */
	public String getName() {
		return name;
	}

	/**
	 * 商品名を格納する為のメソッド
	 * @param name 商品名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 値段を取得する為のメソッド
	 * @return price 値段
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * 値段を格納する為のメソッド
	 * @param price 値段
	 */
	public void setPrice(int price) {
		this.price = price;
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