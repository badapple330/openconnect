package com.internousdev.openconnect.students.action;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.students.dao.StudentsUpdateDAO;
import com.opensymphony.xwork2.ActionSupport;

public class StudentsUpdateActon extends ActionSupport{
	private List<Integer> user_idList = new ArrayList<Integer>();
	private List<String> family_nameList = new ArrayList<String>();
	private List<String> given_nameList = new ArrayList<String>();
	private List<String> yearList = new ArrayList<String>();
	private List<String> monthList = new ArrayList<String>();
	private List<Integer> passwordList = new ArrayList<Integer>();



	public String execute() throws SQLException{

		String result =ERROR;
		StudentsUpdateDAO dao = new StudentsUpdateDAO();
		int count = 0;

		for(int i=0;i< user_idList.size();++i){
			count = dao.select(yearList.get(i),monthList.get(i),family_nameList.get(i),given_nameList.get(i),passwordList.get(i),user_idList.get(i));}
		if(count > 0){
			result = SUCCESS;
		}

		return result;
	}

	public void setUser_idList(List<Integer> user_idList) {
		this.user_idList = user_idList;
	}

	public void setFamily_nameList(List<String> family_nameList) {
		this.family_nameList = family_nameList;
	}

	public void setGiven_nameList(List<String> given_nameList) {
		this.given_nameList = given_nameList;
	}

	public void setYearList(List<String> yearList) {
		this.yearList = yearList;
	}

	public void setMonthList(List<String> monthList) {
		this.monthList = monthList;
	}

	public List<Integer> getUser_idList() {
		return user_idList;
	}

	public List<String> getFamily_nameList() {
		return family_nameList;
	}

	public List<String> getGiven_nameList() {
		return given_nameList;
	}

	public List<String> getYearList() {
		return yearList;
	}

	public List<String> getMonthList() {
		return monthList;
	}

	public List<Integer> getPasswordList() {
		return passwordList;
	}

	public void setPasswordList(List<Integer> passwordList) {
		this.passwordList = passwordList;
	}

}