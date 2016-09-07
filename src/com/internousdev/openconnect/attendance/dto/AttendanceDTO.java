/**
 *
 */
package com.internousdev.openconnect.attendance.dto;

/**
 * DBの情報を画面に表示する為のクラス
 * @author MINORI SUNAGAWA
 * @since 2016/09/04
 * @version 1.0
 */
public class AttendanceDTO {

	/**
	 * 日付
	 */
	private String date;
	/**
	 * ID
	 */
	private int id;
	/**
	 * 勤怠
	 */
	private int attendance;
	/**
	 * 面談
	 */
	private int interview;

	/**
	* 取得メソッド
	* @author MINORI SUNAGAWA
	* @return date
	*/
	public String getDate() {
		return date;
	}
	/**
	* 設定メソッド
	* @author MINORI SUNAGAWA
	* @param date
	*/
	public void setDate(String date) {
		this.date = date;
	}
	/**
	* 取得メソッド
	* @author MINORI SUNAGAWA
	* @return id
	*/
	public int getId() {
		return id;
	}
	/**
	* 設定メソッド
	* @author MINORI SUNAGAWA
	* @param id
	*/
	public void setId(int id) {
		this.id = id;
	}
	/**
	* 取得メソッド
	* @author MINORI SUNAGAWA
	* @return attendance
	*/
	public int getAttendance() {
		return attendance;
	}
	/**
	* 設定メソッド
	* @author MINORI SUNAGAWA
	* @param attendance
	*/
	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}
	/**
	* 取得メソッド
	* @author MINORI SUNAGAWA
	* @return interview
	*/
	public int getInterview() {
		return interview;
	}
	/**
	* 設定メソッド
	* @author MINORI SUNAGAWA
	* @param interview
	*/
	public void setInterview(int interview) {
		this.interview = interview;
	}
}
