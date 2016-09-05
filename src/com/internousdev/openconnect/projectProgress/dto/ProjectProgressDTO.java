/**
 *
 */
package com.internousdev.openconnect.projectProgress.dto;

/**
 * @author internous
 *
 */
public class ProjectProgressDTO {

	private int projectId;
	private String projectDay;
	private String project;
	private String projectPlan;
	private String projectResult;
	private String other;
	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return
	*/
	public int getProjectId() {
		return projectId;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param
	*/
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return
	*/
	public String getProjectDay() {
		return projectDay;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param
	*/
	public void setProjectDay(String projectDay) {
		this.projectDay = projectDay;
	}
	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return
	*/
	public String getProject() {
		return project;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param
	*/
	public void setProject(String project) {
		this.project = project;
	}
	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return
	*/
	public String getProjectPlan() {
		return projectPlan;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param
	*/
	public void setProjectPlan(String projectPlan) {
		this.projectPlan = projectPlan;
	}
	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return
	*/
	public String getProjectResult() {
		return projectResult;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param
	*/
	public void setProjectResult(String projectResult) {
		this.projectResult = projectResult;
	}
	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return
	*/
	public String getOther() {
		return other;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param
	*/
	public void setOther(String other) {
		this.other = other;
	}


}
