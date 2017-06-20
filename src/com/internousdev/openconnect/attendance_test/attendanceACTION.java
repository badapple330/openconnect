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

	private String attendance;	//勤怠
	private String familyNameKanji;








	/*ユーザーリスト*/
	private ArrayList<AttendanceDTO> displayList = new ArrayList<AttendanceDTO>();

	public String execute(){

		String result = ERROR;

		AttendanceDao dao = new AttendanceDao();
		displayList = dao.select(attendance,familyNameKanji);
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