package jp.co.internous.action;

import com.opensymphony.xwork2.ActionSupport;

import jp.co.internous.dao.AddAppDAO;
/**
 * AddAppAction 管理者画面でのアプリ追加を行うクラス
 *
 * @author MAIKI OKANO
 * @since 2016/07/20
 * @version 1.0
 */
public class AddAppAction extends ActionSupport {

	/**
     * サイトID
     */
	private int site_id;
	/**
     * サイトの名前
     */
	private String site_name;
	/**
     * サイトURL
     */
	private String site_url;
	/**
     * サイトのジャンル
     */
	private String genre;
	/**
     * エラーメッセージ
     */
	private String errorMsg;

	/**
     * DAOにサイト情報を渡して結果を返す
     *
     * @author MAIKI OKANO
     * @return result
     */
	public String execute() {
		String result = ERROR;
		AddAppDAO dao = new AddAppDAO();

		int count = 0;
		count = dao.insert(site_id, site_name, site_url, genre);

		if(count > 0){
			return SUCCESS;
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
     * 取得メソッド サイトの名前を取得
     *
     * @author MAIKI OKANO
     * @return site_name
     */
	public String getSite_name() {
		return site_name;
	}
	/**
     * 格納メソッド サイトの名前を格納
     *
     * @author MAIKI OKANO
     * @param site_name
     */
	public void setSite_name(String site_name) {
		this.site_name = site_name;
	}
	/**
     * 取得メソッド サイトURLを取得
     *
     * @author MAIKI OKANO
     * @return site_url
     */
	public String getSite_url() {
		return site_url;
	}
	/**
     * 格納メソッド サイトURLを格納
     *
     * @author MAIKI OKANO
     * @param site_url
     */
	public void setSite_url(String site_url) {
		this.site_url = site_url;
	}
	/**
     * 取得メソッド サイトのジャンルを取得
     *
     * @author MAIKI OKANO
     * @return genre
     */
	public String getGenre() {
		return genre;
	}
	/**
     * 格納メソッド サイトのジャンルを格納
     *
     * @author MAIKI OKANO
     * @param genre
     */
	public void setGenre(String genre) {
		this.genre = genre;
	}
	/**
     * 取得メソッド エラーメッセージを取得
     *
     * @author MAIKI OKANO
     * @return errorMsg
     */
	public String getErrorMsg() {
		return errorMsg;
	}
	/**
     * 格納メソッド エラーメッセージを格納
     *
     * @author MAIKI OKANO
     * @param errorMsg
     */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
}
