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
	 * 取得メソッド リスト形式のスケジュールIDを取得
	 * @author MASAHIRO KEDSUKA
	 * @return scheduleIdList
	 */
	public List<Integer> getScheduleIdList() {
		return scheduleIdList;
	}


	/**
	 * 設定メソッド リスト形式のスケジュールIDを設定
	 * @author MASAHIRO KEDSUKA
	 * @param scheduleIdList
	 */
	public void setScheduleIdList(List<Integer> scheduleIdList) {
		this.scheduleIdList = scheduleIdList;
	}


	/**
	 * 取得メソッド リスト形式の開始日を取得
	 * @author MASAHIRO KEDSUKA
	 * @return scheduleStartdayList
	 */
	public List<String> getScheduleStartdayList() {
		return scheduleStartdayList;
	}


	/**
	 * 設定メソッド リスト形式の開始日を設定
	 * @author MASAHIRO KEDSUKA
	 * @param scheduleStartdayList
	 */
	public void setScheduleStartdayList(List<String> scheduleStartdayList) {
		this.scheduleStartdayList = scheduleStartdayList;
	}


	/**
	 * 取得メソッド リスト形式の終了日を取得
	 * @author MASAHIRO KEDSUKA
	 * @return scheduleEnddayList
	 */
	public List<String> getScheduleEnddayList() {
		return scheduleEnddayList;
	}


	/**
	 * 設定メソッド リスト形式の終了日を設定
	 * @author MASAHIRO KEDSUKA
	 * @param scheduleEnddayList
	 */
	public void setScheduleEnddayList(List<String> scheduleEnddayList) {
		this.scheduleEnddayList = scheduleEnddayList;
	}


	/**
	 * 取得メソッド リスト形式の件名を取得
	 * @author MASAHIRO KEDSUKA
	 * @return scheduleTitleList
	 */
	public List<String> getScheduleTitleList() {
		return scheduleTitleList;
	}


	/**
	 * 設定メソッド リスト形式の件名を設定
	 * @author MASAHIRO KEDSUKA
	 * @param scheduleTitleList
	 */
	public void setScheduleTitleList(List<String> scheduleTitleList) {
		this.scheduleTitleList = scheduleTitleList;
	}


	/**
	 * 取得メソッド リスト形式の内容を取得
	 * @author MASAHIRO KEDSUKA
	 * @return scheduleContentList
	 */
	public List<String> getScheduleContentList() {
		return scheduleContentList;
	}


	/**
	 * 設定メソッド リスト形式の内容を設定
	 * @author MASAHIRO KEDSUKA
	 * @param scheduleContentList
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
	 * 取得メソッド エラーメッセージを取得
	 * @author MASAHIRO KEDSUKA
	 * @return errorMsg
	 */
	public String getErrorMsg() {
		return errorMsg;
	}


	/**
	 * 設定メソッド エラーメッセージを設定
	 * @author MASAHIRO KEDSUKA
	 * @param errorMsg
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}


	/**
	 * 取得メソッド 成功メッセージの取得
	 * @author MASAHIRO KEDSUKA
	 * @return successMsg
	 */
	public String getSuccessMsg() {
		return successMsg;
	}


	/**
	 * 設定メソッド 成功メッセージの設定
	 * @author MASAHIRO KEDSUKA
	 * @param successMsg
	 */
	public void setSuccessMsg(String successMsg) {
		this.successMsg = successMsg;
	}


	/**
	 * 取得メソッド シリアルIDの取得
	 * @author MASAHIRO KEDSUKA
	 * @return serialVersionUID
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}