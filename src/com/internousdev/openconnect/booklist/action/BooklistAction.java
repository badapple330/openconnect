package com.internousdev.openconnect.booklist.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.booklist.dao.BooklistDAO;
import com.internousdev.openconnect.booklist.dto.BooklistDTO;
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




