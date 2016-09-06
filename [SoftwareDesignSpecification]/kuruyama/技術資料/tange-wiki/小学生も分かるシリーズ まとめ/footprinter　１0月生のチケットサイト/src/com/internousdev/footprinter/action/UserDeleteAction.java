package com.internousdev.footprinter.action;


import com.internousdev.footprinter.dao.UserDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 選択項目を削除するためのクラス
 * @author 小澤 竜樹
 * @version 1.0
 * @since version 1.0
 */
public class UserDeleteAction extends ActionSupport {
	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -5555623348911613595L;
	/**
	 * ID
	 */
	private int id;
	/**
	 * 選択された項目を削除するためのメソッド
	 * @return SUCCESS ERROR
	 */
	public String execute() {
		UserDeleteDAO dao = new UserDeleteDAO();
		int result = dao.delete(id);
		if (result == 0) {
			return ERROR;
		}
		
		return SUCCESS;
	}

	/**
	 * ユーザーID取得メソッド
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * ユーザーID格納メソッド
	 * @param id ユーザーID
	 */
	public void setId(int id) {
		this.id = id;
	}
}
