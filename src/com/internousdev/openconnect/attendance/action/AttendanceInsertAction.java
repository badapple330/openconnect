/**
 *
 */
package com.internousdev.openconnect.attendance.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * DBの情報を画面に表示する為のクラス
 * @author MINORI SUNAGAWA
 * @since 2016/09/04
 * @version 1.0
 */
public class AttendanceInsertAction extends ActionSupport{

	/**
	 * シリアル番号
	 */
	private static final long serialVersionUID = 671961516965709160L;

	/**
	 * 勤怠日付
	 */
	private String attendanceDate = "";

	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 * @author MINORI SUNAGAWA
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute(){
		String result = ERROR;
//		AttendanceSelectDAO dao = new AttendanceSelectDAO();
//
//		attendanceDate = attendanceDate.replaceAll("/", "-");
//
//		attendanceList = dao.select(year, month, attendanceDate);
//
//		if( attendanceList.size() != 0 ){
//
//			result = SUCCESS;
//		}

		return SUCCESS;
}

	/**
	* 取得メソッド
	* @author MINORI SUNAGAWA
	* @return attendanceDate
	*/
	public String getAttendanceDate() {
		return attendanceDate;
	}

	/**
	* 設定メソッド
	* @author MINORI SUNAGAWA
	* @param attendanceDate
	*/
	public void setAttendanceDate(String attendanceDate) {
		this.attendanceDate = attendanceDate;
	}

	/**
	* 取得メソッド
	* @author MINORI SUNAGAWA
	* @return serialVersionUID
	*/
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
