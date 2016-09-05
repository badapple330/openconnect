package com.internousdev.openconnect.projects.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.projects.dao.ProjectListDAO;
import com.internousdev.openconnect.projects.dto.ProjectListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ProjectAction extends ActionSupport{

	private List<ProjectListDTO> projectList = new ArrayList<ProjectListDTO>();


				public String execute() {
					String result = ERROR;
					ProjectListDAO dao = new ProjectListDAO();
					projectList = dao.select();
					if (!(projectList == null)) {
						result = SUCCESS;
					}
					return result;
				}

				public List<ProjectListDTO> getProjectList() {
					return projectList;
				}

				public void setProjectList(List<ProjectListDTO> projectList) {
					this.projectList = projectList;
				}


			}
