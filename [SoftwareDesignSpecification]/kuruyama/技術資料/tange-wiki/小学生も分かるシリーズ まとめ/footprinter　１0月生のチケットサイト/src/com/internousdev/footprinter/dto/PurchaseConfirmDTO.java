package com.internousdev.footprinter.dto;

/**
* 購入情報登録用DTO
* @author 丹下 陽平
* @since 1.0
* @version 1.0
*/
public class PurchaseConfirmDTO {
	/**
	 * イベント名
	 */
	private String eventName;
	/**
	 * イベント値段
	 */
	private String price;
	/**
	 * イベント実施日
	 */
	private String eventDate;
	/**
	 * 郵便番号
	 */
	private String postalCode;
	/**
	 * 住所
	 */
	private String address;
	/**
	 * クレジットカード番号
	 */
	private String creditNum;
	/**
	 * クレジットカードトークン
	 */
	private String creditToken;
	
	/**
	 * イベント名の取得
	 * @return eventName
	 */
	public String getEventName() {
		return eventName;
	}
	
	/**
	 * イベント名の格納
	 * @param eventName イベント名
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	
	/**
	 * 郵便番号の取得
	 * @return postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}
	/**
	 * 郵便番号の格納
	 * @param postalCode 郵便番号
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	/**
	 * 住所の取得
	 * @return address
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * 住所の格納
	 * @param address 住所
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * クレジットカード番号の取得
	 * @return creditNum
	 */
	public String getCreditNum() {
		return creditNum;
	}
	
	/**
	 * クレジットカード番号の格納
	 * @param creditNum クレジットカード番号
	 */
	public void setCreditNum(String creditNum) {
		this.creditNum = creditNum;
	}
	
	/**
	 * クレジットカードトークンの取得
	 * @return creditToken
	 */
	public String getCreditToken() {
		return creditToken;
	}
	
	/**
	 * クレジットカードトークンの格納
	 * @param creditToken クレジットカードトークン
	 */
	public void setCreditToken(String creditToken) {
		this.creditToken = creditToken;
	}
	
	/**
	 * イベントの値段の取得
	 * @return price
	 */
	public String getPrice() {
		return  price;
	}
	
	/**
	 * イベントの値段の格納
	 * @param price イベントの値段
	 */
	public void setPrice(String price) {
		this.price = price;
	}
	
	/**
	 * イベント実施日の取得
	 * @return eventDate
	 */
	public String getEventDate() {
		return eventDate;
	}
	
	/**
	 * イベント実施日の格納
	 * @param eventDate イベント実施日
	 */
	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}
}
