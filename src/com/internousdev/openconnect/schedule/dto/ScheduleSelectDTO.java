package com.internousdev.openconnect.schedule.dto;

/**
 * DBを検索するクラス。
 * @author MASAHIRO KEDSUKA
 * @since 2016/09/07
 */
public class ScheduleSelectDTO {
	/**
	 * ID
	 */
	private int id;

	/**
	 * 開始日
	 * @author MASAHIRO KEDSUKA
	 */
	private String start_day;

	/**
	 *終了日
	 *@author MASAHIRO KEDSUKA
	 */
	private String end_day;

	/**
	 * 件名
	 * @author MASAHIRO KEDSUKA
	 */
	private String title;

	/**
	 * 内容
	 * @author MASAHIRO KEDSUKA
	 */
	private String content;

	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return
	 */
	public int getId() {
		return id;
	}
	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return start_day
	 */
	public String getStart_day() {
		return start_day;
	}
	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param start_day
	 */
	public void setStart_day(String start_day) {
		this.start_day = start_day;
	}
	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return end_day
	 */
	public String getEnd_day() {
		return end_day;
	}
	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param end_day
	 */
	public void setEnd_day(String end_day) {
		this.end_day = end_day;
	}
	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param content
	 */
	public void setContent(String content) {
		this.content = content;
	}

}