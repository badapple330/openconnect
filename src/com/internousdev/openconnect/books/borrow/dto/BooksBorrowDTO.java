/**
 *
 */
package com.internousdev.openconnect.books.borrow.dto;

/**
 * 書籍貸し出し情報を格納するためのクラス
 * @author TATSUYA HOSHI
 */
public class BooksBorrowDTO {

	private int bookId;
	private String borrowStatus;
	private String borrowDay;
	private int borrowId;
	private String title;
	/**
	 * 取得メソッド
	 * @author TATSUYA HOSHI
	 * @return bookId
	 */
	public int getBookId() {
		return bookId;
	}
	/**
	 * 設定メソッド
	 * @author TATSUYA HOSHI
	 * @param bookId
	 */
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	/**
	 * 取得メソッド
	 * @author TATSUYA HOSHI
	 * @return borrowStatus
	 */
	public String getBorrowStatus() {
		return borrowStatus;
	}
	/**
	 * 設定メソッド
	 * @author TATSUYA HOSHI
	 * @param borrowStatus
	 */
	public void setBorrowStatus(String borrowStatus) {
		this.borrowStatus = borrowStatus;
	}
	/**
	 * 取得メソッド
	 * @author TATSUYA HOSHI
	 * @return borrowDay
	 */
	public String getBorrowDay() {
		return borrowDay;
	}
	/**
	 * 設定メソッド
	 * @author TATSUYA HOSHI
	 * @param borrowDay
	 */
	public void setBorrowDay(String borrowDay) {
		this.borrowDay = borrowDay;
	}
	/**
	 * 取得メソッド
	 * @author TATSUYA HOSHI
	 * @return borrowId
	 */
	public int getBorrowId() {
		return borrowId;
	}
	/**
	 * 設定メソッド
	 * @author TATSUYA HOSHI
	 * @param borrowId
	 */
	public void setBorrowId(int borrowId) {
		this.borrowId = borrowId;
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
