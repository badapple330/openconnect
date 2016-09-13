/**
 *
 */
package com.internousdev.openconnect.books.borrow.action;

import com.internousdev.openconnect.books.borrow.dao.BooksBorrow‎UpdateDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * DBの情報を画面に表示する為のクラス
 * @author TATSUYA HOSHI
 */
public class BooksBorrowUpdateAction extends ActionSupport{

	/**
	 * シリアルバージョンID
	 */

	private static final long serialVersionUID = -7584789844350L;

	/**
	 * ブックID
	 * ユーザーID
	 */

	private int bookId;
	private int borrowId;
	private String errorMsg;

	/**
	 * DAOに入力されたデータを渡して、結果を返す
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */

	public String execute(){

		String result = ERROR;
		BooksBorrow‎UpdateDAO dao = new BooksBorrow‎UpdateDAO();
		int count = 0;
		count = dao.update(bookId,borrowId);
		if (count > 0) {
			result = SUCCESS;
		}else {
			errorMsg = "該当する情報は存在しません";
		}
		return result;
	}

	/**
	 * 取得メソッド
	 * @author TATSUYA HOSHI
	 * @return serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * 取得メソッド
	 * @author TATSUYA HOSHI
	 * @return
	 */
	public int getBookId() {
		return bookId;
	}

	/**
	 * 設定メソッド
	 * @author TATSUYA HOSHI
	 * @param
	 */
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	/**
	 * 取得メソッド
	 * @author TATSUYA HOSHI
	 * @return
	 */
	public int getBorrowId() {
		return borrowId;
	}

	/**
	 * 設定メソッド
	 * @author TATSUYA HOSHI
	 * @param
	 */
	public void setBorrowId(int borrowId) {
		this.borrowId = borrowId;
	}

	/**
	* 取得メソッド
	* @author TATSUYA HOSHI
	* @return
	*/
	public String getErrorMsg() {
		return errorMsg;
	}

	/**
	* 設定メソッド
	* @author TATSUYA HOSHI
	* @param
	*/
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

}
