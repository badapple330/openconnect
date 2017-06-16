/**
 *
 */
package com.internousdev.openconnect.decision.detail.action;


import java.util.Map;

import com.internousdev.openconnect.decision.detail.dao.DecisionDetailInsertDAO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 決裁手続き画面で新規に追加した情報を、DBに追加する為のクラス
 * @author TATUHUMI ITOU, SOSHI AZUMA
 * @since 2016/09/04
 * @version 1.0
 */
public class DecisionDetailInsertAction extends ActionSupport{
	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -7584789844350L;
	/**
	 * エラーメッセージ
	 */
	private String resultString = "追加できませんでした。";
	/**
	 * プロジェクトID
	 */
	private int projectId;
	/**
	 * 決済種類
	 */
	private String decisionType = "実施";
	/**
	 * 管理者権限メソッド
	 */
	public Map<String, Object> session;
	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute() {

		String result=ERROR;
		DecisionDetailInsertDAO dao = new DecisionDetailInsertDAO();

		int count = 0;
		int decisionStatus1 = 0;

		count = dao.insert( projectId, decisionType, decisionStatus1 );

		if (count > 0 ) {
			result = SUCCESS;
			resultString = "追加できました! 1度検索ボタンを押してください。";
		}
		return result;
	}

	/**
	* 取得メソッド プロジェクトIDを取得
	* @return projectId
	*/
	public int getProjectId() {
		return projectId;
	}
	/**
	* 設定メソッド プロジェクトIDを設定
	* @param projectId
	*/
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	/**
	* 取得メソッド を取得
	* @return decisionType
	*/
	public String getDecisionType() {
		return decisionType;
	}

	/**
	* 設定メソッド を設定
	* @param decisionType
	*/
	public void setDecisionType(String decisionType) {
		this.decisionType = decisionType;
	}

	/**
	* 取得メソッド 結果を取得
	* @return resultString
	*/
	public String getResultString() {
		return resultString;
	}

	/**
	* 設定メソッド 結果を設定
	* @param resultString
	*/
	public void setResultString(String resultString) {
		this.resultString = resultString;
	}

	/**
	* 取得メソッド を取得
	* @return session
	*/
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	* 設定メソッド を設定
	* @param session
	*/
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}



}
