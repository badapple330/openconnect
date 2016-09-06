/*
 * タイトル：取得した商品情報のデータを格納する為の処理
 * 説明    ：取得した商品情報のデータを格納する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.dto;

/**
* 商品情報を格納する為のクラス
* @author K.Kamijo
* @version 1.0
* @since 1.0
*/
public class MyPageGoodsDTO {

	/**
	 * 商品ID
	 */
	private int id;

	/**
	 * 商品名
	 */
	private String name;

	/**
	 * カテゴリー
	 */
	private String category;

	/**
	 * イチオシ
	 */
	private boolean closeUp;

	/**
	 * 値段
	 */
	private float price;

	/**
	 * 商品詳細
	 */
	private String detail;

	/**
	 * 画像パス
	 */
	private String imgPath;

	/**
	 * セット画像パス
	 */
	private String setImgPath;

	/**
	 * アレルギー
	 */
	private String allergie;

	/**
	 * 作成日時
	 */
	private String createdAt;

	/**
	 * 更新日時
	 */
	private String updatedAt;

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
	 * カテゴリを取得する為のメソッド
	 * @return category カテゴリ
	 */
	public String getCategory() {
		return category;
	}

	/**
	 *カテゴリを格納する為のメソッド
	 * @param category カテゴリ
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * イチオシを取得する為のメソッド
	 * @return closeUp イチオシ
	 */
	public boolean isCloseUp() {
		return closeUp;
	}

	/**
	 * イチオシを格納する為のメソッド
	 * @param closeUp イチオシ
	 */
	public void setCloseUp(boolean closeUp) {
		this.closeUp = closeUp;
	}

	/**
	 *値段を取得する為のメソッド
	 * @return price 値段
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * 値段を格納する為のメソッド
	 * @param price 値段
	 */
	public void setPrice(float price) {
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
	 * アレルギーを取得する為のメソッド
	 * @return allergie アレルギー
	 */
	public String getAllergie() {
		return allergie;
	}

	/**
	 * アレルギーを格納する為のメソッド
	 * @param allergie アレルギー
	 */
	public void setAllergie(String allergie) {
		this.allergie = allergie;
	}

	/**
	 * 作成日時を取得する為のメソッド
	 * @return createdAt 作成日時
	 */
	public String getCreatedAt() {
		return createdAt;
	}

	/**
	 * 作成日時を格納する為のメソッド
	 * @param createdAt 作成日時
	 */
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * 更新日時を取得する為のメソッド
	 * @return updatedAt 更新日時
	 */
	public String getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * 更新日時を格納する為のメソッド
	 * @param updatedAt 更新日時
	 */
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

}