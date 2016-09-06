/*
 * タイトル：ユーザー情報を検索する為の処理
 * 説明    ：DAOから受け取った商品のデータをリストに格納し admin_user.jspに送る。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kinnosawa.dao.AdminUserSearchDAO;
import com.internousdev.kinnosawa.dto.GoAdminUserDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * データベース内のユーザー情報をIDを使用し検索する為のクラス
 * @author S.Makino
 * @version 1.0
 * @since 1.0
 */
public class AdminUserSearchAction extends ActionSupport implements SessionAware {

		/**
		 * シリアルID
		 */
		private static final long serialVersionUID = 3217861627159771790L;

		/**
		 * セッション
		 */
		private Map<String,Object> session;

		/**
		 * 検索するユーザー名
		 */
		private String user;

		/**
		 * データベースからデータを引き継ぐリスト
		 */
		private ArrayList<GoAdminUserDTO> userList=new ArrayList<>();

		/**
		 * エラーメッセージを入れる変数
		 */
		private String message=null;

		/**
		 * エラーメッセージを入れる変数
		 */
		private String errorDelete=null;

		/**
		 * ユーザー情報を検索できるか否かを判定、またはエラーメッセージの表示するメソッド
		 * error ヴァリデーションによるエラーメッセージ
		 * @return result データベースのユーザーデータを削除できた場合はSUCCESS、データが存在しない場合と削除ができなかった場合はERRORを返す
		 */
	public String execute()throws SQLException{

		String result=ERROR;
		session.remove("notDate");

		if (user != null) {

			if (!user.equals("")) {
				message = (getText("admin_user.search_user"));
				session.remove("searchKey");
				session.put("searchKey", user);
			} else {
				errorDelete= (getText("admin_user.user_name"));
				session.remove("searchKey");
				user = "";

				if (session.containsKey("searchKey")) {
					user = (String) session.get("searchKey");
				}

			}

		} else {
			if (session.containsKey("searchKey")) {
				user = (String) session.get("searchKey");
			}

		}

		AdminUserSearchDAO dao = new AdminUserSearchDAO();

		if(dao.userSearchSelect(user)){
			userList = dao.getUserList();
			 if ( user.length() == 0 ) {
				 message= (getText("admin_user.search_message") +" "+ userList.size()+ " " + getText("admin_user.search_show"));
		            return result;
			 }

			 if ( user.length() > 0 ) {
				 message=(getText("admin_user.search_message" )+ " " + userList.size() + " "+getText("admin_user.display"));
		            return result;

			}

			}else{
			session.put("notDate", false);
			return result;
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
	 * データベースからデータを引き継ぐリストを取得する為のメソッド
	 * @return userList データベースからデータを引き継ぐリスト
	 */
	public ArrayList<GoAdminUserDTO> getUserList() {
		return userList;
	}

	/**
	 * データベースからデータを引き継ぐリストを格納する為のメソッド
	 * @param userList データベースからデータを引き継ぐリスト
	 */
	public void setUserList(ArrayList<GoAdminUserDTO> userList) {
		this.userList = userList;
	}

	/**
	 * ユーザー検索のユーザー名を取得する為のメソッド
	 * @return user ユーザー検索のユーザー名
	 */
	public String getUser() {
		return user;
	}

	/**
	 * ユーザー検索のユーザー名を格納する為のメソッド
	 * @param user ユーザー検索のユーザー名
	 */
	public void setUser(String user) {
		this.user = user;
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
	/**
	 * エラーメッセージを取得する為のメソッド
	 * @return errorDelete エラーメッセージ
	 */
	public String getErrorDelete() {
		return errorDelete;
	}
	/**
	 * エラーメッセージを格納する為のメソッド
	 * @param errorDelete エラーメッセージS
	 */
	public void setErrorDelete(String errorDelete) {
		this.errorDelete = errorDelete;
	}

}