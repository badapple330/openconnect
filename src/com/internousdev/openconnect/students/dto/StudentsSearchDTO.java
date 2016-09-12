package com.internousdev.openconnect.students.dto;

public class StudentsSearchDTO {

 private String familyname;
 private String givenname;
 private String month;
 private String year;
 private String password;
 private int userid;
/**
* 取得メソッド
* @author
* @return
*/
public String getFamilyname() {
	return familyname;
}
/**
* 設定メソッド
* @author
* @param
*/
public void setFamilyname(String familyname) {
	this.familyname = familyname;
}
/**
* 取得メソッド
* @author
* @return
*/
public String getGivenname() {
	return givenname;
}
/**
* 設定メソッド
* @author
* @param
*/
public void setGivenname(String givenname) {
	this.givenname = givenname;
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
/**
* 取得メソッド
* @author
* @return
*/
public int getUserid() {
	return userid;
}
/**
* 設定メソッド
* @author
* @param
*/
public void setUserid(int userid) {
	this.userid = userid;
}



}
