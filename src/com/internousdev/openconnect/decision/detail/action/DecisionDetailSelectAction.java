/**
 *
 */
package com.internousdev.openconnect.decision.detail.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.internousdev.openconnect.dao.LoginDAO;
import com.internousdev.openconnect.decision.detail.dao.DecisionDetailSelectDAO;
import com.internousdev.openconnect.decision.detail.dto.DecisionDetailDTO;
import com.internousdev.openconnect.projects.dao.ProjectsSelectDAO;
import com.internousdev.openconnect.projects.dto.ProjectsSelectDTO;
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
	private List<DecisionDetailDTO> decisionDetailList1 = new ArrayList<DecisionDetailDTO>();
	/**
	 * 決裁手続きリスト
	 */
	private List<DecisionDetailDTO> decisionDetailList2 = new ArrayList<DecisionDetailDTO>();
	/**
	 * プロジェクトリスト
	 */
	private List<ProjectsSelectDTO> projectsList = new ArrayList<ProjectsSelectDTO>();
	/**
	 * 検索文字
	 */
	private String searchString = "";
	/**
	 * 管理者権限メソッド
	 */
	public Map<String, Object> session;
	/**
	 * エラー文字
	 */
	private String resultSelect = "検索結果を表示しました";


	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 * @author TATUHUMI ITOU
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute(){

		DecisionDetailSelectDAO dao = new DecisionDetailSelectDAO();
		ProjectsSelectDAO projectsDao = new ProjectsSelectDAO();

		/*DecisionDetailDTO dto = new DecisionDetailDTO();
		decisionDetailList1.add(dto);
		decisionDetailList2.add(dto);*/

		LoginDAO loginDao = new LoginDAO();
		int userId = loginDao.getUserId();
	/*	decisionDetailList1 = dao.select1( searchString );*/
		decisionDetailList2 = dao.select2( searchString, userId );

		projectsList = projectsDao.select("");

		if( /*decisionDetailList1.size() == 0 && */decisionDetailList2.size() == 0){
			resultSelect = "該当する情報はありません";
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
	* 取得メソッド プロジェクトリストを取得
	* @author KOHEI NITABARU
	* @return projectsList
	*/
	public List<ProjectsSelectDTO> getProjectsList() {
		return projectsList;
	}

	/**
	* 設定メソッド  プロジェクトリストを設定
	* @author KOHEI NITABARU
	* @param projectsList
	*/
	public void setProjectsList(List<ProjectsSelectDTO> projectsList) {
		this.projectsList = projectsList;
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
	* @return resultSelect
	*/
	public String getResultSelect() {
		return resultSelect;
	}



	/**
	* 設定メソッド
	* @author TATUHUMI ITOU
	* @param resultSelect
	*/
	public void setResultSelect(String resultSelect) {
		this.resultSelect = resultSelect;
	}





}
