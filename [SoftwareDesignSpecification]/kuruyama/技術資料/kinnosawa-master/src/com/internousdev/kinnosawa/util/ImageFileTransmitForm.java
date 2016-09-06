/*
 * タイトル：取得したﾌｧｲﾙのデータを格納する為の処理
 * 説明    ：取得したﾌｧｲﾙのデータを格納する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */

package com.internousdev.kinnosawa.util;

import java.io.File;

public class ImageFileTransmitForm{
	/**
	 *  ファイル
	 */
	private File uploadFile;
	/**
	 *  ファイルの拡張子
	 */
	private String uploadFileContentType;
	/**
	 *  ファイル名称
	 */
	private String uploadFileFileName;

	/**
	 * ファイルを取得する為のメソッド
	 * @return uploadFile ファイル
	 */
	public File getUploadFile() {
		return uploadFile;
	}

	/**
	 * ファイルを格納する為のメソッド
	 * @param uploadFile ファイル
	 */
	public void setUploadFile(File uploadFile) {
		this.uploadFile = uploadFile;
	}

	/**
	 * ファイルの拡張子を取得する為のメソッド
	 * @return uploadFileContentType ファイルの拡張子
	 */
	public String getUploadFileContentType() {
		return uploadFileContentType;
	}

	/**
	 * ファイルの拡張子を格納する為のメソッド
	 * @param uploadFileContentType ファイルの拡張子
	 */
	public void setUploadFileContentType(String uploadFileContentType) {
		this.uploadFileContentType = uploadFileContentType;
	}

	/**
	 * ファイル名称を取得する為のメソッド
	 * @return the uploadFileFileName
	 */
	public String getUploadFileFileName() {
		return uploadFileFileName;
	}

	/**
	 * ファイル名称を格納する為のメソッド
	 * @param uploadFileFileName ファイル名称
	 */
	public void setUploadFileFileName(String uploadFileFileName) {
		this.uploadFileFileName = uploadFileFileName;
	}

}