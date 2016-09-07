/**
 *
 */
package com.internousdev.openconnect.books.dto;

/**
 * @author internous
 *
 */
public class BooksSearchDTO {

	private int bookId;
	private String title;
	/**
	* 取得メソッド
	* @author Tatsuya Hoshi
	* @return bookId
	*/
	public int getBookId() {
		return bookId;
	}
	/**
	* 設定メソッド
	* @author Tatsuya Hoshi
	* @param bookId
	*/
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	/**
	* 取得メソッド
	* @author Tatsuya Hoshi
	* @return title
	*/
	public String getTitle() {
		return title;
	}
	/**
	* 設定メソッド
	* @author Tatsuya Hoshi
	* @param title
	*/
	public void setTitle(String title) {
		this.title = title;
	}



}
