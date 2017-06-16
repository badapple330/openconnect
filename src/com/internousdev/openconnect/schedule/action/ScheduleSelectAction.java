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

	private List<ScheduleDTO> teamList = new ArrayList<ScheduleDTO>();

	/**
	 * 検索文
	 * @author MASAHIRO KEDSUKA
	 */
	private String search = "";

	private String team = "";
	/**
	 *成功メッセージ
	 * @author MASAHIRO KEDSUKA
	 */
	private String selectSuccessMsg;
	/**
	 *エラーメッセージ
	 * @author MASAHIRO KEDSUKA
	 */
	private String selectErrorMsg;

	/**
	 * 検索の実行メソッド
	 * @author MASAHIRO KEDSUKA
	 */
	public String execute() {
		String result = ERROR;
		ScheduleSelectDAO dao = new ScheduleSelectDAO();
		ScheduleSelectDAO dao2 = new ScheduleSelectDAO();
		scheduleList = dao.select(search);
		setTeamList(dao2.select2(team));
		if (scheduleList.size() != 0) {
			if(search.equals("")){
				selectSuccessMsg ="すべてを表示しました。";
			}else{selectSuccessMsg = (getText("「"+search+"」を検索しました。"));}
			result = SUCCESS;
		} else {
			selectErrorMsg = (getText("該当する情報は存在しません"));
		}
		return result;
	}


	/**
	 * 取得メソッド リスト形式のスケジュール一覧を取得
	 * @author MASAHIRO KEDSUKA
	 * @return scheduleList
	 */
	public List<ScheduleDTO> getScheduleList() {
		return scheduleList;
	}


	/**
	 * 設定メソッド リスト形式のスケジュール一覧を設定
	 * @author MASAHIRO KEDSUKA
	 * @param scheduleList
	 */
	public void setScheduleList(List<ScheduleDTO> scheduleList) {
		this.scheduleList = scheduleList;
	}


	/**
	 * 取得メソッド 検索文を取得
	 * @author MASAHIRO KEDSUKA
	 * @return search
	 */
	public String getSearch() {
		return search;
	}


	/**
	 * 設定メソッド 検索文を設定
	 * @author MASAHIRO KEDSUKA
	 * @param search
	 */
	public void setSearch(String search) {
		this.search = search;
	}





	/**
	 * 取得メソッド 成功メッセージを取得
	 * @author MASAHIRO KEDSUKA
	 * @return selectSuccessMsg
	 */
	public String getSelectSuccessMsg() {
		return selectSuccessMsg;
	}


	/**
	 * 設定メソッド 成功メッセージを設定
	 * @author MASAHIRO KEDSUKA
	 * @param selectSuccessMsg
	 */
	public void setSelectSuccessMsg(String selectSuccessMsg) {
		this.selectSuccessMsg = selectSuccessMsg;
	}


	/**
	 * 取得メソッド エラーメッセージを取得
	 * @author MASAHIRO KEDSUKA
	 * @return selectErrorMsg
	 */
	public String getSelectErrorMsg() {
		return selectErrorMsg;
	}


	/**
	 * 設定メソッド エラーメッセージを設定
	 * @author MASAHIRO KEDSUKA
	 * @param selectErrorMsg
	 */
	public void setSelectErrorMsg(String selectErrorMsg) {
		this.selectErrorMsg = selectErrorMsg;
	}


	/**
	 * 取得メソッド シリアルIDを取得
	 * @author MASAHIRO KEDSUKA
	 * @return serialVersionUID
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public List<ScheduleDTO> getTeamList() {
		return teamList;
	}


	public void setTeamList(List<ScheduleDTO> teamList) {
		this.teamList = teamList;
	}

}