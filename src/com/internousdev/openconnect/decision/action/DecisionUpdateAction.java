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

	private List<String> registrasion= new ArrayList<String>();
	private List<Integer> user_id = new ArrayList<Integer>();
	private List<Integer> project_id = new ArrayList<Integer>();
	private List<Integer> decision_id = new ArrayList<Integer>();
	private List<String> decision_name = new ArrayList<String>();
	private List<String> detail = new ArrayList<String>();
	private List<String> i_drafting_id = new ArrayList<String>();
	private List<String> i_approval_id = new ArrayList<String>();
	private List<String> a_drafting_id = new ArrayList<String>();
	private List<String> cd_id = new ArrayList<String>();
	private List<String> i_a_d_id = new ArrayList<String>();
	private List<String> i_a_id = new ArrayList<String>();

	/**
	 * 決裁状況一覧情報を更新できたか否か判定するメソッド
	 * @author  KENICHI HORIGUCHI
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 *
	 */
	public String execute(){


		String result =ERROR;
		DecisionUpdateDAO dao = new DecisionUpdateDAO();
		int count = 0;
		for(int i=0;i<registrasion.size();++i){


			count = dao.select(
					registrasion.get(i),
					user_id .get(i),
					project_id.get(i),
					decision_id.get(i),
					decision_name.get(i),
					detail.get(i),
					i_drafting_id.get(i),
					i_approval_id.get(i),
					a_drafting_id.get(i),
			        cd_id.get(i),
			        i_a_d_id.get(i),
			        i_a_id.get(i)
			        );


		}
		if(count > 0){
			result = SUCCESS;
		}
		return result;
	}

	/**
	* 取得メソッド
	* @author KENICHI HORIGUCHI
	* @return registrasion
	*/
	public List<String> getRegistrasion() {
		return registrasion;
	}

	/**
	* 設定メソッド
	* @author KENICHI HORIGUCHI
	* @param registrasion
	*/
	public void setRegistrasion(List<String> registrasion) {
		this.registrasion = registrasion;
	}

	/**
	* 取得メソッド
	* @author KENICHI HORIGUCHI
	* @return user_id
	*/
	public List<Integer> getUser_id() {
		return user_id;
	}

	/**
	* 設定メソッド
	* @author KENICHI HORIGUCHI
	* @param user_id
	*/
	public void setUser_id(List<Integer> user_id) {
		this.user_id = user_id;
	}

	/**
	* 取得メソッド
	* @author KENICHI HORIGUCHI
	* @return project_id
	*/
	public List<Integer> getProject_id() {
		return project_id;
	}

	/**
	* 設定メソッド
	* @author KENICHI HORIGUCHI
	* @param project_id
	*/
	public void setProject_id(List<Integer> project_id) {
		this.project_id = project_id;
	}

	/**
	* 取得メソッド
	* @author KENICHI HORIGUCHI
	* @return decision_id
	*/
	public List<Integer> getDecision_id() {
		return decision_id;
	}

	/**
	* 設定メソッド
	* @author KENICHI HORIGUCHI
	* @param decision_id
	*/
	public void setDecision_id(List<Integer> decision_id) {
		this.decision_id = decision_id;
	}

	/**
	* 取得メソッド
	* @author KENICHI HORIGUCHI
	* @return decision_name
	*/
	public List<String> getDecision_name() {
		return decision_name;
	}

	/**
	* 設定メソッド
	* @author KENICHI HORIGUCHI
	* @param decision_name
	*/
	public void setDecision_name(List<String> decision_name) {
		this.decision_name = decision_name;
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
	* @return i_drafting_id
	*/
	public List<String> getI_drafting_id() {
		return i_drafting_id;
	}

	/**
	* 設定メソッド
	* @author KENICHI HORIGUCHI
	* @param i_drafting_id
	*/
	public void setI_drafting_id(List<String> i_drafting_id) {
		this.i_drafting_id = i_drafting_id;
	}

	/**
	* 取得メソッド
	* @author KENICHI HORIGUCHI
	* @return  i_approval_id
	*/
	public List<String> getI_approval_id() {
		return i_approval_id;
	}

	/**
	* 設定メソッド
	* @author KENICHI HORIGUCHI
	* @param  i_approval_id
	*/
	public void setI_approval_id(List<String> i_approval_id) {
		this.i_approval_id = i_approval_id;
	}

	/**
	* 取得メソッド
	* @author KENICHI HORIGUCHI
	* @return a_drafting_id
	*/
	public List<String> getA_drafting_id() {
		return a_drafting_id;
	}

	/**
	* 設定メソッド
	* @author KENICHI HORIGUCHI
	* @param a_drafting_id
	*/
	public void setA_drafting_id(List<String> a_drafting_id) {
		this.a_drafting_id = a_drafting_id;
	}

	/**
	* 取得メソッド
	* @author KENICHI HORIGUCHI
	* @return cd_id
	*/
	public List<String> getCd_id() {
		return cd_id;
	}

	/**
	* 設定メソッド
	* @author KENICHI HORIGUCHI
	* @param cd_id
	*/
	public void setCd_id(List<String> cd_id) {
		this.cd_id = cd_id;
	}

	/**
	* 取得メソッド
	* @author KENICHI HORIGUCHI
	* @return  i_a_d_id
	*/
	public List<String> getI_a_d_id() {
		return i_a_d_id;
	}

	/**
	* 設定メソッド
	* @author KENICHI HORIGUCHI
	* @param  i_a_d_id
	*/
	public void setI_a_d_id(List<String> i_a_d_id) {
		this.i_a_d_id = i_a_d_id;
	}

	/**
	* 取得メソッド
	* @author KENICHI HORIGUCHI
	* @return i_a_id
	*/
	public List<String> getI_a_id() {
		return i_a_id;
	}

	/**
	* 設定メソッド
	* @author KENICHI HORIGUCHI
	* @param i_a_id
	*/
	public void setI_a_id(List<String> i_a_id) {
		this.i_a_id = i_a_id;
	}

}

