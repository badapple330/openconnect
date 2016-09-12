package com.internousdev.openconnect.projects.action;

import com.internousdev.openconnect.projects.dao.ProjectsInsertDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 画面から追加された情報をＤＢに追加するクラス
 * @author YUICHI KIRIU
 * @since 2016/09/07
 */
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


	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 * @author YUICHI KIRIU
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute(){

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
	 * @author YUICHI KIRIU
	 * @return projectId
	 */
	public int getProjectId() {
		return projectId;
	}



	/**
	 * 設定メソッド
	 * @author YUICHI KIRIU
	 * @param projectId
	 */
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}



	/**
	 * 取得メソッド
	 * @author YUICHI KIRIU
	 * @return projectName
	 */
	public String getProjectName() {
		return projectName;
	}



	/**
	 * 設定メソッド
	 * @author YUICHI KIRIU
	 * @param projectName
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}



	/**
	 * 取得メソッド
	 * @author YUICHI KIRIU
	 * @return managerId
	 */
	public int getManagerId() {
		return managerId;
	}



	/**
	 * 設定メソッド
	 * @author YUICHI KIRIU
	 * @param managerId
	 */
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}



	/**
	 * 取得メソッド
	 * @author YUICHI KIRIU
	 * @return subManagerId
	 */
	public int getSubManagerId() {
		return subManagerId;
	}



	/**
	 * 設定メソッド
	 * @author YUICHI KIRIU
	 * @param subManagerId
	 */
	public void setSubManagerId(int subManagerId) {
		this.subManagerId = subManagerId;
	}



	/**
	 * 取得メソッド
	 * @author YUICHI KIRIU
	 * @return startDate
	 */
	public String getStartDate() {
		return startDate;
	}



	/**
	 * 設定メソッド
	 * @author YUICHI KIRIU
	 * @param startDate
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}





}
