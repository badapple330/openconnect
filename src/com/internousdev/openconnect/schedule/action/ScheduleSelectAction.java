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
	 * スケジュールリスト。検索文。エラー
	 */
	private List<ScheduleSelectDTO> schedulelist = new ArrayList<ScheduleSelectDTO>();
	private String search = "";
	private String errorSelect;



	/* (非 Javadoc)
	 * 検索の実行メソッド。
	 */
	public String execute() {
		String result = ERROR;
		ScheduleSelectDAO dao = new ScheduleSelectDAO();

		schedulelist = dao.select(search);
		if (schedulelist.size() != 0) {
			result = SUCCESS;
		} else {
			errorSelect = (getText("データがありません"));
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



	/**
	* 取得メソッド
	* @author MASAHIRO KEDSUKA
	* @return errorSelect
	*/
	public String getErrorSelect() {
		return errorSelect;
	}



	/**
	* 設定メソッド
	* @author MASAHIRO KEDSUKA
	* @param errorSelect
	*/
	public void setErrorSelect(String errorSelect) {
		this.errorSelect = errorSelect;
	}


}