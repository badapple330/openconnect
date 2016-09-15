package com.internousdev.openconnect.projects.dto;

/**
 * DBを検索するクラス。
 * @author YUICHI KIRIU
 * @since 2016/09/08
 */
public class ProjectsSearchDTO {


	/**
	 * プロジェクトＩＤ
	 * @author YUICHI KIRIU
	 */
	private int projectId;

	/**
	 * プロジェクト名
	 * @author YUICHI KIRIU
	 */
	private String projectName;

	/**
	 * 管理者ＩＤ（リーダー）
	 * @author YUICHI KIRIU
	 */
	private int managerId;

	/**
	 * 管理者ＩＤ（サブ）
	 * @author YUICHI KIRIU
	 */
	private int subManagerId;

	/**
	 * 開始日
	 * @author YUICHI KIRIU
	 */
	private String startDate;

	/**
	 * 終了日
	 * @author YUICHI KIRIU
	 */
	private String endDate;

	/**
	 * 備考
	 * @author YUICHI KIRIU
	 */
	private String Note;




	/**
	 * 取得メソッド  プロジェクトＩＤを取得
	 * @author YUICHI KIRIU
	 * @return projectId
	 */
	public int getProjectId() {
		return projectId;
	}
	/**
	 * 設定メソッド プロジェクトＩＤを設定
	 * @author YUICHI KIRIU
	 * @param projectId
	 */
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	/**
	 * 取得メソッド プロジェクト名を取得
	 * @author YUICHI KIRIU
	 * @return projectName
	 */
	public String getProjectName() {
		return projectName;
	}
	/**
	 * 設定メソッド プロジェクト名を設定
	 * @author YUICHI KIRIU
	 * @param projectName
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	/**
	 * 取得メソッド 管理者ＩＤ（リーダー）を取得
	 * @author YUICHI KIRIU
	 * @return managerId
	 */
	public int getManagerId() {
		return managerId;
	}
	/**
	 * 設定メソッド 管理者ＩＤ（リーダー）を設定
	 * @author YUICHI KIRIU
	 * @param managerId
	 */
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	/**
	 * 取得メソッド 管理者ＩＤ（サブ）を取得
	 * @author YUICHI KIRIU
	 * @return subManagerId
	 */
	public int getSubManagerId() {
		return subManagerId;
	}
	/**
	 * 設定メソッド 管理者ＩＤ（サブ）を設定
	 * @author YUICHI KIRIU
	 * @param subManagerId
	 */
	public void setSubManagerId(int subManagerId) {
		this.subManagerId = subManagerId;
	}
	/**
	 * 取得メソッド 開始日を取得
	 * @author YUICHI KIRIU
	 * @return startDate
	 */
	public String getStartDate() {
		return startDate;
	}
	/**
	 * 設定メソッド 開始日を設定
	 * @author YUICHI KIRIU
	 * @param startDate
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	/**
	 * 取得メソッド 終了日を取得
	 * @author YUICHI KIRIU
	 * @return endDate
	 */
	public String getEndDate() {
		return endDate;
	}
	/**
	 * 設定メソッド 終了日を設定
	 * @author YUICHI KIRIU
	 * @param endDate
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	/**
	 * 取得メソッド  備考を取得
	 * @author YUICHI KIRIU
	 * @return Note
	 */
	public String getNote() {
		return Note;
	}
	/**
	 * 設定メソッド 備考を設定
	 * @author YUICHI KIRIU
	 * @param note
	 */
	public void setNote(String note) {
		this.Note = note;
	}

}
