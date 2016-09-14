/**
 *
 */
package com.internousdev.openconnect.books.borrow.action;

import com.internousdev.openconnect.books.borrow.dao.BooksBorrowInsertDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 画面で新規に追加した情報を、DBに追加する為のクラス
 * @author TATSUYA HOSHI
 */
public class BooksBorrowInsertAction extends ActionSupport{

	private int bookId;
	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -7586577377473680450L;
	/**
	 * DAOに入力されたデータを渡して、結果を返す
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute(){

		String result = ERROR;
		BooksBorrowInsertDAO dao = new BooksBorrowInsertDAO();
		int count = 0;
		count = dao.insert(bookId);
		if (count > 0) {
			result = SUCCESS;
		}
		return result;
	}

	/**
	* ブックID取得メソッド
	* @author KENICHI HORIGUCHI
	* @return bookId
	*/
	public int getBookId() {
		return bookId;
	}

	/**
	* ブックID設定メソッド
	* @author KENICHI HORIGUCHI
	* @param bookId
	*/
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


}
