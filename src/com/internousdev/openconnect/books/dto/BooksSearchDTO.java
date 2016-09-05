/**
 *
 */
package com.internousdev.openconnect.books.dto;

import java.util.List;

/**
 * @author internous
 *
 */
public class BooksSearchDTO {

	private int bookId;
	private String title;
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
	public List<BooksSearchDTO> select(String search) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}





}
