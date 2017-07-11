package com.internousdev.bulletinboard.dto;

public class StampDTO {

	/** スタンプID */
	private int stampId;
	
	/** 種別ID */
	private int typeId;

	/** 使用可能レベル */
	private int userLevel;

	/** URL */
	private String url;
	

	public int getStampId() {
		return stampId;
	}

	public int getTypeId() {
		return typeId;
	}

	public int getUserLevel() {
		return userLevel;
	}

	public String getUrl() {
		return url;
	}

	public void setStampId(int stampId) {
		this.stampId = stampId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public void setUserLevel(int userLevel) {
		this.userLevel = userLevel;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
