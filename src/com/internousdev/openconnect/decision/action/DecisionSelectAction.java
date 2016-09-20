package com.internousdev.openconnect.decision.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.decision.dao.DecisionSelectDAO;
import com.internousdev.openconnect.decision.dto.DecisionDTO;
import com.internousdev.openconnect.projects.dao.ProjectsSelectDAO;
import com.internousdev.openconnect.projects.dto.ProjectsSelectDTO;
import com.internousdev.openconnect.students.dao.StudentsSelectDAO;
import com.internousdev.openconnect.students.dto.StudentsDTO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 決裁状況一覧のDBの情報を検索するクラス
 * @author KENICHI HORIGUCHI,KOUHEI NITABARU
 * @since 2016/09/04
 * @version 1.0
 */
public class DecisionSelectAction extends ActionSupport{
	/**
	 * シリアル番号
	 */
	private static final long serialVersionUID = 6053714239083263231L;
	/**
	 *@author KENICHI HORIGUCHI
	 *プロジェクトリスト
	 */
	private ArrayList <DecisionDTO> decisiontList = new ArrayList <DecisionDTO>();
	/**
	 * プロジェクトリスト
	 */
	private List<ProjectsSelectDTO> projectsList = new ArrayList<ProjectsSelectDTO>();
	/**
	 * プロジェクトリスト
	 */
	private List<StudentsDTO> studentsList = new ArrayList<StudentsDTO>();
	/**
	 *エラーメッセージ
	 * @author KENICHI HORIGUCHI
	 */
	private String errorSelect;
	/**
	 * 検索文
	 * @author KENICHI HORIGUCHI
	 */
	private String searchString = "";
	/**
	 * 検索の実行メソッド
	 * @author KENICHI HORIGUCHI
	 */
	public String execute(){
		DecisionSelectDAO dao = new DecisionSelectDAO();
		ProjectsSelectDAO projectsDao = new ProjectsSelectDAO();
		StudentsSelectDAO studentsDao = new StudentsSelectDAO();

		if (dao.select(searchString)) {
			decisiontList = dao.getList();
			projectsList = projectsDao.select("");
			studentsList = studentsDao.select("");

		} else {
			errorSelect = (getText("データがありません"));
		}
		return SUCCESS;
	}
	/**
	 * 取得メソッド 決裁状況リスト
	 * @author KENICHI HORIGUCHI
	 * @return decisiontList
	 */
	public ArrayList <DecisionDTO> getDecisiontList() {
		return decisiontList;
	}


	/**
	 * 設定メソッド
	 * @author KENICHI HORIGUCHI
	 * @param decisiontList
	 */
	public void setDecisiontList(ArrayList <DecisionDTO> decisiontList) {
		this.decisiontList = decisiontList;
	}


	/**
	 * 取得メソッド エラーメッセージ
	 * @author KENICHI HORIGUCHI
	 * @return errorSelect
	 */
	public String getErrorSelect() {
		return errorSelect;
	}


	/**
	 * 設定メソッド
	 * @author KENICHI HORIGUCHI
	 * @param errorSelect
	 */
	public void setErrorSelect(String errorSelect) {
		this.errorSelect = errorSelect;
	}


	/**
	 * 取得メソッド 検索文
	 * @author KENICHI HORIGUCHI
	 * @return searchString
	 */
	public String getSearchString() {
		return searchString;
	}


	/**
	 * 設定メソッド
	 * @author KENICHI HORIGUCHI
	 * @param searchString
	 */
	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}


	/**
	 * 取得メソッド シリアルID
	 * @author KENICHI HORIGUCHI
	 * @return serialVersionUID
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 *   取得メソッド プロジェクトリストを取得する
	 * @author MASAHIRO KEDSUKA
	 * @param projectsList セットする projectsList
	 */
	public List<ProjectsSelectDTO> getProjectsList() {
		return projectsList;
	}
	/**
	 *   格納メソッド プロジェクトリストを格納する
	 * @author MASAHIRO KEDSUKA
	 * @param projectsList セットする projectsList
	 */
	public void setProjectsList(List<ProjectsSelectDTO> projectsList) {
		this.projectsList = projectsList;
	}
	/**
	* 取得メソッド
	* @author TATSUYA HOSHI
	* @return
	*/
	public List<StudentsDTO> getStudentsList() {
		return studentsList;
	}
	/**
	* 設定メソッド
	* @author TATSUYA HOSHI
	* @param
	*/
	public void setStudentsList(List<StudentsDTO> studentsList) {
		this.studentsList = studentsList;
	}



}
