/**
 *
 */
package com.internousdev.openconnect.books.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.books.dao.BooksDAO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 画面で受け取った更新情報を、DBへ転送する為のクラス
 * @author TATSUYA HOSHI , KOUHEI NITABARU
 */
public class BooksUpdateAction extends ActionSupport {
	/**
	 * 	シリアルID
	 */
	private static final long serialVersionUID = -3541224046836562290L;
	/**
	 * ID 書籍一覧
	 */
	private List<Integer> bookIdList = new ArrayList<Integer>();
	private List<String> titleList = new ArrayList<String>();
	/**
	 * ユーザー情報を更新できたか否か判定するメソッド
	 * @result ERROR ヴァリデーションによるエラーメッセージ
	 * @return result データベースのuser,passwordを更新できたか否か
	 * @throws SQLException
	 */
	public String execute() throws SQLException{

		String result = ERROR;
		BooksDAO dao = new BooksDAO();
		int count = 0 ;

		for(int i=0; i<bookIdList.size(); ++i){
			count = dao.select(titleList.get(i),bookIdList.get(i));}
		if(count > 0){
			result = SUCCESS ;
		}
		return result;
	}

	/**
	 * ブックIDリスト取得メソッド
	 * @author TATSUYA HOSHI
	 * @return bookIdList
	 */
	public List<Integer> getBookIdList() {
		return bookIdList;
	}

	/**
	 * ブックIDリスト設定メソッド
	 * @author TATSUYA HOSHI
	 * @param bookIdList
	 */
	public void setBookIdList(List<Integer> bookIdList) {
		this.bookIdList = bookIdList;
	}

	/**
	 * タイトルリスト取得メソッド
	 * @author TATSUYA HOSHI
	 * @return titleList
	 */
	public List<String> getTitleList() {
		return titleList;
	}

	/**
	 * タイトルリスト設定メソッド
	 * @author TATSUYA HOSHI
	 * @param titleList
	 */
	public void setTitleList(List<String> titleList) {
		this.titleList = titleList;
	}

	/**
	 * シリアルバージョン取得メソッド
	 * @author TATSUYA HOSHI
	 * @return serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
