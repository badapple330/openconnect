package com.internousdev.openconnect.decisionDetail.action;

import com.internousdev.openconnect.decisionDetail.dao.DecisionDetailApplicationDAO;
import com.opensymphony.xwork2.ActionSupport;

public class DecisionDetailApplicationAction  extends ActionSupport{
	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -758470450L;
	/**
	 * プロジェクトID
	 */
	private String decisionStatus;
	private int decisionDetailId;
	/**
	 * 実行メソッド DAOにデータを渡して、結果を返す
	 * @author TATUHUMI ITOU
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute(){
		DecisionDetailApplicationDAO dao = new DecisionDetailApplicationDAO();
		String result = ERROR;
		int count = 0;
		count = dao.update(decisionStatus,decisionDetailId);
		if(count > 0){
			result = SUCCESS;
		}
		return result;
	}
	/**
	* 取得メソッド
	* @author
	* @return
	*/
	public String getDecisionStatus() {
		return decisionStatus;
	}
	/**
	* 設定メソッド
	* @author
	* @param
	*/
	public void setDecisionStatus(String decisionStatus) {
		this.decisionStatus = decisionStatus;
	}
	/**
	* 取得メソッド
	* @author
	* @return
	*/
	public int getDecisionDetailId() {
		return decisionDetailId;
	}
	/**
	* 設定メソッド
	* @author
	* @param
	*/
	public void setDecisionDetailId(int decisionDetailId) {
		this.decisionDetailId = decisionDetailId;
	}



}
