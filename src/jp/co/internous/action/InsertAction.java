package jp.co.internous.action;

import com.opensymphony.xwork2.ActionSupport;

import jp.co.internous.dao.InsertDAO;

public class InsertAction extends ActionSupport {
	private int site_id;
	private String site_name;
	private String site_url;
	private String errorMsg;
	private String site_group;
	/*
	private String site_article;
	private String picture;
	private String banner;
	*/
	public String execute() {
		String result = ERROR;
		InsertDAO dao = new InsertDAO();

		int count = 0;
		count = dao.insert(site_id, site_name, site_url, site_group);

		if(count > 0){
			return SUCCESS;
		}
		return result;
	}
	public int getSite_id() {
		return site_id;
	}
	public void setSite_id(int site_id) {
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
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getSite_group() {
		return site_group;
	}
	public void setSite_group(String site_group) {
		this.site_group = site_group;
	}
}
