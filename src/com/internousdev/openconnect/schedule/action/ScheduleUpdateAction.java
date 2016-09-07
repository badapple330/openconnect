package com.internousdev.openconnect.schedule.action;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.schedule.dao.ScheduleUpdateDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 画面から入力された値を更新するクラス。
 * @author MASAHIRO KEDSUKA
 * @since 2016/09/07
 */
public class ScheduleUpdateAction extends ActionSupport {

	/**
	 * ID
	 */
	private List<Integer> scheduleIdList = new ArrayList<Integer>();

	/**
	 * 開始日
	 * @author MASAHIRO KEDSUKA
	 */
	private List<Date> scheduleStart_dayList = new ArrayList<Date>();

	/**
	 *終了日
	 * @author MASAHIRO KEDSUKA
	 */
	private List<Date> scheduleEnd_dayList = new ArrayList<Date>();

	/**
	 * 件名
	 * @author MASAHIRO KEDSUKA
	 */
	private List<String> scheduleTitleList = new ArrayList<String>();

	/**
	 * 内容
	 * @author MASAHIRO KEDSUKA
	 */
	private List<String> scheduleContentList = new ArrayList<String>();

	/**
	 * エラー
	 * @author MASAHIRO KEDSUKA
	 */
	private String error_msg;


	/**
	 * 成功
	 * @author MASAHIRO KEDSUKA
	 */
	private String success_msg;


	/**
	 * 更新のメソッド。
	 */
	public String execute(){
		String ret = ERROR;

		ScheduleUpdateDAO dao = new ScheduleUpdateDAO();
		int count = 0;

		for(int i = 0 ; i < scheduleIdList.size() ;++i){
			count = dao.update(scheduleIdList.get(i),scheduleStart_dayList.get(i),scheduleEnd_dayList.get(i),scheduleTitleList.get(i),scheduleContentList.get(i));}

		if ( count > 0) {
			success_msg=(getText("更新しました。"));
			ret = SUCCESS;
		} else {
			error_msg=(getText("更新できませんでした"));
		}
		return ret;
	}


	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return scheduleIdList
	 */
	public List<Integer> getScheduleIdList() {
		return scheduleIdList;
	}


	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param scheduleIdList
	 */
	public void setScheduleIdList(List<Integer> scheduleIdList) {
		this.scheduleIdList = scheduleIdList;
	}


	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return scheduleStart_dayList
	 */
	public List<Date> getScheduleStart_dayList() {
		return scheduleStart_dayList;
	}


	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param scheduleStart_dayList
	 */
	public void setScheduleStart_dayList(List<Date> scheduleStart_dayList) {
		this.scheduleStart_dayList = scheduleStart_dayList;
	}


	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return scheduleEnd_dayList
	 */
	public List<Date> getScheduleEnd_dayList() {
		return scheduleEnd_dayList;
	}


	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param scheduleEnd_dayList
	 */
	public void setScheduleEnd_dayList(List<Date> scheduleEnd_dayList) {
		this.scheduleEnd_dayList = scheduleEnd_dayList;
	}


	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return scheduleTitleList
	 */
	public List<String> getScheduleTitleList() {
		return scheduleTitleList;
	}


	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param scheduleTitleList
	 */
	public void setScheduleTitleList(List<String> scheduleTitleList) {
		this.scheduleTitleList = scheduleTitleList;
	}


	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return scheduleContentList
	 */
	public List<String> getScheduleContentList() {
		return scheduleContentList;
	}


	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param scheduleContentList
	 */
	public void setScheduleContentList(List<String> scheduleContentList) {
		this.scheduleContentList = scheduleContentList;
	}


	/**
	* 取得メソッド
	* @author MASAHIRO KEDSUKA
	* @return error_msg
	*/
	public String getError_msg() {
		return error_msg;
	}


	/**
	* 設定メソッド
	* @author MASAHIRO KEZUKA
	* @param error_msg
	*/
	public void setError_msg(String error_msg) {
		this.error_msg = error_msg;
	}


	/**
	* 取得メソッド
	* @author MASAHIRO KEDSUKA
	* @return success_msg
	*/
	public String getSuccess_msg() {
		return success_msg;
	}


	/**
	* 設定メソッド
	* @author MASAHIRO KEZUKA
	* @param success_msg
	*/
	public void setSuccess_msg(String success_msg) {
		this.success_msg = success_msg;
	}



}