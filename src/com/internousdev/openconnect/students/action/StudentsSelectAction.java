package com.internousdev.openconnect.students.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.students.dao.StudentsSelectDAO;
import com.internousdev.openconnect.students.dto.StudentsDTO;
import com.opensymphony.xwork2.ActionSupport;


public class StudentsSelectAction extends ActionSupport {

	/**
	 * シリアル番号
	 */
	private static final long serialVersionUID = 214651219760554487L;
	/**
	 * 生徒リスト
	 */
	private List<StudentsDTO> studentsList = new ArrayList<StudentsDTO>();
	/**
	 * 検索文字
	 */
    private String search = "";
	/**
	 * エラー文字
	 */
    private String errorMsg;

    /**
     * DBの情報を画面に表示する為のクラス
     * @author KOHEI NITABARU
     * @since 2016/09/04
     * @version 1.0
     */
	public String execute(){

    String result = ERROR;
    StudentsSelectDAO dao = new StudentsSelectDAO();
    studentsList = dao.select(search);

	if (studentsList.size() != 0) {
		result = SUCCESS;
	} else {
		errorMsg = "該当する情報は存在しません";
	}

	return result;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return studentsList
	*/
	public List<StudentsDTO> getStudentsList() {
		return studentsList;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param studentsList
	*/
	public void setStudentsList(List<StudentsDTO> studentsList) {
		this.studentsList = studentsList;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return search
	*/
	public String getSearch() {
		return search;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param search
	*/
	public void setSearch(String search) {
		this.search = search;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return errorMsg
	*/
	public String getErrorMsg() {
		return errorMsg;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param errorMsg
	*/
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return serialVersionUID
	*/
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}

