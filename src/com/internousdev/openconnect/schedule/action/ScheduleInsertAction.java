/**
 *
 */
package com.internousdev.openconnect.schedule.action;
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
	private String Startday;

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
	private String error_msg;

	/**
	 * 成功
	 * @author MASAHIRO KEDSUKA
	 */
	private String success_msg;

	/**
	 * 実行メソッド。DAOに情報を渡して、DBに追加する。
	 */
	public String execute(){
		String ret = ERROR;
		int k;

		if(Startday.isEmpty()&&Title.isEmpty()){
			ret = ERROR;
			error_msg=(getText("追加できませんでした"));
			return ret;
		}else{

			ScheduleInsertDAO dao = new ScheduleInsertDAO();

			k = dao.insert(Startday,Title,Content);

			if (k>0) {
				success_msg=(getText("追加しました。"));
				ret = SUCCESS;
			} else {
				error_msg=(getText("追加に失敗しました"));
			}
		}
		return ret;
	}


	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return Start_day
	 */
	public String getStartday() {
		return Startday;
	}


	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param start_day
	 */
	public void setStart_day(String startday) {
		Startday = startday;
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
	 * @return error_msg
	 */
	public String getError_msg() {
		return error_msg;
	}


	/**
	 * 設定メソッド
	 * @author MASAHIRO KEZUKA
	 * @param error_msg
	 */
	public void setError_msg(String error_msg) {
		this.error_msg = error_msg;
	}


	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return success_msg
	 */
	public String getSuccess_msg() {
		return success_msg;
	}


	/**
	 * 設定メソッド
	 * @author MASAHIRO KEZUKA
	 * @param success_msg
	 */
	public void setSuccess_msg(String success_msg) {
		this.success_msg = success_msg;
	}

}
