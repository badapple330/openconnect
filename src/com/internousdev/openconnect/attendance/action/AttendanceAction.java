/**
 *
 */
package com.internousdev.openconnect.attendance.action;

import com.internousdev.openconnect.attendance.dao.AttendanceDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * AttendanceAction
 * 出欠情報をDBに格納するメソッド
 * @author Teppei Matsumoto
 *@since 2017/06/02
 *@version 1.0
 */
public class AttendanceAction extends ActionSupport{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -5350844672857079386L;

	/**
	 * ユーザーID
	 * joinでuser_nameを引っ張って来たい
	 */
	private int user_id;

	/**
	 * 出欠状況
	 */
	private int attendance;

	/**
	 * 備考欄
	 */
	private String reason;

	/**
	 * 実行メソッド　出欠状況の送信処理をする
	 * @author Teppei Matsumoto
	 * @since 2017/06/02
	 * @return SUCCESS/ERROR
	 */
	public String execute(){
		String result =ERROR;

		AttendanceDAO dao=new AttendanceDAO();
		  if(!dao.select(user_id)){
		    int con = dao.insert(user_id,attendance,reason);
		    if(con > 0){
		      result = SUCCESS;
				}
		  }
		  return result;
	}


	/**
	* 取得メソッド を取得
	* @author Teppei Matsumoto
	* @return user_id
	*/
	public int getUserId() {
		return user_id;
	}

	/**
	* 設定メソッド を設定
	* @author Teppei Matsumoto
	* @param user_id
	*/
	public void setUserId(int user_id) {
		this.user_id = user_id;
	}

	/**
	* 取得メソッド を取得
	* @author Teppei Matsumoto
	* @return attendance
	*/
	public int getAttendance() {
		return attendance;
	}

	/**
	* 設定メソッド を設定
	* @author Teppei Matsumoto
	* @param attendance
	*/
	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}

	/**
	* 取得メソッド を取得
	* @author Teppei Matsumoto
	* @return reason
	*/
	public String getReason() {
		return reason;
	}

	/**
	* 設定メソッド を設定
	* @author Teppei Matsumoto
	* @param reason
	*/
	public void setReason(String reason) {
		this.reason = reason;
	}



}
