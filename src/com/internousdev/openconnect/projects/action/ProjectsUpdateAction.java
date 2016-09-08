package com.internousdev.openconnect.projects.action;


import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.projects.dao.ProjectsUpdateDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 *編集されたDB情報を画面に表示させるクラス
 * @author YUICHI KIRIU
 * @since 2016/09/7
 * @version 1.0
 */

public class ProjectsUpdateAction extends ActionSupport{

	private List<Integer> projectIdList= new ArrayList<Integer>();
	private List<String> projectNameList = new ArrayList<String>();
	private List<String> projectManagerIdList = new ArrayList<String>();
	private List<String> projectSubManagerIdList = new ArrayList<String>();
	private List<String> projectStartDateList = new ArrayList<String>();
	private List<String> projectEndDateList = new ArrayList<String>();
	private List<String> projectNoteList = new ArrayList<String>();


	/**
	 * プロジェクト一覧情報を更新できたか否か判定するメソッド
	 * @author  YUICHI KIRIU
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 *
	 */
	public String execute(){


		String result =ERROR;
		ProjectsUpdateDAO dao = new ProjectsUpdateDAO();
		int count = 0;
		for(int i=0;i<projectIdList.size();++i){


			count = dao.select(
					projectNameList.get(i),
					projectManagerIdList.get(i),
					projectSubManagerIdList.get(i),
					projectStartDateList.get(i),
					projectEndDateList.get(i),
					projectNoteList.get(i),
					projectIdList.get(i));
		}
		if(count > 0){
			result = SUCCESS;
		}
		return result;
	}

	/**
	* 取得メソッド
	* @author YUICHI KIRIU
	* @return projectIdList
	*/
	public List<Integer> getProjectIdList() {
		return projectIdList;
	}

	/**
	* 設定メソッド
	* @author YUICHI KIRIU
	* @param projectIdList
	*/
	public void setProjectIdList(List<Integer> projectIdList) {
		this.projectIdList = projectIdList;
	}

	/**
	* 取得メソッド
	* @author YUICHI KIRIU
	* @return projectNameList
	*/
	public List<String> getProjectNameList() {
		return projectNameList;
	}

	/**
	* 設定メソッド
	* @author YUICHI KIRIU
	* @param projectNameList
	*/
	public void setProjectNameList(List<String> projectNameList) {
		this.projectNameList = projectNameList;
	}

	/**
	* 取得メソッド
	* @author YUICHI KIRIU
	* @return projectManagerIdList
	*/
	public List<String> getProjectManagerIdList() {
		return projectManagerIdList;
	}

	/**
	* 設定メソッド
	* @author YUICHI KIRIU
	* @param projectManagerIdList
	*/
	public void setProjectManagerIdList(List<String> projectManagerIdList) {
		this.projectManagerIdList = projectManagerIdList;
	}

	/**
	* 取得メソッド
	* @author YUICHI KIRIU
	* @return projectSubManagerIdList
	*/
	public List<String> getProjectSubManagerIdList() {
		return projectSubManagerIdList;
	}

	/**
	* 設定メソッド
	* @author YUICHI KIRIU
	* @param projectSubManagerIdList
	*/
	public void setProjectSubManagerIdList(List<String> projectSubManagerIdList) {
		this.projectSubManagerIdList = projectSubManagerIdList;
	}

	/**
	* 取得メソッド
	* @author YUICHI KIRIU
	* @return projectStartDateList
	*/
	public List<String> getProjectStartDateList() {
		return projectStartDateList;
	}

	/**
	* 設定メソッド
	* @author  YUICHI KIRIU
	* @param projectStartDateList
	*/
	public void setProjectStartDateList(List<String> projectStartDateList) {
		this.projectStartDateList = projectStartDateList;
	}

	/**
	* 取得メソッド
	* @author  YUICHI KIRIU
	* @return projectEndDateList
	*/
	public List<String> getProjectEndDateList() {
		return projectEndDateList;
	}

	/**
	* 設定メソッド
	* @author YUICHI KIRIU
	* @param projectEndDateList
	*/
	public void setProjectEndDateList(List<String> projectEndDateList) {
		this.projectEndDateList = projectEndDateList;
	}

	/**
	* 取得メソッド
	* @author  YUICHI KIRIU
	* @return projectNoteList
	*/
	public List<String> getProjectNoteList() {
		return projectNoteList;
	}

	/**
	* 設定メソッド
	* @author YUICHI KIRIU
	* @param projectNoteList
	*/
	public void setProjectNoteList(List<String> projectNoteList) {
		this.projectNoteList = projectNoteList;
	}


}

