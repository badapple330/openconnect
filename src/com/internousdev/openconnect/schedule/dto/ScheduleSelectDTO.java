package com.internousdev.openconnect.schedule.dto;

import java.sql.Date;

/**
 * DBを検索するクラス。
 * @author MASAHIRO KEDSUKA
 * @since 2016/09/07
 */
public class ScheduleSelectDTO {
	/**
	 * ID、開始日、終了日、件名、内容。
	 */
	private int id;
	private Date start_day;
	private Date end_day;
	private String title;
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
	public Date getStart_day() {
		return start_day;
	}
	/**
	* 設定メソッド
	* @author MASAHIRO KEDSUKA
	* @param start_day
	*/
	public void setStart_day(Date start_day) {
		this.start_day = start_day;
	}
	/**
	* 取得メソッド
	* @author MASAHIRO KEDSUKA
	* @return end_day
	*/
	public Date getEnd_day() {
		return end_day;
	}
	/**
	* 設定メソッド
	* @author MASAHIRO KEDSUKA
	* @param end_day
	*/
	public void setEnd_day(Date end_day) {
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