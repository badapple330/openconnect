package com.internousdev.footprinter.dto;

/**
 * イベント登録処理用DTO
 * @author 北山 菜穂
 * @since 1.0
 * @version 1.0
 */
public class EventEntryRegistrationDTO {
	/**
	 * イベント名
	 */
	private String eventName;

	/**
	 * イベント実施日
	 */
	private String eventDate;

	/**
	 * イベント値段
	 */
	private double price;

	/**
	 * イベントチケット枚数
	 */
	private int numOfTickets;

	/**
	 * イベント詳細
	 */
	private String eventDetail;

	/**
	 * イベント画像ファイルの名前
	 */
	private String imgPath;

	/**
	 * カテゴリー名
	 */
	private int category;

	/**
	 * eventNameのゲッターメソッド
	 * @return eventName
	 */
	public String getEventName() {
		return eventName;
	}

	/**
	 * eventNameのセッターメソッド
	 * @param eventName イベント名
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	/**
	 * eventDateのゲッターメソッド
	 * @return eventDate
	 */
	public String getEventDate() {
		return eventDate;
	}
	/**
	 * eventDateのセッターメソッド
	 * @param  eventDate イベント日
	 */
	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	/**
	 * priceのゲッターメソッド
	 * @return price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 *  priceのセッターメソッド
	 * @param  price 値段
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * numOfTicketsのゲッターメソッド
	 * @return numOfTickets
	 */
	public int getNumOfTickets() {
		return numOfTickets;
	}

	/**
	 *  numOfTicketsのセッターメソッド
	 * @param  numOfTickets 申し込み限度
	 */
	public void setNumOfTickets(int numOfTickets) {
		this.numOfTickets = numOfTickets;
	}

	/**
	 *  eventDetailのゲッターメソッド
	 * @return  eventDetail
	 */
	public String getEventDetail() {
		return eventDetail;
	}

	/**
	 * eventDetailのセッターメソッド
	 * @param eventDetail イベント詳細
	 */
	public void setEventDetail(String eventDetail) {
		this.eventDetail = eventDetail;
	}

	/**
	 *  imgPathのゲッターメソッド
	 * @return  imgPath
	 */
	public String getImgPath() {
		return imgPath;
	}

	/**
	 * imgPathのセッターメソッド
	 * @param imgPath イベント画像パス
	 */
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	/**
	 * categoryのゲッターメソッド
	 * @return  category
	 */
	public int getCategory() {
		return category;
	}

	/**
	 * categoryのセッターメソッド
	 * @param category カテゴリId
	 */
	public void setCategory(int category) {
		this.category = category;
	}
}
