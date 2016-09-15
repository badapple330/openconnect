/**
 *
 */
package com.internousdev.openconnect.decision.detail.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.decision.detail.dao.DecisionDetailSelectDAO;
import com.internousdev.openconnect.decision.detail.dto.DecisionDetailDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * DBの情報を画面に表示する為のクラス
 * @author TATUHUMI ITOU
 * @since 2016/09/04
 * @version 1.0
 */
public class DecisionDetailSelectAction extends ActionSupport{



	/**
	 * シリアル番号
	 */
	private static final long serialVersionUID = -7677481694269615816L;
	/**
	 * 決裁手続きリスト
	 */
	private List<DecisionDetailDTO> decisionDetailList = new ArrayList<DecisionDetailDTO>();
	/**
	 * 検索文字
	 */
	private String searchString = "";
	/**
	 * エラー文字
	 */
	private String errorString = "";
	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 * @author TATUHUMI ITOU
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute(){

		DecisionDetailSelectDAO dao = new DecisionDetailSelectDAO();

		decisionDetailList = dao.select( searchString );

		if( decisionDetailList == null ){

			errorString = "データがありません";
		}

		return SUCCESS;
	}



	/**
	* 取得メソッド 決裁手続きリストを取得
	* @author TATUHUMI ITOU
	* @return decisionDetailList
	*/
	public List<DecisionDetailDTO> getDecisionDetailList() {
		return decisionDetailList;
	}



	/**
	* 設定メソッド 決裁手続きリストを設定
	* @author TATUHUMI ITOU
	* @param decisionDetailList
	*/
	public void setDecisionDetailList(List<DecisionDetailDTO> decisionDetailList) {
		this.decisionDetailList = decisionDetailList;
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
	* 取得メソッド エラーメッセージを取得
	* @author TATUHUMI ITOU
	* @return errorString
	*/
	public String getErrorString() {
		return errorString;
	}

	/**
	* 設定メソッド エラーメッセージを設定
	* @author TATUHUMI ITOU
	* @param errorString
	*/
	public void setErrorString(String errorString) {
		this.errorString = errorString;
	}

}
