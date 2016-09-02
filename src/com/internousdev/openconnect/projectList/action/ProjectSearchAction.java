package com.internousdev.openconnect.projectList.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.projectList.dao.ProjectSerachDAO;
import com.internousdev.openconnect.projectList.dto.ProjectSearchDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ProjectSearchAction extends ActionSupport{

	//エラーメッセージ

		private String search;
		/**
		 * エラーメッセージ
		 */
		private List<ProjectSearchDTO > searchList = new ArrayList<ProjectSearchDTO>();
		private String errorMsg;
		/**
		 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
		 *
		 * @author YUKI MAEDA
		 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
		 */
		public String execute() {
			String result = ERROR;
			ProjectSerachDAO dao = new ProjectSerachDAO();
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

		public List<ProjectSearchDTO> getSearchList() {
			return searchList;
		}

		public void setSearchList(List<ProjectSearchDTO> searchList) {
			this.searchList = searchList;
		}
}
