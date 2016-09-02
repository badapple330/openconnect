package com.internousdev.openconnect.action.decision_list.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.action.decision_list.dao.DecisionDisplayDAO;
import com.internousdev.openconnect.action.decision_list.dto.DecisionDisplayDTO;
import com.opensymphony.xwork2.ActionSupport;

public class DecisionDisplayAction extends ActionSupport{

	private List<DecisionDisplayDTO> DecisiontList = new ArrayList<DecisionDisplayDTO>();

	private static final long serialVersionUID = -7586577377473680450L;

	public String execute() {
		String result = ERROR;
		DecisionDisplayDAO dao = new DecisionDisplayDAO();

		DecisiontList = dao.select();
		if (!(DecisiontList == null)) {
			result = SUCCESS;
		}
		return result;
	}

	public List<DecisionDisplayDTO> getDecisiontList() {
		return DecisiontList;
	}

	public void setDecisiontList(List<DecisionDisplayDTO> decisiontList) {
		DecisiontList = decisiontList;
	}


}
