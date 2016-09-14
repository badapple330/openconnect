package com.internousdev.openconnect.decision.detail.action;

import com.internousdev.openconnect.decision.detail.dao.DecisionDetailApplicationDAO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * DBに情報を格納する為のクラス
 * @author TATSUHUMI ITOU
 * * @since 2016/09/04
 * @version 1.0
 */
public class DecisionDetailApplicationAction  extends ActionSupport{
	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -758470450L;
	/**
	 * 決裁状況
	 */
	private String decisionStatus;
	/**
	 * 決裁ID
	 */
	private int decisionDetailId;
	/**
	 * 実行メソッド DAOのメソッドにデータを渡して、その結果が１つでもあればSUCCESSを返す
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
	* @author TATSUHUMI ITOU
	* @return decisionStatus
	*/
	public String getDecisionStatus() {
		return decisionStatus;
	}
	/**
	* 設定メソッド
	* @author TATSUHUMI ITOU
	* @param decisionStatus
	*/
	public void setDecisionStatus(String decisionStatus) {
		this.decisionStatus = decisionStatus;
	}
	/**
	* 取得メソッド
	* @author TATSUHUMI ITOU
	* @return decisionDetailId
	*/
	public int getDecisionDetailId() {
		return decisionDetailId;
	}
	/**
	* 設定メソッド
	* @author TATSUHUMI ITOU
	* @param decisionDetailId
	*/
	public void setDecisionDetailId(int decisionDetailId) {
		this.decisionDetailId = decisionDetailId;
	}



}