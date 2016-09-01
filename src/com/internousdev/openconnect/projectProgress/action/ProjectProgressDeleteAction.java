/**
 *
 */
package com.internousdev.openconnect.projectProgress.action;


import com.internousdev.openconnect.projectProgress.dao.ProjectProgressDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;


public class ProjectProgressDeleteAction extends ActionSupport{

	private int projectId;

	public String execute(){
		ProjectProgressDeleteDAO dao = new ProjectProgressDeleteDAO();
		String result = ERROR;
		int count = 0;
		count = dao.delete(projectId);
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




}
