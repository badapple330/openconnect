/**
 *
 */
package com.internousdev.openconnect.decision.detail.action;

import java.util.ArrayList;

import com.internousdev.openconnect.decision.dto.DecisionDTO;
import com.opensymphony.xwork2.ActionSupport;

public class DecisionArchiveAction extends ActionSupport {

	private static final long serialVersionUID = 6045130027645771884L; //シリアルID

	/**
	 * 決済ID
	 */
	private int decisionId;

	/**
	 * 案件名
	 */
	private String decisionName;

	/**
	 * 決裁手続きの情報をリスト化
	 */
	private ArrayList<DecisionDTO> archiveList = new  ArrayList<DecisionDTO>();



	public String execute() {

		String result=ERROR;
		int count = 1;
		if (count > 0 ) {
			result = SUCCESS;
		}
		return result;
	}

	/**
	* 取得メソッド を取得
	* @return decisionId
	*/
	public int getDecisionId() {
		return decisionId;
	}

	/**
	* 設定メソッド を設定
	* @param decisionId
	*/
	public void setDecisionId(int decisionId) {
		this.decisionId = decisionId;
	}

	/**
	* 取得メソッド を取得
	* @return decisionName
	*/
	public String getDecisionName() {
		return decisionName;
	}

	/**
	* 設定メソッド を設定
	* @param decisionName
	*/
	public void setDecisionName(String decisionName) {
		this.decisionName = decisionName;
	}

	/**
	* 取得メソッド を取得
	* @return archiveList
	*/
	public ArrayList<DecisionDTO> getArchiveList() {
		return archiveList;
	}

	/**
	* 設定メソッド を設定
	* @param archiveList
	*/
	public void setArchiveList(ArrayList<DecisionDTO> archiveList) {
		this.archiveList = archiveList;
	}





}
