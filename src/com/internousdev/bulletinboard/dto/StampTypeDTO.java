package com.internousdev.bulletinboard.dto;

import java.util.ArrayList;

public class StampTypeDTO {

	/**
	 * 種別ID
	 */
	private int typeId;

	/**
	 * スタンプURL
	 */
	private String typeUrl;

	/**
	 * 該当タイプのスタンプリスト
	 */
	private ArrayList<StampDTO> typedStampList= new ArrayList<StampDTO>();



	/**
	 * @return typeId
	 */
	public int getTypeId() {
		return typeId;
	}
	/**
	 * @param typeId セットする typeId
	 */
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}


	/**
	 * @return typedStampList
	 */
	public ArrayList<StampDTO> getTypedStampList() {
		return typedStampList;
	}

	/**
	 * @param typedStampList セットする typedStampList
	 */
	public void setTypedStampList(ArrayList<StampDTO> typedStampList) {
		this.typedStampList = typedStampList;
	}
	/**
	 * @return typeUrl
	 */
	public String getTypeUrl() {
		return typeUrl;
	}
	/**
	 * @param typeUrl セットする typeUrl
	 */
	public void setTypeUrl(String typeUrl) {
		this.typeUrl = typeUrl;
	}


}
