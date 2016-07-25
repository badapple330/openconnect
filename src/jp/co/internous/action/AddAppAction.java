package jp.co.internous.action;

import java.io.Serializable;

import com.opensymphony.xwork2.ActionSupport;

import jp.co.internous.dao.AddAppDAO;
/**
 * AddAppAction 管理者画面でのアプリ追加を行うクラス
 *
 * @author MAIKI OKANO
 * @since 2016/07/20
 * @version 1.0
 */
public class AddAppAction extends ActionSupport implements Serializable{
	/**
	 * シリアルバージョンIDの生成
	 */
	private static final long serialVersionUID = -7911061777161312117L;
	/**
     * サイトID
     */
	private int siteId;
	/**
     * サイトの名前
     */
	private String siteName;
	/**
     * サイトURL
     */
	private String siteUrl;
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
		count = dao.insert(siteId, siteName, siteUrl, genre);

		if(count > 0){
			return SUCCESS;
		}
		return result;
	}

	 /**
     * 取得メソッド サイトIDを取得
     *
     * @author MAIKI OKANO
     * @return siteId
     */
	public int getSiteId() {
		return siteId;
	}
	/**
     * 格納メソッド サイトIDを格納
     *
     * @author MAIKI OKANO
     * @param siteId
     */
	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}
	 /**
     * 取得メソッド サイトの名前を取得
     *
     * @author MAIKI OKANO
     * @return siteName
     */
	public String getSiteName() {
		return siteName;
	}
	/**
     * 格納メソッド サイトの名前を格納
     *
     * @author MAIKI OKANO
     * @param siteName
     */
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	/**
     * 取得メソッド サイトURLを取得
     *
     * @author MAIKI OKANO
     * @return siteUrl
     */
	public String getSiteUrl() {
		return siteUrl;
	}
	/**
     * 格納メソッド サイトURLを格納
     *
     * @author MAIKI OKANO
     * @param siteUrl
     */
	public void setSiteUrl(String siteUrl) {
		this.siteUrl = siteUrl;
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
