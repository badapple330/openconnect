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
	 * エラー
	 * @author MASAHIRO KEDSUKA
	 */
	private String errortitle;

	/**
	 * 成功
	 * @author MASAHIRO KEDSUKA
	 */
	private String successtitle;


	/**
	 * 実行メソッド。DAOにデータを渡して削除する。
	 */
	public String execute() throws SQLException{

		String result =ERROR;    //削除の判定
		ScheduleDeleteDAO dao = new ScheduleDeleteDAO();
		int count = 0;
		count = dao.delete(scheduleId);

		if(count > 0){ //何かしらDBが数値を返したら
			successtitle=(getText("削除しました。"));
			result = SUCCESS;
		}else{
			errortitle=(getText("削除に失敗しました。"));
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
	 * @return errortitle
	 */
	public String getErrortitle() {
		return errortitle;
	}

	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param errortitle
	 */
	public void setErrortitle(String errortitle) {
		this.errortitle = errortitle;
	}

	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return successtitle
	 */
	public String getSuccesstitle() {
		return successtitle;
	}

	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param successtitle
	 */
	public void setSuccesstitle(String successtitle) {
		this.successtitle = successtitle;
	}


}
