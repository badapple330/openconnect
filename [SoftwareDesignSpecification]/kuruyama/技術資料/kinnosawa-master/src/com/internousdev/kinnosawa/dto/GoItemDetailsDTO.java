/*
 * タイトル：取得した商品詳細情報のデータを格納する為の処理
 * 説明    ：取得した商品詳細情報のデータを格納する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.dto;

/**
 * 商品詳細情報を格納する為のクラス
 * @author S.Kobata
 * @version 1.0
 * @since 1.0
 */
public class GoItemDetailsDTO {

	/**
	 * 商品ID
	 */
	private int id;

	/**
	 * 商品名
	 */
	private String name;

	/**
	 * 値段
	 */
	private int price;

	/**
	 * 商品詳細
	 */
	private String detail;

	/**
	 * 画像パス
	 */
	private String imgPath;

	/**
	 * 箱入り画像パス
	 */
	private String setImgPath;

	/**
	 * アレルギー項目
	 */
	private String allergie;

	/**
	 * 商品IDを取得する為のメソッド
	 * @return id 商品ID
	 */
	public int getId() {
		return id;
	}

	/**
	 * 商品IDを格納する為のメソッド
	 * @param id 商品ID
	 */
	public void setId(int id) {
		this.id = id;
	}

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
	 * 商品詳細を取得する為のメソッド
	 * @return detail 商品詳細
	 */
	public String getDetail() {
		return detail;
	}

	/**
	 * 商品詳細を格納する為のメソッド
	 * @param detail 商品詳細
	 */
	public void setDetail(String detail) {
		this.detail = detail;
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

	/**
	 * 箱入り画像パスを取得する為のメソッド
	 * @return setImgPath 箱入り画像パス
	 */
	public String getSetImgPath() {
		return setImgPath;
	}

	/**
	 * 箱入り画像パスを格納する為のメソッド
	 * @param setImgPath 箱入り画像パス
	 */
	public void setSetImgPath(String setImgPath) {
		this.setImgPath = setImgPath;
	}

	/**
	 * アレルギー項目を取得する為のメソッド
	 * @return allergie アレルギー項目
	 */
	public String getAllergie() {
		return allergie;
	}

	/**
	 * アレルギー項目を格納する為のメソッド
	 * @param allergie アレルギー項目
	 */
	public void setAllergie(String allergie) {
		this.allergie = allergie;
	}

}
