package com.internousdev.openconnect.action.decision_list.action;

import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.openconnect.action.decision_list.dao.DecisionListDAO;
import com.internousdev.openconnect.action.decision_list.dto.DecisionListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class DecisionListAction extends ActionSupport{
/**
 * シリアル番号
 */
	private static final long serialVersionUID = 6053714239083263231L;

	private ArrayList<DecisionListDTO> list = new ArrayList<DecisionListDTO>();

	private String errorSelect;

	private String searchString;


	public String execute() throws SQLException {
		System.out.println(searchString);
		DecisionListDAO dao = new DecisionListDAO();
		if (dao.select(searchString)) {
			list = dao.getList();
		} else {
			errorSelect = (getText("データがありません"));
		}

		return SUCCESS;
	}


	public ArrayList<DecisionListDTO> getList() {
		return list;
	}


	public void setList(ArrayList<DecisionListDTO> list) {
		this.list = list;
	}


	public String getErrorSelect() {
		return errorSelect;
	}


	public void setErrorSelect(String errorSelect) {
		this.errorSelect = errorSelect;
	}


	public String getSearchString() {
		return searchString;
	}


	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}







}
