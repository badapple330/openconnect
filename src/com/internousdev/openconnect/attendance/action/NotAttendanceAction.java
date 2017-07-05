/**
 *
 */
package com.internousdev.openconnect.attendance.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.attendance.dao.AttendanceCheckDAO;
import com.internousdev.openconnect.attendance.dao.AttendanceDAO;
import com.internousdev.openconnect.attendance.dto.AttendanceDTO;


/**
 * 連絡なしのIDをinsertするクラス
 * @author Kawamura
 * @since 7/4
 * @version 1.0.0
 */
public class NotAttendanceAction {

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
	/* 勤怠 */
	private int attendance;
	/* 備考 */
	private int reason;
	/* チームネーム */
	private String teamName;
	
	private ArrayList<AttendanceDTO> usersIdList = new ArrayList<AttendanceDTO>();
	
	private ArrayList<AttendanceDTO> attendanceIdList = new ArrayList<AttendanceDTO>();

	/**
	 * 
	 * @return
	 */
	public String execute(){
		String result =ERROR;
		NotAttendanceDAO dao = new NotAttendanceDAO();
		
		if(dao.void insert(int atYear, int atMonth, int atDay, String atDate, List<Integer> usersIdList, String attendance) > 0){
		      result = SUCCESS;

		}
	}
		  return result;

}
