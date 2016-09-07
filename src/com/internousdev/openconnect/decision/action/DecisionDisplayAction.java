package com.internousdev.openconnect.decision.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.decision.dao.DecisionDisplayDAO;
import com.internousdev.openconnect.decision.dto.DecisionDisplayDTO;
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

	/**
	* 取得メソッド
	* @author KENICHI HORIGUCHI
	* @return DecisiontList
	*/
	public List<DecisionDisplayDTO> getDecisiontList() {
		return DecisiontList;
	}

	/**
	* 設定メソッド
	* @author KENICHI HORIGUCHI
	* @param decisiontList
	*/
	public void setDecisiontList(List<DecisionDisplayDTO> decisiontList) {
		DecisiontList = decisiontList;
	}

	/**
	* 取得メソッド
	* @author KENICHI HORIGUCHI
	* @return serialVersionUID
	*/
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
