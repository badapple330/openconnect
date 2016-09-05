/**
 *
 */
package com.internousdev.openconnect.operate.dto;

/**
 * @author internous
 *
 */
public class OperateDTO {

	private int operateId;
	private String projectName;
	private String password;

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return
	*/
	public int getOperateId() {
		return operateId;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param
	*/
	public void setOperateId(int operateId) {
		this.operateId = operateId;
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
	public String getPassword() {
		return password;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param
	*/
	public void setPassword(String password) {
		this.password = password;
	}



}
