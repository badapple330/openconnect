/**
 *
 */
package com.internousdev.openconnect.booksBorrow.action;

import com.internousdev.openconnect.booksBorrow.dao.BooksBorrowReturnDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * DBの情報を画面に表示する為のクラス
 * @author TATSUYA HOSHI
 */
public class BooksBorrowReturnAction extends ActionSupport {

	/**
	 * ブックID
	 */

	private int bookId;

	/**
	 * DAOに入力されたデータを渡して、結果を返す
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */

	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -7586577377473680450L;

	public String execute(){
		BooksBorrowReturnDAO dao = new BooksBorrowReturnDAO();
		String result = ERROR;
		System.out.println(bookId);
		int count = 0;
		System.out.println(count);
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


}
