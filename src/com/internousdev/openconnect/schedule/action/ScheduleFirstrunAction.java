package com.internousdev.openconnect.schedule.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.schedule.dao.ScheduleFirstrunDAO;
import com.internousdev.openconnect.schedule.dto.ScheduleDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * はじめに画面を開いたときDBの情報を表示するクラス。
 * @author MASAHIRO KEDSUKA
 * @since 2016/09/07
 */
public class ScheduleFirstrunAction extends ActionSupport {

	/**
	 * シリアル番号
	 */
	private static final long serialVersionUID = -7243356698619733505L;


	/**
	 * スケジュールリスト
	 */
	private List<ScheduleDTO> scheduleList = new ArrayList<ScheduleDTO>();

	/**
	 * 実行メソッド。DAOに入力されたデータを渡して、結果を返す。
	 * @author MASAHIRO KEDSUKA
	 */
	public String execute() {

		String result = ERROR;
		ScheduleFirstrunDAO dao = new ScheduleFirstrunDAO();

		scheduleList = dao.select(result);
		//daoのresultをいれる
		if (scheduleList != null) {
			//nullじゃなかったら
			result = SUCCESS;
		}
		return result;
	}


	/**
	 * 取得メソッド
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
	public void setSchedulelist(List<ScheduleDTO> scheduleList) {
		this.scheduleList = scheduleList;
	}

}
