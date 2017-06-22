package com.internousdev.openconnect.schedule.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.schedule.dao.ScheduleUpdateDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * スケジュール一覧で入力された値を更新するクラス。
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

	private List<String> scheduleTeamNameList = new ArrayList<String>();

	/**
	 * エラーメッセージ
	 * @author MASAHIRO KEDSUKA
	 */
	private String errorMsg;


	/**
	 * 成功メッセージ
	 * @author MASAHIRO KEDSUKA
	 */
	private String successMsg;

	//ScheduleSelectAcitionにチーム名渡すための変数
	private String search;

	//jspからteamNameを取得する
	private List<String> teamList = new ArrayList<String>();


	/**
	 * 更新のメソッド。
	 */
	public String execute(){
		String ret = ERROR;

		search = getParameterValues("teamList[]");

		ScheduleUpdateDAO dao = new ScheduleUpdateDAO();
		int count = 0;

		for(int i = 0 ; i < scheduleIdList.size() ;++i){
			count = dao.update(
					scheduleIdList.get(i),
					scheduleStartdayList.get(i),
					scheduleEnddayList.get(i),
					scheduleTitleList.get(i)
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
	 * IDを取得します。
	 * @return ID
	 */
	public List<Integer> getScheduleIdList() {
	    return scheduleIdList;
	}


	/**
	 * IDを設定します。
	 * @param scheduleIdList ID
	 */
	public void setScheduleIdList(List<Integer> scheduleIdList) {
	    this.scheduleIdList = scheduleIdList;
	}


	/**
	 * 開始日を取得します。
	 * @return 開始日
	 */
	public List<String> getScheduleStartdayList() {
	    return scheduleStartdayList;
	}


	/**
	 * 開始日を設定します。
	 * @param scheduleStartdayList 開始日
	 */
	public void setScheduleStartdayList(List<String> scheduleStartdayList) {
	    this.scheduleStartdayList = scheduleStartdayList;
	}


	/**
	 * 終了日を取得します。
	 * @return 終了日
	 */
	public List<String> getScheduleEnddayList() {
	    return scheduleEnddayList;
	}


	/**
	 * 終了日を設定します。
	 * @param scheduleEnddayList 終了日
	 */
	public void setScheduleEnddayList(List<String> scheduleEnddayList) {
	    this.scheduleEnddayList = scheduleEnddayList;
	}


	/**
	 * 件名を取得します。
	 * @return 件名
	 */
	public List<String> getScheduleTitleList() {
	    return scheduleTitleList;
	}


	/**
	 * 件名を設定します。
	 * @param scheduleTitleList 件名
	 */
	public void setScheduleTitleList(List<String> scheduleTitleList) {
	    this.scheduleTitleList = scheduleTitleList;
	}


	/**
	 * 内容を取得します。
	 * @return 内容
	 */
	public List<String> getScheduleContentList() {
	    return scheduleContentList;
	}


	/**
	 * 内容を設定します。
	 * @param scheduleContentList 内容
	 */
	public void setScheduleContentList(List<String> scheduleContentList) {
	    this.scheduleContentList = scheduleContentList;
	}


	/**
	 * scheduleTeamNameListを取得します。
	 * @return scheduleTeamNameList
	 */
	public List<String> getScheduleTeamNameList() {
	    return scheduleTeamNameList;
	}


	/**
	 * scheduleTeamNameListを設定します。
	 * @param scheduleTeamNameList scheduleTeamNameList
	 */
	public void setScheduleTeamNameList(List<String> scheduleTeamNameList) {
	    this.scheduleTeamNameList = scheduleTeamNameList;
	}


	/**
	 * エラーメッセージを取得します。
	 * @return エラーメッセージ
	 */
	public String getErrorMsg() {
	    return errorMsg;
	}


	/**
	 * エラーメッセージを設定します。
	 * @param errorMsg エラーメッセージ
	 */
	public void setErrorMsg(String errorMsg) {
	    this.errorMsg = errorMsg;
	}


	/**
	 * 成功メッセージを取得します。
	 * @return 成功メッセージ
	 */
	public String getSuccessMsg() {
	    return successMsg;
	}


	/**
	 * 成功メッセージを設定します。
	 * @param successMsg 成功メッセージ
	 */
	public void setSuccessMsg(String successMsg) {
	    this.successMsg = successMsg;
	}


	/**
	 * searchを取得します。
	 * @return search
	 */
	public String getSearch() {
	    return search;
	}


	/**
	 * searchを設定します。
	 * @param search search
	 */
	public void setSearch(String search) {
	    this.search = search;
	}


	/**
	 * teamListを取得します。
	 * @return teamList
	 */
	public List<String> getTeamList() {
	    return teamList;
	}


	/**
	 * teamListを設定します。
	 * @param teamList teamList
	 */
	public void setTeamList(List<String> teamList) {
	    this.teamList = teamList;
	}


	}