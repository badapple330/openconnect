package com.internousdev.openconnect.booklist.action;

import com.internousdev.openconnect.booklist.dao.BooklistDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;


public class BooklistDelete extends ActionSupport{

	private int bookId;

	public String execute(){
		BooklistDeleteDAO dao = new BooklistDeleteDAO();
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
