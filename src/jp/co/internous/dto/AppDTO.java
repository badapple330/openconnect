package jp.co.internous.dto;

public class AppDTO {
	private int site_id;
	private String site_name;
	private String site_url;
	private String site_group;

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
	public String getSite_group() {
		return site_group;
	}
	public void setSite_group(String site_group) {
		this.site_group = site_group;
	}
}