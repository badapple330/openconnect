package com.internousdev.openconnect.schedule.dto;

/**
 * スケジュール一覧から検索したデータを溜め込むクラス。
 * @author MASAHIRO KEDSUKA
 * @since 2016/09/07
 */
public class ScheduleDTO {

	/**
	 * id
	 * @author MASAHIRO KEDSUKA
	 */
	private int id;

	/**
	 * 開始日
	 * @author MASAHIRO KEDSUKA
	 */
	private String startDay;

	/**
	 * 終了日
	 *@author MASAHIRO KEDSUKA
	 */
	private String endDay;

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
	 * 取得メソッド IDを取得
	 * @author MASAHIRO KEDSUKA
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * 設定メソッド IDを設定
	 * @author MASAHIRO KEDSUKA
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 取得メソッド 開始日を取得
	 * @author MASAHIRO KEDSUKA
	 * @return startDay
	 */
	public String getStartDay() {
		return startDay;
	}

	/**
	 * 設定メソッド 開始日を設定
	 * @author MASAHIRO KEDSUKA
	 * @param startDay
	 */
	public void setStartDay(String startDay) {
		this.startDay = startDay;
	}

	/**
	 * 取得メソッド 終了日を取得
	 * @author MASAHIRO KEDSUKA
	 * @return endDay
	 */
	public String getEndDay() {
		return endDay;
	}

	/**
	 * 設定メソッド 終了日を設定
	 * @author MASAHIRO KEDSUKA
	 * @param endDay
	 */
	public void setEndDay(String endDay) {
		this.endDay = endDay;
	}

	/**
	 * 取得メソッド 件名を取得
	 * @author MASAHIRO KEDSUKA
	 * @return title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 設定メソッド 件名を設定
	 * @author MASAHIRO KEDSUKA
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 取得メソッド 内容を取得
	 * @author MASAHIRO KEDSUKA
	 * @return content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * 設定メソッド 内容を設定
	 * @author MASAHIRO KEDSUKA
	 * @param content
	 */
	public void setContent(String content) {
		this.content = content;
	}

}