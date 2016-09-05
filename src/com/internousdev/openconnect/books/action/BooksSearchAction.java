/**
 *
 */
package com.internousdev.openconnect.books.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.books.dao.BooksSearchDAO;
import com.internousdev.openconnect.books.dto.BooksSearchDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internous
 *
 */
public class BooksSearchAction extends ActionSupport {


	private static final long serialVersionUID = -75847044350L;

	private String search;

	/**
	 * エラーメッセージ
	 */
	private List<BooksSearchDTO> searchList = new ArrayList<BooksSearchDTO>();
	private String errorMsg;
	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute() {
		String result = ERROR;
		BooksSearchDAO dao = new BooksSearchDAO();
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

	public List<BooksSearchDTO> getSearchList() {
		return searchList;
	}

	public void setSearchList(List<BooksSearchDTO> searchList) {
		this.searchList = searchList;
	}


}
