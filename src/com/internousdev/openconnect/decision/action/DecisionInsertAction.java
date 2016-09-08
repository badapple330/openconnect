package com.internousdev.openconnect.decision.action;

import java.sql.Date;

import com.internousdev.openconnect.decision.dao.DecisionInsertDAO;
import com.opensymphony.xwork2.ActionSupport;

public class DecisionInsertAction  extends ActionSupport  {

	/**
	 * 登録日
	 */
	private Date registration;

	/**
	 * ユーザーID
	 */
	private int user_id;

	/**
	 * プロジェクトID
	 */
	private int project_id;

	/**
	 * 案件番号
	 */
	private int decision_id;

	/**
	 * 案件名
	 */
	private String decision_name;

	/**
	 * 詳細
	 */
	private String detail;

	/**
	 * 実施起案番号
	 */
	private String i_drafting_id;

	/**
	 * 実施決裁番号
	 */
	private String i_approval_id;

	/**
	 * 契約起案番号
	 */
	private String a_drafting_id;

	/**
	 * 契約決番号
	 */
	private String cd_id;

	/**
	 * 実施兼契約起案番号
	 */
	private String i_a_d_id;

	/**
	 * 実施兼契約番号
	 */
	private String i_a_id;



	public String execute(){
		/**
		 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
		 * @author KENICHI HORIGUCHI
		 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
		 */
		String result = ERROR;
		DecisionInsertDAO dao = new DecisionInsertDAO();
		int count = 0;
		count = dao.insert(registration,user_id,project_id,decision_id,decision_name,detail,i_drafting_id,i_approval_id,a_drafting_id,cd_id,i_a_d_id,i_a_id
);
		if (count > 0) {
			result = SUCCESS;
		}
		return result;
	}




}
