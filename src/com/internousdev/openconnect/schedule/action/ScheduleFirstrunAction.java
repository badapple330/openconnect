package com.internousdev.openconnect.schedule.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.schedule.dao.ScheduleFirstrunDAO;
import com.internousdev.openconnect.schedule.dto.ScheduleSelectDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * はじめに画面を開いたときDBの情報を表示するクラス。
 * @author MASAHIRO KEDSUKA
 * @since 2016/09/07
 */
public class ScheduleFirstrunAction extends ActionSupport {
	/**
	 * スケジュールリスト
	 */
	private List<ScheduleSelectDTO> schedulelist = new ArrayList<ScheduleSelectDTO>();
	/**
	 * シリアルver
	 */


	/**
	 * 実行メソッド。DAOに入力されたデータを渡して、結果を返す。
	 * @author MASAHIRO KEDSUKA
	 */
	public String execute() {
		String result = ERROR;
		ScheduleFirstrunDAO dao = new ScheduleFirstrunDAO();

		schedulelist = dao.select(result);
		//daoのresultをいれる
		if (schedulelist != null) {
			//nullじゃなかったら
			result = SUCCESS;
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

}
