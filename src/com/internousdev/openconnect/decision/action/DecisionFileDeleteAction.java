/**
 *
 */
package com.internousdev.openconnect.decision.action;

import java.util.Map;

import com.internousdev.openconnect.decision.dao.DecisionDAO;
import com.opensymphony.xwork2.ActionSupport;



/**
 * 画像を削除するクラス
 * @author Kikuchi Jun
 * @since 2017/06/09
 * @version 1.0
 */
public class DecisionFileDeleteAction extends ActionSupport {



	/**
	 * セッション情報
	 */
	private Map<String,Object> session;

	/**
	 * イメージネーム
	 */
	private String documentName;

	/**
	 * エラーメッセージ
	 */
	public String resultString="削除できませんでした。";




	public String execute(){
		String result =ERROR;

		int deleted=0;

	    DecisionDAO dao= new DecisionDAO();

		    deleted=dao.delete(documentName);

		    if(deleted>0){
		    	result = SUCCESS;
		    	resultString="削除しました。";
		    }
		return result;

	}



	/**
	 * セッション取得メソッド
	 * @author Jun Kikuchi
	 * @return session セッション
	 */
	public Map<String,Object> getSession(){
		return session;
	}


	/**
	 * セッション格納メソッド
	 * @author Jun Kikuchi
	 * @param session セッション
	 */
	public void setSession(Map<String,Object> session){
		this.session = session;
	}

	/**
	* 取得メソッド を取得
	* @return documentName
	*/
	public String getDocumentName() {
		return documentName;
	}

	/**
	* 設定メソッド を設定
	* @param documentName
	*/
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}


}





