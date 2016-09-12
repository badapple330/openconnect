package com.internousdev.openconnect.projects.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.projects.dao.ProjectsSerachDAO;
import com.internousdev.openconnect.projects.dto.ProjectsSearchDTO;
import com.opensymphony.xwork2.ActionSupport;


/**
 * 検索したＤＢ情報を画面に表示する為のクラス
 * @author YUICHI KIRIU
 * @since 2016/09/7
 *
 */
public class ProjectsSearchAction extends ActionSupport{
	/**
	 * シリアルＩＤ
	 */
	private static final long serialVersionUID = -4601966790767506826L;

	/**
	 * 検索ワード
	 */
	private String search;

	private List<ProjectsSearchDTO > projectList = new ArrayList<ProjectsSearchDTO>();
	private String errorMsg;
	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 *
	 * @author YUICHI KIRIU
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute() {
		String result = ERROR;
		ProjectsSerachDAO dao = new ProjectsSerachDAO();
		projectList = dao.select(search);
		if (projectList.size() != 0) {
			result = SUCCESS;
		} else {
			errorMsg = "該当する情報は存在しません";
		}
		return result;
	}
	/**
	 * 取得メソッド
	 * @author YUICHI KIRIU
	 * @return search
	 */
	public String getSearch() {
		return search;
	}
	/**
	 * 設定メソッド
	 * @author YUICHI KIRIU
	 * @param search
	 */
	public void setSearch(String search) {
		this.search = search;
	}

	/**
	 * 取得メソッド
	 * @author YUICHI KIRIU
	 * @return projectList
	 */
	public List<ProjectsSearchDTO> getProjectList() {
		return projectList;
	}
	/**
	 * 設定メソッド
	 * @author YUICHI KIRIU
	 * @param projectList
	 */
	public void setProjectList(List<ProjectsSearchDTO> projectList) {
		this.projectList = projectList;
	}
	/**
	 * 取得メソッド
	 * @author YUICHI KIRIU
	 * @return errorMsg
	 */
	public String getErrorMsg() {
		return errorMsg;
	}
	/**
	 * 設定メソッド
	 * @author YUICHI KIRIU
	 * @param errorMsg
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}


}

