package com.internousdev.bulletinboard.dto;

public class ColorDTO {

	/**
	 * ヘッターカラー
	 */
	private String hColor;

	/**
	 * ボディカラー
	 */
	private String bColor;

	/**
	 * フッターカラー
	 */
	private String fColor;

	/**
	* 取得メソッド を取得
	* @return hColor
	*/
	public String gethColor() {
		return hColor;
	}

	/**
	* 設定メソッド を設定
	* @param hColor
	*/
	public void sethColor(String hColor) {
		this.hColor = hColor;
	}

	/**
	* 取得メソッド を取得
	* @return bColor
	*/
	public String getbColor() {
		return bColor;
	}

	/**
	* 設定メソッド を設定
	* @param bColor
	*/
	public void setbColor(String bColor) {
		this.bColor = bColor;
	}

	/**
	* 取得メソッド を取得
	* @return fColor
	*/
	public String getfColor() {
		return fColor;
	}

	/**
	* 設定メソッド を設定
	* @param fColor
	*/
	public void setfColor(String fColor) {
		this.fColor = fColor;
	}

}
