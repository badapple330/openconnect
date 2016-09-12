package com.internousdev.openconnect.students.action;

import com.internousdev.openconnect.students.dao.StudentsInsertDAO;
import com.opensymphony.xwork2.ActionSupport;


public class StudentsInsertAction extends ActionSupport  {

	private String familyName;
	 private String givenName;
	private String familyNameKanji;
	private String givenNameKanji;

	 private String month;
	 private String year;
	 private String password;




	public String execute() {
     String result = ERROR;
     StudentsInsertDAO dao = new StudentsInsertDAO();
     System.out.println(familyNameKanji);
 	 int count = 0;
	count = dao.insert(year,month,familyName,givenName,familyNameKanji,givenNameKanji,password);
	if (count > 0) {
		result = SUCCESS;
	}

    	return result;
}




	/**
	* 取得メソッド
	* @author
	* @return
	*/
	public String getFamilyName() {
		return familyName;
	}




	/**
	* 設定メソッド
	* @author
	* @param
	*/
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}




	/**
	* 取得メソッド
	* @author
	* @return
	*/
	public String getGivenName() {
		return givenName;
	}




	/**
	* 設定メソッド
	* @author
	* @param
	*/
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}




	/**
	* 取得メソッド
	* @author
	* @return
	*/
	public String getFamilyNameKanji() {
		return familyNameKanji;
	}




	/**
	* 設定メソッド
	* @author
	* @param
	*/
	public void setFamilyNameKanji(String familyNameKanji) {
		this.familyNameKanji = familyNameKanji;
	}




	/**
	* 取得メソッド
	* @author
	* @return
	*/
	public String getGivenNameKanji() {
		return givenNameKanji;
	}




	/**
	* 設定メソッド
	* @author
	* @param
	*/
	public void setGivenNameKanji(String givenNameKanji) {
		this.givenNameKanji = givenNameKanji;
	}




	/**
	* 取得メソッド
	* @author
	* @return
	*/
	public String getMonth() {
		return month;
	}




	/**
	* 設定メソッド
	* @author
	* @param
	*/
	public void setMonth(String month) {
		this.month = month;
	}




	/**
	* 取得メソッド
	* @author
	* @return
	*/
	public String getYear() {
		return year;
	}




	/**
	* 設定メソッド
	* @author
	* @param
	*/
	public void setYear(String year) {
		this.year = year;
	}




	/**
	* 取得メソッド
	* @author
	* @return
	*/
	public String getPassword() {
		return password;
	}




	/**
	* 設定メソッド
	* @author
	* @param
	*/
	public void setPassword(String password) {
		this.password = password;
	}







}