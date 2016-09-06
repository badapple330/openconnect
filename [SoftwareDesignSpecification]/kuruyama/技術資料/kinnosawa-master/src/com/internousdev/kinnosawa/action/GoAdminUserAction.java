/*
 * タイトル：ユーザー管理画面する為の処理
 * 説明    ：admin_user.jspへ遷移する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kinnosawa.dao.GoAdminUserDAO;
import com.internousdev.kinnosawa.dto.GoAdminUserDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ユーザー管理画面へ遷移する為のクラス
 * @author S.Makino
 * @version 1.0
 * @since 1.0
 */
public class GoAdminUserAction extends ActionSupport implements SessionAware {

	/**
	 * シリアルＩＤ
	 */
	private static final long serialVersionUID = 7256602743057382099L;

	/**
	 * データベースからのデータを引き継ぐためのリスト
	 */
	private ArrayList<GoAdminUserDTO> userList=new ArrayList<GoAdminUserDTO>();

	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * メッセージを入れる変数
	 */
	private String message=null;

	/**
	 * データベース内のユーザー情報をリストに格納出来たものか判定する為のメソッド
	 * @return result DBからのユーザー情報を格納できたらSUCCESS、できなければLogInErrorを返す。
	 */
	public String execute(){

		String  result=SUCCESS;

		if(session.containsKey("adminId")){
			GoAdminUserDAO dao =new GoAdminUserDAO();
			dao.userSelect();
			userList = dao.getUserList();

			if(session.containsKey("searchKey")){
				session.remove("searchKey");
			}

		}else{
			result="LogInError";
		}
		message = (getText("admin_user.search_message" )+ " " + userList.size()+ " " + getText("admin_user.search_show"));
		return result;
	}

	/**
	 * データを引き継ぐためのリストを取得する為のメソッド
	 * @return userList データを引き継ぐためのリスト
	 */
	public ArrayList<GoAdminUserDTO> getUserList() {
		return userList;
	}

	/**
	 *  データを引き継ぐためのリストを格納する為のメソッド
	 * @param userList データを引き継ぐためのリスト
	 */
	public void setUserList(ArrayList<GoAdminUserDTO> userList) {
		this.userList = userList;
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
	 * メッセージを取得する為のメソッド
	 * @return message メッセージ
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * メッセージを格納する為のメソッド
	 * @param message メッセージ
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}