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





	/*ユーザーリスト*/
	private ArrayList<AttendanceDTO> searchList= new ArrayList<AttendanceDTO>();

	public String execute(){

		String result = ERROR;

		AttendanceDao dao = new AttendanceDao();
		searchList = dao.select(attendance);
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


	/* (非 Javadoc)
	 * @see org.apache.struts2.interceptor.SessionAware#setSession(java.util.Map)
	 */
	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}
}