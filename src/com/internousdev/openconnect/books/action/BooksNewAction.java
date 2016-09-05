/**
 *
 */
package com.internousdev.openconnect.books.action;


import com.internousdev.openconnect.books.dao.BooksNewDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internous
 *
 */
public class BooksNewAction extends ActionSupport{

	private String title;

	public String execute(){

		String result=ERROR;
		BooksNewDAO dao = new BooksNewDAO();
		int count = 0;
		count = dao.insert(title);
		if (count > 0) {
			result = SUCCESS;
		}
		return result;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}



}
