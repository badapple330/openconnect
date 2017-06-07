/**
 *
 */
package com.internousdev.openconnect.attendance.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.openconnect.attendance.dao.AttendanceDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * AttendanceAction
 * 出欠情報をDBに格納するメソッド
 * @author Teppei Matsumoto
 *@since 2017/06/02
 *@version 1.0
 */
public class AttendanceAction extends ActionSupport implements SessionAware {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -5350844672857079386L;

	/**
	 * ユーザーID
	 * joinでuser_nameを引っ張って来たい
	 */
	private int userId;

	/**
	 * 出欠状況
	 */
	private int attendance;

	/**
	 * 備考欄
	 */
	private String reason;

	/**
	 * ユーザー情報
	 */
	private Map<String, Object> session;

	/**
	 * 報告年
	 */
	private int atYear;

	/**
	 * 報告月
	 */
	private int atMonth;

	/**
	 * 報告日
	 */
	private int atDay;

	/**
	 * 漢字姓
	 */
	private String familyNameKanji;

	/**
	 * 漢字名
	 */
	private String givenNameKanji;

	/**
	 * 実行メソッド 出欠状況の送信処理をする
	 * @author Teppei Matsumoto
	 * @since 2017/06/02
	 * @return SUCCESS/ERROR
	 */
	public String execute(){
		String result =ERROR;

		if(session.get("userId") != null){
			int userId = (int) session.get("userId");
			  AttendanceDAO dao=new AttendanceDAO();

		    if(dao.insert(userId,atYear,atMonth,atDay,attendance,reason) > 0){
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
		return userId;
	}

	/**
	* 設定メソッド を設定
	* @author Teppei Matsumoto
	* @param user_id
	*/
	public void setUserId(int userId) {
		this.userId = userId;
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

	/**
	* 取得メソッド を取得
	* @author  Teppei Matsumoto
	* @return atYear
	*/
	public int getAtYear() {
		return atYear;
	}

	/**
	* 設定メソッド を設定
	* @author  Teppei Matsumoto
	* @param atYear
	*/
	public void setAtYear(int atYear) {
		this.atYear = atYear;
	}

	/**
	* 取得メソッド を取得
	* @author  Teppei Matsumoto
	* @return atMonth
	*/
	public int getAtMonth() {
		return atMonth;
	}

	/**
	* 設定メソッド を設定
	* @author  Teppei Matsumoto
	* @param atMonth
	*/
	public void setAtMonth(int atMonth) {
		this.atMonth = atMonth;
	}

	/**
	* 取得メソッド を取得
	* @author  Teppei Matsumoto
	* @return atDay
	*/
	public int getAtDay() {
		return atDay;
	}

	/**
	* 設定メソッド を設定
	* @author  Teppei Matsumoto
	* @param atDay
	*/
	public void setAtDay(int atDay) {
		this.atDay = atDay;
	}

	/**
	* 取得メソッド を取得
	* @author Teppei Matsumoto
	* @return familyNameKanji
	*/
	public String getFamilyNameKanji() {
		return familyNameKanji;
	}

	/**
	* 設定メソッド を設定
	* @author Teppei Matsumoto
	* @param familyNameKanji
	*/
	public void setFamilyNameKanji(String familyNameKanji) {
		this.familyNameKanji = familyNameKanji;
	}

	/**
	* 取得メソッド を取得
	* @author Teppei Matsumoto
	* @return givenNameKanji
	*/
	public String getGivenNameKanji() {
		return givenNameKanji;
	}

	/**
	* 設定メソッド を設定
	* @author Teppei Matsumoto
	* @param givenNameKanji
	*/
	public void setGivenNameKanji(String givenNameKanji) {
		this.givenNameKanji = givenNameKanji;
	}

	/**
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}


	/**
	 * @param session セットする session
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}
