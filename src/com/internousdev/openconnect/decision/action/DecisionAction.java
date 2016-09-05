package com.internousdev.openconnect.decision.action;

import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.openconnect.decision.dao.DecisionDAO;
import com.internousdev.openconnect.decision.dto.DecisionDTO;
import com.opensymphony.xwork2.ActionSupport;

public class DecisionAction extends ActionSupport{
/**
 * シリアル番号
 */
	private static final long serialVersionUID = 6053714239083263231L;

	private ArrayList<DecisionDTO> list = new ArrayList<DecisionDTO>();

	private String errorSelect;

	private String searchString;


	public String execute() throws SQLException {
		System.out.println(searchString);
		DecisionDAO dao = new DecisionDAO();
		if (dao.select(searchString)) {
			list = dao.getList();
		} else {
			errorSelect = (getText("データがありません"));
		}

		return SUCCESS;
	}


	public ArrayList<DecisionDTO> getList() {
		return list;
	}


	public void setList(ArrayList<DecisionDTO> list) {
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
