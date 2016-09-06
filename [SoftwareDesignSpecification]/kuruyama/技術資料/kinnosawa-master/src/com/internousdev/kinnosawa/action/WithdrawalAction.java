/*
 * タイトル：会員情報をNULLにして、退会画面に遷移する為の処理
 * 説明    ：会員Idを除き、会員情報をNULLにし、Withdrawal.jspへ遷移する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kinnosawa.dao.WithdrawalDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ユーザーの会員情報をNULLにし、退会画面に遷移する為のクラス
 * @author K.Kamijo
 * @version 1.0
 * @since 1.0
 */
public class WithdrawalAction extends ActionSupport implements SessionAware {

	/**
	 *シリアルID
	 */
	private static final long serialVersionUID = -2923461566775830357L;

	/**
	 * セッション
	 */
	public Map<String, Object> session;

	/**
	 * メールアドレス、パスワード、電話番号、郵便番号、住所、クレジットカード番号、クレジット用トークン、
	 * OAuth用ID、OAuth名、名前、フリガナをNULLにしてログイン出来なくする為のメソッド
	 * @return result DBをNULLに更新できていればSUCCESS、そうでなければERRORを返す
	 */
	public String execute(){

		String result =ERROR;

		if(!session.containsKey("userId")){
			return result;
		}
		int id =(int) session.get("userId");
		WithdrawalDAO dao = new WithdrawalDAO();
		int count = 0;
		count = dao.update(id);

		if(count < 1){
			return result;
		}
		session.clear();
		result = SUCCESS;
		return result;
	}

	/**
	 * セッションを格納する為のメソッド
	 * @param session セッション
	 */
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

	/**
	 * セッションを取得する為のメソッド
	 * @return session セッション
	 */
	public Map<String, Object> getSession() {
		return session;
	}

}