package com.internousdev.openconnect.schedule.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.schedule.dao.ScheduleSelectDAO;
import com.internousdev.openconnect.schedule.dto.ScheduleSelectDTO;
import com.opensymphony.xwork2.ActionSupport;


/**
 * DBを検索するクラス。
 * @author MASAHIRO KEDSUKA
 * @since 2016/09/07
 */
public class ScheduleSelectAction extends ActionSupport {


	/**
	 * @author MASAHIRO KEDSUKA
	 * スケジュールリスト
	 */
	private List<ScheduleSelectDTO> schedulelist = new ArrayList<ScheduleSelectDTO>();

	/**
	 * 検索文
	 * @author MASAHIRO KEDSUKA
	 */
	private String search = "";

	/**
	 *エラー
	 * @author MASAHIRO KEDSUKA
	 */
	private String error_msg;

//	/**
//	 * 成功
//	 * @author MASAHIRO KEDSUKA
//	 */
//	private String success_msg;


	/**
	 * 検索の実行メソッド
	 * @author MASAHIRO KEDSUKA
	 */
	public String execute() {
		String result = ERROR;
		ScheduleSelectDAO dao = new ScheduleSelectDAO();

		schedulelist = dao.select(search);
		if (schedulelist.size() != 0) {
//			success_msg = (getText("「"+search+"」を検索しました。"));
			result = SUCCESS;
		} else {
			error_msg = (getText("データがありません"));
		}
		return result;
	}



	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return schedulelist
	 */
	public List<ScheduleSelectDTO> getSchedulelist() {
		return schedulelist;
	}



	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param schedulelist
	 */
	public void setSchedulelist(List<ScheduleSelectDTO> schedulelist) {
		this.schedulelist = schedulelist;
	}



	/**
	 * 取得メソッド
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



//	/**
//	 * 取得メソッド
//	 * @author MASAHIRO KEDSUKA
//	 * @return success_msg
//	 */
//	public String getSuccess_msg() {
//		return success_msg;
//	}
//
//
//
//	/**
//	 * 設定メソッド
//	 * @author MASAHIRO KEZUKA
//	 * @param success_msg
//	 */
//	public void setSuccess_msg(String success_msg) {
//		this.success_msg = success_msg;
//	}
//


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

}