package com.internousdev.openconnect.decision.action;



import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.decision.dao.DecisionUpdateDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 *編集されたDB情報を画面に表示させるクラス
 * @author KENICHI HORIGUCHI
 * @since 2016/09/8
 * @version 1.0
 */

public class DecisionUpdateAction extends ActionSupport{

	private List<String> registration = new ArrayList<String>();
	private List<Integer> userId = new ArrayList<Integer>();
	private List<Integer> projectId = new ArrayList<Integer>();
	private List<Integer> decisionId = new ArrayList<Integer>();
	private List<String> decisionName = new ArrayList<String>();
	private List<String> detail = new ArrayList<String>();
	private List<String> iDraftingId = new ArrayList<String>();
	private List<String> iApprovalId = new ArrayList<String>();
	private List<String> aDraftingId = new ArrayList<String>();
	private List<String> cdId = new ArrayList<String>();
	private List<String> iADId = new ArrayList<String>();
	private List<String> iAId = new ArrayList<String>();

	/**
	 * 決裁状況一覧情報を更新できたか否か判定するメソッド
	 * @author  KENICHI HORIGUCHI
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 *
	 */
	public String execute(){

		String result = ERROR;

		DecisionUpdateDAO dao = new DecisionUpdateDAO();

		int count = 0;

		System.out.println(registration.size());

		for(int i=0;i<registration.size();i++){

			count += dao.update(
					registration.get(i),
					userId.get(i),
					projectId.get(i),
					decisionId.get(i),
					decisionName.get(i),
					detail.get(i),
					iDraftingId.get(i),
					iApprovalId.get(i),
					aDraftingId.get(i),
					cdId.get(i),
					iADId.get(i),
					iAId.get(i)
			        );
//			System.out.println(count);
		}
		if(count > 0){
			result = SUCCESS;
		}


		return result;
	}

	/**
	* 取得メソッド
	* @author KENICHI HORIGUCHI
	* @return registration
	*/
	public List<String> getRegistration() {
		return registration;
	}

	/**
	* 設定メソッド
	* @author KENICHI HORIGUCHI
	* @param registration
	*/
	public void setRegistration(List<String> registration) {
		this.registration = registration;
	}

	/**
	* 取得メソッド
	* @author KENICHI HORIGUCHI
	* @return userId
	*/
	public List<Integer> getUserId() {
		return userId;
	}

	/**
	* 設定メソッド
	* @author KENICHI HORIGUCHI
	* @param userId
	*/
	public void setUserId(List<Integer> userId) {
		this.userId = userId;
	}

	/**
	* 取得メソッド
	* @author KENICHI HORIGUCHI
	* @return projectId
	*/
	public List<Integer> getProjectId() {
		return projectId;
	}

	/**
	* 設定メソッド
	* @author KENICHI HORIGUCHI
	* @param projectId
	*/
	public void setProjectId(List<Integer> projectId) {
		this.projectId = projectId;
	}

	/**
	* 取得メソッド
	* @author KENICHI HORIGUCHI
	* @return decisionId
	*/
	public List<Integer> getDecisionId() {
		return decisionId;
	}

	/**
	* 設定メソッド
	* @author KENICHI HORIGUCHI
	* @param decisionId
	*/
	public void setDecisionId(List<Integer> decisionId) {
		this.decisionId = decisionId;
	}

	/**
	* 取得メソッド
	* @author KENICHI HORIGUCHI
	* @return decisionName
	*/
	public List<String> getDecisionName() {
		return decisionName;
	}

	/**
	* 設定メソッド
	* @author KENICHI HORIGUCHI
	* @param decisionName
	*/
	public void setDecisionName(List<String> decisionName) {
		this.decisionName = decisionName;
	}

	/**
	* 取得メソッド
	* @author KENICHI HORIGUCHI
	* @return detail
	*/
	public List<String> getDetail() {
		return detail;
	}

	/**
	* 設定メソッド
	* @author KENICHI HORIGUCHI
	* @param detail
	*/
	public void setDetail(List<String> detail) {
		this.detail = detail;
	}

	/**
	* 取得メソッド
	* @author KENICHI HORIGUCHI
	* @return iDraftingId
	*/
	public List<String> getiDraftingId() {
		return iDraftingId;
	}

	/**
	* 設定メソッド
	* @author KENICHI HORIGUCHI
	* @param iDraftingId
	*/
	public void setiDraftingId(List<String> iDraftingId) {
		this.iDraftingId = iDraftingId;
	}

	/**
	* 取得メソッド
	* @author KENICHI HORIGUCHI
	* @return iApprovalId
	*/
	public List<String> getiApprovalId() {
		return iApprovalId;
	}

	/**
	* 設定メソッド
	* @author KENICHI HORIGUCHI
	* @param iApprovalId
	*/
	public void setiApprovalId(List<String> iApprovalId) {
		this.iApprovalId = iApprovalId;
	}

	/**
	* 取得メソッド
	* @author KENICHI HORIGUCHI
	* @return aDraftingId
	*/
	public List<String> getaDraftingId() {
		return aDraftingId;
	}

	/**
	* 設定メソッド
	* @author KENICHI HORIGUCHI
	* @param aDraftingId
	*/
	public void setaDraftingId(List<String> aDraftingId) {
		this.aDraftingId = aDraftingId;
	}

	/**
	* 取得メソッド
	* @author KENICHI HORIGUCHI
	* @return cdId
	*/
	public List<String> getCdId() {
		return cdId;
	}

	/**
	* 設定メソッド
	* @author KENICHI HORIGUCHI
	* @param cdId
	*/
	public void setCdId(List<String> cdId) {
		this.cdId = cdId;
	}

	/**
	* 取得メソッド
	* @author KENICHI HORIGUCHI
	* @return iADId
	*/
	public List<String> getiADId() {
		return iADId;
	}

	/**
	* 設定メソッド
	* @author KENICHI HORIGUCHI
	* @param iADId
	*/
	public void setiADId(List<String> iADId) {
		this.iADId = iADId;
	}

	/**
	* 取得メソッド
	* @author KENICHI HORIGUCHI
	* @return iAId
	*/
	public List<String> getiAId() {
		return iAId;
	}

	/**
	* 設定メソッド
	* @author KENICHI HORIGUCHI
	* @param iAId
	*/
	public void setiAId(List<String> iAId) {
		this.iAId = iAId;
	}

}

