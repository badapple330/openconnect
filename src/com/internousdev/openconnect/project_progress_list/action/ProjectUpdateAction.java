package com.internousdev.openconnect.project_progress_list.action;

import java.sql.SQLException;

import com.internousdev.openconnect.project_progress_list.dao.ProjectUpdateDAO;
import com.opensymphony.xwork2.ActionSupport;
//データベースにユーザー情報を削除させる為のクラス
public class ProjectUpdateAction extends ActionSupport  {
	/**
	 * 	シリアルID
	 */
	private static final long serialVersionUID = -3541224046836562290L;

	/**
	 * ID
	 */
	private int projectId;
	private String projectDay;
	private String project;
	private String projectPlan;
	private String projectResult;
	private String other;

	/**
	 * ユーザー情報を更新できたか否か判定するメソッド
	 * @result ERROR ヴァリデーションによるエラーメッセージ
	 * @return result データベースのuser,passwordを更新できたか否か
	 * @throws SQLException
	 */
	public String execute() throws SQLException{


		  String result =ERROR;
		  ProjectUpdateDAO dao = new ProjectUpdateDAO();
		  int count = 0;
		  count = dao.select(projectId,projectDay,project,projectPlan,projectResult,other);
			if(count > 0){
				   result = SUCCESS;
			}

		   return result;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectDay() {
		return projectDay;
	}

	public void setProjectDay(String projectDay) {
		this.projectDay = projectDay;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getProjectPlan() {
		return projectPlan;
	}

	public void setProjectPlan(String projectPlan) {
		this.projectPlan = projectPlan;
	}

	public String getProjectResult() {
		return projectResult;
	}

	public void setProjectResult(String projectResult) {
		this.projectResult = projectResult;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}


}
