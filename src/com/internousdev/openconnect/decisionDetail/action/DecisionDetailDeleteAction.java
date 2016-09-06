/**
 *
 */
package com.internousdev.openconnect.decisionDetail.action;


import com.internousdev.openconnect.decisionDetail.dao.DecisionDetailDeleteDAO;
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
	 * プロジェクトID
	 */
	private int decisionId;
	/**
	 * 実行メソッド DAOにデータを渡して、結果を返す
	 * @author TATUHUMI ITOU
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute(){
		DecisionDetailDeleteDAO dao = new DecisionDetailDeleteDAO();
		String result = ERROR;
		int count = 0;
		count = dao.delete(decisionId);
		if(count > 0){
			result = SUCCESS;
		}
		return result;
	}
	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return
	*/
	public int getDecisionId() {
		return decisionId;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param
	*/
	public void setDecisionId(int decisionId) {
		this.decisionId = decisionId;
	}








}
