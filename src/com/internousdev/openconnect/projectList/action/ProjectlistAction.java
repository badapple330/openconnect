package com.internousdev.openconnect.projectList.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import com.internousdev.openconnect.projectList.dao.ProjectlistDAO;
import com.internousdev.openconnect.projectList.dto.ProjectlistDTO;

public class ProjectlistAction {


			private String projectname;


			private ArrayList<ProjectlistDTO> list = new ArrayList<ProjectlistDTO>();

			private Map<String, Object> session;

			public String execute() throws SQLException {

				String result = ERROR;
				ProjectlistDAO dao = new ProjectlistDAO();

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
