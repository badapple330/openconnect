package com.internousdev.openconnect.students.dto;

public class StudentsInsertDTO {
	private String family_name;
	private String given_name;
	private int year;
	private int month;
	public void setFamily_name(String family_name) {
		this.family_name = family_name;
	}
	public void setGiven_name(String given_name) {
		this.given_name = given_name;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public String getFamily_name() {
		return family_name;
	}
	public String getGiven_name() {
		return given_name;
	}
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
}
