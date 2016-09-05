package com.internousdev.openconnect.booksBorrow.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.booksBorrow.dao.BooksBorrowDAO;
import com.internousdev.openconnect.booksBorrow.dto.BooksBorrowDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internous
 *
 */
public class BooksBorrowAction extends ActionSupport {

	private List<BooksBorrowDTO>bookList=new ArrayList<BooksBorrowDTO>();

	private static final long serialVersionUID = -7586577377473680450L;

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




