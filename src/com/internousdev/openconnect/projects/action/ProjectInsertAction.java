package com.internousdev.openconnect.projects.action;

import com.internousdev.openconnect.projectProgress.dao.ProjectProgressNewDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ProjectInsertAction  extends ActionSupport  {

	private int projectId;
	private String projectName;
	private String Manager;
	private String subManager;
	private String startDate;



	public String execute(){
		/**
		 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
		 * @author YUICHI KIRIU
		 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
		 */
		String result=ERROR;
		ProjectProgressNewDAO dao = new ProjectProgressNewDAO();
		int count = 0;
		count = dao.insert(projectId,projectName,Manager,subManager,startDate);
		if (count > 0) {
			result = SUCCESS;
		}
		return result;
	}




}
