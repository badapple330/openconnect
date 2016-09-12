/**
 *
 */
package com.internousdev.openconnect.booksBorrow.action;

import com.internousdev.openconnect.booksBorrow.dao.BooksBorrowNewDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * DBの情報を画面に表示する為のクラス
 * @author TATSUYA HOSHI
 */

public class BooksBorrowNewAction extends ActionSupport{

	private int bookId;

	/**
	 * DAOに入力されたデータを渡して、結果を返す
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */

	public String execute(){

		String result = ERROR;
		BooksBorrowNewDAO dao = new BooksBorrowNewDAO();
		int count = 0;
		count = dao.insert(bookId);
		if (count > 0) {
			result = SUCCESS;
		}
		return result;
	}

	/**
	* 取得メソッド
	* @author KENICHI HORIGUCHI
	* @return bookId
	*/
	public int getBookId() {
		return bookId;
	}

	/**
	* 設定メソッド
	* @author KENICHI HORIGUCHI
	* @param bookId
	*/
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


}
