package com.internousdev.openconnect.books.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.openconnect.books.dao.BooksDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 画面で受け取ったIDを元にして、DBの情報のID,タイトル、削除を削除する為のクラス
 * @author TATSUYA HOSHI, SOSHI AZUMA
 */
public class BooksDeleteAction extends ActionSupport implements SessionAware{
	/**
	 * 管理者権限メソッド
	 */
	public Map<String, Object> session;
	/**
	 * ブックID
	 */
	private int bookId;

	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -7586577377473680450L;
	/**
	 * エラーメッセージ
	 */
	private String resultString = "削除に失敗しました！";
	/**
	 * DAOに命令し、結果を返す
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute(){
		BooksDAO dao = new BooksDAO();
		String result = ERROR;
		int count = 0;
		count = dao.delete(bookId);
		if(count > 0){
			result = SUCCESS;
			resultString = "削除に成功しました！";
		}
		return result;
	}

	/**
	* エラーメッセージ取得メソッド
	* @return resultString
	*/
	public String getResultString() {
		return resultString;
	}

	/**
	* エラーメッセージ設定メソッド
	* @param resultString
	*/
	public void setResultString(String resultString) {
		this.resultString = resultString;
	}

	/**
	* シリアルバージョン取得メソッド
	* @return serialversion
	*/
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * ブックID取得メソッド
	 * @return bookId
	 */
	public int getBookId() {
		return bookId;
	}

	/**
	 * ブックID設定メソッド
	 * @param bookId
	 */
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	/**
	 * セッション取得メソッド
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}


	/**
	 * セッション設定メソッド
	 * @param session
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}



}
