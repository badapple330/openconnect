package com.internousdev.openconnect.attendance.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.openconnect.attendance.dao.AdminAttendanceDAO;
import com.internousdev.openconnect.attendance.dto.AttendanceDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AdminAttendanceAction extends ActionSupport implements SessionAware{

	/**
	 * 日付
	 */
	private String atDate;
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
	 * 勤怠
	 */
	private int attendance;
	/**
	 * 備考
	 */
    private String reason;


	/*
	 * ユーザーリスト
	 */
	private ArrayList<AttendanceDTO> searchList = new ArrayList<AttendanceDTO>();
	/**
	 * ページネーション用リスト
	 */


	public String execute() {

		String result = ERROR;


		AdminAttendanceDAO dao = new AdminAttendanceDAO();
		searchList = dao.select(atDate);
		if(searchList.size() > 0){
			result=SUCCESS;
		}
	return result;
	}



	/**
	 * @return searchList
	 */
	public ArrayList<AttendanceDTO> getSearchList() {
		return searchList;
	}

	/**
	 * @param searchList
	 *            セットする searchList
	 */
	public void setSearchList(ArrayList<AttendanceDTO> searchList) {
		this.searchList = searchList;
	}


	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	* 取得メソッド 日付を取得
	* @author MINORI SUNAGAWA
	* @return date
	*/
	public String getAtDate() {
		return atDate;
	}
	/**
	* 設定メソッド 日付を設定
	* @author MINORI SUNAGAWA
	* @param date
	*/
	public void setAtDate(String atDate) {
		this.atDate = atDate;
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
