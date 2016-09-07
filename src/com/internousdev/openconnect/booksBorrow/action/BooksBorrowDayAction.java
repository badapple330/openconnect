/**
 * 
 */
package com.internousdev.openconnect.booksBorrow.action;

import com.internousdev.openconnect.books.dao.BooksNewDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 情報を、DBに追加する為のクラス
 * @author TATSUYA HOSHI
 */
public class BooksBorrowDayAction extends ActionSupport{

	private  String borrowDay;

	public String execute(){

		/**
		 * DAOに入力されたデータを渡して、結果を返す
		 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
		 */

		String result = ERROR;
		BooksNewDAO dao = new BooksNewDAO();
		int count = 0;
		count = dao.insert(borrowDay);
		if (count > 0) {
			result = SUCCESS;
		}
		return result;
	}

	/**
	* 取得メソッド 
	* @author KENICHI HORIGUCHI
	* @return 
	*/
	public String getBorrowDay() {
		return borrowDay;
	}

	/**
	* 設定メソッド 
	* @author KENICHI HORIGUCHI
	* @param 
	*/
	public void setBorrowDay(String borrowDay) {
		this.borrowDay = borrowDay;
	}

	}


