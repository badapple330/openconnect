/**
 *
 */
package com.internousdev.openconnect.books.action;


import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.openconnect.books.borrow.dao.BooksBorrowInsertDAO;
import com.internousdev.openconnect.books.dao.BooksInsertDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 画面で新規に追加した情報を、DBに追加する為のクラス
 * @author TATSUYA HOSHI
 */
public class BooksInsertAction extends ActionSupport implements SessionAware{
	/**
	 * 管理者権限メソッド
	 */
	public Map<String, Object> session;
	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -7586577377473680450L;
	/**
	 * タイトル
	 */
	private String title;
	/**
	 * エラーメッセージ
	 */
	private String resultString;
	/**
	 * DAOに入力されたデータを渡して、結果を返す
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute(){

		String result = ERROR;
		BooksInsertDAO dao = new BooksInsertDAO();
		int count = 0 ;
		count = dao.insert(title);
		if (count > 0) {
			int bookId = dao.select(title);
			if( bookId == 0 ) return result;
			result = SUCCESS;
			BooksBorrowInsertDAO dao1 = new BooksBorrowInsertDAO();
			dao1.insert(bookId);
		}else {
			resultString = "書籍追加できません";
		}
		return result;
	}

	/**
	 * タイトル取得メソッド
	 * @author TATSUYA HOSHI
	 * @return title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * タイトル設定メソッド
	 * @author TATSUYA HOSHI
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * セッション取得メソッド
	 * @author TATSUYA HOSHI
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッション設定メソッド
	 * @author TATSUYA HOSHI
	 * @param session
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	/**
	 * 取得メソッド
	 * @author TATSUYA HOSHI
	 * @return
	 */
	public String getResultString() {
		return resultString;
	}

	/**
	 * 設定メソッド
	 * @author TATSUYA HOSHI
	 * @param
	 */
	public void setResultString(String resultString) {
		this.resultString = resultString;
	}

	/**
	 * 取得メソッド
	 * @author TATSUYA HOSHI
	 * @return
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
