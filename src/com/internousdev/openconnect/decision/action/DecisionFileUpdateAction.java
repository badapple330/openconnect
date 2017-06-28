/**
 *
 */
package com.internousdev.openconnect.decision.action;

import java.io.File;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.openconnect.decision.dao.DecisionDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Jun kikuchi
 * @since 2017/06/08
 * @version 1.0
 */
public class DecisionFileUpdateAction extends ActionSupport implements SessionAware{



	/**
	 * 資料ID
	 */
	private int documentId;

	/**
	 * セッション情報
	 */
	private Map<String,Object> session;

	/**
	 * 資料パス
	 */
	private String documentPath;

	/**
	 * 資料名
	 */
	private String documentName;



	/**
	 * 資料情報を追加する
	 * @author Kota Miyazato
	 * @since 2017/06/27
	 * @version 1.0
	 */
	public String execute()throws Exception{
		String result = ERROR;

		int inserted=0;
		 String documentName = new File(documentPath).getName();
	        System.out.println(documentName);
		DecisionDAO dao = new DecisionDAO();

		inserted=dao.insert(documentId,documentPath,documentName);

		if(inserted>0){
			result = SUCCESS;
		}
		return result;
	}



	/**
	 * 取得メソッド
	 * sessionを取得
	 * @author Jun kikuchi
	 * @return session セッション
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * 格納メソッド
	 * sessionを格納
	 * @author Jun kikuchi
	 * @param session セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
    /**
     * 取得メソッド
     * @autor Jun kikuchi
     * @return articleId
     */
	public int getArticleId() {
		return documentId;
	}

    /**
     * 格納メソッド
     * @autor Jun kikuchi
     * @param documentId アーティクルID
     */
	public void setDocumentId(int documentId) {
		this.documentId = documentId;
	}

    /**
     * 取得メソッド
     * @autor Jun kikuchi
     * @return documentPath
     */
	public String getDocumentPath() {
		return documentPath;
	}


    /**
     * 格納メソッド
     * @autor Jun kikuchi
     * @param documentPath イメージパス
     */
	public void setDocumentPath(String documentPath) {
		this.documentPath = documentPath;
	}
	/**
	 * 取得メソッド
	 * userIdを取得
	 * @author KOHEI NITABARU
	 * @return documentName 資料名
	 */
	public String getDocumentName() {
		return documentName;
	}



	/**
	 * 格納メソッド
	 * userIdを格納
	 * @author KOHEI NITABARU
	 * @param userId ユーザーＩＤ
	 */
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

}
