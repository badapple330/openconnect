package com.internousdev.openconnect.books.action;

import com.internousdev.openconnect.books.dao.BooksDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 画面で受け取ったIDを元にして、DBの情報を削除する為のクラス
 * @author Tatsuya Hoshi
 */

public class BooksDeleteAction extends ActionSupport{
	/**
	 * ブックID
	 */
	private int bookId;

	/**
	 * DAOにデータを渡して、結果を返す
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */

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
	* @author Tatsuya Hoshi
	* @return
	*/
	public int getBookId() {
		return bookId;
	}

	/**
	* 設定メソッド
	* @author Tatsuya Hoshi
	* @param
	*/
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	}


