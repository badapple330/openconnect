/**
 *
 */
package com.internousdev.openconnect.operate.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.operate.dao.OperateDAO;
import com.internousdev.openconnect.operate.dto.OperateDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internous
 *
 */
public class OperateAction extends ActionSupport{

	private List<OperateDTO> operateList = new ArrayList<OperateDTO>();

	private String searchString;

	private String errorString;

	/**
	 * @param args
	 */
	public String execute(){

		OperateDAO dao = new OperateDAO();

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
	public List<OperateDTO> getOperateList() {
		return operateList;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param
	*/
	public void setOperateList(List<OperateDTO> operateList) {
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
