package com.internousdev.openconnect.books.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.books.dao.BooksDAO;
import com.internousdev.openconnect.books.dto.BooksDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internous
 *
 */
public class BooksAction extends ActionSupport {

	private List<BooksDTO>bookList=new ArrayList<BooksDTO>();

	private static final long serialVersionUID = -7586577377473680450L;

	public String execute() {
		String result = ERROR;
		BooksDAO dao = new BooksDAO();

		bookList = dao.select();
		if (!(bookList == null)) {
			result = SUCCESS;
		}
		return result;
	}

	public List<BooksDTO> getBooklist() {
		return bookList;
	}

	public void setBooklist(List<BooksDTO> booklist) {
		bookList = booklist;
	}



}




