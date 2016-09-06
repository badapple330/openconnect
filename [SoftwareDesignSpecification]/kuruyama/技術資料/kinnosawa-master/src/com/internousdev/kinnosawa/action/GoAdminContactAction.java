/*
 * タイトル：お問い合わせ管理画面へ遷移する為のクラス
 * 説明    ：admin_contact.jspへ遷移する.
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 *変更履歴：
 *
 */
package com.internousdev.kinnosawa.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kinnosawa.dao.ContactDAO;
import com.internousdev.kinnosawa.dto.ContactDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * お問い合わせ管理画面に遷移する為のクラス
 * @author Y.Tashiro
 * @since 1.0
 * @version 1.0
 */
public class GoAdminContactAction extends ActionSupport implements SessionAware{

	/**
	 *シリアルID
	 */
	private static final long serialVersionUID = 3566927852080206695L;

	/**
	 *ユーザー名
	 */
	private String contactName;

	/**
	 *お問い合わせデータを格納するためのリスト
	 */
	private ArrayList<ContactDTO> list = new ArrayList<ContactDTO>();

	/**
	 *セッション
	 */
	private Map<String, Object> session;

	/**
	 * お問い合わせ管理画面へ遷移する為のメソッド
	 * @return 正常に表示される場合はSUCCESS、異常な表示の場合はERRORを返す
	 */
	public String execute(){

		if(!session.containsKey("adminId")){
			return ERROR;
		}
		ContactDAO dao = new ContactDAO();

		if(dao.serch(list)){
			return SUCCESS;
		}
		return ERROR;
	}

	/**
	 * ユーザーを検索後、お問い合わせ管理画面へ遷移する為のメソッド
	 * @return 正常に表示される場合はSUCCESS、異常な表示の場合はERRORを返す
	 */
	public String search(){

		if(!session.containsKey("adminId")){
			return ERROR;
		}
		ContactDAO dao = new ContactDAO();

		if(dao.serch(list, contactName)){

			if(list.size() == 0){
				addActionMessage(getText("admin_contact.text8"));
			}
			return SUCCESS;
		}
		return ERROR;
	}

	/**
	 * ユーザー名を取得する為のメソッド
	 * @return contactName ユーザー名
	 */
	public String getContactName() {
		return contactName;
	}

	/**
	 * ユーザー名を格納する為のメソッド
	 * @param contactName ユーザー名
	 */
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	/**
	 * お問い合わせデータを格納するためのリストを取得する為のメソッド
	 * @return list お問い合わせデータのArrayList
	 */
	public ArrayList<ContactDTO> getList() {
		return list;
	}

	/**
	 * お問い合わせデータを格納するためのリストを格納する為のメソッド
	 * @param list お問い合わせデータのArrayList
	 */
	public void setList(ArrayList<ContactDTO> list) {
		this.list = list;
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

}