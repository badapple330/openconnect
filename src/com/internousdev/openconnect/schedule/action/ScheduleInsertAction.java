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
	 * 開始日、件名、内容
	 * @author MASAHIRO KEDSUKA
	 */
	private Date Start_day;
	private String Title;
	private String Content;
	private String errortitle;


	/* (非 Javadoc)
	 * 実行メソッド。DAOに情報を渡して、DBに追加する。
	 */
	public String execute(){
        String ret = ERROR;
        int k;

        ScheduleInsertDAO dao = new ScheduleInsertDAO();

        k = dao.insert(Start_day,Title,Content);

        if (k>0) {
            ret = SUCCESS;
        } else {
        	errortitle=(getText("登録できませんでした"));
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
