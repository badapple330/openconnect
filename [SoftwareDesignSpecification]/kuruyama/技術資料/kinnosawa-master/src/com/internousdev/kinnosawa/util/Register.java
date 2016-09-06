/*
 * タイトル ：小計額・消費税額・合計額を算出する処理
 * 説明 ：小計額・消費税額・合計額の算出ができる
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.util;

/**
 * 商品単価のリストと購入数のリストから小計額、消費税額、合計額を計算する為のクラス
 * @author Y.Murakami
 * @version 1.0
 * @since 1.0
 */
public class Register {

	/**
	 * 小計額
	 */
	private int subtotal;

	/**
	 * 消費税額
	 */
	private int tax;

	/**
	 * 合計額
	 */
	private int total;

	/**
	 * 合計商品数
	 */
	private int totalNumber;

	/**
	 * 商品の単価・個数のリストから計算し、小計額・消費税額・合計額を算出する「税計算」メソッド
	 * getSubtotal() getTax() getTotal() getTotalNumber()で小計額・消費税額・合計額・合計商品数を受け取れる
	 * 引数に値があればintでそれぞれの計算結果が、引数のリストがnullの場合は「0」を受け取れる
	 * @param price 商品単価のリスト
	 * @param number 購入数量のリスト
	 * @param RATE 消費税率 8％
	 * @return result 計算するリストがnullでない場合true、nullならばfalseを返す
	 */
	public boolean taxCalculation(int[] price,int[] number) {
		boolean result =false;
		final float RATE=0.08f;
		if(price==null|| number==null){
			setSubtotal(0);
			setTax(0);
			setTotal(0);
		}else {
			for(int i=0;i<price.length||i<number.length;i++){
				setSubtotal(subtotal+(price[i]*number[i]));
				setTotalNumber(totalNumber+number[i]);
			}
			setTax(Math.round(subtotal*RATE));
			setTotal(tax+subtotal);
			result = true;
		}
		return result;
	}

	/**
	 * 引数なしの「税計算」メソッド
	 * 使用後にgetSubtotal() getConsumptionTax() getTotal()
	 * それぞれからintの「0」を受け取れる
	 */
	public void taxCalculation() {
		subtotal=0;
		tax=0;
		total=0;
	}

	/**
	 * 小計額を取得する為のメソッド
	 * @return subtotal 小計額
	 */
	public int getSubtotal() {
		return subtotal;
	}

	/**
	 * 小計額を格納するためのメソッド
	 * @param subtotal 小計額
	 */
	public void setSubtotal(int subtotal) {
		this.subtotal = subtotal;
	}

	/**
	 * 消費税額を取得する為のメソッド
	 * @return tax 消費税額
	 */
	public int getTax() {
		return tax;
	}

	/**
	 * 消費税額を格納するためのメソッド
	 * @param tax 消費税額
	 */
	public void setTax(int tax) {
		this.tax = tax;
	}

	/**
	 * 合計額を取得する為のメソッド
	 * @return total 合計額
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * 合計額を格納するためのメソッド
	 * @param total 合計額
	 */
	public void setTotal(int total) {
		this.total = total;
	}

	/**
	 * 合計商品数を取得するためのメソッド
	 * @return totalNumber 合計商品数
	 */
	public int getTotalNumber() {
		return totalNumber;
	}

	/**
	 * 合計商品数を格納するためのメソッド
	 * @param totalNumber 合計商品数
	 */
	public void setTotalNumber(int totalNumber) {
		this.totalNumber = totalNumber;
	}
}
