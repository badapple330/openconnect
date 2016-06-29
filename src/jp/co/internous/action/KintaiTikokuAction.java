/**
 *
 */
package jp.co.internous.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internous
 *
 */
public class KintaiTikokuAction extends ActionSupport{

	/**
	 *
	 */
	private static final long serialVersionUID = 245386271740241550L;

	/**
	 * 管理番号
	 */

	private int number;

	/**
	 * 名前
	 */
	private String name;

	/**
	 * 遅刻理由
	 */
	private String reason;

	/**
	 * エラーメッセージ
	 */
	private String erroemsg;

	public String execute(){

//		if

		return SUCCESS;
	}

}
