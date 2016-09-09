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
	* 取得メソッド
	* @author MINORI SUNAGAWA
	* @return
	*/
	public int getYear() {
		return year;
	}
	/**
	* 設定メソッド
	* @author MINORI SUNAGAWA
	* @param
	*/
	public void setYear(int year) {
		this.year = year;
	}
	/**
	* 取得メソッド
	* @author MINORI SUNAGAWA
	* @return
	*/
	public String getYearString() {
		return yearString;
	}
	/**
	* 設定メソッド
	* @author MINORI SUNAGAWA
	* @param
	*/
	public void setYearString(String yearString) {
		this.yearString = yearString;
	}
	/**
	* 取得メソッド
	* @author MINORI SUNAGAWA
	* @return
	*/
	public int getMonth() {
		return month;
	}
	/**
	* 設定メソッド
	* @author MINORI SUNAGAWA
	* @param
	*/
	public void setMonth(int month) {
		this.month = month;
	}
	/**
	* 取得メソッド
	* @author MINORI SUNAGAWA
	* @return
	*/
	public String getMonthString() {
		return monthString;
	}
	/**
	* 設定メソッド
	* @author MINORI SUNAGAWA
	* @param
	*/
	public void setMonthString(String monthString) {
		this.monthString = monthString;
	}
	/**
	* 取得メソッド
	* @author MINORI SUNAGAWA
	* @return
	*/
	public int getDay() {
		return day;
	}
	/**
	* 設定メソッド
	* @author MINORI SUNAGAWA
	* @param
	*/
	public void setDay(int day) {
		this.day = day;
	}
	/**
	* 取得メソッド
	* @author MINORI SUNAGAWA
	* @return
	*/
	public String getDayString() {
		return dayString;
	}
	/**
	* 設定メソッド
	* @author MINORI SUNAGAWA
	* @param
	*/
	public void setDayString(String dayString) {
		this.dayString = dayString;
	}
}
