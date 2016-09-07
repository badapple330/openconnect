package com.internousdev.openconnect.projects.dto;
public class ProjectsListDTO {


            private String projectId;
            private String projectName;
		 	private String managerId;
		 	private String subManagerId;
		 	private String startDate;
		 	private String endDate;
		 	private String Note;
    	 	//内部結合するまで
 	        private String managerName;
      	 	private String subManagerName;
			/**
			* 取得メソッド
			* @author YUICHI KIRIU
			* @return projectId
			*/
			public String getProjectId() {
				return projectId;
			}
			/**
			* 設定メソッド
			* @author YUICHI KIRIU
			* @param projectId
			*/
			public void setProjectId(String projectId) {
				this.projectId = projectId;
			}
			/**
			* 取得メソッド
			* @author YUICHI KIRIU
			* @return projectName
			*/
			public String getProjectName() {
				return projectName;
			}
			/**
			* 設定メソッド
			* @author YUICHI KIRIU
			* @param projectName
			*/
			public void setProjectName(String projectName) {
				this.projectName = projectName;
			}
			/**
			* 取得メソッド
			* @author YUICHI KIRIU
			* @return managerId
			*/
			public String getManagerId() {
				return managerId;
			}
			/**
			* 設定メソッド
			* @author YUICHI KIRIU
			* @param managerId
			*/
			public void setManagerId(String managerId) {
				this.managerId = managerId;
			}
			/**
			* 取得メソッド
			* @author YUICHI KIRIU
			* @return subManagerId
			*/
			public String getSubManagerId() {
				return subManagerId;
			}
			/**
			* 設定メソッド
			* @author YUICHI KIRIU
			* @param subManagerId
			*/
			public void setSubManagerId(String subManagerId) {
				this.subManagerId = subManagerId;
			}
			/**
			* 取得メソッド
			* @author YUICHI KIRIU
			* @return startDate
			*/
			public String getStartDate() {
				return startDate;
			}
			/**
			* 設定メソッド
			* @author YUICHI KIRIU
			* @param startDate
			*/
			public void setStartDate(String startDate) {
				this.startDate = startDate;
			}
			/**
			* 取得メソッド
			* @author YUICHI KIRIU
			* @return endDate
			*/
			public String getEndDate() {
				return endDate;
			}
			/**
			* 設定メソッド
			* @author YUICHI KIRIU
			* @param endDate
			*/
			public void setEndDate(String endDate) {
				this.endDate = endDate;
			}
			/**
			* 取得メソッド
			* @author YUICHI KIRIU
			* @return endDate
			*/
			public String getNote() {
				return Note;
			}
			/**
			* 設定メソッド
			* @author YUICHI KIRIU
			* @param
			*/
			public void setNote(String note) {
				this.Note = note;
			}
			/**
			* 取得メソッド
			* @author YUICHI KIRIU
			* @return note
			*/
			public String getManagerName() {
				return managerName;
			}
			/**
			* 設定メソッド
			* @author YUICHI KIRIU
			* @param managerName
			*/
			public void setManagerName(String managerName) {
				this.managerName = managerName;
			}
			/**
			* 取得メソッド
			* @author YUICHI KIRIU
			* @return subManagerName
			*/
			public String getSubManagerName() {
				return subManagerName;
			}
			/**
			* 設定メソッド
			* @author YUICHI KIRIU
			* @param subManagerName
			*/
			public void setSubManagerName(String subManagerName) {
				this.subManagerName = subManagerName;
			}



}
