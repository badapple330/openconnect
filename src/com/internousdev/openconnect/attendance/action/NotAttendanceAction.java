/**
 *
 */
package com.internousdev.openconnect.attendance.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.openconnect.attendance.dao.GoAttendanceDAO;
import com.internousdev.openconnect.attendance.dao.NotAttendanceDAO;
import com.internousdev.openconnect.attendance.dto.AttendanceDTO;
import com.opensymphony.xwork2.ActionSupport;


/**
 * 連絡なしのIDをinsertするクラス
 * @author Kawamura
 * @since 7/4
 * @version 1.0.0
 */
public class NotAttendanceAction extends ActionSupport implements SessionAware {

	/* ユーザーID */
	private int userId;
	/* 年 */
	private int atYear;
	/* 月 */
	private int atMonth;
	/* 日 */
	private int atDay;
	/* 日付 */
	private int atDate;
	/* 受講開始 月 */
	private String month;
	/* 漢字 姓 */
	private String familyNameKanji;
	/* 漢字 名 */
	private String givenNameKanji;
	/* 勤怠 */
	private String attendance;
	/* 備考 */
	private int reason;
	/* チーム名 */
	private String teamName;
	/* エラーメッセージ */
	private String errorMsg;
	/* 出席数 */
	private int present = 0;
	/* 欠席数 */
	private int absent = 0;
	/* 遅刻数 */
	private int late = 0;
	/* 早退数 */
	private int early = 0;
	/* 連絡なし数 */
	private int noContact = 0;

	/**
	 * チームリスト
	 */
	private ArrayList<AttendanceDTO> atTeamList = new ArrayList<AttendanceDTO>();

	/* ユーザーIDリスト */
	private ArrayList<AttendanceDTO> usersIdList = new ArrayList<AttendanceDTO>();
	/* 勤怠IDリスト */
	private ArrayList<AttendanceDTO> attendanceIdList = new ArrayList<AttendanceDTO>();
	/* ユーザーリスト */
	private ArrayList<AttendanceDTO> atUserList = new ArrayList<AttendanceDTO>();

	private ArrayList<AttendanceDTO> searchList = new ArrayList<AttendanceDTO>();

	/**
	 * 実行メソッド、勤怠を送信してないユーザーの出欠状況の送信処理をする
	 * @return result
	 */
	public String execute(){
		String result =ERROR;

		GoAttendanceDAO dao3 = new GoAttendanceDAO();
		atUserList = dao3.select(userId);

		NotAttendanceDAO dao = new NotAttendanceDAO();
		attendanceIdList = dao.select(atYear, atMonth, atDay);
		usersIdList = dao. select2( attendanceIdList, teamName);

		if(dao.insert(atYear, atMonth, atDay, usersIdList, attendance) > 0){
			result = SUCCESS;
		}else {
			this.setErrorMsg("連絡なしはいません。");
		}

		searchList = dao.select(atYear, atMonth, atDay, teamName);

		for(int i = 0; i<searchList.size(); i++){
			String attend = searchList.get(i).getAttendance();
			if(attend.equals("出席")){
				present = present + 1;
			} else if(attend.equals("欠席")){
				absent = absent + 1;
			} else if(attend.equals("遅刻")){
				late = late + 1;
			} else if(attend.equals("早退")){
				early = early + 1;
			} else if(attend.equals("連絡なし")){
				noContact = noContact + 1;
			}
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
		 * usersIdListを取得します。
		 * @return usersIdList
		 */
		public ArrayList<AttendanceDTO> getUsersIdList() {
					    return usersIdList;
					}
		/**
		 * usersIdListを設定します。
		 * @param usersIdList usersIdList
		 */
		public void setUsersIdList(ArrayList<AttendanceDTO> usersIdList) {
					    this.usersIdList = usersIdList;
					}
		/* (非 Javadoc)
		 * @see org.apache.struts2.interceptor.SessionAware#setSession(java.util.Map)
		 */
		@Override
		public void setSession(Map<String, Object> arg0) {
			// TODO 自動生成されたメソッド・スタブ

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
		* 取得メソッド を取得
		* @return atDate
		*/
		public int getAtDate() {
			return atDate;
		}
		/**
		* 設定メソッド を設定
		* @param atDate
		*/
		public void setAtDate(int atDate) {
			this.atDate = atDate;
		}
		public String getAllTeamNames(){
			return "";
		}
		/**
		 * presentを取得します。
		 * @return present
		 */
		public int getPresent() {
		    return present;
		}
		/**
		 * presentを設定します。
		 * @param present present
		 */
		public void setPresent(int present) {
		    this.present = present;
		}
		/**
		 * absentを取得します。
		 * @return absent
		 */
		public int getAbsent() {
		    return absent;
		}
		/**
		 * absentを設定します。
		 * @param absent absent
		 */
		public void setAbsent(int absent) {
		    this.absent = absent;
		}
		/**
		 * lateを取得します。
		 * @return late
		 */
		public int getLate() {
		    return late;
		}
		/**
		 * lateを設定します。
		 * @param late late
		 */
		public void setLate(int late) {
		    this.late = late;
		}
		/**
		 * earlyを取得します。
		 * @return early
		 */
		public int getEarly() {
		    return early;
		}
		/**
		 * earlyを設定します。
		 * @param early early
		 */
		public void setEarly(int early) {
		    this.early = early;
		}
		/**
		 * noContactを取得します。
		 * @return noContact
		 */
		public int getNoContact() {
		    return noContact;
		}
		/**
		 * noContactを設定します。
		 * @param noContact noContact
		 */
		public void setNoContact(int noContact) {
		    this.noContact = noContact;
		}
		/**
		* 取得メソッド を取得
		* @return atTeamList
		*/
		public ArrayList<AttendanceDTO> getAtTeamList() {
			return atTeamList;
		}
		/**
		* 設定メソッド を設定
		* @param atTeamList
		*/
		public void setAtTeamList(ArrayList<AttendanceDTO> atTeamList) {
			this.atTeamList = atTeamList;
		}
		/**
		 * reasonを取得します。
		 * @return reason
		 */
		public int getReason() {
					    return reason;
					}
		/**
		 * reasonを設定します。
		 * @param reason reason
		 */
		public void setReason(int reason) {
					    this.reason = reason;
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
		* 取得メソッド を取得
		* @return errorMsg
		*/
		public String getErrorMsg() {
			return errorMsg;
		}
		/**
		* 設定メソッド を設定
		* @param errorMsg
		*/
		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}
		/**
		 * attendanceIdListを取得します。
		 * @return attendanceIdList
		 */
		public ArrayList<AttendanceDTO> getAttendanceIdList() {
					    return attendanceIdList;
					}
		/**
		 * attendanceIdListを設定します。
		 * @param attendanceIdList attendanceIdList
		 */
		public void setAttendanceIdList(ArrayList<AttendanceDTO> attendanceIdList) {
					    this.attendanceIdList = attendanceIdList;
					}
		/**
		 * atUserListを取得します。
		 * @return atUserList
		 */
		public ArrayList<AttendanceDTO> getAtUserList() {
				    return atUserList;
				}
		/**
		 * atUserListを設定します。
		 * @param atUserList atUserList
		 */
		public void setAtUserList(ArrayList<AttendanceDTO> atUserList) {
				    this.atUserList = atUserList;
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

}
