package com.internousdev.openconnect.projectProgress.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.projectProgress.dao.ProjectProgressDAO;
import com.internousdev.openconnect.projectProgress.dto.GetAddressDTO;
import com.opensymphony.xwork2.ActionSupport;


public class ProjectProgressAction extends ActionSupport {

	private List<GetAddressDTO> projectList = new ArrayList<GetAddressDTO>();

	private static final long serialVersionUID = -7586577377473680450L;

	public String execute() {
		String result = ERROR;
		ProjectProgressDAO dao = new ProjectProgressDAO();

		projectList = dao.select();
		if (!(projectList == null)) {
			result = SUCCESS;
		}
		return result;
	}

	public List<GetAddressDTO> getProjectList() {
		return projectList;
	}

	public void setProjectList(List<GetAddressDTO> projectList) {
		this.projectList = projectList;
	}


}
