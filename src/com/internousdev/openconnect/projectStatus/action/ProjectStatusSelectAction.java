/**
 *
 */
package com.internousdev.openconnect.projectStatus.action;

import java.util.ArrayList;

import com.internousdev.openconnect.projectStatus.dao.ProjectStatusSelectDAO;
import com.internousdev.openconnect.projectStatus.dto.ProjectStatusDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * DBの情報を画面に表示する為のクラス
 * @author MINORI SUNAGAWA
 * @since 2016/09/04
 * @version 1.0
 */
public class ProjectStatusSelectAction extends ActionSupport{

	/**
	 * シリアル番号
	 */
	private static final long serialVersionUID = 671961516965709160L;
	/**
	 * 検索文字
	 */
	private String searchString = "";
	/**
	 * リリース状況リスト
	 */
	private ArrayList<ProjectStatusDTO> projectStatusList = new ArrayList<ProjectStatusDTO>();
	/**
	 * 結果文字
	 */
	private String resultString = "";

	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 * @author KOHEI NITABARU
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute(){
		String result = ERROR;
		ProjectStatusSelectDAO dao = new ProjectStatusSelectDAO();

		projectStatusList = dao.select(searchString);

		if( projectStatusList.size() != 0 ){

			result = SUCCESS;
		}

		return result;
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
	* @return projectStatusList
	*/
	public ArrayList<ProjectStatusDTO> getProjectStatusList() {
		return projectStatusList;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param projectStatusList
	*/
	public void setProjectStatusList(ArrayList<ProjectStatusDTO> projectStatusList) {
		this.projectStatusList = projectStatusList;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return resultString
	*/
	public String getResultString() {
		return resultString;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param resultString
	*/
	public void setResultString(String resultString) {
		this.resultString = resultString;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return serialVersionUID
	*/
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
