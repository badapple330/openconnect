package com.internousdev.openconnect.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.openconnect.dao.UpdateAppDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * AddAppAction 管理者画面でのアプリ追加を行うクラス
 *
 * @author Arima Genki
 * @since 2015/06/15
 * @author MAIKI OKANO
 * @since 2016/07/20
 * @version 1.1
 */
public class UpdateAppAction extends ActionSupport implements SessionAware {

	/**
	 * シリアルバージョンIDの生成
	 */
	private static final long serialVersionUID = 811223625143510825L;

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
     * セッション
     */
	private Map<String, Object> sessionMap;
	/**
     * エラーメッセージ
     */
	public String errormsg = null;
	/**
     * 戻り値
     */
	private String result = ERROR;

	/**
	 * 入力された値をDBに登録されている商品に反映し、resultを返すメソッド
	 * @author Arima Genki
	 * @since 2015/06/15
	 * @author MAIKI OKANO
	 * @since 2015/07/21
	 * @return result データベースの情報を更新できたらSUCCESS、失敗したらERROR
	 */
	public String execute() throws SQLException {
		UpdateAppDAO updateAppDao = new UpdateAppDAO();

		if (updateAppDao.update(siteId, siteName, siteUrl, genre)) {
			try {
				result = SUCCESS;
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			errormsg = "*正しい値を入力してください。";
		}
		return result;
	}

	/**
     * 取得メソッド サイトIDを取得
     *
     * @author MAIKI OKANO
     * @return site_id 取得するサイトID
     */
	public int getSiteId() {
		return siteId;
	}
	/**
     * 格納メソッド サイトIDを格納
     *
     * @author MAIKI OKANO
     * @param site_id
     *            格納するサイトID
     */
	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}
	 /**
     * 取得メソッド サイトの名前を取得
     *
     * @author MAIKI OKANO
     * @return site_name 取得するサイトの名前
     */
	public String getSiteName() {
		return siteName;
	}
	/**
     * 格納メソッド サイトの名前を格納
     *
     * @author MAIKI OKANO
     * @param site_name
     *            格納するサイトの名前
     */
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	/**
     * 取得メソッド サイトURLを取得
     *
     * @author MAIKI OKANO
     * @return site_url 取得するサイトのURL
     */
	public String getSiteUrl() {
		return siteUrl;
	}
	/**
     * 格納メソッド サイトURLを格納
     *
     * @author MAIKI OKANO
     * @param site_url
     *            サイトのURL
     */
	public void setSiteUrl(String siteUrl) {
		this.siteUrl = siteUrl;
	}
	/**
     * 取得メソッド サイトのジャンルを取得
     *
     * @author MAIKI OKANO
     * @return genre 取得するサイトのジャンル
     */
	public String getGenre() {
		return genre;
	}
	/**
     * 格納メソッド サイトのジャンルを格納
     *
     * @author MAIKI OKANO
     * @param genre
     *            格納するサイトのジャンル
     */
	public void setGenre(String genre) {
		this.genre = genre;
	}
	/**
     * 取得メソッド セッションを取得
     *
     * @author MAIKI OKANO
     * @return sessionMap 取得するセッションマップ
     */
	public Map<String, Object> getSessionMap() {
		return sessionMap;
	}
	/**
     * 格納メソッド セッションを格納
     *
     * @author MAIKI OKANO
     * @param sessionMap
     *            格納するセッションマップ
     */
	@Override
	public void setSession(Map<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}

}
