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
	 * シリアル番号
	 */
	private static final long serialVersionUID = -1823142777543076903L;

	/**
	 * 開始日
	 * @author MASAHIRO KEDSUKA
	 */
	private String startDay;

	/**
	 * 件名
	 * @author MASAHIRO KEDSUKA
	 */
	private String title;

	/**
	 * 内容
	 * @author MASAHIRO KEDSUKA
	 */
	private String content;

	/**
	 *エラー
	 * @author MASAHIRO KEDSUKA
	 */
	private String errorMsg;

	/**
	 * 成功
	 * @author MASAHIRO KEDSUKA
	 */
	private String successMsg;

	/**
	 * 実行メソッド。DAOに情報を渡して、DBに追加する。
	 */
	public String execute(){
		String ret = ERROR;
		int k;

		if(startDay.isEmpty()&&title.isEmpty()){
			ret = ERROR;
			errorMsg=(getText("追加できませんでした"));
			return ret;
		}else{

			ScheduleInsertDAO dao = new ScheduleInsertDAO();

			k = dao.insert(startDay,title,content);

			if (k>0) {
				successMsg=(getText("追加しました。"));
				ret = SUCCESS;
			} else {
				errorMsg=(getText("追加に失敗しました"));
			}
		}
		return ret;
	}



	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return startDay
	 */
	public String getStartDay() {
		return startDay;
	}



	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param startDay
	 */
	public void setStartDay(String startDay) {
		this.startDay = startDay;
	}



	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return Title
	 */
	public String getTitle() {
		return title;
	}


	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}


	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return Content
	 */
	public String getContent() {
		return content;
	}


	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param content
	 */
	public void setContent(String content) {
		this.content = content;
	}



	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return errorMsg
	 */
	public String getErrorMsg() {
		return errorMsg;
	}


	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param errorMsg
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}


	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return successMsg
	 */
	public String getSuccessMsg() {
		return successMsg;
	}


	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param successMsg
	 */
	public void setSuccessMsg(String successMsg) {
		this.successMsg = successMsg;
	}


}
