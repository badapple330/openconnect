package com.internousdev.openconnect.schedule.action;

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
	 * シリアル番号
	 */
	private static final long serialVersionUID = 2437915534439167729L;

	/**
	 * ID
	 * @author MASAHIRO KEDSUKA
	 */
	private List<Integer> scheduleIdList = new ArrayList<Integer>();

	/**
	 * 開始日
	 * @author MASAHIRO KEDSUKA
	 */
	private List<String> scheduleStartdayList = new ArrayList<String>();

	/**
	 *終了日
	 * @author MASAHIRO KEDSUKA
	 */
	private List<String> scheduleEnddayList = new ArrayList<String>();

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
	private String errorMsg;


	/**
	 * 成功
	 * @author MASAHIRO KEDSUKA
	 */
	private String successMsg;


	/**
	 * 更新のメソッド。
	 */
	public String execute(){
		String ret = ERROR;

		ScheduleUpdateDAO dao = new ScheduleUpdateDAO();
		int count = 0;

		for(int i = 0 ; i < scheduleIdList.size() ;++i){
			count = dao.update(
					scheduleIdList.get(i),
					scheduleStartdayList.get(i),
					scheduleEnddayList.get(i),
					scheduleTitleList.get(i),
					scheduleContentList.get(i)
					);
		}
		if ( count > 0) {
			successMsg=(getText("更新しました。"));
			ret = SUCCESS;
		} else {
			errorMsg=(getText("更新できませんでした"));
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
	 * @return scheduleStartdayList
	 */
	public List<String> getScheduleStartdayList() {
		return scheduleStartdayList;
	}


	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param scheduleStartdayList
	 */
	public void setScheduleStartdayList(List<String> scheduleStartdayList) {
		this.scheduleStartdayList = scheduleStartdayList;
	}


	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return scheduleEnddayList
	 */
	public List<String> getScheduleEnddayList() {
		return scheduleEnddayList;
	}


	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param scheduleEnddayList
	 */
	public void setScheduleEnddayList(List<String> scheduleEnddayList) {
		this.scheduleEnddayList = scheduleEnddayList;
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
	 * @return errorMsg
	 */
	public String getErrorMsg() {
		return errorMsg;
	}


	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param errorMsg
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}


	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return successMsg
	 */
	public String getSuccessMsg() {
		return successMsg;
	}


	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param successMsg
	 */
	public void setSuccessMsg(String successMsg) {
		this.successMsg = successMsg;
	}


	/**
	* 取得メソッド
	* @author MASAHIRO KEDSUKA
	* @return serialVersionUID
	*/
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}