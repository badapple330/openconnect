/*
 * タイトル：画像を追加する為の処理
 * 説明    ：admin_item.jspから受け取った画像データをディレクトリに追加する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.action;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.omg.CORBA.SystemException;

import com.internousdev.kinnosawa.util.ImageFileTransmitForm;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internous
 *
 */
public class ImageUploadAction extends ActionSupport{

	/**
	 * 画像をディレクトリに追加する為のクラス
	 * @author H.Hagiwara
	 * @version 1.0
	 * @since 1.0
	 */
	private static final long serialVersionUID = 5177520417277024454L;

	/**
	 * 画像を受け取るフォーム
	 */
	ImageFileTransmitForm form = new ImageFileTransmitForm();

	/**
	 * 画像の最大サイズ
	 */
	long fileMaxSize = 2097152;//2MB

	/**
	 * 単品画像の相対ﾊﾟｽ
	 */
	String realPath = ServletActionContext.getServletContext().getRealPath("/images/slide");

	/**
	 * セット画像の相対ﾊﾟｽ
	 */
	String realSetPath = ServletActionContext.getServletContext().getRealPath("/images/itemDetails");

	/**
	 * エラーメッセージ
	 */
	private String messageImg;


	/**
	 * 相対ﾊﾟｽを取得する為のメソッド
	 * @return 必ず realPath を返します。
	 * @throws SystemException システムエラー
	 */
	public String doInit() throws SystemException {

		return realPath;
	}


	/**
	 * 画像をアップロードする為のメソッド
	 * @return アップロードできたら SUCCESS できなかったら ERROR
	 * @throws SystemException システムエラー
	 */
	public String doFileUpload() throws SystemException {

		String uploadFileFileName = form.getUploadFileFileName();
		if(uploadFileFileName != null){
		//uploadFileFileName = uploadFileFileName.substring(uploadFileFileName.lastIndexOf('.'));
		//イメージファイルじゃない場合、異常を返す
			if(uploadFileFileName.substring(uploadFileFileName.length()-4).equals(".jpg")||
				uploadFileFileName.substring(uploadFileFileName.length()-4).equals("jpeg")||
				uploadFileFileName.substring(uploadFileFileName.length()-4).equals(".gif")||
				uploadFileFileName.substring(uploadFileFileName.length()-4).equals(".png")){
		if(!isImageFile(form.getUploadFileContentType())) {
			// return error;//TODO
		}
		// 空ファイル、またはファイルサイズ２M以上の場合、異常を返す
		if(form.getUploadFile() == null || form.getUploadFile().length()>fileMaxSize) {
			// return maxSizeError;//TODO
		}

		File filePath = new File(new File(realPath), uploadFileFileName);
		// ディレクトリ存在しない場合、新なディレクトリを作成
		if(!filePath.getParentFile().exists()) {
			filePath.getParentFile().mkdirs();
		}

		 try {
			// ★コピーを実施
            		 FileUtils.copyFile(form.getUploadFile(), filePath);
            		 messageImg = getText("admin_item.imageUpSuccess");
	         } catch (IOException e) {
	    		 messageImg = (getText("admin_item.imageUpError"));
	             e.printStackTrace();
	         }
		}else{
			 messageImg = (getText("admin_item.imageUpError"));
		}
		}else{
			 messageImg = (getText("admin_item.imageUpError"));
		}
		return "uploadSuccess";
	}

	public String doFileUploadSet() throws SystemException {


		String uploadFileFileName = form.getUploadFileFileName();
		if(uploadFileFileName != null){
		//uploadFileFileName = uploadFileFileName.substring(uploadFileFileName.lastIndexOf('.'));
		//イメージファイルじゃない場合、異常を返す
			if(uploadFileFileName.substring(uploadFileFileName.length()-4).equals(".jpg")||
					uploadFileFileName.substring(uploadFileFileName.length()-4).equals("jpeg")||
					uploadFileFileName.substring(uploadFileFileName.length()-4).equals(".gif")||
					uploadFileFileName.substring(uploadFileFileName.length()-4).equals(".png")){
		if(!isImageFile(form.getUploadFileContentType())) {
			// return error;//TODO
		}
		// 空ファイル、またはファイルサイズ２M以上の場合、異常を返す
		if(form.getUploadFile() == null || form.getUploadFile().length()>fileMaxSize) {
			// return maxSizeError;//TODO
		}

		File filePath = new File(new File(realSetPath), uploadFileFileName);
		// ディレクトリ存在しない場合、新なディレクトリを作成
		if(!filePath.getParentFile().exists()) {
			filePath.getParentFile().mkdirs();
		}

		 try {
			// ★コピーを実施
            		 FileUtils.copyFile(form.getUploadFile(), filePath);
            		 messageImg = getText("admin_item.imageUpSuccess");
	         } catch (IOException e) {
	    		 messageImg =  (getText("admin_item.imageUpError"));
	             e.printStackTrace();
	         }
		 }else{
	 			messageImg =  (getText("admin_item.imageUpError"));
		 }
		}else{
			messageImg =  (getText("admin_item.imageUpError"));
		}
		return "uploadSuccess";
	}



	/**
	 *
	 * @param extension
	 *            　ファイルの拡張子
	 * @return
	 */
	private boolean isImageFile(String extension) {

		return (extension.equals("image/gif")
				|| extension.equals("image/jpeg")
				|| extension.equals("image/png")
				|| extension.equals("image/bmp")
				|| extension.equals("image/x-icon")
				|| extension.equals("image/pjpeg"));

	}

	/**
	 * 画像を受け取るフォームを取得する為のメソッド
	 * @return form 画像を受け取るフォーム
	 */
	public ImageFileTransmitForm getForm() {
		return form;
	}


	/**
	 * 画像を受け取るフォームを格納する為のメソッド
	 * @param form 画像を受け取るフォーム
	 */
	public void setForm(ImageFileTransmitForm form) {
		this.form = form;
	}

	/**
	 * エラーメッセージ を取得する為のメソッド
	 * @return messageImg エラーメッセージ
	 */
	public String getMessageImg() {
		return messageImg;
	}

	/**
	 * エラーメッセージ を格納する為のメソッド
	 * @param messageImg エラーメッセージ
	 */
	public void setMessageImg(String messageImg) {
		this.messageImg = messageImg;
	}

}