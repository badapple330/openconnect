package com.internousdev.openconnect.projects.action;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.openconnect.projects.dao.ProjectsUpdateDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 *編集されたDB情報を画面に表示させるクラス
 * @author YUICHI KIRIU
 * @since 2016/09/8
 * @version 1.0
 */

public class ProjectsUpdateAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルＩＤ
	 */
	private static final long serialVersionUID = 1453496957429527686L;

	private List<Integer> projectIdList= new ArrayList<Integer>();
	private List<String> projectNameList = new ArrayList<String>();
	private List<Integer> projectManagerIdList = new ArrayList<Integer>();
	private List<Integer> projectSubManagerIdList = new ArrayList<Integer>();
	private List<String> projectStartDateList = new ArrayList<String>();
	private List<String> projectEndDateList = new ArrayList<String>();
	private List<String> projectNoteList = new ArrayList<String>();
	public Map<String, Object> session;


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
	public List<Integer> getProjectManagerIdList() {
		return projectManagerIdList;
	}

	/**
	 * 設定メソッド
	 * @author YUICHI KIRIU
	 * @param projectManagerIdList
	 */
	public void setProjectManagerIdList(List<Integer> projectManagerIdList) {
		this.projectManagerIdList = projectManagerIdList;
	}

	/**
	 * 取得メソッド
	 * @author YUICHI KIRIU
	 * @return projectSubManagerIdList
	 */
	public List<Integer> getProjectSubManagerIdList() {
		return projectSubManagerIdList;
	}

	/**
	 * 設定メソッド
	 * @author YUICHI KIRIU
	 * @param projectSubManagerIdList
	 */
	public void setProjectSubManagerIdList(List<Integer> projectSubManagerIdList) {
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

	/**
	 * 設定メソッド
	 * @author YUICHI KIRIU
	 * @param projectNoteList
	 */
	@Override
	public void setSession(Map<String, Object> arg0) {

	}

	/**
	* 取得メソッド
	* @author KENICHI HORIGUCHI
	* @return session
	*/
	public Map<String, Object> getSession() {
		return session;
	}


}

