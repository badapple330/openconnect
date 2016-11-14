/**
 *
 */
package com.internousdev.openconnect.books.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.books.dao.BooksDAO;
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
	 * サーチリスト
	 */
	private List<BooksDTO> searchList = new ArrayList<BooksDTO>();
	/**
	 * エラーメッセージ
	 */
	private String resultSelect;
	/**
	 * DAOに入力されたデータを渡して、結果を返す
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute() {
		String result = ERROR;
		BooksDAO dao = new BooksDAO();
//		searchList = dao.select(search);
		searchList = dao.select();
		if (searchList.size() != 0) {
			result = SUCCESS;
			resultSelect = "検索結果を表示しました。";
		}else {
			resultSelect = "該当する書籍は存在しません";
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
	 * @return resultSelect
	 */
	public String getResultSelect() {
		return resultSelect;
	}
	/**
	 * エラーメッセージ設定メソッド
	 * @author TATSUYA HOSHI
	 * @param resultSelect
	 */
	public void setResultSelect(String resultSelect) {
		this.resultSelect = resultSelect;
	}


}
