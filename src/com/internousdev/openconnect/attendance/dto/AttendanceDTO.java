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
	 * ユーザーID
	 */
	private int userId;
	/**
	 * 勤怠
	 */
	private int attendance;
	/**
	 * 勤怠文字
	 */
	private String attendanceString;
	/**
	 * 面談
	 */
	private int interview;
	/**
	 * 面談文字
	 */
	private String interviewString;

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
	* @return userId
	*/
	public int getUserId() {
		return userId;
	}
	/**
	* 設定メソッド
	* @author MINORI SUNAGAWA
	* @param userId
	*/
	public void setUserId(int userId) {
		this.userId = userId;
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
	/**
	* 取得メソッド
	* @author MINORI SUNAGAWA
	* @return attendanceString
	*/
	public String getAttendanceString() {
		return attendanceString;
	}
	/**
	* 設定メソッド
	* @author MINORI SUNAGAWA
	* @param attendanceString
	*/
	public void setAttendanceString(String attendanceString) {
		this.attendanceString = attendanceString;
	}
	/**
	* 取得メソッド
	* @author MINORI SUNAGAWA
	* @return interviewString
	*/
	public String getInterviewString() {
		return interviewString;
	}
	/**
	* 設定メソッド
	* @author MINORI SUNAGAWA
	* @param interviewString
	*/
	public void setInterviewString(String interviewString) {
		this.interviewString = interviewString;
	}

}
