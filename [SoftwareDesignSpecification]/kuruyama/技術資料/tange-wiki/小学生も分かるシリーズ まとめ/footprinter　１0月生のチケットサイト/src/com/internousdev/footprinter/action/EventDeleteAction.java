package com.internousdev.footprinter.action;

import com.internousdev.footprinter.dao.AdminEventDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * イベント削除処理クラス
 * @author 冨内 峻太朗
 * @version 1.0
 * @since 1.0
 *
 */
public class EventDeleteAction extends ActionSupport {
	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 8925300023391299409L;
	/**
	 * ユーザID
	 */
	private int id;
	/**
	 * 選択された項目を削除するためのメソッド
	 * @return SUCCESS ERROR
	 */
	public String execute() {
		int result = 0;
		AdminEventDeleteDAO dao = new AdminEventDeleteDAO();
		result = dao.delete(id);
		if (result == 0) {
			return ERROR;
		}
		if (result == 0) {
			return ERROR;
		}
		return SUCCESS;
	}

	/**
	 * イベントID取得メソッド
	 * @return id イベントID　
	 */
	public int getId() {
		return id;
	}
	/**
	 * イベントID登録メソッド
	 * @param id イベントID
	 */
	public void setId(int id) {
		this.id = id;
	}
}
