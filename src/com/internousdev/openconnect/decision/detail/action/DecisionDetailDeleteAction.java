/**
 *
 */
package com.internousdev.openconnect.decision.detail.action;


import com.internousdev.openconnect.decision.detail.dao.DecisionDetailDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 決裁手続き画面で受け取ったIDを元にして、DBの情報を削除する為のクラス
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
	 * パスワード
	 */
	private String password;
	/**
	 * エラーメッセージ
	 */
	private String resultString = "削除できませんでした。";
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

		boolean check = dao.check(decisionDetailId,password);

		if( check ){
			int count = 0;
			count = dao.delete(decisionDetailId);
			if(count > 0){
				result = SUCCESS;
				resultString="削除しました。";
			}
		}else{
			resultString = "パスワードが間違っています。";
		}
		return result;
	}

	/**
	 * 取得メソッド 決裁手続きIDを取得
	 * @author TATSUHUMI ITOU
	 * @return decisionDetailId
	 */
	public int getDecisionDetailId() {
		return decisionDetailId;
	}
	/**
	 * 設定メソッド 決裁手続きIDを設定
	 * @author TATSUHUMI ITOU
	 * @param decisionDetailId
	 */
	public void setDecisionDetailId(int decisionDetailId) {
		this.decisionDetailId = decisionDetailId;
	}

	/**
	 * 取得メソッド 結果を取得
	 * @author TATSUHUMI ITOU
	 * @return resultString
	 */
	public String getResultString() {
		return resultString;
	}

	/**
	 * 設定メソッド 結果を設定
	 * @author TATSUHUMI ITOU
	 * @param resultString
	 */
	public void setResultString(String resultString) {
		this.resultString = resultString;
	}

	/**
	* 取得メソッド パスワードを取得
	* @author TATSUHUMI ITOU
	* @return password
	*/
	public String getPassword() {
		return password;
	}

	/**
	* 設定メソッド パスワードを設定
	* @author TATSUHUMI ITOU
	* @param password
	*/
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	* 取得メソッド シリアルIDを取得
	* @author TATSUHUMI ITOU
	* @return serialVersionUID
	*/
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}