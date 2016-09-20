/**
 *
 */
package com.internousdev.rewrite.action;

import com.internousdev.rewrite.dao.AdminArticleEditDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * AdminArticleAction
 * @author KOCHO SANSHIRO
 *@since 2016/08/18
 *@version 1.0
 */
public class AdminArticleEditAction extends ActionSupport  {

	private String siteDate;
	private String siteTitle;
	private String newSiteTitle;
	private String summary;
	private String siteJanre;
	private String siteBanner;
	private String imageUrl;
	/**
	 *
	 * 記事を編集、更新するメソッド
	 * @author KOCHO SANSHIRO
	 * @return
	 */
	public String execute(){
		String result = ERROR;
		int count =0;
		AdminArticleEditDAO dao=new AdminArticleEditDAO();
		count = dao.update(siteDate,siteTitle,newSiteTitle,siteJanre,imageUrl,summary,siteBanner);
		if(count > 0){
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
	public String getSiteTitle() {
		return siteTitle;
	}
	public void setSiteTitle(String siteTitle) {
		this.siteTitle = siteTitle;
	}
	public String getNewSiteTitle() {
		return newSiteTitle;
	}
	public void setNewSiteTitle(String newSiteTitle) {
		this.newSiteTitle = newSiteTitle;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getSiteJanre() {
		return siteJanre;
	}
	public void setSiteJanre(String siteJanre) {
		this.siteJanre = siteJanre;
	}
	public String getSiteBanner() {
		return siteBanner;
	}
	public void setSiteBanner(String siteBanner) {
		this.siteBanner = siteBanner;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}



}

