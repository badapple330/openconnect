package com.internousdev.openconnect.books.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.books.dao.BooklistDAO;
import com.internousdev.openconnect.books.dto.BooklistDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internous
 *
 */
public class BooklistAction extends ActionSupport {

	private List<BooklistDTO>bookList=new ArrayList<BooklistDTO>();

	private static final long serialVersionUID = -7586577377473680450L;

	public String execute() {
		String result = ERROR;
		BooklistDAO dao = new BooklistDAO();

		bookList = dao.select();
		if (!(bookList == null)) {
			result = SUCCESS;
		}
		return result;
	}

	public List<BooklistDTO> getBooklist() {
		return bookList;
	}

	public void setBooklist(List<BooklistDTO> booklist) {
		bookList = booklist;
	}



}




