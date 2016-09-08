/**
 *
 */
package com.internousdev.openconnect.attendance.action;

import java.util.ArrayList;

import com.internousdev.openconnect.attendance.dao.AttendanceUpdateDAO;
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
	 *
	 */
	private ArrayList<String> date = new ArrayList<String>();
	/**
	 *
	 */
	private ArrayList<Integer> userId = new ArrayList<Integer>();
	/**
	 *
	 */
	private ArrayList<Integer> attendance = new ArrayList<Integer>();
	/**
	 *
	 */
	private ArrayList<Integer> interview = new ArrayList<Integer>();

	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 * @author MINORI SUNAGAWA
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute(){
		String result = ERROR;
		AttendanceUpdateDAO dao = new AttendanceUpdateDAO();

		int count = 0;

		for( int i=0; i<userId.size(); i++ ){

			count += dao.update( date.get(i), userId.get(i), attendance.get(i), interview.get(i) );
		}

		if( count != 0 ){

			result = SUCCESS;
		}

		return result;
}

	/**
	* 取得メソッド
	* @author MINORI SUNAGAWA
	* @return date
	*/
	public ArrayList<String> getDate() {
		return date;
	}

	/**
	* 設定メソッド
	* @author MINORI SUNAGAWA
	* @param date
	*/
	public void setDate(ArrayList<String> date) {
		this.date = date;
	}

	/**
	* 取得メソッド
	* @author MINORI SUNAGAWA
	* @return
	*/
	public ArrayList<Integer> getUserId() {
		return userId;
	}

	/**
	* 設定メソッド
	* @author MINORI SUNAGAWA
	* @param
	*/
	public void setUserId(ArrayList<Integer> userId) {
		this.userId = userId;
	}

	/**
	* 取得メソッド
	* @author MINORI SUNAGAWA
	* @return attendance
	*/
	public ArrayList<Integer> getAttendance() {
		return attendance;
	}

	/**
	* 設定メソッド
	* @author MINORI SUNAGAWA
	* @param attendance
	*/
	public void setAttendance(ArrayList<Integer> attendance) {
		this.attendance = attendance;
	}

	/**
	* 取得メソッド
	* @author MINORI SUNAGAWA
	* @return interview
	*/
	public ArrayList<Integer> getInterview() {
		return interview;
	}

	/**
	* 設定メソッド
	* @author MINORI SUNAGAWA
	* @param interview
	*/
	public void setInterview(ArrayList<Integer> interview) {
		this.interview = interview;
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
