/**
 *
 */
package com.internousdev.openconnect.attendance.action;

import java.util.ArrayList;

import com.internousdev.openconnect.attendance.dao.AttendanceDAO;
import com.internousdev.openconnect.attendance.dao.AttendanceUpDAO;
import com.internousdev.openconnect.attendance.dto.AttendanceDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * DBの情報を画面に表示する為のクラス
 * @author MINORI SUNAGAWA
 * @since 2016/09/04
 * @version 1.0
 */
public class AttendanceAction extends ActionSupport {

	/**
	 * シリアル番号
	 */
	private static final long serialVersionUID = -7346242933265314489L;
	/**
	 * 日付
	 */
	private String date;
	/**
	 * ID
	 */
	private int id;
	/**
	 * 勤怠
	 */
	private int attendance;
	/**
	 * 面談
	 */
	private int interview;
	/**
	 * 勤怠リスト
	 */
	private ArrayList<AttendanceDTO> list = new ArrayList<AttendanceDTO>();
	/**
	 * エラー文字
	 */
	private String errorSelect;
	/**
	 * 更新結果
	 */
	private String resultUpdate;

	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 * @author MINORI SUNAGAWA
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute(){
		String result=ERROR;
		AttendanceUpDAO dao=new AttendanceUpDAO();
		AttendanceDTO dto=new AttendanceDTO();

		dto.setDate(date);
		dto.setId(id);
		dto.setAttendance(attendance);
		dto.setInterview(interview);

		try{
			if(dao.update(dto)>0){
				resultUpdate="更新に成功しました";
				result=SUCCESS;
			}else{
				resultUpdate="更新に失敗しました";
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		select();
		return result;
	}

	/**
	 * 実行メソッド DAOに入力されたデータを渡して結果を表示
	 * @author MINORI SUNAGAWA
	 */
	private void select(){
		AttendanceDAO dao=new AttendanceDAO();
		dao.select();
		list=dao.getList();
		if(list.size()==0){
			errorSelect="データがありません";
		}
	}

	/**
	* 取得メソッド
	* @author MINORI SUNAGAWA
	* @return date
	*/
	public String getDate() {
		return date;
	}

	/**
	* 設定メソッド
	* @author MINORI SUNAGAWA
	* @param date
	*/
	public void setDate(String date) {
		this.date = date;
	}

	/**
	* 取得メソッド
	* @author MINORI SUNAGAWA
	* @return id
	*/
	public int getId() {
		return id;
	}

	/**
	* 設定メソッド
	* @author MINORI SUNAGAWA
	* @param id
	*/
	public void setId(int id) {
		this.id = id;
	}

	/**
	* 取得メソッド
	* @author MINORI SUNAGAWA
	* @return attendance
	*/
	public int getAttendance() {
		return attendance;
	}

	/**
	* 設定メソッド
	* @author MINORI SUNAGAWA
	* @param attendance
	*/
	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}

	/**
	* 取得メソッド
	* @author MINORI SUNAGAWA
	* @return interview
	*/
	public int getInterview() {
		return interview;
	}

	/**
	* 設定メソッド
	* @author MINORI SUNAGAWA
	* @param interview
	*/
	public void setInterview(int interview) {
		this.interview = interview;
	}

	/**
	* 取得メソッド
	* @author MINORI SUNAGAWA
	* @return list
	*/
	public ArrayList<AttendanceDTO> getList() {
		return list;
	}

	/**
	* 設定メソッド
	* @author MINORI SUNAGAWA
	* @param list
	*/
	public void setList(ArrayList<AttendanceDTO> list) {
		this.list = list;
	}

	/**
	* 取得メソッド
	* @author MINORI SUNAGAWA
	* @return errorSelect
	*/
	public String getErrorSelect() {
		return errorSelect;
	}

	/**
	* 設定メソッド
	* @author MINORI SUNAGAWA
	* @param errorSelect
	*/
	public void setErrorSelect(String errorSelect) {
		this.errorSelect = errorSelect;
	}

	/**
	* 取得メソッド
	* @author MINORI SUNAGAWA
	* @return resultUpdate
	*/
	public String getResultUpdate() {
		return resultUpdate;
	}

	/**
	* 設定メソッド
	* @author MINORI SUNAGAWA
	* @param resultUpdate
	*/
	public void setResultUpdate(String resultUpdate) {
		this.resultUpdate = resultUpdate;
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
