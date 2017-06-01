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
	private String date;


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
		searchList = dao.select(date);
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

}
