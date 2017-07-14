package com.internousdev.bulletinboard.dto;

public class StampDTO {
	/** スタンプID */
	private int stampId;
	/** スタンプパッケージID */
	private int stampPackageId;
	/** 使用可能レベル */
	private int userLevel;

	public int getStampId() {
		return stampId;
	}
	public void setStampId(int stampId) {
		this.stampId = stampId;
	}
	public int getStampPackageId() {
		return stampPackageId;
	}
	public void setStampPackageId(int stampPackageId) {
		this.stampPackageId = stampPackageId;
	}
	public int getUserLevel() {
		return userLevel;
	}
	public void setUserLevel(int userLevel) {
		this.userLevel = userLevel;
	}
	public String getStamp() {
		return stamp;
	}
	public void setStamp(String stamp) {
		this.stamp = stamp;
	}
	/** スタンプのパス */
	private String stamp;
}
