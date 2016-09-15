package com.internousdev.openconnect.attendance.dto;

/**
 * DBの情報を画面に表示する為のクラス
 * @author MINORI SUNAGAWA
 * @since 2016/09/04
 * @version 1.0
 */
public class AttendanceCalendarDTO {

	/**
	 * 年
	 */
	private int year;
	/**
	 * 年
	 */
	private String yearString;
	/**
	 * 月
	 */
	private int month;
	/**
	 * 月
	 */
	private String monthString;
	/**
	 * 日
	 */
	private int day;
	/**
	 * 日
	 */
	private String dayString;
	/**
	* 取得メソッド 月を取得
	* @author MINORI SUNAGAWA
	* @return year
	*/
	public int getYear() {
		return year;
	}
	/**
	* 設定メソッド 年を取得
	* @author MINORI SUNAGAWA
	* @param year
	*/
	public void setYear(int year) {
		this.year = year;
	}
	/**
	* 取得メソッド 年文字を取得
	* @author MINORI SUNAGAWA
	* @return yearString
	*/
	public String getYearString() {
		return yearString;
	}
	/**
	* 設定メソッド 年文字を取得
	* @author MINORI SUNAGAWA
	* @param yearString
	*/
	public void setYearString(String yearString) {
		this.yearString = yearString;
	}
	/**
	* 取得メソッド 月を取得
	* @author MINORI SUNAGAWA
	* @return month
	*/
	public int getMonth() {
		return month;
	}
	/**
	* 設定メソッド 月を設定
	* @author MINORI SUNAGAWA
	* @param month
	*/
	public void setMonth(int month) {
		this.month = month;
	}
	/**
	* 取得メソッド 月文字を取得
	* @author MINORI SUNAGAWA
	* @return monthString
	*/
	public String getMonthString() {
		return monthString;
	}
	/**
	* 設定メソッド 月文字を設定
	* @author MINORI SUNAGAWA
	* @param monthString
	*/
	public void setMonthString(String monthString) {
		this.monthString = monthString;
	}
	/**
	* 取得メソッド 日を取得
	* @author MINORI SUNAGAWA
	* @return day
	*/
	public int getDay() {
		return day;
	}
	/**
	* 設定メソッド 日を設定
	* @author MINORI SUNAGAWA
	* @param day
	*/
	public void setDay(int day) {
		this.day = day;
	}
	/**
	* 取得メソッド 日文字を取得
	* @author MINORI SUNAGAWA
	* @return dayString
	*/
	public String getDayString() {
		return dayString;
	}
	/**
	* 設定メソッド 日文字を設定
	* @author MINORI SUNAGAWA
	* @param dayString
	*/
	public void setDayString(String dayString) {
		this.dayString = dayString;
	}

}
