package com.internousdev.openconnect.attendance.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.openconnect.attendance.dao.AdminAttendanceDAO;
import com.internousdev.openconnect.attendance.dto.AttendanceDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AdminAttendanceAction extends ActionSupport implements SessionAware{

	/*
	 * 手動入力の年
	 */
	private int atYear;
	/*
	 * 手動入力の月
	 */
	private int atMonth;
	/*
	 * 手動入力の日
	 */
	private int atDay;
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
	private String attendance;
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
		searchList = dao.select(atYear,atMonth,atDay,familyNameKanji,givenNameKanji);
		if(searchList.size() > 0){
			result=SUCCESS;
		}
	return result;
	}



	/**
	 * searchListを取得します。
	 * @return searchList
	 */
	public ArrayList<AttendanceDTO> getSearchList() {
		return searchList;
	}



	/**
	 * searchListを設定します。
	 * @param searchList searchList
	 */
	public void setSearchList(ArrayList<AttendanceDTO> searchList) {
		this.searchList = searchList;
	}



	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * atYearを取得します。
	 * @return atYear
	 */
	public int getAtYear() {
	    return atYear;
	}



	/**
	 * atYearを設定します。
	 * @param atYear atYear
	 */
	public void setAtYear(int atYear) {
	    this.atYear = atYear;
	}



	/**
	 * atMonthを取得します。
	 * @return atMonth
	 */
	public int getAtMonth() {
	    return atMonth;
	}



	/**
	 * atMonthを設定します。
	 * @param atMonth atMonth
	 */
	public void setAtMonth(int atMonth) {
	    this.atMonth = atMonth;
	}



	/**
	 * atDayを取得します。
	 * @return atDay
	 */
	public int getAtDay() {
	    return atDay;
	}



	/**
	 * atDayを設定します。
	 * @param atDay atDay
	 */
	public void setAtDay(int atDay) {
	    this.atDay = atDay;
	}



	/**
	 * 日付を取得します。
	 * @return 日付
	 */
	public String getAtDate() {
		return atDate;
	}



	/**
	 * 日付を設定します。
	 * @param atDate 日付
	 */
	public void setAtDate(String atDate) {
		this.atDate = atDate;
	}



	/**
	 * 受講開始月を取得します。
	 * @return 受講開始月
	 */
	public String getMonth() {
		return month;
	}



	/**
	 * 受講開始月を設定します。
	 * @param month 受講開始月
	 */
	public void setMonth(String month) {
		this.month = month;
	}



	/**
	 * 漢字姓を取得します。
	 * @return 漢字姓
	 */
	public String getFamilyNameKanji() {
		return familyNameKanji;
	}



	/**
	 * 漢字姓を設定します。
	 * @param familyNameKanji 漢字姓
	 */
	public void setFamilyNameKanji(String familyNameKanji) {
		this.familyNameKanji = familyNameKanji;
	}



	/**
	 * 漢字名を取得します。
	 * @return 漢字名
	 */
	public String getGivenNameKanji() {
		return givenNameKanji;
	}



	/**
	 * 漢字名を設定します。
	 * @param givenNameKanji 漢字名
	 */
	public void setGivenNameKanji(String givenNameKanji) {
		this.givenNameKanji = givenNameKanji;
	}



	/**
	 * 勤怠を取得します。
	 * @return 勤怠
	 */
	public String getAttendance() {
		return attendance;
	}



	/**
	 * 勤怠を設定します。
	 * @param attendance 勤怠
	 */
	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}



	/**
	 * 備考を取得します。
	 * @return 備考
	 */
	public String getReason() {
		return reason;
	}



	/**
	 * 備考を設定します。
	 * @param reason 備考
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}

}
