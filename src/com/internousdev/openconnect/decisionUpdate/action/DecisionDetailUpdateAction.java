/**
 *
 */
package com.internousdev.openconnect.decisionUpdate.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.openconnect.decisionDetail.dto.DecisionDetailDTO;
import com.internousdev.openconnect.decisionUpdate.dao.DecisionDetailUpdateDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * DBの情報を画面に表示する為のクラス
 * @author TATUHUMI ITOU
 * @since 2016/09/04
 * @version 1.0
 */
public class DecisionDetailUpdateAction extends ActionSupport implements SessionAware{


	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 3838876771681623480L;
	/**
	 * セッション
	 */
	private Map<String, Object> session;
	/**
	 * 決裁手続きリスト
	 */
	private List<DecisionDetailDTO> decisionDetailList = new ArrayList<DecisionDetailDTO>();
	/**
	 * エラーメッセージ
	 */
	private String errorString ;
	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 * @author TATUHUMI ITOU
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute(){
		DecisionDetailUpdateDAO dao = new DecisionDetailUpdateDAO();
		decisionDetailList = dao.select((int) (session.get("decisionDetailId")) );
		if( decisionDetailList == null ){
			errorString = "データがありません";
		}
		return SUCCESS;
	}
	/**
	* 取得メソッド
	* @author TATUHUMI ITOU
	* @return decisionDetailList
	*/
	public List<DecisionDetailDTO> getDecisionDetailList() {
		return decisionDetailList;
	}



	/**
	* 設定メソッド
	* @author TATUHUMI ITOU
	* @param decisionDetailList
	*/
	public void setDecisionDetailList(List<DecisionDetailDTO> decisionDetailList) {
		this.decisionDetailList = decisionDetailList;
	}

	/**
	* 取得メソッド
	* @author TATUHUMI ITOU
	* @return errorString
	*/
	public String getErrorString() {
		return errorString;
	}

	/**
	* 設定メソッド
	* @author TATUHUMI ITOU
	* @param errorString
	*/
	public void setErrorString(String errorString) {
		this.errorString = errorString;
	}
	/**
	* 取得メソッド
	* @author TATUHUMI ITOU
	* @return session
	*/
	public Map<String, Object> getSession() {
		return session;
	}
	/**
	* 設定メソッド
	* @author TATUHUMI ITOU
	* @param session
	*/
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}



}
