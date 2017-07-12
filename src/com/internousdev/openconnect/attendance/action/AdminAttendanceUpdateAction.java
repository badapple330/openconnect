/**
 *
 */
package com.internousdev.openconnect.attendance.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.openconnect.attendance.dao.AdminAttendanceUpdateDAO;
import com.internousdev.openconnect.attendance.dto.AttendanceDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internousdev
 *
 */
public class AdminAttendanceUpdateAction extends ActionSupport implements SessionAware{

	/**
     * シリアル番号
     */
    private static final long serialVersionUID = 8587637642584563442L;

//    ユーザーID
    private int userId;
//    出欠
    private String attendance;
//    備考
    private String reason;
//    年
    private int atYear;
//    月
    private int atMonth;
//    日
    private int atDay;
//    チーム名
    private String teamName;
//    日付
    private String atDate;
//    受講開始月
    private String month;
//    漢字姓
    private String familyNameKanji;
//    漢字名
    private String givenNameKanji;


    /* 検索結果 */
    private ArrayList<AttendanceDTO> searchList = new ArrayList<AttendanceDTO>();

    public String execute() throws SQLException {

        String result = ERROR;
        AdminAttendanceUpdateDAO dao = new AdminAttendanceUpdateDAO();
        int count = 0;
        count = dao.update(userId,attendance,reason,atYear,atMonth,atDay);

        if (count != 0) {
        	searchList = dao.select(atYear,atMonth,atDay,teamName);
            result = SUCCESS;

        }
        return result;
    }


	/**
	 * userIdを取得します。
	 * @return userId
	 */
	public int getUserId() {
		return userId;
	}


	/**
	 * userIdを設定します。
	 * @param userId userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}


	/**
	 * attendanceを取得します。
	 * @return attendance
	 */
	public String getAttendance() {
		return attendance;
	}


	/**
	 * attendanceを設定します。
	 * @param attendance attendance
	 */
	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}


	/**
	 * reasonを取得します。
	 * @return reason
	 */
	public String getReason() {
		return reason;
	}


	/**
	 * reasonを設定します。
	 * @param reason reason
	 */
	public void setReason(String reason) {
		this.reason = reason;
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
	 * teamNameを取得します。
	 * @return teamName
	 */
	public String getTeamName() {
		return teamName;
	}


	/**
	 * teamNameを設定します。
	 * @param teamName teamName
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	/**
	 * atDateを取得します。
	 * @return atDate
	 */
	public String getAtDate() {
	    return atDate;
	}


	/**
	 * atDateを設定します。
	 * @param atDate atDate
	 */
	public void setAtDate(String atDate) {
	    this.atDate = atDate;
	}


	/**
	 * monthを取得します。
	 * @return month
	 */
	public String getMonth() {
	    return month;
	}


	/**
	 * monthを設定します。
	 * @param month month
	 */
	public void setMonth(String month) {
	    this.month = month;
	}


	/**
	 * familyNameKanjiを取得します。
	 * @return familyNameKanji
	 */
	public String getFamilyNameKanji() {
	    return familyNameKanji;
	}


	/**
	 * familyNameKanjiを設定します。
	 * @param familyNameKanji familyNameKanji
	 */
	public void setFamilyNameKanji(String familyNameKanji) {
	    this.familyNameKanji = familyNameKanji;
	}


	/**
	 * givenNameKanjiを取得します。
	 * @return givenNameKanji
	 */
	public String getGivenNameKanji() {
	    return givenNameKanji;
	}


	/**
	 * givenNameKanjiを設定します。
	 * @param givenNameKanji givenNameKanji
	 */
	public void setGivenNameKanji(String givenNameKanji) {
	    this.givenNameKanji = givenNameKanji;
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


	/* (非 Javadoc)
	 * @see org.apache.struts2.interceptor.SessionAware#setSession(java.util.Map)
	 */
	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
