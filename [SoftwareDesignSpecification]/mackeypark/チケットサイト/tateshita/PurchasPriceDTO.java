package com.internousdevwork.mackeypark.dto;

/**
* MySQLから取得したデータを格納する為のクラス
* @author SAORI MAEKAWA
* @since 1.0
* @version 1.0
*/
public class PurchasPriceDTO {

	/**
	 * PRICE
	 */
	private String price;



	/**
	 * PRICEを取得する為のメソッド
	 * @return price PRICE
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * PRICEを格納する為のメソッド
	 * @paramprice PRICE
	 */
	public void setPrice(String price) {
		this.price = price;

	}




}