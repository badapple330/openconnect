/**
 *
 */
package com.internousdev.openconnect.books.dto;

/**
 * 書籍に関するDTOクラス
 * @author SOSHI AZUMA
 * @since 2017/06/01
 * @version 1.0
 */
public class BooksDTO {

	/**
	 * ブックID
	 */
	private int bookId;

	/**
	 * タイトル
	 */
	private String title;

	/**
	 * サブタイトル
	 */
	private String subTitle;

	/**
	 * 著者
	 */
	private String author;

	/**
	 * 出版社
	 */
	private String publisher;

	/**
	 * 出版日
	 */
	private String pubDay;

	/**
	 * イニシャル
	 */
	private String initial;

	/**
	 * 状態フラグ
	 */
	private int statusFlg;

	/**
	 * カレッジ登録日
	 */
	private String regDay;

	/**
	 * 更新日
	 */
	private String updDay;

	/**
	* を取得するメソッド
	* @return bookId
	*/
	public int getBookId() {
		return bookId;
	}

	/**
	* を格納するメソッド
	* @param bookId セットする bookId
	*/
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	/**
	* を取得するメソッド
	* @return title
	*/
	public String getTitle() {
		return title;
	}

	/**
	* を格納するメソッド
	* @param title セットする title
	*/
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	* を取得するメソッド
	* @return subTitle
	*/
	public String getSubTitle() {
		return subTitle;
	}

	/**
	* を格納するメソッド
	* @param subTitle セットする subTitle
	*/
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	/**
	* を取得するメソッド
	* @return author
	*/
	public String getAuthor() {
		return author;
	}

	/**
	* を格納するメソッド
	* @param author セットする author
	*/
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	* を取得するメソッド
	* @return publisher
	*/
	public String getPublisher() {
		return publisher;
	}

	/**
	* を格納するメソッド
	* @param publisher セットする publisher
	*/
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	/**
	* を取得するメソッド
	* @return pubDay
	*/
	public String getPubDay() {
		return pubDay;
	}

	/**
	* を格納するメソッド
	* @param pubDay セットする pubDay
	*/
	public void setPubDay(String pubDay) {
		this.pubDay = pubDay;
	}

	/**
	* を取得するメソッド
	* @return initial
	*/
	public String getInitial() {
		return initial;
	}

	/**
	* を格納するメソッド
	* @param initial セットする initial
	*/
	public void setInitial(String initial) {
		this.initial = initial;
	}

	/**
	* を取得するメソッド
	* @return statusFlg
	*/
	public int getStatusFlg() {
		return statusFlg;
	}

	/**
	* を格納するメソッド
	* @param statusFlg セットする statusFlg
	*/
	public void setStatusFlg(int statusFlg) {
		this.statusFlg = statusFlg;
	}

	/**
	* を取得するメソッド
	* @return regDay
	*/
	public String getRegDay() {
		return regDay;
	}

	/**
	* を格納するメソッド
	* @param regDay セットする regDay
	*/
	public void setRegDay(String regDay) {
		this.regDay = regDay;
	}

	/**
	* を取得するメソッド
	* @return updDay
	*/
	public String getUpdDay() {
		return updDay;
	}

	/**
	* を格納するメソッド
	* @param updDay セットする updDay
	*/
	public void setUpdDay(String updDay) {
		this.updDay = updDay;
	}





}
