/**
 *
 */
package com.internousdev.rewrite.action;

import com.internousdev.rewrite.dao.AdminArticleNewDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 新規記事を作成し、DBに格納するクラス
 * @author SANSHIRO KOCHO
 * @since 2016/8/23
 */
public class AdminArticleNewAction extends ActionSupport{

	private String siteDate;

	 private String siteJanre;

	private String siteTitle;

	private String summary;

	private String imageUrl;

	private String siteBanner;


	/**
	 * 新規記事を作成し、DBに格納するメソッド
	 * @author SANSHIRO KOCHO
	 * @return　DBへの格納が成功したらSUCCESS,失敗したらERROR
	 */
	public String execute(){

		String result=ERROR;
		AdminArticleNewDAO dao = new AdminArticleNewDAO();
		int count = 0;
		count = dao.insert(siteDate,siteJanre,siteTitle,summary,imageUrl,siteBanner);

		if (count > 0) {
			result = SUCCESS;
		}
		return result;
	}



	public String getSiteDate() {
		return siteDate;
	}

	public void setSiteDate(String siteDate) {
		this.siteDate = siteDate;
	}

	public String getSiteJanre() {
		return siteJanre;
	}

	public void setSiteJanre(String siteJanre) {
		this.siteJanre = siteJanre;
	}

	public String getSiteTitle() {
		return siteTitle;
	}

	public void setSiteTitle(String siteTitle) {
		this.siteTitle = siteTitle;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getSiteBanner() {
		return siteBanner;
	}

	public void setSiteBanner(String siteBanner) {
		this.siteBanner = siteBanner;
	}




}
