/*
 * タイトル：取得したカート情報のデータを購入手続き画面で格納する為の処理
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
 * 購入手続き画面に表示する商品の情報を取得、格納する為のクラス
 * @author K.Abe
 * @version 1.0
 * @since 1.0
 */
public class GoPurchaseDTO {

	/**
	 * 商品ID
	 */
	private int goodsId;

	/**
	 * 商品名
	 */
	private String goodsName;

	/**
	 * 商品の数
	 */
	private int goodsNumber;

	/**
	 * 商品価格
	 */
	private int goodsPrice;

	/**
	 * 画像パス
	 */
	 private String imgPath;

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
	 * @return goodsName 商品名
	 */
	public String getGoodsName() {
		return goodsName;
	}

	/**
	 * 商品名を格納する為のメソッド
	 * @param goodsName 商品名
	 */
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	/**
	 * 商品の数を取得する為のメソッド
	 * @return goodsNumber 商品の数
	 */
	public int getGoodsNumber() {
		return goodsNumber;
	}

	/**
	 * 商品の数を格納する為のメソッド
	 * @param goodsNumber 商品の数
	 */
	public void setGoodsNumber(int goodsNumber) {
		this.goodsNumber = goodsNumber;
	}

	/**
	 * 商品価格を取得する為のメソッド
	 * @return goodsPrice 商品価格
	 */
	public int getGoodsPrice() {
		return goodsPrice;
	}

	/**
	 * 商品価格を格納する為のメソッド
	 * @param goodsPrice 商品価格
	 */
	public void setGoodsPrice(int goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	/**
	 * 画像パスを取得する為のメソッド
	 * @return 画像パス
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