/*
 * タイトル：取得した商品詳細のデータを格納する為の処理
 * 説明    ：取得した商品詳細のデータを格納する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.dto;

/**
 *商品管理情報を格納する為のクラス
 * @author K.Hagiwara
 * @version 1.0
 * @since 1.0
 */
public class AdminItemDTO {

	/**
	 * 商品ID
	 */
	private int id;

	/**
	 * 商品名
	 */
	private String name;

	/**
	 * 価格
	 */
	private float price;

	/**
	 * 画像パス
	 */
	private String imgPath;

	/**
	 * セット画像パス
	 */
	private String setImgPath;

	/**
	 * アレルギー食材
	 */
	private String allergie;

	/**
	 * カテゴリー
	 */
	private String category;

	/**
	 * イチオシ
	 */
	private String closeUp;

	/**
	 * 作成日時
	 */
	private String createdDate;

	/**
	 * 商品詳細
	 */
	private String detail;

	/**
	 * トップページ表示の是非
	 */
	private String topPage;

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
	 * 価格を取得する為のメソッド
	 * @return price 価格
	 */
	public float getPrice() {
	    return price;
	}

	/**
	 * 価格を格納する為のメソッド
	 * @param price 価格
	 */
	public void setPrice(float price) {
	    this.price = price;
	}

	/**
	 * 画像パスを取得する為のメソッド
	 * @return imgPath画像パス
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
	 * セット画像パスを取得する為のメソッド
	 * @return setImgPath セット画像パス
	 */
	public String getSetImgPath() {
	    return setImgPath;
	}

	/**
	 * セット画像パスを格納する為のメソッド
	 * @param setImgPath セット画像パス
	 */
	public void setSetImgPath(String setImgPath) {
	    this.setImgPath = setImgPath;
	}

	/**
	 * アレルギー食材を取得する為のメソッド
	 * @return allergie アレルギー食材
	 */
	public String getAllergie() {
	    return allergie;
	}

	/**
	 * アレルギー食材を格納する為のメソッド
	 * @param allergie アレルギー食材
	 */
	public void setAllergie(String allergie) {
	    this.allergie = allergie;
	}

	/**
	 * カテゴリーを取得する為のメソッド
	 * @return category カテゴリー
	 */
	public String getCategory() {
	    return category;
	}

	/**
	 * カテゴリーを格納する為のメソッド
	 * @param category カテゴリー
	 */
	public void setCategory(String category) {
	    this.category = category;
	}

	/**
	 * イチオシを取得する為のメソッド
	 * @return closeUp イチオシ
	 */
	public String getCloseUp() {
	    return closeUp;
	}

	/**
	 * イチオシを格納する為のメソッド
	 * @param closeUp イチオシ
	 */
	public void setCloseUp(String closeUp) {
	    this.closeUp = closeUp;
	}

	/**
	 * 作成日時を取得する為のメソッド
	 * @return createdDate 作成日時
	 */
	public String getCreatedDate() {
	    return createdDate;
	}

	/**
	 * 作成日時を格納する為のメソッド
	 * @param createdDate 作成日時
	 */
	public void setCreatedDate(String createdDate) {
	    this.createdDate = createdDate;
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
	 * トップページ表示の是非 を取得する為のメソッド
	 * @return topPage トップページ表示の是非
	 */
	public String getTopPage() {
		return topPage;
	}

	/**
	 * トップページ表示の是非 を格納する為のメソッド
	 * @param topPage トップページ表示の是非
	 */
	public void setTopPage(String topPage) {
		this.topPage = topPage;
	}

}