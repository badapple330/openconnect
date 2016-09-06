package com.internousdev.footprinter.dto;

/**
 * 旅情報を格納するためのDTOクラス
 * @author 小澤 竜樹
 * @since 1.0
 * @version 1.0
 */
public class TourListDTO {
	/**
	 * 名前
	 */
	private String name;
	/**
	 * 旅ごとのID
	 */
	private int id;
	/**
	 * 日時
	 */
	private String eventDate;
	/**
	 * 価格
	 */
	private String price;
	/**
	 * 詳細
	 */
	private String detail;
	/**
	 * 画像ID
	 */
	private String imgPath;
	/**
	 * 大陸別ID
	 */
	private int categoryId;

	/**
	 * 旅名取得メソッド
	 * @return Name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 旅名格納メソッド
	 * @param name ツアー名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 旅ID取得メソッド
	 * @return Id ツアーId
	 */
	public int getId() {
		return id;
	}

	/**
	 * 旅ID格納メソッド
	 * @param id ツアーId
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 日時取得メソッド
	 * @return eventDate
	 */
	public String getEventDate() {
		return eventDate;
	}

	/**
	 * 日時格納メソッド
	 * @param eventdate イベント日
	 */
	public void setEventDate(String eventdate) {
		this.eventDate = eventdate;
	}

	/**
	 * 金額取得メソッド
	 * @param price イベント料金
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/**
	 * 金額格納メソッド
	 * @return price
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * 詳細取得メソッド
	 * @return detail
	 */
	public String getDetail() {
		return detail;
	}

	/**
	 * 詳細格納メソッド
	 * @param detail イベント詳細
	 */
	public void setDetail(String detail) {
		this.detail = detail;
	}

	/**
	 * 画像パス取得メソッド
	 * @return imgPath
	 */
	public String getImgPath() {
		return imgPath;
	}

	/**
	 * 画像パス格納メソッド
	 * @param imgpath イベント画像パス
	 */
	public void setImgPath(String imgpath) {
		this.imgPath = imgpath;
	}

	/**
	 * 大陸別ID取得メソッド
	 * @return categoryId
	 */
	public int getCategoryId() {
		return categoryId;
	}

	/**
	 * 大陸別格納メソッド
	 * @param categoryid カテゴリId
	 */
	public void setCategoryId(int categoryid) {
		this.categoryId = categoryid;
	}

}
