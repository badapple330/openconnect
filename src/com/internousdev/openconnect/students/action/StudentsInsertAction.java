package com.internousdev.openconnect.students.action;

import com.internousdev.openconnect.students.dao.StudentsInsertDAO;
import com.opensymphony.xwork2.ActionSupport;


public class StudentsInsertAction extends ActionSupport  {

	private String family_name;
	 private String given_name;
	 private String month;
	 private String year;
	 private int password;
	 private int user_id;

	public String execute() {
     String result = ERROR;
     StudentsInsertDAO dao = new StudentsInsertDAO();
 	 int count = 0;
	count = dao.insert(year,month,family_name,given_name,password,user_id);
	if (count > 0) {
		result = SUCCESS;
	}

    	return result;
}

	public void setPassword(int password) {
		this.password = password;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getPassword() {
		return password;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setFamily_name(String family_name) {
		this.family_name = family_name;
	}

	public void setGiven_name(String given_name) {
		this.given_name = given_name;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getFamily_name() {
		return family_name;
	}

	public String getGiven_name() {
		return given_name;
	}

	public String getMonth() {
		return month;
	}

	public String getYear() {
		return year;
	}






}