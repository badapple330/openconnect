package com.internousdev.openconnect.decision.detail.action;
import java.util.Map;

import com.internousdev.openconnect.decision.detail.dao.DecisionDetailRemandDAO;
import com.opensymphony.xwork2.ActionSupport;


/**
 * 差し戻しボタン押下時にDBの情報を更新するクラス
 * @author SOSHI AZUMA
 * @since 2017/06/21
 * @version 1.0
 */
public class DecisionDetailRemandAction extends ActionSupport {

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
	private int decisionStatus;
	/**
	 * sessionから取得したログイン中ユーザーID
	 */
	private int userId;
	/**
	 * 管理者権限メソッド
	 */
	public Map<String, Object> session;
	/**
	 * エラーメッセージ
	 */
	private String resultString = "差し戻しできませんでした。";



	/**
	 * 実行メソッド 差し戻しによる値の更新をする
	 * @return result 決裁情報の更新に成功したらSUCCESS, 失敗したらERROR
	 */
	public String execute() throws Exception {

		String result=ERROR;


		DecisionDetailRemandDAO dao = new DecisionDetailRemandDAO();


		int count = 0;

		count = dao.remand( decisionStatus, decisionId );


		if (count > 0 ) {
			result = SUCCESS;
			resultString = "差し戻しました!";
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


	public int getDecisionStatus() {
		return decisionStatus;
	}



	public void setDecisionStatus(int decisionStatus) {
		this.decisionStatus = decisionStatus;
	}



	/**
	* 取得メソッド を取得
	* @return userId
	*/
	public int getUserId() {
		return userId;
	}



	/**
	* 設定メソッド を設定
	* @param userId
	*/
	public void setUserId(int userId) {
		this.userId = userId;
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
