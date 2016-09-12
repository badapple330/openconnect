package com.internousdev.openconnect.schedule.action;

import java.sql.SQLException;

import com.internousdev.openconnect.schedule.dao.ScheduleDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;


/**
 * DB情報を削除するクラス。
 * @author MASAHIRO KEDSUKA
 * @since 2016/09/07
 */

public class ScheduleDeleteAction extends ActionSupport{
	/**
	 * シリアル番号
	 */
	private static final long serialVersionUID = 7068183435588051155L;


	/**
	 * @author MASAHIRO KEDSUKA
	 *スケジュールID
	 */
	private int scheduleId;


	/**
	 * 成功
	 * @author MASAHIRO KEDSUKA
	 */
	private String successMsg;

	/**
	 * エラー
	 * @author MASAHIRO KEDSUKA
	 */
	private String errorMsg;


	/**
	 * 実行メソッド。DAOにデータを渡して削除する。
	 */
	public String execute() throws SQLException{

		String result =ERROR;    //削除の判定
		ScheduleDeleteDAO dao = new ScheduleDeleteDAO();
		int count = 0;
		count = dao.delete(scheduleId);

		if(count > 0){ //何かしらDBが数値を返したら
			successMsg=(getText("削除しました。"));
			result = SUCCESS;
		}else{
			errorMsg=(getText("削除に失敗しました。"));
		}
		return result;
	}

	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return scheduleId
	 */
	public int getScheduleId() {
		return scheduleId;
	}


	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param scheduleId
	 */
	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
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



}
