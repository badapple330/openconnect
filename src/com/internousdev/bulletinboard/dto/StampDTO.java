package com.internousdev.bulletinboard.dto;

public class StampDTO {

	/**
	 * スタンプID
	 */
	private int stampId;
	/**
	 * 種別ID
	 */
	private int typeId;

	/**
	 * 使用可能レベル
	 */
	private int lv;

	/**
	 * URL
	 */
	private String url;

	/**
	 * @return stampId
	 */
	public int getStampId() {
		return stampId;
	}

	/**
	 * @return typeId
	 */
	public int getTypeId() {
		return typeId;
	}

	/**
	 * @return lv
	 */
	public int getLv() {
		return lv;
	}

	/**
	 * @return url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param stampId セットする stampId
	 */
	public void setStampId(int stampId) {
		this.stampId = stampId;
	}

	/**
	 * @param typeId セットする typeId
	 */
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	/**
	 * @param lv セットする lv
	 */
	public void setLv(int lv) {
		this.lv = lv;
	}

	/**
	 * @param url セットする url
	 */
	public void setUrl(String url) {
		this.url = url;
	}




}
