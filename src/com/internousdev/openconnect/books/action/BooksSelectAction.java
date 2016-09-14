/**
 *
 */
package com.internousdev.openconnect.books.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.books.dao.BooksSelectDAO;
import com.internousdev.openconnect.books.dto.BooksDTO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 書籍名を、DBのプロジェクト名から検索する為のクラス
 * @author TATSUYA HOSHI
 */
public class BooksSelectAction extends ActionSupport {
	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -75847044350L;
	/**
	 * サーチ
	 */
	private String search = "";
	/**
	 * リスト
	 */
	private List<BooksDTO> searchList = new ArrayList<BooksDTO>();
	/**
	 * エラーメッセージ
	 */
	private String resultString;
	/**
	 * DAOに入力されたデータを渡して、結果を返す
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute() {
		String result = ERROR;
		BooksSelectDAO dao = new BooksSelectDAO();
		searchList = dao.select(search);
		if (searchList.size() != 0) {
			result = SUCCESS;
		}else {
		resultString = "該当する書籍は存在しません";
		}
		return result;
	}
	/**
	 * 検索取得メソッド
	 * @author TATSUYA HOSHI
	 * @return search
	 */
	public String getSearch() {
		return search;
	}
	/**
	 * 検索設定メソッド
	 * @author TATSUYA HOSHI
	 * @param search
	 */
	public void setSearch(String search) {
		this.search = search;
	}
	/**
	 * 検索リスト取得メソッド
	 * @author TATSUYA HOSHI
	 * @return searchList
	 */
	public List<BooksDTO> getSearchList() {
		return searchList;
	}
	/**
	 * 検索リスト設定メソッド
	 * @author TATSUYA HOSHI
	 * @param searchList
	 */
	public void setSearchList(List<BooksDTO> searchList) {
		this.searchList = searchList;
	}
	/**
	 * シリアルバージョン取得メソッド
	 * @author TATSUYA HOSHI
	 * @return serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	* エラーメッセージ取得メソッド
	* @author TATSUYA HOSHI
	* @return
	*/
	public String getResultString() {
		return resultString;
	}
	/**
	* エラーメッセージ設定メソッド
	* @author TATSUYA HOSHI
	* @param
	*/
	public void setResultString(String resultString) {
		this.resultString = resultString;
	}


}
