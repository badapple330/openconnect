/**
 *
 */
package com.internousdev.openconnect.decisionDetail.dto;

/**
 * @author internous
 *
 */
public class DecisionDetailDTO {
	private String decisionStatus;
	private int decisionId;
	private String projectName;
	private String decisionType;
	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return
	*/
	public int getDecisionId() {
		return decisionId;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param
	*/
	public void setDecisionId(int decisionId) {
		this.decisionId = decisionId;
	}
	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return
	*/
	public String getProjectName() {
		return projectName;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param
	*/
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return
	*/
	public String getDecisionType() {
		return decisionType;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param
	*/
	public void setDecisionType(String decisionType) {
		this.decisionType = decisionType;
	}
	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return
	*/
	public String getDecisionStatus() {
		return decisionStatus;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param
	*/
	public void setDecisionStatus(String decisionStatus) {
		this.decisionStatus = decisionStatus;
	}





}
