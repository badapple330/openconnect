/*
 * タイトル：退会確認画面に遷移する為の処理
 * 説明    ：Withdrawal_confirmation.jspへ遷移する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.action;
import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 退会確認画面に遷移する為のクラス
 * @author K.Kamijo
 * @version 1.0
 * @since 1.0
 */
public class WithdrawalConfirmationAction extends ActionSupport{

	/**
	 *シリアルID
	 */
	private static final long serialVersionUID = -6502607747098358081L;

	/**
	 * 退会を実行する為のメソッド
	 * @return SUCCESS 必ずSUCCESSを返す
	 */
	public String execute() throws SQLException {
		return SUCCESS;
	}
}
