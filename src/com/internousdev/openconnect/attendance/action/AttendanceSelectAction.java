/**
 *
 */
package com.internousdev.openconnect.attendance.action;

import java.util.ArrayList;

import com.internousdev.openconnect.attendance.dao.AttendanceSelectDAO;
import com.internousdev.openconnect.attendance.dto.AttendanceDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * DBの情報を画面に表示する為のクラス
 * @author MINORI SUNAGAWA
 * @since 2016/09/04
 * @version 1.0
 */
public class AttendanceSelectAction extends ActionSupport{

	/**
	 * シリアル番号
	 */
	private static final long serialVersionUID = 671961516965709160L;
	/**
	 * 受講年&月
	 */
	private String studentDate = "";
	/**
	 * 勤怠日付
	 */
	private String attendanceDate = "";
	/**
	 * 勤怠リスト
	 */
	private ArrayList<AttendanceDTO> attendanceList = new ArrayList<AttendanceDTO>();

	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 * @author MINORI SUNAGAWA
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute(){
		String result = ERROR;
		AttendanceSelectDAO dao = new AttendanceSelectDAO();

		attendanceList = dao.select(studentDate, attendanceDate);

		if( attendanceList.size() != 0 ){

			result = SUCCESS;
		}

		return result;
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
	* @return studentDate
	*/
	public String getStudentDate() {
		return studentDate;
	}

	/**
	* 設定メソッド
	* @author MINORI SUNAGAWA
	* @param studentDate
	*/
	public void setStudentDate(String studentDate) {
		this.studentDate = studentDate;
	}

	/**
	* 取得メソッド
	* @author MINORI SUNAGAWA
	* @return attendanceList
	*/
	public ArrayList<AttendanceDTO> getAttendanceList() {
		return attendanceList;
	}

	/**
	* 設定メソッド
	* @author MINORI SUNAGAWA
	* @param attendanceList
	*/
	public void setAttendanceList(ArrayList<AttendanceDTO> attendanceList) {
		this.attendanceList = attendanceList;
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
