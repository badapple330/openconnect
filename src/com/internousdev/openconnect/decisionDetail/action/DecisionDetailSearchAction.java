/**
 *
 */
package com.internousdev.openconnect.decisionDetail.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.decisionDetail.dao.DecisionDetailSearchDAO;
import com.internousdev.openconnect.decisionDetail.dto.DecisionDetailDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * DBの情報を画面に表示する為のクラス
 * @author TATUHUMI ITOU
 * @since 2016/09/04
 * @version 1.0
 */
public class DecisionDetailSearchAction extends ActionSupport{

	/**
	 * 決裁手続きリスト
	 */
	private List<DecisionDetailDTO> operateList = new ArrayList<DecisionDetailDTO>();
	/**
	 * 検索文字
	 */
	private String searchString;
	/**
	 * エラー文字
	 */
	private String errorString;
	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 * @author TATUHUMI ITOU
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute(){

		DecisionDetailSearchDAO dao = new DecisionDetailSearchDAO();

		operateList = dao.select( searchString );

		if( operateList == null ){

			errorString = "データがありません";
		}

		return SUCCESS;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return operateList
	*/
	public List<DecisionDetailDTO> getOperateList() {
		return operateList;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param operateList
	*/
	public void setOperateList(List<DecisionDetailDTO> operateList) {
		this.operateList = operateList;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return searchString
	*/
	public String getSearchString() {
		return searchString;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param searchString
	*/
	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return errorString
	*/
	public String getErrorString() {
		return errorString;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param errorString
	*/
	public void setErrorString(String errorString) {
		this.errorString = errorString;
	}

}
