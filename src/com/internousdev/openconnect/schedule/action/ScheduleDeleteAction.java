package com.internousdev.openconnect.schedule.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.openconnect.schedule.dao.ScheduleDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;


/**
 * スケジュール一覧のDB情報を削除するクラス。
 * @author MASAHIRO KEDSUKA
 * @since 2016/09/07
 */

public class ScheduleDeleteAction extends ActionSupport implements SessionAware{

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
	 * 成功メッセージ
	 * @author MASAHIRO KEDSUKA
	 */
	private String successMsg;

	/**
	 * エラーメッセージ
	 * @author MASAHIRO KEDSUKA
	 */
	private String errorMsg;

	/**
	 * 管理権限
	 * @author MASAHIRO KEDSUKA
	 */
	public Map<String, Object> session;
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
	 * 取得メソッド スケジュールのIDを取得
	 * @author MASAHIRO KEDSUKA
	 * @return scheduleId
	 */
	public int getScheduleId() {
		return scheduleId;
	}


	/**
	 * 設定メソッド スケジュールのIDを設定
	 * @author MASAHIRO KEDSUKA
	 * @param scheduleId
	 */
	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}


	/**
	 * 取得メソッド 成功のメッセージを取得
	 * @author MASAHIRO KEDSUKA
	 * @return successMsg
	 */
	public String getSuccessMsg() {
		return successMsg;
	}


	/**
	 * 設定メソッド 成功のメッセージを設定
	 * @author MASAHIRO KEDSUKA
	 * @param successMsg
	 */
	public void setSuccessMsg(String successMsg) {
		this.successMsg = successMsg;
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
	* 取得メソッド 管理権限の状態を取得
	* @author MASAHIRO KEDSUKA
	* @return session
	*/
	public Map<String, Object> getSession() {
		return session;
	}


	/**
	* 設定メソッド 管理権限の状態を設定
	* @author MASAHIRO KEDSUKA
	* @param session
	*/
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	/**
	* 取得メソッド シリアルIDを取得
	* @author
	* @return serialVersionUID
	*/
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
