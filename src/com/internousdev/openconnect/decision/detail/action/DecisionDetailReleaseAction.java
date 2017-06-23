/**
 *
 */
package com.internousdev.openconnect.decision.detail.action;

import java.util.Map;

import com.internousdev.openconnect.decision.detail.dao.DecisionDetailUpdateDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internousdev
 *
 */
public class DecisionDetailReleaseAction extends ActionSupport {


	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 8633009576791703661L;
	/**
	 * 決裁ID
	 */
	private int decisionId;
	/**
	 * エラーメッセージ
	 */
	private String resultString = "リリース完了できませんでした。";
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

		DecisionDetailUpdateDAO dao = new DecisionDetailUpdateDAO();

		int count = 0;

		count = dao.release( decisionId );


		if (count > 0 ) {
			result = SUCCESS;
			resultString = "リリース完了しました! ";
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
