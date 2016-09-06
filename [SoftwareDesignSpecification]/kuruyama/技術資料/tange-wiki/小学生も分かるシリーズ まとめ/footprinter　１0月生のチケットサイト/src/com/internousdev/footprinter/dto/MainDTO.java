package com.internousdev.footprinter.dto;

/**
 * MainDTO 新着情報を格納しておく為のクラス
 * @author 北山 菜穂
 * @since  1.0
 * @version 1.0
 */
public class MainDTO {
	/**
	 * イベントID
	 */
	private int id;

	/**
	 * イベント名前
	 */
	private String name;

	/**
	 * イベント実施日
	 */
	private String eventDate;

	/**
	 * イベント値段
	 */
	private String price;

	/**
	 * イベント詳細
	 */
	private String detail;

	/**
	 * イベント画像ファイル名
	 */
	private String imgPath;


	/**
	 * id(イベントID)を格納する為のメソッド
	 * @param id イベントId
	 */
	public void setId(int id){
		this.id = id;
	}
	/**
	 * id(イベントID)を取得する為のメソッド
	 * @return id
	 */
	public int getId(){
		return id;
	}

	/**
	 * name(イベント名)を格納する為のメソッド
	 * @param name イベント名
	 */
	public void setName(String name){
		this.name = name;
	}

	/**
	 * name(イベント名)を取得する為のメソッド
	 * @return name
	 */
	public String getName(){
		return name;
	}

	/**
	 * eventDate(イベント実施日)を格納する為のメソッド
	 * @param eventDate イベント実施日
	 */
	public void setDate(String eventDate){
		this.eventDate = eventDate;
	}

	/**
	 * eventDate(イベント実施日)を取得する為のメソッド
	 * @return eventDate
	 */
	public String getDate(){
		return eventDate;
	}

	/**
	 * price(イベント値段)を格納する為のメソッド
	 * @param price イベント値段
	 */
	public void setPrice(String price){
		this.price = price;
	}

	/**
	 * price(イベント値段)を取得する為のメソッド
	 * @return price
	 */
	public String getPrice(){
		return  price;
	}

	/**
	 * detail(イベント詳細)を格納する為のメソッド
	 * @param detail イベント詳細
	 */
	public void setDetail(String detail){
		this.detail = detail;
	}

	/**
	 * detail(イベント詳細)を取得する為のメソッド
	 * @return detail
	 */
	public String getDetail(){
		return detail;
	}

	/**
	 * imgPath(イベントの画像ファイル名)を格納する為のメソッド
	 * @param imgPath イベントの画像ファイル名
	 */
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	/**
	 * imgPaht(イベントの画像ファイル名)を取得する為のメソッド
	 * @return imgPath
	 */
	public String getImgPath() {
		return imgPath;
	}
}
