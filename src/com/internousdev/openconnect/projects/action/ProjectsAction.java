package com.internousdev.openconnect.projects.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.projects.dao.ProjectsListDAO;
import com.internousdev.openconnect.projects.dto.ProjectListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ProjectsAction extends ActionSupport{

	private List<ProjectListDTO> projectList = new ArrayList<ProjectListDTO>();


				public String execute() {
					String result = ERROR;
					ProjectsListDAO dao = new ProjectsListDAO();
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
