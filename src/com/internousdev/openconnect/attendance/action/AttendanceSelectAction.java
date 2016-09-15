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
	 * 受講年
	 */
	private String year = "";
	/**
	 * 受講開始月
	 */
	private String month = "";
	/**
	 * 勤怠日付
	 */
	private String attendanceDate = "";
	/**
	 * 勤怠リスト
	 */
	private ArrayList<AttendanceDTO> attendanceList = new ArrayList<AttendanceDTO>();
	/**
	 * 結果文字
	 */
	private String resultString = "";

	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 * @author MINORI SUNAGAWA
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute(){
		String result = ERROR;
		AttendanceSelectDAO dao = new AttendanceSelectDAO();

		attendanceDate = attendanceDate.replaceAll("/", "-");

		attendanceList = dao.select(year, month, attendanceDate);

		if( attendanceList.size() != 0 ){

			result = SUCCESS;
		}

		return result;
}

	/**
	* 取得メソッド 勤怠日付を取得
	* @author MINORI SUNAGAWA
	* @return attendanceDate
	*/
	public String getAttendanceDate() {
		return attendanceDate;
	}

	/**
	* 設定メソッド 勤怠日付を設定
	* @author MINORI SUNAGAWA
	* @param attendanceDate
	*/
	public void setAttendanceDate(String attendanceDate) {
		this.attendanceDate = attendanceDate;
	}

	/**
	* 取得メソッド 受講年を取得
	* @author MINORI SUNAGAWA
	* @return year
	*/
	public String getYear() {
		return year;
	}

	/**
	* 設定メソッド 受講年を設定
	* @author MINORI SUNAGAWA
	* @param year
	*/
	public void setYear(String year) {
		this.year = year;
	}

	/**
	* 取得メソッド 受講開始月を取得
	* @author MINORI SUNAGAWA
	* @return month
	*/
	public String getMonth() {
		return month;
	}

	/**
	* 設定メソッド 受講開始月を設定
	* @author MINORI SUNAGAWA
	* @param month
	*/
	public void setMonth(String month) {
		this.month = month;
	}

	/**
	* 取得メソッド 勤怠リストを取得
	* @author MINORI SUNAGAWA
	* @return attendanceList
	*/
	public ArrayList<AttendanceDTO> getAttendanceList() {
		return attendanceList;
	}

	/**
	* 設定メソッド 勤怠リストを設定
	* @author MINORI SUNAGAWA
	* @param attendanceList
	*/
	public void setAttendanceList(ArrayList<AttendanceDTO> attendanceList) {
		this.attendanceList = attendanceList;
	}

	/**
	* 取得メソッド  シリアル番号を取得
	* @author MINORI SUNAGAWA
	* @return serialVersionUID
	*/
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	* 取得メソッド 結果文字を取得
	* @author MINORI SUNAGAWA
	* @return resultString
	*/
	public String getResultString() {
		return resultString;
	}

	/**
	* 設定メソッド 結果文字を設定
	* @author MINORI SUNAGAWA
	* @param resultString
	*/
	public void setResultString(String resultString) {
		this.resultString = resultString;
	}


}
