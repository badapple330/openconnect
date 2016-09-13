package com.internousdev.openconnect.books.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.openconnect.books.dao.BooksDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 画面で受け取ったIDを元にして、DBの情報を削除する為のクラス
 * @author TATSUYA HOSHI
 */

public class BooksDeleteAction extends ActionSupport implements SessionAware{

	/**
	 * 管理者権限メソッド
	 */

	public Map<String, Object> session;

	/**
	 * ブックID
	 */
	private int bookId;

	/**
	 * DAOにデータを渡して、結果を返す
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */

	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -7586577377473680450L;

	public String execute(){
		BooksDeleteDAO dao = new BooksDeleteDAO();
		String result = ERROR;
		int count = 0;
		count = dao.delete(bookId);
		if(count > 0){
			result = SUCCESS;
		}
		return result;
	}

	/**
	 * 取得メソッド
	 * @author TATSUYA HOSHI
	 * @return bookId
	 */
	public int getBookId() {
		return bookId;
	}

	/**
	 * 設定メソッド
	 * @author TATSUYA HOSHI
	 * @param bookId
	 */
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	/**
	 * 取得メソッド
	 * @author TATSUYA HOSHI
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}


	/**
	 * 設定メソッド
	 * @author TATSUYA HOSHI
	 * @param session
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}



}


