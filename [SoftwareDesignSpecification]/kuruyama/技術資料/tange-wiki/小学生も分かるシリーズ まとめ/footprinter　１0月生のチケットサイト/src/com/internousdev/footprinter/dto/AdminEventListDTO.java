package com.internousdev.footprinter.dto;
/**
 * Arraylist AdminEventListに入る値を格納しておくところ
 * @author 冨内 峻太朗
 * @version 1.0
 * @since 1.0
 */
public class AdminEventListDTO {
	/**
	 * イベントID
	 */
	private int id;
	/**
	 * イベント名
	 */
	private String name; 
	/**
	 * イベント詳細
	 */
	private String detail; 
	/**
	 * イベント日
	 */
	private String eventDate; 
	/**
	 * イベント値段
	 */
	private String price;
	/**
	 * 申し込み限度
	 */
	private int numOfTickets;
	/**
	 * 申し込み残数
	 */
	private int remaining;
	/**
	 * 画像パス
	 */
	private String imgPath;
	/**
	 * カテゴリID
	 */
	private int categoryId;
	/**
	 * 登録日
	 */
	private String createdAt;
	/**
	 * 更新日
	 */
	private String updatedAt;
	
	/**
	 * イベントId登録メソッド
	 * @param id イベントID
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * イベントId取得メソッド
	 * @return id イベントID
	 */
	public int getId() {
		return id;
	}
	/**
	 * イベント名登録メソッド
	 * @param name イベント名
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * イベント名取得メソッド
	 * @return name イベント名
	 */
	public String getName() {
		return name;
	}
	/**
	 * イベント日登録メソッド
	 * @param event_date イベント日 
	 */
	public void setEventDate(String event_date) {
		this.eventDate = event_date;
	}
	/**
	 * イベント日取得メソッド
	 * @return event_date イベント日
	 */
	public String getEventDate() {
		return eventDate;
	}
	/**
	 * イベント値段登録メソッド
	 * @param price イベントの値段
	 */
	public void setPrice(String price) {
		this.price = price;
	}
	/**
	 * イベント値段取得メソッド
	 * @return price イベントの値段
	 */
	public String getPrice() {
		return price;
	}
	/**
	 * 申し込み限度登録メソッド
	 * @param numOfTickets 申し込み限度
	 */
	public void setNumOfTickets(int numOfTickets) {
		this.numOfTickets = numOfTickets;
	}
	/**
	 * 申し込み限度取得メソッド
	 * @return numOfTickets 申し込み限度
	 */
	public int getNumOfTickets() {
		return numOfTickets;
	}
	/**
	 * 申し込み残数登録メソッド
	 * @param remaining 申し込み残数
	 */
	public void setRemaining(int remaining) {
		this.remaining = remaining;
	}
	/**
	 * 申し込み残数取得メソッド
	 * @return remaining 申し込み残数
	 */
	public int getRemaining() {
		return remaining;
	}
	/**
	 * イベント詳細登録メソッド
	 * @param detail イベント詳細
	 */
	public void setDetail(String detail) {
		this.detail = detail;
	}
	/**
	 * イベント詳細取得メソッド
	 * @return detail イベント詳細
	 */
	public String getDetail() {
		return detail;
	}
	/**
	 * 画像パス登録メソッド
	 * @param imgPath 画像パス
	 */
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	/**
	 * 画像パス取得メソッド
	 * @return imgPath 画像パス
	 */
	public String getImgPath() {
		return imgPath;
	}
	/**
	 * カテゴリID登録メソッド
	 * @param categoryId カテゴリID
	 */
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	/**
	 * カテゴリID取得メソッド
	 * @return categoryId カテゴリID
	 */
	public int getCategoryId() {
		return categoryId;
	}
	/**
	 * 登録日登録メソッド
	 * @param createdAt 登録日
	 */
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	/**
	 * 登録日取得メソッド
	 * @return createdAt 登録日
	 */
	public String getCreatedAt() {
		return createdAt;
	}
	/**
	 * 更新日登録メソッド
	 * @param updatedAt 更新日
	 */
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}
	/**
	 * 更新日取得メソッド
	 * @return updatedAt 更新日
	 */
	public String getUpdatedAt() {
		return updatedAt;
	}
}
