package com.internousdev.openconnect.schedule.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.schedule.dao.ScheduleSelectDAO;
import com.internousdev.openconnect.schedule.dto.ScheduleDTO;
import com.opensymphony.xwork2.ActionSupport;


/**
 * スケジュール一覧のDBを検索するクラス。
 * @author MASAHIRO KEDSUKA
 * @since 2016/09/07
 */
public class ScheduleSelectAction extends ActionSupport {


	/**
	 * シリアル番号
	 */
	private static final long serialVersionUID = -6055065667656806167L;

	/**
	 * @author MASAHIRO KEDSUKA
	 * スケジュールリスト
	 */
	private List<ScheduleDTO> scheduleList = new ArrayList<ScheduleDTO>();

	/**
	 * 検索文
	 * @author MASAHIRO KEDSUKA
	 */
	private String search = "";

	/**
	 *エラーメッセージ
	 * @author MASAHIRO KEDSUKA
	 */
	private String errorMsg;

	/**
	 * 検索の実行メソッド
	 * @author MASAHIRO KEDSUKA
	 */
	public String execute() {
		String result = ERROR;
		ScheduleSelectDAO dao = new ScheduleSelectDAO();

		scheduleList = dao.select(search);
		if (scheduleList.size() != 0) {
			//			success_msg = (getText("「"+search+"」を検索しました。"));
			result = SUCCESS;
		} else {
			errorMsg = (getText("データがありません"));
		}
		return result;
	}


	/**
	 * 取得メソッド スケジュールリスト
	 * @author MASAHIRO KEDSUKA
	 * @return scheduleList
	 */
	public List<ScheduleDTO> getScheduleList() {
		return scheduleList;
	}


	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param scheduleList
	 */
	public void setScheduleList(List<ScheduleDTO> scheduleList) {
		this.scheduleList = scheduleList;
	}


	/**
	 * 取得メソッド 検索文
	 * @author MASAHIRO KEDSUKA
	 * @return search
	 */
	public String getSearch() {
		return search;
	}


	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param search
	 */
	public void setSearch(String search) {
		this.search = search;
	}


	/**
	 * 取得メソッド エラーメッセージ
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
	 * 取得メソッド シリアルID
	 * @author MASAHIRO KEDSUKA
	 * @return serialVersionUID
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}