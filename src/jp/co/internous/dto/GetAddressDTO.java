package jp.co.internous.dto;

public class GetAddressDTO {


	private int id;
	private String siteName;
	private String url;
	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id セットする id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return siteName
	 */
	public String getSiteName() {
		return siteName;
	}
	/**
	 * @param siteName セットする siteName
	 */
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	/**
	 * @return url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url セットする url
	 */
	public void setUrl(String url) {
		this.url = url;
	}



}