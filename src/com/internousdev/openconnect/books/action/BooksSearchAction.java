/**
 *
 */
package com.internousdev.openconnect.books.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.books.dao.BooksSearchDAO;
import com.internousdev.openconnect.books.dto.BooksDTO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 書籍名を、DBのプロジェクト名から検索する為のクラス
 * @author TATSUYA HOSHI
 */
public class BooksSearchAction extends ActionSupport {

	/**
	 * シリアルバージョンID
	 */

	private static final long serialVersionUID = -75847044350L;

	/**
	 * サーチ
	 */

	private String search;

	/**
	 * エラーメッセージ
	 */

	private List<BooksDTO> searchList = new ArrayList<BooksDTO>();
	private String errorMsg;

	/**
	 * DAOに入力されたデータを渡して、結果を返す
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
	/**
	 * 取得メソッド
	 * @author TATSUYA HOSHI
	 * @return search
	 */
	public String getSearch() {
		return search;
	}
	/**
	 * 設定メソッド
	 * @author TATSUYA HOSHI
	 * @param search
	 */
	public void setSearch(String search) {
		this.search = search;
	}
	/**
	 * 取得メソッド
	 * @author TATSUYA HOSHI
	 * @return searchList
	 */
	public List<BooksDTO> getSearchList() {
		return searchList;
	}
	/**
	 * 設定メソッド
	 * @author TATSUYA HOSHI
	 * @param searchList
	 */
	public void setSearchList(List<BooksDTO> searchList) {
		this.searchList = searchList;
	}
	/**
	 * 取得メソッド
	 * @author TATSUYA HOSHI
	 * @return errorMsg
	 */
	public String getErrorMsg() {
		return errorMsg;
	}
	/**
	 * 設定メソッド
	 * @author TATSUYA HOSHI
	 * @param errorMsg
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	/**
	 * 取得メソッド
	 * @author TATSUYA HOSHI
	 * @return serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
