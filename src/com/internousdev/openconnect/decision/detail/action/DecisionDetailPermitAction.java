/**
 *
 */
package com.internousdev.openconnect.decision.detail.action;


import java.util.Map;

import com.internousdev.openconnect.decision.detail.dao.DecisionDetailPermitDAO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 決裁手続き画面で新規に追加した情報を、DBに追加する為のクラス
 * @author SOSHI AZUMA
 * @since 2017/06/16
 * @version 1.0
 */
public class DecisionDetailPermitAction extends ActionSupport{
	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -7584789844350L;
	/**
	 * エラーメッセージ
	 */
	private String resultString = "承認できませんでした。";
	/**
	 * 決裁ID
	 */
	private int decisionId;
	/**
	 * 承認状況
	 */
	private int permitStatus = 0;
	/**
	 * 実施決裁状況
	 */
	private int decisionStatus1;
	/**
	 * 契約/実施兼契約決裁状況
	 */
	private int decisionStatus2;
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
		DecisionDetailPermitDAO dao = new DecisionDetailPermitDAO();

		int count = 0;
		String decisionType = "実施";

			count = dao.update1( permitStatus, decisionStatus1, decisionStatus2, decisionType, permitUserId1, decisionId );

		if (count > 0 ) {
			result = SUCCESS;
			resultString = "承認できました! ";
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
	* @return permitStatus
	*/
	public int getPermitStatus() {
		return permitStatus;
	}



	/**
	* 設定メソッド を設定
	* @param permitStatus
	*/
	public void setPermitStatus(int permitStatus) {
		this.permitStatus = permitStatus;
	}



	/**
	* 取得メソッド を取得
	* @return decisionStatus1
	*/
	public int getDecisionStatus1() {
		return decisionStatus1;
	}



	/**
	* 設定メソッド を設定
	* @param decisionStatus1
	*/
	public void setDecisionStatus1(int decisionStatus1) {
		this.decisionStatus1 = decisionStatus1;
	}



	/**
	* 取得メソッド を取得
	* @return decisionStatus2
	*/
	public int getDecisionStatus2() {
		return decisionStatus2;
	}



	/**
	* 設定メソッド を設定
	* @param decisionStatus2
	*/
	public void setDecisionStatus2(int decisionStatus2) {
		this.decisionStatus2 = decisionStatus2;
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
