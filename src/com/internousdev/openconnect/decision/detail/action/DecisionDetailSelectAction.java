/**
 *
 */
package com.internousdev.openconnect.decision.detail.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.openconnect.decision.detail.dao.DecisionDetailSelectDAO;
import com.internousdev.openconnect.decision.detail.dto.DecisionDetailDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * DBの情報を画面に表示する為のクラス
 * @author TATUHUMI ITOU
 * @since 2016/09/04
 * @version 1.0
 */
public class DecisionDetailSelectAction extends ActionSupport implements SessionAware {



	/**
	 * シリアル番号
	 */
	private static final long serialVersionUID = -7677481694269615816L;
	/**
	 * 決裁手続きリスト
	 */
	private List<DecisionDetailDTO> decisionDetailList1 = new ArrayList<DecisionDetailDTO>();
	/**
	 * 決裁手続きリスト
	 */
	private List<DecisionDetailDTO> decisionDetailList2 = new ArrayList<DecisionDetailDTO>();
	/**
	 * 決裁手続きリスト
	 */
	private List<DecisionDetailDTO> decisionBeginList = new ArrayList<DecisionDetailDTO>();
	/**
	 * 検索文字
	 */
	private String searchString = "";
	/**
	 * 管理者権限メソッド
	 */
	private Map<String, Object> session;
	/**
	 * エラー文字1
	 */
	private String resultSelect1 = "全プロジェクト検索結果を表示しました";
	/**
	 * エラー文字2
	 */
	private String resultSelect2 = "自プロジェクト検索結果を表示しました";



	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 * @author TATUHUMI ITOU
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute(){

		int userId = (int) session.get("userId");
		int userId1 = (int) session.get("userId");


		DecisionDetailSelectDAO dao = new DecisionDetailSelectDAO();

		decisionDetailList1 = dao.selectAnotherD( searchString, userId, userId1 );
		decisionDetailList2 = dao.selectMyD( userId, userId1);
		decisionBeginList = dao.selectP( userId, userId1 );


		if( decisionDetailList1.size() == 0){
			resultSelect1 = "該当する情報はありません";
		}
		if( decisionDetailList2.size() == 0){
			resultSelect2 = "自プロジェクトはありません";
		}

		return SUCCESS;
	}



	/**
	* 取得メソッド 決裁手続きリストを取得
	* @author TATUHUMI ITOU
	* @return decisionDetailList1
	*/
	public List<DecisionDetailDTO> getDecisionDetailList1() {
		return decisionDetailList1;
	}



	/**
	* 設定メソッド 決裁手続きリストを設定
	* @author TATUHUMI ITOU
	* @param decisionDetailList1
	*/
	public void setDecisionDetailList1(List<DecisionDetailDTO> decisionDetailList1) {
		this.decisionDetailList1 = decisionDetailList1;
	}

	/**
	* 取得メソッド 決裁手続きリストを取得
	* @author TATUHUMI ITOU
	* @return decisionDetailList2
	*/
	public List<DecisionDetailDTO> getDecisionDetailList2() {
		return decisionDetailList2;
	}



	/**
	* 設定メソッド 決裁手続きリストを設定
	* @author TATUHUMI ITOU
	* @param decisionDetailList2
	*/
	public void setDecisionDetailList2(List<DecisionDetailDTO> decisionDetailList2) {
		this.decisionDetailList2 = decisionDetailList2;
	}

	/**
	* 取得メソッド を取得
	* @author KOHEI NITABARU
	* @return decisionBeginList
	*/
	public List<DecisionDetailDTO> getDecisionBeginList() {
		return decisionBeginList;
	}



	/**
	* 設定メソッド を設定
	* @author KOHEI NITABARU
	* @param decisionBeginList
	*/
	public void setDecisionBeginList(List<DecisionDetailDTO> decisionBeginList) {
		this.decisionBeginList = decisionBeginList;
	}



	/**
	* 取得メソッド シリアル番号を取得
	* @author KOHEI NITABARU
	* @return serialVersionUID
	*/
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	* 取得メソッド 検索文を取得
	* @author TATUHUMI ITOU
	* @return searchString
	*/
	public String getSearchString() {
		return searchString;
	}

	/**
	* 設定メソッド 検索文を設定
	* @author TATUHUMI ITOU
	* @param searchString
	*/
	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}



	/**
	* 取得メソッド を取得
	* @author KOHEI NITABARU
	* @return session
	*/
	public Map<String, Object> getSession() {
		return session;
	}



	/**
	* 設定メソッド を設定
	* @author KOHEI NITABARU
	* @param session
	*/
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}



	/**
	* 取得メソッド
	* @author TATUHUMI ITOU
	* @return resultSelect1
	*/
	public String getResultSelect1() {
		return resultSelect1;
	}



	/**
	* 設定メソッド
	* @author TATUHUMI ITOU
	* @param resultSelect1
	*/
	public void setResultSelect1(String resultSelect1) {
		this.resultSelect1 = resultSelect1;
	}

	/**
	* 取得メソッド
	* @author TATUHUMI ITOU
	* @return resultSelect1
	*/
	public String getResultSelect2() {
		return resultSelect2;
	}



	/**
	* 設定メソッド
	* @author TATUHUMI ITOU
	* @param resultSelect2
	*/
	public void setResultSelect2(String resultSelect2) {
		this.resultSelect2 = resultSelect2;
	}



}
