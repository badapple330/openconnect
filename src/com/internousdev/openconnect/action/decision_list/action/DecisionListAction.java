package com.internousdev.openconnect.action.decision_list.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.openconnect.action.decision_list.dao.DecisionListDAO;
import com.internousdev.openconnect.action.decision_list.dto.DecisionListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class DecisionListAction extends ActionSupport implements SessionAware{
/**
 * シリアル番号
 */
	private static final long serialVersionUID = 6053714239083263231L;

	private ArrayList<DecisionListDTO> list = new ArrayList<DecisionListDTO>();

	private Map<String, Object> session;

	private String errorSelect;

	private String Registration;

	private String project_list;

	private String project_name;

	public String execute() throws SQLException {

		String result = ERROR;
		DecisionListDAO dao = new DecisionListDAO();
		if (dao.select(project_list)) {
			list = dao.getProjectlistSelect();
			session.put("project_list", list.get(0).getProject_list());
			result = SUCCESS;
		} else {
			errorSelect = (getText("データがありません"));
			session.put("project_list",project_list);
		}
		if (dao.select(project_name)) {
			list = dao.getProjectnameSelect();
			session.put("project_name", list.get(0).getProject_name());
			result = SUCCESS;
		} else {
			errorSelect = (getText("データがありません"));
			session.put("project_name",project_name);
		}
		if (dao.select(Registration)) {
			list = dao.getRegistrationSelect();
			session.put("Registration", list.get(0).getRegistration());
			result = SUCCESS;
		} else {
			errorSelect = (getText("データがありません"));
			session.put("Registration",Registration);
		}

		return result;
	}

	public ArrayList<DecisionListDTO> getList() {
		return list;
	}

	public void setList(ArrayList<DecisionListDTO> list) {
		this.list = list;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getErrorSelect() {
		return errorSelect;
	}

	public void setErrorSelect(String errorSelect) {
		this.errorSelect = errorSelect;
	}

	public String getRegistration() {
		return Registration;
	}

	public void setRegistration(String registration) {
		Registration = registration;
	}

	public String getProject_list() {
		return project_list;
	}

	public void setProject_list(String project_list) {
		this.project_list = project_list;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	

}
