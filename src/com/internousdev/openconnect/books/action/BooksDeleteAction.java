package com.internousdev.openconnect.books.action;

import com.internousdev.openconnect.books.dao.BooksDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;


public class BooksDeleteAction extends ActionSupport{

	private int bookId;

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

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}





}
