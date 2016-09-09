package com.internousdev.openconnect.decisionUpdate.action;

import com.internousdev.openconnect.decisionUpdate.dao.DecisionEditPasswordDAO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * DBの情報を画面に表示する為のクラス
 * @author TATUHUMI ITOU
 * @since 2016/09/04
 * @version 1.0
 */

public class DecisionEditPasswordAction extends ActionSupport {
	/**
	 * 決裁手続きリスト
	 */

	private String password;
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
	* @author KENICHI HORIGUCHI
	* @return
	*/
	public String getPassword() {
		return password;
	}




	/**
	* 設定メソッド
	* @author KENICHI HORIGUCHI
	* @param
	*/
	public void setPassword(String password) {
		this.password = password;
	}




	public int getDecisionDetailId() {
		return decisionDetailId;
	}
	/**
	* 設定メソッド
	* @author KENICHI HORIGUCHI
	* @param
	*/
	public void setDecisionDetailId(int decisionDetailId) {
		this.decisionDetailId = decisionDetailId;
	}


}
