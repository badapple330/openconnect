package com.internousdev.openconnect.projects.action;

import com.internousdev.openconnect.projectProgress.dao.ProjectProgressNewDAO;
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
	private String Manager;

	/**
	 * 管理者名（サブ）
	 */
	private String subManager;

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
		ProjectProgressNewDAO dao = new ProjectProgressNewDAO();
		int count = 0;
		count = dao.insert(projectId,projectName,Manager,subManager,startDate);
		if (count > 0) {
			result = SUCCESS;
		}
		return result;
	}




}
