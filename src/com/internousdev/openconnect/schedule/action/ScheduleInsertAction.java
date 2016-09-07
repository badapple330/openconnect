/**
 *
 */
package com.internousdev.openconnect.schedule.action;
import java.sql.Date;

import com.internousdev.openconnect.schedule.dao.ScheduleInsertDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * DBに情報を追加するクラス。
 * @author MASAHIRO KEDSUKA
 * @since 2016/09/07
 */
public class ScheduleInsertAction extends ActionSupport{

	/**
	 * 開始日
	 * @author MASAHIRO KEDSUKA
	 */
	private Date Start_day;

	/**
	 * 件名
	 * @author MASAHIRO KEDSUKA
	 */
	private String Title;

	/**
	 * 内容
	 * @author MASAHIRO KEDSUKA
	 */
	private String Content;

	/**
	 *エラー
	 * @author MASAHIRO KEDSUKA
	 */
	private String errortitle;

	/**
	 * 成功
	 * @author MASAHIRO KEDSUKA
	 */
	private String successtitle;

	/**
	 * 実行メソッド。DAOに情報を渡して、DBに追加する。
	 */
	public String execute(){
		String ret = ERROR;
		int k;

		if(Title.isEmpty()){
			ret = ERROR;
			errortitle=(getText("追加できませんでした"));
			return ret;
		}else{

		ScheduleInsertDAO dao = new ScheduleInsertDAO();

		k = dao.insert(Start_day,Title,Content);

		if (k>0) {
			successtitle=(getText("追加しました。"));
			ret = SUCCESS;
		} else {
			errortitle=(getText("追加に失敗しました"));
		}
		}
		return ret;
	}


	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return Start_day
	 */
	public Date getStart_day() {
		return Start_day;
	}


	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param start_day
	 */
	public void setStart_day(Date start_day) {
		Start_day = start_day;
	}


	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return Title
	 */
	public String getTitle() {
		return Title;
	}


	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param title
	 */
	public void setTitle(String title) {
		Title = title;
	}


	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return Content
	 */
	public String getContent() {
		return Content;
	}


	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param content
	 */
	public void setContent(String content) {
		Content = content;
	}


	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return successtitle
	 */
	public String getSuccesstitle() {
		return successtitle;
	}

	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param successtitle
	 */
	public void setSuccesstitle(String successtitle) {
		this.successtitle = successtitle;
	}

	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return errortitle
	 */
	public String getErrortitle() {
		return errortitle;
	}


	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param errortitle
	 */
	public void setErrortitle(String errortitle) {
		this.errortitle = errortitle;
	}


}
