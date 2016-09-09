package com.internousdev.openconnect.decisionDetail.dto;

public class DecisionDetailCheckDTO {

	private int decisionDetailId;
	private String password;
	/**
	* 取得メソッド
	* @author KENICHI HORIGUCHI
	* @return
	*/
	public int getDecisionDetailId() {
		return decisionDetailId;
	}
	/**
	* 設定メソッド
	* @author KENICHI HORIGUCHI
	* @param
	*/
	public void setDecisionDetailId(int decisionDetailId) {
		this.decisionDetailId = decisionDetailId;
	}
	/**
	* 取得メソッド
	* @author KENICHI HORIGUCHI
	* @return
	*/
	public String getPassword() {
		return password;
	}
	/**
	* 設定メソッド
	* @author KENICHI HORIGUCHI
	* @param
	*/
	public void setPassword(String password) {
		this.password = password;
	}

}
