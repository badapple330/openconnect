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
 * @author internous
 *
 */
public class DecisionDetailSearchAction extends ActionSupport{

	private List<DecisionDetailDTO> operateList = new ArrayList<DecisionDetailDTO>();

	private String searchString;

	private String errorString;

	/**
	 * @param args
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
	* @return
	*/
	public List<DecisionDetailDTO> getOperateList() {
		return operateList;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param
	*/
	public void setOperateList(List<DecisionDetailDTO> operateList) {
		this.operateList = operateList;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return
	*/
	public String getSearchString() {
		return searchString;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param
	*/
	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return
	*/
	public String getErrorString() {
		return errorString;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param
	*/
	public void setErrorString(String errorString) {
		this.errorString = errorString;
	}

}
