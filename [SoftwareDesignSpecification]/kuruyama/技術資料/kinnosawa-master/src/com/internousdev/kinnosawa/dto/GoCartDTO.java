/*
 * タイトル：取得したカート情報のデータを格納する為の処理
 * 説明    ：取得したカート情報のデータを格納する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.dto;

/**
 * カート情報を格納する為のクラス
 * @author S.Kobata
 * @version 1.0
 * @since 1.0
 */
public class GoCartDTO {

	/**
	 * 商品ID
	 */
	private int goodsId;

	/**
	 * 商品名
	 */
	private String name;

	/**
	 * 画像パス
	 */
	 private String imgPath;

	/**
	 * 商品単価
	 */
	private int price;

	/**
	 * 購入予定数
	 */
	private int count;

	/**
	 * 小計
	 */
	private int countPrice;

	/**
	 * 商品IDを取得する為のメソッド
	 * @return goodsId 商品ID
	 */
	public int getGoodsId() {
		return goodsId;
	}

	/**
	 * 商品IDを格納する為のメソッド
	 * @param goodsId 商品ID
	 */
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
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
	 * 商品単価を取得する為のメソッド
	 * @return price 商品単価
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * 商品単価を格納する為のメソッド
	 * @param price 商品単価
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * 購入予定数を取得する為のメソッド
	 * @return count 購入予定数
	 */
	public int getCount() {
		return count;
	}

	/**
	 * 購入予定数を格納する為のメソッド
	 * @param count 購入予定数
	 */
	public void setCount(int count) {
		this.count = count;
	}

	/**
	 * 小計を取得する為のメソッド
	 * @return countPrice 小計
	 */
	public int getCountPrice() {
		return countPrice;
	}

	/**
	 * 小計を格納する為のメソッド
	 * @param countPrice 小計
	 */
	public void setCountPrice(int countPrice) {
		this.countPrice = countPrice;
	}

}