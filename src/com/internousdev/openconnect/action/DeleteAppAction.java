package com.internousdev.openconnect.action;

import java.sql.SQLException;

import com.internousdev.openconnect.dao.DeleteAppDAO;
import com.opensymphony.xwork2.ActionSupport;
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
	private int siteId;
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
		String result = ERROR;
		DeleteAppDAO dao = new DeleteAppDAO();
		int count =0;
		count = dao.delete(siteId);

		if (count > 0) {
			result = SUCCESS;
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
	public int getSiteId() {
		return siteId;
	}

	/**
     * 格納メソッド サイトIDを格納
     *
     * @author MAIKI OKANO
     * @param site_id
     */
	public void setSiteId(int siteId) {
		this.siteId = siteId;
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

