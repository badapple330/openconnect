package com.internousdev.openconnect.students.dto;

public class StudentsDTO {
 private String family_name;
 private String given_name;
 private String month;
 private String year;
 private int password;
 private int user_id;


public String getFamily_name() {
	return family_name;
}
public String getGiven_name() {
	return given_name;
}
public String getYear() {
	return year;
}
public void setFamily_name(String family_name) {
	this.family_name = family_name;
}
public void setGiven_name(String given_name) {
	this.given_name = given_name;
}
public void setYear(String year) {
	this.year = year;
}
public void setFamilyName(String family_name) {
	this.family_name = family_name;
}
public void setMonth(String month) {
	this.month = month;
}
public String getFamilyName() {
	return family_name;
}
public String getMonth() {
	return month;
}
public int getPassword() {
	return password;
}
public int getUser_id() {
	return user_id;
}
public void setPassword(int password) {
	this.password = password;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}

}
