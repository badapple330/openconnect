/**
 *
 */
package com.internousdev.openconnect.attendance.action;

import java.util.ArrayList;

import com.internousdev.openconnect.attendance.dao.AttendanceDAO;
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
	 * 勤怠DTO
	 */
	private AttendanceDTO dto;
	/**
	 * 勤怠日付
	 */
	private String attendanceDate;
	/**
	 * エラー文字
	 */
	private String dateNotFound;
	/**
	 * 勤怠リスト
	 */
	private ArrayList<AttendanceDTO> list = new ArrayList<AttendanceDTO>();

	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 * @author MINORI SUNAGAWA
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute(){
		String result=ERROR;
		AttendanceDAO dao=new AttendanceDAO();

		if(attendanceDate.equals("")){
			dateNotFound="表示する日付を入力してください。";
			return result;

		}
		try{
			if(dao.select(attendanceDate)){

				dto=dao.getList().get(0);
				result=SUCCESS;
			}else{
				dateNotFound="DATE:"+attendanceDate+"のデータはありません";
			}
		}catch(Exception e ){
				return result;
			}

		return result;
}

	/**
	* 取得メソッド
	* @author MINORI SUNAGAWA
	* @return dto
	*/
	public AttendanceDTO getDto() {
		return dto;
	}

	/**
	* 設定メソッド
	* @author MINORI SUNAGAWA
	* @param dto
	*/
	public void setDto(AttendanceDTO dto) {
		this.dto = dto;
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
	* @return dateNotFound
	*/
	public String getDateNotFound() {
		return dateNotFound;
	}

	/**
	* 設定メソッド
	* @author MINORI SUNAGAWA
	* @param dateNotFound
	*/
	public void setDateNotFound(String dateNotFound) {
		this.dateNotFound = dateNotFound;
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
	* @return serialVersionUID
	*/
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
