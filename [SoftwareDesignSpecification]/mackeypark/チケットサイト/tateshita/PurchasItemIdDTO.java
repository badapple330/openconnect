package com.internousdevwork.mackeypark.dto;

/**
* MySQLから取得したデータを格納する為のクラス
* @author SAORI MAEKAWA
* @since 1.0
* @version 1.0
*/
public class PurchasItemIdDTO {

	/**
	 * ITEMID
	 */
	private String itemid;



	/**
	 * ITEMIDを取得する為のメソッド
	 * @return itemid ITEMID
	 */
	public String getItemid() {
		return itemid;
	}

	/**
	 * ITEMIDを格納する為のメソッド
	 * @paramprice ITEMID
	 */
	public void setItemid(String itemid) {
		this.itemid = itemid;

	}




}