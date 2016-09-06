/*
 * タイトル：新規登録画面で入力された個人情報をデータベースに登録する為のクラス
 * 説明    ：sign_up.jspで入力された個人情報をMySQLに登録する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *        ：
 */
package com.internousdev.kinnosawa.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kinnosawa.dao.SignUpCompletionDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 新規登録画面で入力された個人情報をデータベースに登録する為のクラス
 * @author K.Sugano
 * @version 1.1
 * @since 1.0
 *
 */
public class SignUpCompletionAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -5827213562559040317L;

	/**
	 * セッション
	 */
	private Map<String, Object>session;

	/**
	 * 新規登録画面で入力された個人情報をデータベースに登録する為のメソッド
	 * @return result データベースに登録出来ればSUCCESS、失敗ならERRORを返す
	 */
	public String execute(){

		String result=ERROR;
		String email=(String) session.get("email");
		String password=(String) session.get("password");
		String name=(String) session.get("name");
		String nameKana=(String) session.get("nameKana");
		String tellNum=(String) session.get("tellNum");
		String postalCode=(String) session.get("postalCode");
		String address=(String) session.get("address");
		SignUpCompletionDAO dao=new SignUpCompletionDAO();
		int count=dao.insert(email, password,name, nameKana, tellNum, postalCode, address);
		session.remove("email");
		session.remove("password");
		session.remove("name");
		session.remove("nameKana");
		session.remove("tellNum");
		session.remove("postalCode");
		session.remove("address");

		if(count>0){
			if(dao.select(email)){
				session.clear();
				session.put("userId", dao.getId());
				session.put("userName", name);
				session.put("userEmail", email);
				result=SUCCESS;
			}
			return result;
		}
		return ERROR;
	}

	/**
	 * セッションを格納する為のメソッド
	 * @param session セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}

}