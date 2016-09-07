package com.internousdev.openconnect.booksBorrow.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.booksBorrow.dao.BooksBorrowDAO;
import com.internousdev.openconnect.booksBorrow.dto.BooksBorrowDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * DBの情報を画面に表示する為のクラス
 * @author TATSUYA HOSHI
 */
public class BooksBorrowAction extends ActionSupport {

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
		BooksBorrowDAO dao = new BooksBorrowDAO();

		bookList = dao.select();
		if (!(bookList == null)) {
			result = SUCCESS;
		}
		return result;
	}

	public List<BooksBorrowDTO> getBooklist() {
		return bookList;
	}

	public void setBooklist(List<BooksBorrowDTO> booklist) {
		bookList = booklist;
	}



}




