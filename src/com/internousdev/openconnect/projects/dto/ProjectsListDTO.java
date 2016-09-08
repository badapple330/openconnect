package com.internousdev.openconnect.projects.dto;
public class ProjectsListDTO {



	/**
	 * プロジェクトＩＤ
	 */
	private String projectId;

	/**
	 * プロジェクト名
	 */
	private String projectName;

	/**
	 * 管理者ＩＤ（リーダー）
	 */
	private String managerId;

	/**
	 * 管理者ＩＤ（サブ）
	 */
	private String subManagerId;

	/**
	 * 開始日
	 */
	private String startDate;

	/**
	 * 終了日
	 */
	private String endDate;

	/**
	 * 備考
	 */
	private String Note;






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

}
