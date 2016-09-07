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


	/* (非 Javadoc)
	 * 実行メソッド。DAOにデータを渡して削除する。
	 */
	public String execute() throws SQLException{

	String result =ERROR;    //削除の判定
	   ScheduleDeleteDAO dao = new ScheduleDeleteDAO();
	   int count = 0;
	   count = dao.delete(scheduleId);

		if(count > 0){ //何かしらDBが数値を返したら
			   result = SUCCESS;
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


}
