package com.internousdev.openconnect.projectList.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import com.internousdev.openconnect.projectList.dao.ProjectDAO;
import com.internousdev.openconnect.projectList.dto.ProjectDTO;

public class ProjectAction {


			private String projectname;


			private ArrayList<ProjectDTO> list = new ArrayList<ProjectDTO>();

			private Map<String, Object> session;

			public String execute() throws SQLException {

				String result = ERROR;
				ProjectDAO dao = new ProjectDAO();

				//projectに合致するものが見つかるデータをdaoのインスタンスから探す
				if (dao.select(projectname)) {
					list = dao.getProjectlistSelect();
					session.put("projectname", list.get(0).getProjectname());
					result = success;
				} else {
					errorSelect = (getText("データがありません"));
					session.put(" projectname", projectname);
				}

				return result;

		}


}
