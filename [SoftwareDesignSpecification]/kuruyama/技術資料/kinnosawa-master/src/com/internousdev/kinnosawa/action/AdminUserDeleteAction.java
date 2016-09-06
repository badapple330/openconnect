/*
 * タイトル：ユーザー情報を削除する為の処理
 * 説明    ：admin_user.jspから受け取った商品IDのデータをDAOに引渡しデータベースから削除する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kinnosawa.dao.AdminUserDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * データベース内のユーザー情報をIDを使用し,削除する為のクラス
 * @author S.Makino
 * @version 1.0
 * @since 1.0
 */
public class AdminUserDeleteAction extends ActionSupport implements SessionAware {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 4135026584913191903L;

	/**
	 * ユーザーID
	 */
	private int id;

	/**
	 * 削除エラー
	 */
	private String errorDelete;

	/**
	 * 削除するユーザーのID
	 */
	private String userId;

	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * ユーザー情報を削除できたかどうかの判定を行うメソッド
	 * errorDelete ヴァリデーションによるエラーメッセージ
	 * @return result データベースのユーザーデータを削除できた場合はSUCCESS、データが存在しない場合と削除ができなかった場合はERRORを返す
	 */
	public String execute() throws SQLException{

		String result=ERROR;

		if (userId.equals(null)) {
			errorDelete=(getText("admin_user.enter_userID"));
		}
		if(session.containsKey("adminId")){
		AdminUserDeleteDAO dao= new AdminUserDeleteDAO();

		try{
			id=Integer.parseInt(userId);
			int count=dao.userDelete(id);
			if(count==0){
				result=SUCCESS;
				errorDelete=(getText("admin_user.success"));
			}else{
				errorDelete=(getText("admin_user.nodate"));
			}

		}catch(NumberFormatException e){
			errorDelete=(getText("admin_user.enter_userID"));
			e.printStackTrace();
		}
	}
		return result;
}

	/**
	 * ユーザーIDを取得する為のメソッド
	 * @return id ユーザーID
	 */
	public int getId() {
		return id;
	}

	/**
	 *  ユーザーIDを格納する為のメソッド
	 * @param id ユーザーID
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 削除エラーを取得する為のメソッド
	 * @return errorDelete 削除エラー
	 */
	public String getErrorDelete() {
		return errorDelete;
	}

	/**
	 * 削除エラーを格納する為のメソッド
	 * @param errorDelete 削除エラー
	 */
	public void setErrorDelete(String errorDelete) {
		this.errorDelete = errorDelete;
	}

	/**
	 * 削除するユーザーIDを取得する為のメソッド
	 * @return userId 削除するユーザーID
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * 削除するユーザーIDを格納する為のメソッド
	 * @param userId 削除するユーザーID
	 */
	public void setUserId(String userId) {
		this.userId = userId;
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