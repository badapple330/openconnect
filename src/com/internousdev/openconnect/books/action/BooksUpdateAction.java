/**
 *
 */
package com.internousdev.openconnect.books.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.books.dao.BooksUpdateDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internous
 *
 */
public class BooksUpdateAction extends ActionSupport {

	private static final long serialVersionUID = -3541224046836562290L;

	/**
	 * ID
	 */
	private List<Integer> bookIdList = new ArrayList<Integer>();
	private List<String> titleList = new ArrayList<String>();

	/**
	 * ユーザー情報を更新できたか否か判定するメソッド
	 * @result ERROR ヴァリデーションによるエラーメッセージ
	 * @return result データベースのuser,passwordを更新できたか否か
	 * @throws SQLException
	 */
	public String execute() throws SQLException{


		String result =ERROR;
		BooksUpdateDAO dao = new BooksUpdateDAO();
		int count = 0;

		for(int i=0;i<bookIdList.size();++i){
			count = dao.select(titleList.get(i),bookIdList.get(i));}
		if(count > 0){
			result = SUCCESS;
		}

		return result;
	}

	public List<Integer> getBookIdList() {
		return bookIdList;
	}

	public void setBookIdList(List<Integer> bookIdList) {
		this.bookIdList = bookIdList;
	}

	public List<String> getTitleList() {
		return titleList;
	}

	public void setTitleList(List<String> titleList) {
		this.titleList = titleList;
	}




}
