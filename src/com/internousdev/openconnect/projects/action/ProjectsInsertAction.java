package com.internousdev.openconnect.projects.action;

import com.internousdev.openconnect.projects.dao.ProjectsInsertDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ProjectsInsertAction  extends ActionSupport  {

	/**
	 * プロジェクトＩＤ
	 */
	private int projectId;

	/**
	 * プロジェクト名
	 */
	private String projectName;

	/**
	 * 管理者名（リーダー）
	 */
	private int managerId;

	/**
	 * 管理者名（サブ）
	 */
	private int subManagerId;

	/**
	 * 開始日
	 */
	private String startDate;



	public String execute(){
		/**
		 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
		 * @author YUICHI KIRIU
		 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
		 */
		String result = ERROR;
		ProjectsInsertDAO dao = new ProjectsInsertDAO();
		int count = 0;
		count = dao.insert(projectName,managerId,subManagerId,startDate);
		if (count > 0) {
			result = SUCCESS;
		}
		return result;
	}



	/**
	* 取得メソッド
	* @author KENICHI HORIGUCHI
	* @return
	*/
	public int getProjectId() {
		return projectId;
	}



	/**
	* 設定メソッド
	* @author KENICHI HORIGUCHI
	* @param
	*/
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}



	/**
	* 取得メソッド
	* @author KENICHI HORIGUCHI
	* @return
	*/
	public String getProjectName() {
		return projectName;
	}



	/**
	* 設定メソッド
	* @author KENICHI HORIGUCHI
	* @param
	*/
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}



	/**
	* 取得メソッド
	* @author KENICHI HORIGUCHI
	* @return
	*/
	public int getManagerId() {
		return managerId;
	}



	/**
	* 設定メソッド
	* @author KENICHI HORIGUCHI
	* @param
	*/
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}



	/**
	* 取得メソッド
	* @author KENICHI HORIGUCHI
	* @return
	*/
	public int getSubManagerId() {
		return subManagerId;
	}



	/**
	* 設定メソッド
	* @author KENICHI HORIGUCHI
	* @param
	*/
	public void setSubManagerId(int subManagerId) {
		this.subManagerId = subManagerId;
	}



	/**
	* 取得メソッド
	* @author KENICHI HORIGUCHI
	* @return
	*/
	public String getStartDate() {
		return startDate;
	}



	/**
	* 設定メソッド
	* @author KENICHI HORIGUCHI
	* @param
	*/
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}





}
