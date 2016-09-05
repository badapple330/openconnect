package com.internousdev.openconnect.projectProgress.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.projectProgress.dao.ProjectProgressSearchDAO;
import com.internousdev.openconnect.projectProgress.dto.ProjectProgressDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 入力されたユーザーIDをDAOに渡してレビュー情報を操作するためのクラス
 *
 * @author YUKI MAEDA
 * @since 2016/08/11
 */
public class ProjectProgressSearchAction extends ActionSupport {
	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -75847044350L;
	/**
	 * データベースに格納されていセレクトリスト
	 *
	/**
	 * ユーザーID
	 */
	private String search;
	/**
	 * エラーメッセージ
	 */
	private List<ProjectProgressDTO> searchList = new ArrayList<ProjectProgressDTO>();
	private String errorMsg;
	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 *
	 * @author YUKI MAEDA
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute() {
		String result = ERROR;
		ProjectProgressSearchDAO dao = new ProjectProgressSearchDAO();
		searchList = dao.select(search);
		if (searchList.size() != 0) {
			result = SUCCESS;
		} else {
			errorMsg = "該当する情報は存在しません";
		}
		return result;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public List<ProjectProgressDTO> getSearchList() {
		return searchList;
	}

	public void setSearchList(List<ProjectProgressDTO> searchList) {
		this.searchList = searchList;
	}

	/**
	 * 取得メソッド セレクトリストを取得 * @author YUKI MAEDA
	 *
	 * @param selectList
	 */


}