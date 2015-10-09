package jp.co.internous.action;

import java.net.SocketException;
import java.sql.SQLException;

import jp.co.internous.dao.DeleteAppDAO;

/**
 * InsertAction 管理者画面からサイト情報を削除する為のアクション
 * @author Arima Genki
 * @since 2015/06/17
 * @version 1.0
 */
public class DeleteAppAction {
	/**
	 * 結果
	 */
	String result = "error";
	/**
	 * ID
	 */
	private int id;
	/**
	 * エラーメッセージ
	 */
	public String errormsg = null;
	/**
	 * 入力された値をDから削除し、resultを返すメソッド
	 * @author Arima Genki
	 * @since 2015/06/17
	 * @return result
	 * @throws SQLException
	 * @throws SocketException
	 * @see DeleteAppDAO
	 */
	public String execute() throws SQLException, SocketException {
		DeleteAppDAO dao = new DeleteAppDAO();
		if (dao.delete(id)) {
			result = "success";
			return result;
		} else {
			errormsg = "入力された値が正しくありません";
			return result;
		}
	}

	/**
	 * ID取得メソッド
	 * @author Arima Genki
	 * @since 2015/06/17
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * ID格納メソッド
	 * @author Arima Genki
	 * @since 2015/06/17
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
}