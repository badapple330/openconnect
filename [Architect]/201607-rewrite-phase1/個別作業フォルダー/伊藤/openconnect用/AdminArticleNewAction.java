/**
 *
 */
package com.internousdev.openconnect.action;


import com.internousdev.openconnect.dao.AdminArticleNewDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 新規記事を作成し、DBに格納するクラス
 * @author SANSHIRO KOCHO
 * @since 2016/8/23
 */
public class AdminArticleNewAction extends ActionSupport{

	private String projectDay;
	private String project;
	private String projectPlan;
	private String projectResult;
	private String other;


	/**
	 * 新規記事を作成し、DBに格納するメソッド
	 * @author SANSHIRO KOCHO
	 * @return　DBへの格納が成功したらSUCCESS,失敗したらERROR
	 */
	public String execute(){

		String result=ERROR;
		AdminArticleNewDAO dao = new AdminArticleNewDAO();
		int count = 0;
		count = dao.insert(projectDay,project,projectPlan,projectResult,other);
		if (count > 0) {
			result = SUCCESS;
		}
		return result;
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
