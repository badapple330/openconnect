/*
 * タイトル：購入手続き画面に表示する情報のデータを購入確認画面で格納する為の処理
 * 説明    ：取得した購入手続き画面に表示する情報のデータを格納する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.dto;

/**
 * 購入手続き画面に表示する情報のデータを購入確認画面で格納する為のクラス
 * @author K.Abe
 * @version 1.0
 * @since 1.0
 */
public class PurchaseConfirmationDTO {

	/**
	 * 購入手続き画面に表示する商品の名前
	 */
	private String goodsName;

	/**
	 * 購入手続き画面に表示する商品の数
	 */
	private int goodsNumber;

	/**
	 * 購入手続き画面に表示する商品の小計
	 */
	private int goodsSubTotal;

	/**
	 * 購入手続き画面に表示する商品の名前を取得する為のメソッド
	 * @return goodsName 購入手続き画面に表示する商品の名前
	 */
	public String getGoodsName() {
		return goodsName;
	}

	/**
	 * 購入手続き画面に表示する商品の名前を格納する為のメソッド
	 * @param goodsName 購入手続き画面に表示する商品の名前
	 */
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	/**
	 * 購入手続き画面に表示する商品の数を取得する為のメソッド
	 * @return goodsNumber 記入 購入手続き画面に表示する商品の数
	 */
	public int getGoodsNumber() {
		return goodsNumber;
	}

	/**
	 * 購入手続き画面に表示する商品の数を格納する為のメソッド
	 * @param goodsNumber 購入手続き画面に表示する商品の数
	 */
	public void setGoodsNumber(int goodsNumber) {
		this.goodsNumber = goodsNumber;
	}

	/**
	 * 購入手続き画面に表示する商品の小計を取得する為のメソッド
	 * @return goodsSubTotal 購入手続き画面に表示する商品の小計
	 */
	public int getGoodsSubTotal() {
		return goodsSubTotal;
	}

	/**
	 * 購入手続き画面に表示する商品の小計を格納する為のメソッド
	 * @param goodsSubTotal 購入手続き画面に表示する商品の小計
	 */
	public void setGoodsSubTotal(int goodsSubTotal) {
		this.goodsSubTotal = goodsSubTotal;
	}

}