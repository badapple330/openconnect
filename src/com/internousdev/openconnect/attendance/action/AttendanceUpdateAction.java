/**
 *
 */
package com.internousdev.openconnect.attendance.action;

import java.util.ArrayList;

import com.internousdev.openconnect.attendance.dao.AttendanceDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * DBの情報を更新する為のクラス
 * @author MINORI SUNAGAWA
 * @since 2016/09/04
 * @version 1.0
 */
public class AttendanceUpdateAction extends ActionSupport{

	/**
	 * シリアル番号
	 */
	private static final long serialVersionUID = 671961516965709160L;
	/**
	 * 日付
	 */
	private ArrayList<String> date = new ArrayList<String>();
	/**
	 * ユーザーID
	 */
	private ArrayList<Integer> userId = new ArrayList<Integer>();
	/**
	 * 勤怠
	 */
	private ArrayList<Integer> attendance = new ArrayList<Integer>();
	/**
	 * 面談
	 */
	private ArrayList<Integer> interview = new ArrayList<Integer>();
	/**
	 * 結果文字
	 */
	private String resultString = "更新に失敗しました";

	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 * @author MINORI SUNAGAWA
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute(){
		String result = ERROR;
		AttendanceDAO dao = new AttendanceDAO();

		int count = 0;

		for( int i=0; i<userId.size(); i++ ){

			count += dao.update( date.get(i), userId.get(i), attendance.get(i), interview.get(i) );
		}

		if( count != 0 ){

			result = SUCCESS;
			resultString = "更新に成功しました";
		}

		return result;
}

	/**
	* 取得メソッド 日付を取得
	* @author MINORI SUNAGAWA
	* @return date
	*/
	public ArrayList<String> getDate() {
		return date;
	}

	/**
	* 設定メソッド 日付を設定
	* @author MINORI SUNAGAWA
	* @param date
	*/
	public void setDate(ArrayList<String> date) {
		this.date = date;
	}

	/**
	* 取得メソッド ユーザーIDを取得
	* @author MINORI SUNAGAWA
	* @return
	*/
	public ArrayList<Integer> getUserId() {
		return userId;
	}

	/**
	* 設定メソッド ユーザーIDを設定
	* @author MINORI SUNAGAWA
	* @param
	*/
	public void setUserId(ArrayList<Integer> userId) {
		this.userId = userId;
	}

	/**
	* 取得メソッド 勤怠を取得
	* @author MINORI SUNAGAWA
	* @return attendance
	*/
	public ArrayList<Integer> getAttendance() {
		return attendance;
	}

	/**
	* 設定メソッド 勤怠を設定
	* @author MINORI SUNAGAWA
	* @param attendance
	*/
	public void setAttendance(ArrayList<Integer> attendance) {
		this.attendance = attendance;
	}

	/**
	* 取得メソッド 面談を取得
	* @author MINORI SUNAGAWA
	* @return interview
	*/
	public ArrayList<Integer> getInterview() {
		return interview;
	}

	/**
	* 設定メソッド  面談を設定
	* @author MINORI SUNAGAWA
	* @param interview
	*/
	public void setInterview(ArrayList<Integer> interview) {
		this.interview = interview;
	}

	/**
	* 取得メソッド シリアル番号を取得
	* @author MINORI SUNAGAWA
	* @return serialVersionUID
	*/
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	/**
	* 設定メソッド 結果文字を設定
	* @author KENICHI HORIGUCHI
	* @param resultString
	*/
	public void setResultString(String resultString) {
		this.resultString = resultString;
	}

	/**
	* 取得メソッド 結果文字を取得
	* @author KENICHI HORIGUCHI
	* @return resultString
	*/
	public String getResultString() {
		return resultString;
	}

}
