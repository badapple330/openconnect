package com.internousdev.footprinter.dto;

/**
 * 旅詳細情報を保持するクラス
 * @author 細谷 香菜
 * @version 1.0
 * @since 1.0
 */
public class TourDetailDTO {

	/**
	 * イベント名
	 */
	private String eventName;
	/**
	 * イベント開催日
	 */
	private String eventDate;
	/**
	 * チケット価格
	 */
	private String price;
	/**
	 * チケット残数
	 */
	private int remaining;
	/**
	 * 画像パス
	 */
	private String imgPath;
	/**
	 * 詳細情報
	 */
	private String detail;
	/**
	 * コメント
	 */
	private String comment;
	/**
	 * ユーザー名
	 */
	private String userName;
	
	/**
	 * eventNameを設定するメソッド
	 * @param eventName イベント名
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	
	/**
	 * eventNameを取得するメソッド
	 * @return eventName イベント名
	 */
	public String getEventName() {
		return eventName;
	}
	
	/**
	 * eventDateを設定するメソッド
	 * @param eventDate イベント開催日
	 */
	public void setEventDate(String eventDate){
		this.eventDate = eventDate;
	}
	
	/**
	 * eventDateを取得するメソッド
	 * @return eventDate イベント開催日
	 */
	public String getEventDate(){
		return eventDate;
	}
	
	/**
	 * priceを設定するメソッド
	 * @param price チケット金額
	 */
	public void setPrice(String price){
		this.price = price;
	}
	
	/**
	 * priceを取得するメソッド
	 * @return price チケット金額
	 */
	public String getPrice(){
		return price;
	}
	
	/**
	 * remainingを設定するメソッド
	 * @param remaining チケット残数
	 */
	public void setRemaining(int remaining){
		this.remaining = remaining;
	}
	
	/**
	 * remainingを取得するメソッド
	 * @return remaining チケット残数
	 */
	public int getRemaining(){
		return remaining;
	}
	
	/**
	 * detailを設定するメソッド
	 * @param detail 旅詳細文
	 */
	public void setDetail(String detail){
		this.detail = detail;
	}
	
	/**
	 * detailを取得するメソッド
	 * @return detail 旅詳細文
	 */
	public String getDetail(){
		return detail;
	}
	
	/**
	 * imgPathを設定するメソッド
	 * @param imgPath 画像path
	 */
	public void setImgPath(String imgPath){
		this.imgPath = imgPath;
	}
	
	/**
	 * imgPathを取得するメソッド
	 * @return imgPath 画像path
	 */
	public String getImgPath(){
		return imgPath;
	}
	
	/**
	 * commentを設定するメソッド
	 * @param comment レビューコメント
	 */
	public void setComment(String comment){
		this.comment= comment;
		
	}
	
	/**
	 * commentを取得するメソッド
	 * @return comment レビューコメント
	 */
	public String getComment(){
		return comment;
	}

	/**
	 * userNameを取得するメソッド
	 * @return userName ユーザ名
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * userNameを設定するメソッド
	 * @param userName ユーザ名
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
