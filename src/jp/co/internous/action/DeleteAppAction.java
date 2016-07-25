package jp.co.internous.action;

import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

import jp.co.internous.dao.DeleteAppDAO;
/**
 * DeleteAppAction 管理者画面でのアプリ削除を行うクラス
 *
 * @author MAIKI OKANO
 * @since 2016/07/20
 * @version 1.0
 */
public class DeleteAppAction extends ActionSupport {

	/**
	 * シリアルバージョンIDの生成
	 */
	private static final long serialVersionUID = 5892990975591315738L;
	/**
     * サイトID
     */
	private int site_id;
	/**
     * エラーメッセージ
     */
	public String errormsg = null;

	/**
     * DAOにサイト情報を渡して結果を返す
     *
     * @author MAIKI OKANO
     * @return result
     */
	public String execute() throws SQLException {
		String result = "error";
		DeleteAppDAO dao = new DeleteAppDAO();
		int count =0;
		count = dao.delete(site_id);

		if (count > 0) {
			result = "success";
		} else {
			errormsg = "入力された値が正しくありません";
		}
		return result;
	}

	 /**
     * 取得メソッド サイトIDを取得
     *
     * @author MAIKI OKANO
     * @return site_id
     */
	public int getSite_id() {
		return site_id;
	}

	/**
     * 格納メソッド サイトIDを格納
     *
     * @author MAIKI OKANO
     * @param site_id
     */
	public void setSite_id(int site_id) {
		this.site_id = site_id;
	}
	/**
     * 取得メソッド エラーメッセージを取得
     *
     * @author MAIKI OKANO
     * @return errorMsg
     */
	public String getErrormsg() {
		return errormsg;
	}

	/**
     * 格納メソッド エラーメッセージを格納
     *
     * @author MAIKI OKANO
     * @param errorMsg
     */
	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
	}
}

