/**
 *
 */
package com.internousdev.openconnect.booksBorrow.action;

import com.internousdev.openconnect.booksBorrow.dao.BooksBorrowReturnDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author TATSUYA HOSHI
 *
 */
public class BooksBorrowReturnAction extends ActionSupport {

	private int bookId;

	public String execute(){
		BooksBorrowReturnDAO dao = new BooksBorrowReturnDAO();
		String result = ERROR;
		System.out.println(1);
		int count = 0;
		count = dao.delete(bookId);
		if(count > 0){
			result = SUCCESS;
		}System.out.println(5);
		return result;
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


}
