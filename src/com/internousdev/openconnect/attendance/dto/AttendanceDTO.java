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
	 * 受講年
	 */
	private String year;
	/**
	 * 受講開始月
	 */
	private String month;
	/**
	 * 漢字姓
	 */
	private String familyNameKanji;
	/**
	 * 漢字名
	 */
	private String givenNameKanji;
	/**
	 * かな性
	 */
	private String familyNameKana;
	/**
	 * かな名
	 */
	private String givenNameKana;
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
	 * 備考
	 */
    private String reason;
    
	/**
	* 取得メソッド 日付を取得
	* @author MINORI SUNAGAWA
	* @return date
	*/
	public String getDate() {
		return date;
	}
	/**
	* 設定メソッド 日付を設定
	* @author MINORI SUNAGAWA
	* @param date
	*/
	public void setDate(String date) {
		this.date = date;
	}

	/**
	* 取得メソッド ユーザーIDを取得
	* @author MINORI SUNAGAWA
	* @return userId
	*/
	public int getUserId() {
		return userId;
	}
	/**
	* 設定メソッド ユーザーIDを設定
	* @author MINORI SUNAGAWA
	* @param userId
	*/
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	* 取得メソッド 受講年を取得
	* @author MINORI SUNAGAWA
	* @return year
	*/
	public String getYear() {
		return year;
	}
	/**
	* 設定メソッド 受講年を設定
	* @author MINORI SUNAGAWA
	* @param year
	*/
	public void setYear(String year) {
		this.year = year;
	}
	/**
	* 取得メソッド 受講開始月を取得
	* @author MINORI SUNAGAWA
	* @return month
	*/
	public String getMonth() {
		return month;
	}
	/**
	* 設定メソッド 受講開始月を設定
	* @author MINORI SUNAGAWA
	* @param month
	*/
	public void setMonth(String month) {
		this.month = month;
	}
	/**
	* 取得メソッド 漢字姓を取得
	* @author MINORI SUNAGAWA
	* @return familyNameKanji
	*/
	public String getFamilyNameKanji() {
		return familyNameKanji;
	}
	/**
	* 設定メソッド 漢字姓を設定
	* @author MINORI SUNAGAWA
	* @param familyNameKanji
	*/
	public void setFamilyNameKanji(String familyNameKanji) {
		this.familyNameKanji = familyNameKanji;
	}
	/**
	* 取得メソッド 漢字名を取得
	* @author MINORI SUNAGAWA
	* @return givenNameKanji
	*/
	public String getGivenNameKanji() {
		return givenNameKanji;
	}
	/**
	* 設定メソッド 漢字名を設定
	* @author MINORI SUNAGAWA
	* @param givenNameKanji
	*/
	public void setGivenNameKanji(String givenNameKanji) {
		this.givenNameKanji = givenNameKanji;
	}
	/**
	* 取得メソッド かな性を取得
	* @author MINORI SUNAGAWA
	* @return familyNameKana
	*/
	public String getFamilyNameKana() {
		return familyNameKana;
	}
	/**
	* 設定メソッド かな姓を設定
	* @author MINORI SUNAGAWA
	* @param familyNameKana
	*/
	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}
	/**
	* 取得メソッド  かな名を取得
	* @author MINORI SUNAGAWA
	* @return givenNameKana
	*/
	public String getGivenNameKana() {
		return givenNameKana;
	}
	/**
	* 設定メソッド かな名を設定
	* @author MINORI SUNAGAWA
	* @param givenNameKana
	*/
	public void setGivenNameKana(String givenNameKana) {
		this.givenNameKana = givenNameKana;
	}
	/**
	* 取得メソッド 勤怠を取得
	* @author MINORI SUNAGAWA
	* @return attendance
	*/
	public int getAttendance() {
		return attendance;
	}
	/**
	* 設定メソッド 勤怠を設定
	* @author MINORI SUNAGAWA
	* @param attendance
	*/
	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}
	/**
	* 取得メソッド 面談を取得
	* @author MINORI SUNAGAWA
	* @return interview
	*/
	public int getInterview() {
		return interview;
	}
	/**
	* 設定メソッド 面談を設定
	* @author MINORI SUNAGAWA
	* @param interview
	*/
	public void setInterview(int interview) {
		this.interview = interview;
	}
	/**
	* 取得メソッド 勤怠文字を取得
	* @author MINORI SUNAGAWA
	* @return attendanceString
	*/
	public String getAttendanceString() {
		return attendanceString;
	}
	/**
	* 設定メソッド 勤怠文字を設定
	* @author MINORI SUNAGAWA
	* @param attendanceString
	*/
	public void setAttendanceString(String attendanceString) {
		this.attendanceString = attendanceString;
	}
	/**
	* 取得メソッド 面談文字を取得
	* @author MINORI SUNAGAWA
	* @return interviewString
	*/
	public String getInterviewString() {
		return interviewString;
	}
	/**
	* 設定メソッド  面談文字を設定
	* @author MINORI SUNAGAWA
	* @param interviewString
	*/
	public void setInterviewString(String interviewString) {
		this.interviewString = interviewString;
	}
	/**
	* 取得メソッド を取得
	* @author KOHEI NITABARU
	* @return reason
	*/
	public String getReason() {
		return reason;
	}
	/**
	* 設定メソッド を設定
	* @author KOHEI NITABARU
	* @param reason
	*/
	public void setReason(String reason) {
		this.reason = reason;
	}

}
