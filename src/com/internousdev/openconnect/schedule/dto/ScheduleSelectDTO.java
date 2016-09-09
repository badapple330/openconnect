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
	private String startday;

	/**
	 *終了日
	 *@author MASAHIRO KEDSUKA
	 */
	private String endday;

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
	public String getStartday() {
		return startday;
	}
	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param start_day
	 */
	public void setStartday(String startday) {
		this.startday = startday;
	}
	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return end_day
	 */
	public String getEndday() {
		return endday;
	}
	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param end_day
	 */
	public void setEndday(String endday) {
		this.endday = endday;
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