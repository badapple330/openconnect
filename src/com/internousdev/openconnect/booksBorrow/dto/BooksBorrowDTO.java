/**
 *
 */
package com.internousdev.openconnect.booksBorrow.dto;

/**
 * @author internous
 *
 */
public class BooksBorrowDTO {

	private int bookId;
	private String borrowStatus;
	private String borrowHuman;
	private String borrowDay;
	/**
	* 取得メソッド
	* @author
	* @return
	*/
	public int getBookId() {
		return bookId;
	}
	/**
	* 設定メソッド
	* @author
	* @param
	*/
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	/**
	* 取得メソッド
	* @author
	* @return
	*/
	public String getBorrowStatus() {
		return borrowStatus;
	}
	/**
	* 設定メソッド
	* @author
	* @param
	*/
	public void setBorrowStatus(String borrowStatus) {
		this.borrowStatus = borrowStatus;
	}
	/**
	* 取得メソッド
	* @author
	* @return
	*/
	public String getBorrowHuman() {
		return borrowHuman;
	}
	/**
	* 設定メソッド
	* @author
	* @param
	*/
	public void setBorrowHuman(String borrowHuman) {
		this.borrowHuman = borrowHuman;
	}
	/**
	* 取得メソッド
	* @author
	* @return
	*/
	public String getBorrowDay() {
		return borrowDay;
	}
	/**
	* 設定メソッド
	* @author
	* @param
	*/
	public void setBorrowDay(String borrowDay) {
		this.borrowDay = borrowDay;
	}




}
