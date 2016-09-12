package com.internousdev.openconnect.students.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.students.dao.StudentsUpdateDAO;
import com.opensymphony.xwork2.ActionSupport;

public class StudentsUpdateAction extends ActionSupport{
	private List<Integer> useridList = new ArrayList<Integer>();
	private List<String> familyNameList = new ArrayList<String>();
	private List<String> givenNameList = new ArrayList<String>();
	private List<String> yearList = new ArrayList<String>();
	private List<String> monthList = new ArrayList<String>();
	private List<Integer> passwordList = new ArrayList<Integer>();



	public String execute() throws SQLException{

		String result =ERROR;
		StudentsUpdateDAO dao = new StudentsUpdateDAO();
		int count = 0;
System.out.println(useridList);
		for(int i=0;i< useridList.size();++i){
			count = dao.select(yearList.get(i),monthList.get(i),familyNameList.get(i),givenNameList.get(i),passwordList.get(i),useridList.get(i));
			}
		if ( count > 0){
			result = SUCCESS;
		}
		return result;
	}



	/**
	* 取得メソッド
	* @author
	* @return
	*/
	public List<Integer> getUseridList() {
		return useridList;
	}



	/**
	* 設定メソッド
	* @author
	* @param
	*/
	public void setUseridList(List<Integer> useridList) {
		this.useridList = useridList;
	}



	/**
	* 取得メソッド
	* @author
	* @return
	*/
	public List<String> getFamilyNameList() {
		return familyNameList;
	}



	/**
	* 設定メソッド
	* @author
	* @param
	*/
	public void setFamilyNameList(List<String> familyNameList) {
		this.familyNameList = familyNameList;
	}



	/**
	* 取得メソッド
	* @author
	* @return
	*/
	public List<String> getGivenNameList() {
		return givenNameList;
	}



	/**
	* 設定メソッド
	* @author
	* @param
	*/
	public void setGivenNameList(List<String> givenNameList) {
		this.givenNameList = givenNameList;
	}



	/**
	* 取得メソッド
	* @author
	* @return
	*/
	public List<String> getYearList() {
		return yearList;
	}



	/**
	* 設定メソッド
	* @author
	* @param
	*/
	public void setYearList(List<String> yearList) {
		this.yearList = yearList;
	}



	/**
	* 取得メソッド
	* @author
	* @return
	*/
	public List<String> getMonthList() {
		return monthList;
	}



	/**
	* 設定メソッド
	* @author
	* @param
	*/
	public void setMonthList(List<String> monthList) {
		this.monthList = monthList;
	}



	/**
	* 取得メソッド
	* @author
	* @return
	*/
	public List<Integer> getPasswordList() {
		return passwordList;
	}



	/**
	* 設定メソッド
	* @author
	* @param
	*/
	public void setPasswordList(List<Integer> passwordList) {
		this.passwordList = passwordList;
	}



}