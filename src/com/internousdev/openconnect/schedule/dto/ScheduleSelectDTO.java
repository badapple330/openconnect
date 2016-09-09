package com.internousdev.openconnect.schedule.dto;

/**
 * DBを検索するクラス。
 * @author MASAHIRO KEDSUKA
 * @since 2016/09/07
 */
public class ScheduleSelectDTO {

	/**
	 * Id
	 */
	private int Id;

	/**
	 * 開始日
	 * @author MASAHIRO KEDSUKA
	 */
	private String Startday;

	/**
	 *終了日
	 *@author MASAHIRO KEDSUKA
	 */
	private String Endday;

	/**
	 * 件名
	 * @author MASAHIRO KEDSUKA
	 */
	private String Title;

	/**
	 * 内容
	 * @author MASAHIRO KEDSUKA
	 */
	private String Content;

	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return Id
	 */
	public int getId() {
		return Id;
	}
	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param id
	 */
	public void setId(int Id) {
		this.Id = Id;
	}
	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return Start_day
	 */
	public String getStartday() {
		return Startday;
	}
	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param Startday
	 */
	public void setStartday(String Startday) {
		this.Startday = Startday;
	}
	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return Endday
	 */
	public String getEndday() {
		return Endday;
	}
	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param Endday
	 */
	public void setEndday(String Endday) {
		this.Endday = Endday;
	}
	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return Title
	 */
	public String getTitle() {
		return Title;
	}
	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param Title
	 */
	public void setTitle(String Title) {
		this.Title = Title;
	}
	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return Content
	 */
	public String getContent() {
		return Content;
	}
	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param Content
	 */
	public void setContent(String Content) {
		this.Content = Content;
	}

}