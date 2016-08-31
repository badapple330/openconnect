/**
 *
 */
package com.internousdev.openconnect.project_progress_list.action;


import com.internousdev.openconnect.project_progress_list.dao.ProjectDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;


public class ProjectDeleteAction extends ActionSupport{

	private int projectId;

	public String execute(){
		ProjectDeleteDAO dao = new ProjectDeleteDAO();
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
