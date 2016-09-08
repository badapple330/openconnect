/**
 *
 */
package com.internousdev.openconnect.booksBorrow.action;

import com.internousdev.openconnect.booksBorrow.dao.BooksBorrowModalDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 情報を、DBに追加する為のクラス
 * @author TATSUYA HOSHI
 */
public class BooksBorrowModalAction extends ActionSupport{
	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -7584789844350L;
	/**
	 * 借りた日
	 */

	private  String borrowModal;

	public String execute(){

		/**
		 * DAOに入力されたデータを渡して、結果を返す
		 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
		 */

		String result = ERROR;
		BooksBorrowModalDAO dao = new BooksBorrowModalDAO();
		int count = 0;
		count = dao.insert(borrowModal);
		if (count > 0) {
			result = SUCCESS;
		}
		return result;
	}

	/**
	* 取得メソッド
	* @author TATSUYA HOSHI
	* @return
	*/
	public String getBorrowModal() {
		return borrowModal;
	}

	/**
	* 設定メソッド
	* @author TATSUYA HOSHI
	* @param
	*/
	public void setBorrowModal(String borrowModal) {
		this.borrowModal = borrowModal;
	}

	/**
	* 取得メソッド
	* @author TATSUYA HOSHI
	* @return
	*/
	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	}


