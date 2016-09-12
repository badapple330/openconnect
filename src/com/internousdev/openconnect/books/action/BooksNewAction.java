/**
 *
 */
package com.internousdev.openconnect.books.action;


import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.openconnect.books.dao.BooksNewDAO;
import com.internousdev.openconnect.booksBorrow.dao.BooksBorrowNewDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 画面で新規に追加した情報を、DBに追加する為のクラス
 * @author TATSUYA HOSHI
 */


public class BooksNewAction extends ActionSupport implements SessionAware{


	/**
	 * 管理者権限メソッド
	 */

	public Map<String, Object> session;


	/**
	 * タイトル
	 */

	private String title;

	/**
	 * DAOに入力されたデータを渡して、結果を返す
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */

	public String execute(){

		String result = ERROR;
		BooksNewDAO dao = new BooksNewDAO();
		int count = 0;
		count = dao.insert(title);

		if (count > 0) {

			int bookId = dao.select(title);

			if( bookId == 0 ) return result;

			result = SUCCESS;
			BooksBorrowNewDAO dao1 = new BooksBorrowNewDAO();
			dao1.insert(bookId);
		}
		return result;
	}

	/**
	 * 取得メソッド
	 * @author TATSUYA HOSHI
	 * @return title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 設定メソッド
	 * @author TATSUYA HOSHI
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
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
