package com.internousdev.rewrite.dto;

public class MainActionDTO {

	private String site_janre;
	/**
     * 画像URL
     */
	private String image_url;
	/**
     * サイトURL
     */
	private String site_Banner;


	public String getSite_janre() {
		return site_janre;
	}
	public void setSite_janre(String site_janre) {
		this.site_janre = site_janre;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public String getSite_Banner() {
		return site_Banner;
	}
	public void setSite_Banner(String site_Banner) {
		this.site_Banner = site_Banner;
	}

}
