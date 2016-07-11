package jp.co.internous.action;

import com.opensymphony.xwork2.ActionSupport;

import jp.co.internous.dao.InsertDAO;

/**
 * InsertAction 管理者画面からサイト情報を追加する為のアクション
 *
 * @author Arima Genki
 * @since 2015/06/16
 * @version 1.0
 */
public class InsertAction extends ActionSupport {

	/**
	 * 結果
	 */
	private String site_id;
	/**
	 * サイト名
	 */
	private String site_name;
	/**
	 * URL
	 */
	private String site_url;
	/**
	 * 記事
	 */

	private String site_article;

	/**
	 * グループ
	 */
	private String site_group;
	/*
	 * サイト写真
	 */

	private String picture;

	/**
	 * バナー
	 */

	private String banner;

	private String errorMsg;

	/**
	 * 入力された値をDBに登録し、resultを返すメソッド
	 * @author Arima Genki
	 * @since 2015/06/16
	 * @return result
	 * @throws Exception
	 * @see InsertDAO
	 */
	public String execute() {
		String result = ERROR;
		InsertDAO dao = new InsertDAO();
		if (!dao.selectBySiteId(site_id)) {
			if (dao.insert(site_id, site_name, site_url, site_article, site_group, picture, banner) > 0) {
				result = SUCCESS;
			}
	}else{
	    	errorMsg = "そのＩＤは別のサイトで使用されています";
	}
	return result;
}

	public String getSite_id() {
			return site_id;
		}

	public void setSite_id(String site_id) {
		this.site_id = site_id;
	}

	public String getSite_name() {
		return site_name;
	}

	public void setSite_name(String site_name) {
		this.site_name = site_name;
	}

	public String getSite_url() {
		return site_url;
	}

	public void setSite_url(String site_url) {
		this.site_url = site_url;
	}

	public String getSite_article() {
		return site_article;
	}

	public void setSite_article(String site_article) {
		this.site_article = site_article;
	}

	public String getSite_group() {
		return site_group;
	}

	public void setSite_group(String site_group) {
		this.site_group = site_group;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getBanner() {
		return banner;
	}

	public void setBanner(String banner) {
		this.banner = banner;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
}
