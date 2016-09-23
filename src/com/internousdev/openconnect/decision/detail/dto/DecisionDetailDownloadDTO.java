package com.internousdev.openconnect.decision.detail.dto;

public class DecisionDetailDownloadDTO {

	/**
	 * ファイル名
	 */
	private String fileName;
	/**
	 * ファイルURL
	 */
	private String fileUrl;
	/**
	* 取得メソッド ファイル名を取得
	* @author KOHEI NITABARU
	* @return fileName
	*/
	public String getFileName() {
		return fileName;
	}
	/**
	* 設定メソッド ファイル名を設定
	* @author KOHEI NITABARU
	* @param fileName
	*/
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	/**
	* 取得メソッド ファイルURLを取得
	* @author KOHEI NITABARU
	* @return fileUrl
	*/
	public String getFileUrl() {
		return fileUrl;
	}
	/**
	* 設定メソッド ファイルURLを設定
	* @author KOHEI NITABARU
	* @param fileUrl
	*/
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

}
