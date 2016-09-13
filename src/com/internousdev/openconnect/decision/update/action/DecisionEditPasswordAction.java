package com.internousdev.openconnect.decision.update.action;

import com.internousdev.openconnect.decision.update.dao.DecisionEditPasswordDAO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * DBの情報を画面に表示する為のクラス
 * @author TATUHUMI ITOU
 * @since 2016/09/04
 * @version 1.0
 */

public class DecisionEditPasswordAction extends ActionSupport {
	/**
	 * パスワード
	 */

	private String password;
	/**
	 * 決裁手続きID
	 */
private int decisionDetailId;;
	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -7586577377473680450L;
	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 * @author TATUHUMI ITOU
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute() {
		String result =ERROR;
		DecisionEditPasswordDAO dao = new DecisionEditPasswordDAO();
		int count = 0;
		count = dao.select(password,decisionDetailId);
		if(count > 0){
			result = SUCCESS;
		}
		return result;
	}




	/**
	* 取得メソッド
	* @authorCHI TATUHUMI ITOU
	* @return password
	*/
	public String getPassword() {
		return password;
	}




	/**
	* 設定メソッド
	* @author TATUHUMI ITOU
	* @param password
	*/
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	* 取得メソッド
	* @authorCHI TATUHUMI ITOU
	* @return decisionDetailId
	*/

	public int getDecisionDetailId() {
		return decisionDetailId;
	}
	/**
	* 設定メソッド
	* @author TATUHUMI ITOU
	* @paramdecisionDetailId
	*/
	public void setDecisionDetailId(int decisionDetailId) {
		this.decisionDetailId = decisionDetailId;
	}


}
