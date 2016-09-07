/**
 *
 */
package com.internousdev.openconnect.books.action;


import com.internousdev.openconnect.books.dao.BooksNewDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 画面で新規に追加した情報を、DBに追加する為のクラス
 * @author TATSUYA HOSHI
 */


public class BooksNewAction extends ActionSupport{


	private String title;

	public String execute(){

		/**
		 * DAOに入力されたデータを渡して、結果を返す
		 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
		 */

		String result = ERROR;
		BooksNewDAO dao = new BooksNewDAO();
		int count = 0;
		count = dao.insert(title);
		if (count > 0) {
			result = SUCCESS;
		}
		return result;
	}

	/**
	* 取得メソッド
	* @author TATSUYA HOSHI
	* @return title
	*/
	public String getTitle() {
		return title;
	}

	/**
	* 設定メソッド
	* @author TATSUYA HOSHI
	* @param title
	*/
	public void setTitle(String title) {
		this.title = title;
	}


}
