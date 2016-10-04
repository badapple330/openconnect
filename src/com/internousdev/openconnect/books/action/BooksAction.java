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
 * DBの書籍情報、ID、タイトル一覧、削除を書籍画面に表示する為のクラス
 * @author TATSUYA HOSHI
 */
public class BooksAction extends ActionSupport{
	/**
	 * ブックリスト
	 */
	private List<BooksDTO> bookList = new ArrayList<BooksDTO>();
	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -7586577377473680450L;
	/**
	 * DAOに入力されたデータを受け取り、結果を渡す
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute() {
		String result = ERROR;
		BooksDAO dao = new BooksDAO();

		bookList = dao.select();
		if (!(bookList == null)) {
			result = SUCCESS;
		}
		return result;
	}
	/**
	 * 取得メソッド ブックリスト
	 * @author TATSUYA HOSHI
	 * @return bookList
	 */
	public List<BooksDTO> getBookList() {
		return bookList;
	}
	/**
	 *設定メソッド ブックリスト
	 * @author TATSUYA HOSHI
	 * @param bookList
	 */
	public void setBookList(List<BooksDTO> bookList) {
		this.bookList = bookList;
	}
	/**
	 * 取得メソッド シリアルバージョン
	 * @author TATSUYA HOSHI
	 * @return serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}




}
