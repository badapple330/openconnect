/**
 *
 */
package com.internousdev.openconnect.projectProgress.action;


import com.internousdev.openconnect.projectProgress.dao.ProjectProgressNewDAO;
import com.opensymphony.xwork2.ActionSupport;


public class ProjectProgressNewAction extends ActionSupport{

	private String projectDay;
	private String project;
	private String projectPlan;
	private String projectResult;
	private String other;


	public String execute(){

		String result=ERROR;
		ProjectProgressNewDAO dao = new ProjectProgressNewDAO();
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