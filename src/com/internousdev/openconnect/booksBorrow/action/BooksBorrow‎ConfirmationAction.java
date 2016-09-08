/**
 *
 */
package com.internousdev.openconnect.booksBorrow.action;

import com.internousdev.openconnect.booksBorrow.dao.BooksBorrow‎ConfirmationDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 情報を、DBに追加する為のクラス
 * @author TATSUYA HOSHI
 */
public class BooksBorrow‎ConfirmationAction extends ActionSupport{
	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -7584789844350L;
	/**
	 * 借りた日
	 */

	private  String borrow‎Confirmation;

	public String execute(){

		/**
		 * DAOに入力されたデータを渡して、結果を返す
		 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
		 */

		String result = ERROR;
		BooksBorrow‎ConfirmationDAO dao = new BooksBorrow‎ConfirmationDAO();
		int count = 0;
		count = dao.insert(borrow‎Confirmation);
		if (count > 0) {
			result = SUCCESS;
		}
		return result;
	}

	/**
	* 取得メソッド
	* @author TATSUYA HOSHI
	* @return borrowConfirmation
	*/
	public String getBorrow‎Confirmation() {
		return borrow‎Confirmation;
	}

	/**
	* 設定メソッド
	* @author TATSUYA HOSHI
	* @param borrowConfirmation
	*/
	public void setBorrow‎Confirmation(String borrow‎Confirmation) {
		this.borrow‎Confirmation = borrow‎Confirmation;
	}

	/**
	* 取得メソッド
	* @author TATSUYA HOSHI
	* @return serialversionuid
	*/
	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	}


