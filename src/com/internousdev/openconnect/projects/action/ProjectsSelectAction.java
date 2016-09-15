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
public class ProjectsSelectAction extends ActionSupport{
	/**
	 * シリアルＩＤ
	 */
	private static final long serialVersionUID = -4601966790767506826L;

	/**
	 * 検索ワード
	 */
	private String search = "";

	/**
	 * 検索結果文字
	 */
	private String resultString = "該当する情報は存在しません";

	private List<ProjectsSearchDTO > projectList = new ArrayList<ProjectsSearchDTO>();

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
			resultString = "";

		}
		return result;
	}
	/**
	 * 取得メソッド 検索ワードを取得
	 * @author YUICHI KIRIU
	 * @return search
	 */
	public String getSearch() {
		return search;
	}
	/**
	 * 設定メソッド 検索ワードを設定
	 * @author YUICHI KIRIU
	 * @param search
	 */
	public void setSearch(String search) {
		this.search = search;
	}

	/**
	 * 取得メソッド プロジェクトリストを取得
	 * @author YUICHI KIRIU
	 * @return projectList
	 */
	public List<ProjectsSearchDTO> getProjectList() {
		return projectList;
	}

	/**
	 * 設定メソッド プロジェクトリストを設定
	 * @author YUICHI KIRIU
	 * @param projectList
	 */
	public void setProjectList(List<ProjectsSearchDTO> projectList) {
		this.projectList = projectList;
	}

	/**
	 * 取得メソッド エラーメッセージを取得
	 * @author YUICHI KIRIU
	 * @return resultString
	 */
	public String getErrorMsg() {
		return resultString;
	}
	/**
	 * 設定メソッド エラーメッセージを設定
	 * @author YUICHI KIRIU
	 * @param resultString
	 */
	public void setErrorMsg(String resultString) {
		this.resultString = resultString;
	}


}

