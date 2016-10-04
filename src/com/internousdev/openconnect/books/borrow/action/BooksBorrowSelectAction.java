package com.internousdev.openconnect.books.borrow.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.books.borrow.dao.BooksBorrowSelectDAO;
import com.internousdev.openconnect.books.borrow.dto.BooksBorrowDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 書籍名を、DBのプロジェクト名から検索する為のクラス
 * @author TATSUYA HOSHI
 */

public class BooksBorrowSelectAction extends ActionSupport {
	/**
	 * サーチリスト
	 */
	private List<BooksBorrowDTO>bookList = new ArrayList<BooksBorrowDTO>();
	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -7586577377473680450L;
	/**
	 * DAOに入力されたデータを渡して、結果を返す
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute() {
		String result = ERROR;
		BooksBorrowSelectDAO dao = new BooksBorrowSelectDAO();

		bookList = dao.select();
		if (!(bookList == null)) {
			result = SUCCESS;
		}
		return result;
	}

	/**
	 * 取得メソッド
	 * @author TATSUYA HOSHI
	 * @return bookList
	 */
	public List<BooksBorrowDTO> getBookList() {
		return bookList;
	}

	/**
	 * 設定メソッド
	 * @author TATSUYA HOSHI
	 * @param bookList
	 */
	public void setBookList(List<BooksBorrowDTO> bookList) {
		this.bookList = bookList;
	}

}


