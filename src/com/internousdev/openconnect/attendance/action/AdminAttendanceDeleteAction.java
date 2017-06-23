/**
 *
 */
package com.internousdev.openconnect.attendance.action;

import com.internousdev.openconnect.attendance.dao.AdminAttendanceDeleteDAO;

/**
 * @author internousdev
 *
 */
public class AdminAttendanceDeleteAction {



	private int atMonth;


	public String execute(){
		AdminAttendanceDeleteDAO dao = new AdminAttendanceDeleteDAO();
		String retult = ERROR;
		int List=0;
		if(List>0){
			retult = SUCCESS;
		}
		return retult;
	}





	/**
	 * 取得メソッド を取得
	 * @return atMonth
	 */
	public int getAtMonth() {
		return atMonth;
	}

	/**
	 * 設定メソッド を設定
	 * @param atMonth
	 */
	public void setAtMonth(int atMonth) {
		this.atMonth = atMonth;
	}
}
