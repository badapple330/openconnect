/*
 * タイトル：購入履歴、登録内容を取得し、マイページに遷移する為の処理
 * 説明    ：購入履歴、登録内容を取得し、Withdrawal.jspへ遷移する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.action;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kinnosawa.dao.MyPageDAO;
import com.internousdev.kinnosawa.dao.MyPageRegistrationInformationDAO;
import com.internousdev.kinnosawa.dto.MyPageGoodsDTO;
import com.internousdev.kinnosawa.dto.MyPageOrderHistoryDTO;
import com.internousdev.kinnosawa.dto.MyPageUserDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ユーザーの会員情報、購入履歴を取得し、 マイページ画面に遷移する為のクラス
 * @author K.Kamijo
 * @version 1.0
 * @since 1.0
 **/
public class MyPageAction extends ActionSupport implements SessionAware {

	/**
	 * シリアルID
	 */
 private static final long serialVersionUID = 3491168288523567078L;

 	/**
	 * セッション
	 */
 private Map<String, Object> session;

 	/**
	 * 購入履歴情報
	 */
 private ArrayList<MyPageOrderHistoryDTO> historyList = new ArrayList<MyPageOrderHistoryDTO>();

	/**
	 * 購入履歴情報
	 */
 private ArrayList<MyPageOrderHistoryDTO> newHistoryList = new ArrayList<MyPageOrderHistoryDTO>();

 	/**
	 * 商品情報
	 */
 private MyPageGoodsDTO goods = new MyPageGoodsDTO();

 	/**
	 * ユーザー情報リスト
	 */
 private ArrayList<MyPageUserDTO>userList = new ArrayList<MyPageUserDTO>();

	/**
	 * 購入履歴情報
	 */
private ArrayList<MyPageUserDTO> newUserList = new ArrayList<MyPageUserDTO>();

	/**
	 * 10件で一つのページ
	 **/
private int page = 0;

 /**
  * 購入履歴を表示する為の画面
  * @return result ユーザーの購入情報を取得できればSUCCESS、できなければERRORを返す
  **/
public String execute() {

	session.remove("page");
	String result = ERROR;

	if(!session.containsKey("userId")){
		return ERROR;
	}

	int userId = (int) session.get("userId");
	MyPageDAO dao = new MyPageDAO();

	if(dao.select(userId)){
		historyList =dao.getHistoryList();
	}

	MyPageRegistrationInformationDAO dao2 = new  MyPageRegistrationInformationDAO();

	if(dao2.select(userId)){
		userList =dao2.getUserList();
	}

	try{
		newHistoryList.add(historyList.get(page));
		newUserList.add(userList.get(page));
	}catch(IndexOutOfBoundsException e){
		session.put("1",page);
	}
	result = SUCCESS;
	return result;
}

	/**
	 * セッションを取得する為のメソッド
	 * @return session セッション
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッションを格納する為のメソッド
	 * @param session セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * 購入履歴を取得する為のメソッド
	 * @return historyList 購入履歴
	 */
	public ArrayList<MyPageOrderHistoryDTO> getHistoryList() {
		return historyList;
	}

	/**
	 * 購入履歴を格納する為のメソッド
	 * @param historyList 購入履歴
	 */
	public void setHistoryList(ArrayList<MyPageOrderHistoryDTO> historyList) {
		this.historyList = historyList;
	}

	/**
	 * 購入履歴リストを取得する為のメソッド
	 * @return newHistoryList 購入履歴リスト
	 */
	public ArrayList<MyPageOrderHistoryDTO> getNewHistoryList() {
		return newHistoryList;
	}

	/**
	 * 購入履歴リストを格納する為のメソッド
	 * @param newHistoryList 購入履歴リスト
	 */
	public void setNewHistoryList(ArrayList<MyPageOrderHistoryDTO> newHistoryList) {
		this.newHistoryList = newHistoryList;
	}

	/**
	 * 商品情報を取得する為のメソッド
	 * @return goods 商品情報
	 */
	public MyPageGoodsDTO getGoods() {
		return goods;
	}

	/**
	 * 商品情報を格納する為のメソッド
	 * @param goods 商品情報
	 */
	public void setGoods(MyPageGoodsDTO goods) {
		this.goods = goods;
	}

	/**
	 * 会員情報を取得する為のメソッド
	 * @return userList 会員情報
	 */
	public ArrayList<MyPageUserDTO> getUserList() {
		return userList;
	}

	/**
	 * 会員情報を格納する為のメソッド
	 * @param userList 会員情報
	 */
	public void setUserList(ArrayList<MyPageUserDTO> userList) {
		this.userList = userList;
	}

	/**
	 * 会員情報リストを取得する為のメソッド
	 * @return newUserList 会員情報リスト
	 */
	public ArrayList<MyPageUserDTO> getNewUserList() {
		return newUserList;
	}

	/**
	 * 会員情報リストを格納する為のメソッド
	 * @param newUserList 会員情報リスト
	 */
	public void setNewUserList(ArrayList<MyPageUserDTO> newUserList) {
		this.newUserList = newUserList;
	}

}