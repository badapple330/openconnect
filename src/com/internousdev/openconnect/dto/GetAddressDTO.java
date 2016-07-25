package com.internousdev.openconnect.dto;

/**
 * GetAddressDTO
 *
 * @author MAIKI OKANO
 * @since 2016/07/22
 * @version 1.0
 */
public class GetAddressDTO{

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
     * @return genrul
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

}