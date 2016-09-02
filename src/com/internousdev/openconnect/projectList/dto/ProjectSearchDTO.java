package com.internousdev.openconnect.projectList.dto;

public class ProjectSearchDTO {

	private String userId;
	private String projectName;
	private String Manager;
	private String subManager;
	private String startDate;
	private String endDate;
	private String Note;

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getManager() {
		return Manager;
	}
	public void setManager(String manager) {
		Manager = manager;
	}
	public String getSubManager() {
		return subManager;
	}
	public void setSubManager(String subManager) {
		this.subManager = subManager;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getNote() {
		return Note;
	}
	public void setNote(String note) {
		Note = note;
	}

}
