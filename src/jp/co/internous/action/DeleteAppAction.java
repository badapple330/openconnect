package jp.co.internous.action;

import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

import jp.co.internous.dao.DeleteAppDAO;
//データベースにユーザー情報を削除させる為のクラス
public class DeleteAppAction extends ActionSupport {

	private int site_id;
	public String errormsg = null;

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

	public String getErrormsg() {
		return errormsg;
	}

	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
	}

	public int getSite_id() {
		return site_id;
	}

	public void setSite_id(int site_id) {
		this.site_id = site_id;
	}
}

