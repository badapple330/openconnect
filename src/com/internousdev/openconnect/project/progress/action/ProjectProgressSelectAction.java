package com.internousdev.openconnect.project.progress.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.project.progress.dao.ProjectProgressSelectDAO;
import com.internousdev.openconnect.project.progress.dto.ProjectProgressDTO;
import com.internousdev.openconnect.projects.dao.ProjectsSerachDAO;
import com.internousdev.openconnect.projects.dto.ProjectsSearchDTO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 画面で受け取った内容に似た物を、DBのプロジェクト名から検索する為のクラス
 * @author TATUHUMI ITOU
 * @since 2016/09/04
 * @version 1.0
 */
public class ProjectProgressSelectAction extends ActionSupport {
	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -75847044350L;
	/**
	 * 検索キーワード
	 */
	private String search="";
	/**
	 * 検索キーワードリスト
	 */
	private List<ProjectProgressDTO> searchList = new ArrayList<ProjectProgressDTO>();
	/**
	 * プロジェクトリスト
	 */
	private List<ProjectsSearchDTO> projectsList = new ArrayList<ProjectsSearchDTO>();
	/**
	 * エラーメッセージ
	 */
	private String errorMsg;
	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 *
	 * @author TATUHUMI ITOU
	 * @param search
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute() {
		String result = ERROR;
		ProjectProgressSelectDAO dao = new ProjectProgressSelectDAO();
		ProjectsSerachDAO projectsDao = new ProjectsSerachDAO();
		searchList = dao.select(search);
		projectsList = projectsDao.select("");
		if (searchList.size() != 0) {
			result = SUCCESS;
		} else {
			errorMsg = "該当する情報は存在しません";
		}
		return result;
	}

	/**
	 *  取得メソッド searchを取得する
	 * @author TATUHUMI ITOU
	 * @return search
	 */
	public String getSearch() {
		return search;
	}
	/**
	 *   格納メソッド searchを格納する
	 * @author TATUHUMI ITOU
	 * @param search セットする　search
	 */
	public void setSearch(String search) {
		this.search = search;
	}
	/**
	 *  取得メソッド エラーメッセージを取得する
	 * @author TATUHUMI ITOU
	 * @return errorMsg
	 */
	public String getErrorMsg() {
		return errorMsg;
	}
	/**
	 *   格納メソッド エラーメッセージを格納する
	 * @author TATUHUMI ITOU
	 * @param errorMsg　セットする　errorMsg
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	/**
	 *  取得メソッド 検索リストを取得する
	 * @author TATUHUMI ITOU
	 * @return searchList
	 */
	public List<ProjectProgressDTO> getSearchList() {
		return searchList;
	}
	/**
	 *   格納メソッド IDリストを格納する
	 * @author TATUHUMI ITOU
	 * @param searchList セットする searchList
	 */
	public void setSearchList(List<ProjectProgressDTO> searchList) {
		this.searchList = searchList;
	}
	/**
	 *   取得メソッド プロジェクトリストを取得する
	 * @author MASAHIRO KEDSUKA
	 * @param projectsList セットする projectsList
	 */
	public List<ProjectsSearchDTO> getProjectsList() {
		return projectsList;
	}
	/**
	 *   格納メソッド プロジェクトリストを格納する
	 * @author MASAHIRO KEDSUKA
	 * @param projectsList セットする projectsList
	 */
	public void setProjectsList(List<ProjectsSearchDTO> projectsList) {
		this.projectsList = projectsList;
	}



}