/**
 *
 */
package com.internousdev.openconnect.attendance_test;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.openconnect.attendance.dto.AttendanceDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 出欠状況を検索するクラス
 * @author 河村
 * @since 6/19
 * @version 1.0.0
 */
public class attendanceACTION extends ActionSupport implements SessionAware{


	private int atYear;
	private int atMonth;
	/**
	* 取得メソッド を取得
	* @return atYear
	*/
	public int getAtYear() {
		return atYear;
	}


	/**
	* 設定メソッド を設定
	* @param atYear
	*/
	public void setAtYear(int atYear) {
		this.atYear = atYear;
	}


	/**
	* 取得メソッド を取得
	* @return atMonth
	*/
	public int getAtMonth() {
		return atMonth;
	}


	/**
	* 設定メソッド を設定
	* @param atMonth
	*/
	public void setAtMonth(int atMonth) {
		this.atMonth = atMonth;
	}


	/**
	* 取得メソッド を取得
	* @return atDay
	*/
	public int getAtDay() {
		return atDay;
	}


	/**
	* 設定メソッド を設定
	* @param atDay
	*/
	public void setAtDay(int atDay) {
		this.atDay = atDay;
	}


	/**
	* 取得メソッド を取得
	* @return atDate
	*/
	public String getAtDate() {
		return atDate;
	}


	/**
	* 設定メソッド を設定
	* @param atDate
	*/
	public void setAtDate(String atDate) {
		this.atDate = atDate;
	}


	/**
	* 取得メソッド を取得
	* @return month
	*/
	public String getMonth() {
		return month;
	}


	/**
	* 設定メソッド を設定
	* @param month
	*/
	public void setMonth(String month) {
		this.month = month;
	}


	/**
	* 取得メソッド を取得
	* @return givenNameKanji
	*/
	public String getGivenNameKanji() {
		return givenNameKanji;
	}


	/**
	* 設定メソッド を設定
	* @param givenNameKanji
	*/
	public void setGivenNameKanji(String givenNameKanji) {
		this.givenNameKanji = givenNameKanji;
	}


	/**
	* 取得メソッド を取得
	* @return teamName
	*/
	public String getTeamName() {
		return teamName;
	}


	/**
	* 設定メソッド を設定
	* @param teamName
	*/
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	/**
	* 取得メソッド を取得
	* @return reason
	*/
	public String getReason() {
		return reason;
	}


	/**
	* 設定メソッド を設定
	* @param reason
	*/
	public void setReason(String reason) {
		this.reason = reason;
	}


	/**
	* 取得メソッド を取得
	* @return displayList
	*/
	public ArrayList<AttendanceDTO> getDisplayList() {
		return displayList;
	}


	/**
	* 設定メソッド を設定
	* @param displayList
	*/
	public void setDisplayList(ArrayList<AttendanceDTO> displayList) {
		this.displayList = displayList;
	}


	private int atDay;
	private String atDate;
	private String month;
	private String familyNameKanji;
	private String givenNameKanji;
	private String teamName;
	private String attendance;	//勤怠
	private String reason;









	/*ユーザーリスト*/
	private ArrayList<AttendanceDTO> displayList = new ArrayList<AttendanceDTO>();

	public String execute(){

		String result = ERROR;

		AttendanceDao dao = new AttendanceDao();
		displayList = dao.select(attendance,familyNameKanji,atYear,atMonth,atDay);
		if(displayList.size() > 0){
			result=SUCCESS;
		}
		return result;
	}


	/**
	 * displayListを取得します。
	 * @return displayList
	 */
	public ArrayList<AttendanceDTO> getdisplayList() {
		return displayList;
	}





	/**
	 * displayListを設定します。
	 * @param displayList displayList
	 */
	public void setdisplayList(ArrayList<AttendanceDTO> displayList) {
		this.displayList = displayList;
	}

	/**
	 * 勤怠を取得します。
	 * @return attendance 勤怠
	 */
	public String getAttendance() {
		return attendance;

	}
	/**
	* 設定メソッド を設定
	* @param attendance
	*/
	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}

	/**
	* 取得メソッド を取得
	* @return familyNameKanji
	*/
	public String getFamilyNameKanji() {
		return familyNameKanji;
	}


	/**
	* 設定メソッド を設定
	* @param familyNameKanji
	*/
	public void setFamilyNameKanji(String familyNameKanji) {
		this.familyNameKanji = familyNameKanji;
	}


	/* (非 Javadoc)
	 * @see org.apache.struts2.interceptor.SessionAware#setSession(java.util.Map)
	 */
	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}
}