/**
 *
 */
package com.internousdev.openconnect.decision.detail.action;


import com.internousdev.openconnect.decision.detail.dao.DecisionDetailDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 画面で受け取ったIDを元にして、DBの情報を削除する為のクラス
 * @author TATUHUMI ITOU
 * @since 2016/09/04
 * @version 1.0
 */
public class DecisionDetailDeleteAction extends ActionSupport{
	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -758470450L;
	/**
	 * 決裁手続きID
	 */
	private int decisionDetailId;
	/**
	 * 実行メソッド DAOにデータを渡して、結果を返す
	 * @author TATUHUMI ITOU
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute(){
		DecisionDetailDeleteDAO dao = new DecisionDetailDeleteDAO();
		String result = ERROR;
		int count = 0;
		count = dao.delete(decisionDetailId);
		if(count > 0){
			result = SUCCESS;
		}
		return result;
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
