package com.internousdev.bulletinboard.dto;

import java.util.ArrayList;

public class StampPackageDTO {

	/** スタンプパッケージID */
	private int stampPackageId;
	/** スタンプパッケージ名 */
	private String stampPackageName;
	/** 解禁されるレベル */
	private int userLevel;
	/** 該当パッケージのスタンプリスト */
	private ArrayList<StampDTO> stampList = new ArrayList<StampDTO>();


	public int getStampPackageId() {
		return stampPackageId;
	}
	public void setStampPackageId(int typeId) {
		this.stampPackageId = typeId;
	}
	public String getStampPackageName() {
		return stampPackageName;
	}
	public void setStampPackageName(String stampPackageName) {
		this.stampPackageName = stampPackageName;
	}
	public int getUserLevel() {
		return userLevel;
	}
	public void setUserLevel(int userLevel) {
		this.userLevel = userLevel;
	}
	public ArrayList<StampDTO> getStampList() {
		return stampList;
	}
	public void setStampList(ArrayList<StampDTO> typedStampList) {
		this.stampList = typedStampList;
	}
}
