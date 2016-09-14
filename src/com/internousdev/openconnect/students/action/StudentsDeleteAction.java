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
	private int userId;
	/**
	 * 結果文字
	 */
	private String resultString = "この受講生は削除できません。";

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
		count =dao.delete(userId);
		if(count > 0){
			result = SUCCESS;
			resultString = "削除に成功しました。";
		}
		return result;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return userId
	*/
	public int getUserId() {
		return userId;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param userId
	*/
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return resultString
	*/
	public String getResultString() {
		return resultString;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param resultString
	*/
	public void setResultString(String resultString) {
		this.resultString = resultString;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return serialVersionUID
	*/
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
