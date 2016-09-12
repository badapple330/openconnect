/**
 *
 */
package com.internousdev.openconnect.booksBorrow.action;

import com.internousdev.openconnect.booksBorrow.dao.BooksBorrow‎InsertDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * DBの情報を画面に表示する為のクラス
 * @author TATSUYA HOSHI
 */

public class BooksBorrow‎InsertAction extends ActionSupport{

	/**
	 * シリアルバージョンID
	 */

	private static final long serialVersionUID = -7584789844350L;

	/**
	 * 借りた日
	 */

	private  String borrow‎Insert;

	public String execute(){

		/**
		 * DAOに入力されたデータを渡して、結果を返す
		 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
		 */

		String result = ERROR;
		BooksBorrow‎InsertDAO dao = new BooksBorrow‎InsertDAO();
		int count = 0;
		count = dao.insert(borrow‎Insert);
		if (count > 0) {
			result = SUCCESS;
		}
		return result;
	}

	/**
	 * 取得メソッド
	 * @author TATSUYA HOSHI
	 * @return borrowInsert
	 */
	public String getBorrow‎Insert() {
		return borrow‎Insert;
	}

	/**
	 * 設定メソッド
	 * @author TATSUYA HOSHI
	 * @param borrowInsert
	 */
	public void setBorrow‎Insert(String borrow‎Insert) {
		this.borrow‎Insert = borrow‎Insert;
	}

	/**
	 * 取得メソッド
	 * @author TATSUYA HOSHI
	 * @return serialversinuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}



}


