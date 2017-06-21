package com.internousdev.openconnect.decision.detail.action;
import java.util.Map;

import com.internousdev.openconnect.decision.detail.dao.DecisionDetailUpdateDAO;
import com.opensymphony.xwork2.ActionSupport;


/**
* 決裁手続き画面の申請ボタンに付加された情報をDBに送る為のクラス
* @author SOSHI AZUMA
* @since 2017/06/16
* @version 1.0
*/
public class DecisionDetailUpdateAction extends ActionSupport {

	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -8411529948818659378L;
	/**
	 * 決裁ID
	 */
	private int decisionId;
	/**
	 * 決裁種類
	 */
	private String decisionType;
	/**
	 * 承認状況
	 */
	private int permitStatus;
	/**
	 * 管理者権限メソッド
	 */
	public Map<String, Object> session;
	/**
	 * エラーメッセージ
	 */
	private String resultString = "差し戻しできませんでした。";




	/**
	 * 実行メソッド DAOに情報を渡して、結果を返す
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute() throws Exception {

		String result=ERROR;


		DecisionDetailUpdateDAO dao = new DecisionDetailUpdateDAO();


		int count = 0;

		count = dao.remand( decisionType, permitStatus, decisionId );

		int count1 = 0;

		count1 = dao.reject( decisionType, decisionId );


		if (count > 0 ) {
			result = SUCCESS;
			resultString = "差し戻しできました! ";
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

	public String getDecisionType() {
		return decisionType;
	}



	public void setDecisionType(String decisionType) {
		this.decisionType = decisionType;
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
