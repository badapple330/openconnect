package com.internousdev.openconnect.students.action;

import com.internousdev.openconnect.students.dao.StudentsInsertDAO;
import com.opensymphony.xwork2.ActionSupport;


public class StudentsInsertAction extends ActionSupport  {

	private String familyName;
	 private String givenName;
	 private String month;
	 private String year;
	 private int userId;
	 private int password;




	public String execute() {
     String result = ERROR;
     StudentsInsertDAO dao = new StudentsInsertDAO();
 	 int count = 0;
	count = dao.insert(year,month,familyName,givenName,password,userId);
	if (count > 0) {
		result = SUCCESS;
	}

    	return result;
}




	public String getFamilyName() {
		return familyName;
	}




	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}




	public String getGivenName() {
		return givenName;
	}




	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}




	public String getMonth() {
		return month;
	}




	public void setMonth(String month) {
		this.month = month;
	}




	public String getYear() {
		return year;
	}




	public void setYear(String year) {
		this.year = year;
	}




	public int getUserId() {
		return userId;
	}




	public void setUserId(int userId) {
		this.userId = userId;
	}




	public int getPassword() {
		return password;
	}




	public void setPassword(int password) {
		this.password = password;
	}



}