package com.internousdev.openconnect.decision.detail.action;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/**
 * DBの情報を画面に表示する為のクラス
 * @author KOHEI NITABARU
 * @since 2016/09/04
 * @version 1.0
 */
public class DecisionDetailDownloadAction extends ActionSupport {
	/**
	 * ファイル名リスト
	 */
	private String fileName;
	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -7586577377473680450L;
	/**
	 * 結果文字
	 */
	private String resultString = "ダウンロードに失敗しました。";
	/**
	 * エンコードしたファイル名
	 */
	private String encodedFileName;
	/**
	 * ファイルサイズ
	 */
	private long contentLength;
	/**
	 * ストリーム
	 */
	private InputStream inputStream;
	/**
	 * 管理者権限メソッド
	 */
	public Map<String, Object> session;

	/**
	 * 実行メソッド ファイルダウンロード
	 * @author KOHEI NITABARU
	 */
	public String execute(){

		String destPath = System.getProperty("user.home") + File.separator + "temp" + File.separator;

		// ダウンロード対象ファイル
		String filePath = destPath + fileName;

		// 対象ファイル読み込み
		File exportFile = new File(filePath);


		try{
			// ストリームに読込
			this.inputStream = new BufferedInputStream(
					new FileInputStream(filePath));

			// ファイルサイズ取得
			this.contentLength = exportFile.length();

			// ブラウザで分岐
			String agent = ServletActionContext.getRequest()
					.getHeader("User-Agent");
			if (agent.indexOf("IE ") >= 0) {
				// IE
				this.fileName = URLEncoder.encode(exportFile.getName(), "UTF-8");
				this.encodedFileName = URLEncoder.encode(exportFile.getName(),
						"UTF-8");
			} else {
				// IE以外
				this.fileName = exportFile.getName();
				this.encodedFileName = URLEncoder.encode(exportFile.getName(),
						"UTF-8");
			}
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
	/**
	* 取得メソッド ファイルエンコード名を取得
	* @author KOHEI NITABARU
	* @return encodedFileName
	*/
	public String getEncodedFileName() {
		return encodedFileName;
	}
	/**
	* 設定メソッド ファイルエンコード名を設定
	* @author KOHEI NITABARU
	* @param encodedFileName
	*/
	public void setEncodedFileName(String encodedFileName) {
		this.encodedFileName = encodedFileName;
	}
	/**
	* 取得メソッド 文字数を取得
	* @author KOHEI NITABARU
	* @return contentLength
	*/
	public long getContentLength() {
		return contentLength;
	}
	/**
	* 設定メソッド 文字数を設定
	* @author KOHEI NITABARU
	* @param contentLength
	*/
	public void setContentLength(long contentLength) {
		this.contentLength = contentLength;
	}
	/**
	* 取得メソッド 入力ストリームを取得
	* @author KOHEI NITABARU
	* @return inputStream
	*/
	public InputStream getInputStream() {
		return inputStream;
	}
	/**
	* 設定メソッド 入力ストリームを設定
	* @author KOHEI NITABARU
	* @param inputStream
	*/
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}
	/**
	* 取得メソッド を取得
	* @author KOHEI NITABARU
	* @return session
	*/
	public Map<String, Object> getSession() {
		return session;
	}
	/**
	* 設定メソッド を設定
	* @author KOHEI NITABARU
	* @param session
	*/
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
