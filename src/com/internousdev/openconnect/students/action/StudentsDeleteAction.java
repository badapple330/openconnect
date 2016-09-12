package com.internousdev.openconnect.students.action;
import com.internousdev.openconnect.students.dao.StudentsDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class StudentsDeleteAction extends ActionSupport {

	/**
	 * シリアル番号
	 */
	private static final long serialVersionUID = -310066990893410510L;
	/**
	 * ユーザーID
	 */
	private int usersId;

	/**
	 * DBの情報を削除する為のクラス
	 * @author KOHEI NITABARU
	 * @since 2016/09/04
	 * @version 1.0
	 */
	public String execute() {
		StudentsDeleteDAO dao = new StudentsDeleteDAO();
		String result = ERROR;
		int count = 0;
		count =dao.delete(usersId);
		if(count > 0){
			result = SUCCESS;
		}
		return result;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return usersId
	*/
	public int getUsersId() {
		return usersId;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param usersId
	*/
	public void setUsersId(int usersId) {
		this.usersId = usersId;
	}

}
