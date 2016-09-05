package com.internousdev.openconnect.books_loan.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.books_loan.dao.BooksLoanDAO;
import com.internousdev.openconnect.books_loan.dto.BooksLoanDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internous
 *
 */
public class BooksLoanAction extends ActionSupport {

	private List<BooksLoanDTO>bookList=new ArrayList<BooksLoanDTO>();

	private static final long serialVersionUID = -7586577377473680450L;

	public String execute() {
		String result = ERROR;
		BooksLoanDAO dao = new BooksLoanDAO();

		bookList = dao.select();
		if (!(bookList == null)) {
			result = SUCCESS;
		}
		return result;
	}

	public List<BooksLoanDTO> getBooklist() {
		return bookList;
	}

	public void setBooklist(List<BooksLoanDTO> booklist) {
		bookList = booklist;
	}



}




