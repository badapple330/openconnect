/**
 *
 */
package com.internousdev.openconnect.booklist.action;


import com.internousdev.openconnect.booklist.dao.BooklistNewDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internous
 *
 */
public class BooklistNewAction extends ActionSupport{

	private String title;

	public String execute(){

		String result=ERROR;
		BooklistNewDAO dao = new BooklistNewDAO();
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
