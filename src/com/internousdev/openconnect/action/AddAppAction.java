package com.internousdev.openconnect.action;

import java.io.Serializable;

import com.internousdev.openconnect.dao.AddAppDAO;
import com.opensymphony.xwork2.ActionSupport;
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
     * メッセージ
     */
	private String messageAdd;

	/**
     * DAOにサイト情報を渡して結果を返す
     *
     * @author MAIKI OKANO
     * @return result データベースに情報を格納できたらSUCCESS、失敗したらERROR
     */
	public String execute() {
		String result = ERROR;
		AddAppDAO dao = new AddAppDAO();

		int count = 0;
		count = dao.insert(siteId, siteName, siteUrl, genre);

		if(count > 0){
			messageAdd = "追加が完了しました";
			return SUCCESS;
		}else{
			messageAdd = "追加出来ませんでした";
		}

		return result;
	}

	 /**
     * 取得メソッド サイトIDを取得
     *
     * @author MAIKI OKANO
     * @return siteId 取得するサイトID
     */
	public int getSiteId() {
		return siteId;
	}
	/**
     * 格納メソッド サイトIDを格納
     *
     * @author MAIKI OKANO
     * @param siteId 格納するサイトID
     */
	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}
	 /**
     * 取得メソッド サイトの名前を取得
     *
     * @author MAIKI OKANO
     * @return siteName 取得するサイトの名前
     */
	public String getSiteName() {
		return siteName;
	}
	/**
     * 格納メソッド サイトの名前を格納
     *
     * @author MAIKI OKANO
     * @param siteName 格納するサイト名前
     */
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	/**
     * 取得メソッド サイトURLを取得
     *
     * @author MAIKI OKANO
     * @return siteUrl 取得するサイトURL
     */
	public String getSiteUrl() {
		return siteUrl;
	}
	/**
     * 格納メソッド サイトURLを格納
     *
     * @author MAIKI OKANO
     * @param siteUrl 格納するサイトURL
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
     * @param genre 格納するサイトのジャンル
     */
	public void setGenre(String genre) {
		this.genre = genre;
	}
	/**
     * 取得メソッド メッセージを取得
     *
     * @author MAIKI OKANO
     * @return messageAdd 取得するメッセージ
     */
	public String getMessageAdd() {
		return messageAdd;
	}
	/**
     * 格納メソッド メッセージを格納
     *
     * @author MAIKI OKANO
     * @param messageAdd 格納するメッセージ
     */
	public void setMessageAdd(String messageAdd) {
		this.messageAdd = messageAdd;
	}
}
