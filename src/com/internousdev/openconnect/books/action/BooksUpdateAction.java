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
 * 画面で受け取った更新情報を、DBへ転送する為のクラス
 * @author Tatsuya Hoshi
 */
public class BooksUpdateAction extends ActionSupport {
	/**
	 * 	シリアルID
	 */
	private static final long serialVersionUID = -3541224046836562290L;

	/**
	 * ID 書籍一覧
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

	/**
	* 取得メソッド
	* @author Tatsuya Hoshi
	* @return
	*/
	public List<Integer> getBookIdList() {
		return bookIdList;
	}

	/**
	* 設定メソッド
	* @author Tatsuya Hoshi
	* @param
	*/
	public void setBookIdList(List<Integer> bookIdList) {
		this.bookIdList = bookIdList;
	}

	/**
	* 取得メソッド
	* @author Tatsuya Hoshi
	* @return
	*/
	public List<String> getTitleList() {
		return titleList;
	}

	/**
	* 設定メソッド
	* @author Tatsuya Hoshi
	* @param
	*/
	public void setTitleList(List<String> titleList) {
		this.titleList = titleList;
	}

	/**
	* 取得メソッド
	* @author Tatsuya Hoshi
	* @return
	*/
	public static long getSerialversionuid() {
		return serialVersionUID;
	}




}
