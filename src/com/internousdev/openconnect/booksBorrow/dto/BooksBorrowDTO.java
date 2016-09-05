/**
 *
 */
package com.internousdev.openconnect.books_loan.dto;

/**
 * @author internous
 *
 */
public class BooksLoanDTO {

	private int bookId;
	private String title;
	private String borrowHuman;
	private String borrowDay;

	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBorrowHuman() {
		return borrowHuman;
	}
	public void setBorrowHuman(String borrowHuman) {
		this.borrowHuman = borrowHuman;
	}
	public String getBorrowDay() {
		return borrowDay;
	}
	public void setBorrowDay(String borrowDay) {
		this.borrowDay = borrowDay;
	}




}
