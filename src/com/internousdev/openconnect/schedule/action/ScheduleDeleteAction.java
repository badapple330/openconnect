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
	 * @author MASAHIRO KEDSUKA
	 *スケジュールID
	 */
	private int scheduleId;


	/**
	 * 成功
	 * @author MASAHIRO KEDSUKA
	 */
	private String success_msg;

	/**
	 * エラー
	 * @author MASAHIRO KEDSUKA
	 */
	private String error_msg;


	/**
	 * 実行メソッド。DAOにデータを渡して削除する。
	 */
	public String execute() throws SQLException{

		String result =ERROR;    //削除の判定
		ScheduleDeleteDAO dao = new ScheduleDeleteDAO();
		int count = 0;
		count = dao.delete(scheduleId);

		if(count > 0){ //何かしらDBが数値を返したら
			success_msg=(getText("削除しました。"));
			result = SUCCESS;
		}else{
			error_msg=(getText("削除に失敗しました。"));
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
	 * @return success_msg
	 */
	public String getSuccess_msg() {
		return success_msg;
	}

	/**
	 * 設定メソッド
	 * @author MASAHIRO KEZUKA
	 * @param success_msg
	 */
	public void setSuccess_msg(String success_msg) {
		this.success_msg = success_msg;
	}

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
