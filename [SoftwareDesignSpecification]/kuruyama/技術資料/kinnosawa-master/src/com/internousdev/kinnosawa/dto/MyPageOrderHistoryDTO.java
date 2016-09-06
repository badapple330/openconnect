/*
 * タイトル：取得した購入履歴のデータを格納する為の処理
 * 説明    ：取得した購入履歴のデータを格納する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.dto;

/**
* 購入履歴を格納する為のクラス
* @author K.Kamijo
* @version 1.0
* @since 1.0
*/
public class MyPageOrderHistoryDTO {

	/**
	 * 購入履歴ID
	 */
	private int id;

	/**
	 * 注文番号
	 */
	private int orderNumber;

	/**
	 * ユーザーID
	 */
	private int userId;

	/**
	 * お届け先ID
	 */
	private int sendId;

	/**
	 * 商品ID
	 */
	private int goodsId;

	/**
	 * 購入数
	 */
	private int number;

	/**
	 * 作成日時
	 */
	private String createdAt;

	/**
	 * 商品名
	 */
	private String name;

	/**
	 * お届け先住所
	 */
	private String address;

	/**
	 * 値段
	 */
	private int price;

	/**
	 * 購入履歴IDを取得する為のメソッド
	 * @return id 購入履歴ID
	 */
	public int getId() {
		return id;
	}

	/**
	 * 購入履歴IDを格納する為のメソッド
	 * @param id 購入履歴ID
	 */

	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 注文番号を取得する為のメソッド
	 * @return orderNumber 注文番号
	 */
	public int getOrderNumber() {
		return orderNumber;
	}

	/**
	 * 注文番号を格納する為のメソッド
	 * @param orderNumber 注文番号
	 */

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	/**
	 * ユーザーIDを取得する為のメソッド
	 * @return userId ユーザーID
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * ユーザーIDを格納する為のメソッド
	 * @param userId ユーザーID
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * お届け先IDを取得する為のメソッド
	 * @return sendId お届け先ID
	 */
	public int getSendId() {
		return sendId;
	}

	/**
	 * お届け先IDを格納する為のメソッド
	 * @param sendId お届け先ID
	 */

	public void setSendId(int sendId) {
		this.sendId = sendId;
	}

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
	 * 購入数を取得する為のメソッド
	 * @return number 購入数
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * 購入数を格納する為のメソッド
	 * @param number 購入数
	 */

	public void setNumber(int number) {
		this.number = number;
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
	 * お届け先住所を取得する為のメソッド
	 * @return name お届け先住所
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * お届け先住所を格納する為のメソッド
	 * @param address お届け先住所
	 */
	public void setAddress(String address) {
		this.address = address;
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

}