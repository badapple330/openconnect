package com.internousdev.openconnect.decision.detail.action;

import java.io.File;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.ActionSupport;
/**
 * DBの情報を画面に表示する為のクラス
 * @author TATUHUMI ITOU
 * @since 2016/09/04
 * @version 1.0
 */

public class DecisionDetailDownloadAction extends ActionSupport {
	/**
	 * ファイル名リスト
	 */
	private String fileName;
	/**
	 * 保存URL
	 */
	private String saveUrl = "C:/Users/internous/temp2/";
	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -7586577377473680450L;
	/**
	 * 結果文字
	 */
	private String resultString = "ダウンロードに失敗しました。";
	/**
	 * 実行メソッド ファイルダウンロード
	 * @author KOHEI NITABARU
	 */
	public String execute(){

		String destPath = System.getProperty("user.home") + File.separator + "temp" + File.separator;

		try{

			File file1  = new File(destPath, fileName);
			File file2  = new File(saveUrl, fileName);
			FileUtils.copyFile(file1, file2);

			resultString = fileName + "をダウンロードしました。";
		}catch( Exception e ){
			e.printStackTrace();
		}

		return SUCCESS;
	}
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
	* 取得メソッド 保存URLを取得
	* @author KOHEI NITABARU
	* @return saveUrl
	*/
	public String getSaveUrl() {
		return saveUrl;
	}
	/**
	* 設定メソッド 保存URLを設定
	* @author KOHEI NITABARU
	* @param saveUrl
	*/
	public void setSaveUrl(String saveUrl) {
		this.saveUrl = saveUrl;
	}
	/**
	* 取得メソッド シリアル番号を取得
	* @author KOHEI NITABARU
	* @return serialVersionUID
	*/
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	* 取得メソッド 結果文字を取得
	* @author KOHEI NITABARU
	* @return resultString
	*/
	public String getResultString() {
		return resultString;
	}
	/**
	* 設定メソッド 結果文字を設定
	* @author KOHEI NITABARU
	* @param resultString
	*/
	public void setResultString(String resultString) {
		this.resultString = resultString;
	}

}
