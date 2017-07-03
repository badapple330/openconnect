/**
 *
 */
package com.internousdev.openconnect.decision.detail.action;

import java.util.ArrayList;

import com.internousdev.openconnect.decision.detail.dao.DecisionArchiveDAO;
import com.internousdev.openconnect.decision.dto.DecisionDTO;
import com.opensymphony.xwork2.ActionSupport;

public class DecisionArchiveAction extends ActionSupport {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 6045130027645771884L;

	/**
	 * サイトID
	 */
	private int siteId;

	/**
	 * サイト名
	 */
	private String siteName;

	/**
	 * サイトURL
	 */
	private String siteUrl;

	/**
	 * 作成年度
	 */
	private int year;




	/**
	 * 決裁手続きの情報をリスト化
	 */
	private ArrayList<DecisionDTO> archiveList = new  ArrayList<DecisionDTO>();

	/**
	 * エラーメッセージ
	 */
	private String resultString = "失敗";


	public String execute() {

		String result=ERROR;
		DecisionArchiveDAO dao = new DecisionArchiveDAO();

		archiveList = dao.archive(siteId, siteName, siteUrl, year);
		if(archiveList.size() > 0){
			result=SUCCESS;
			resultString="成功";
		}
		return result;

	}


	/**
	* 取得メソッド を取得
	* @return archiveList
	*/
	public ArrayList<DecisionDTO> getArchiveList() {
		return archiveList;
	}


	/**
	* 設定メソッド を設定
	* @param archiveList
	*/
	public void setArchiveList(ArrayList<DecisionDTO> archiveList) {
		this.archiveList = archiveList;
	}


	/**
	* 取得メソッド を取得
	* @return siteId
	*/
	public int getSiteId() {
		return siteId;
	}


	/**
	* 設定メソッド を設定
	* @param siteId
	*/
	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}


	/**
	* 取得メソッド を取得
	* @return siteName
	*/
	public String getSiteName() {
		return siteName;
	}


	/**
	* 設定メソッド を設定
	* @param siteName
	*/
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}


	/**
	* 取得メソッド を取得
	* @return siteUrl
	*/
	public String getSiteUrl() {
		return siteUrl;
	}


	/**
	* 設定メソッド を設定
	* @param siteUrl
	*/
	public void setSiteUrl(String siteUrl) {
		this.siteUrl = siteUrl;
	}


	/**
	* 取得メソッド を取得
	* @return year
	*/
	public int getYear() {
		return year;
	}


	/**
	* 設定メソッド を設定
	* @param year
	*/
	public void setYear(int year) {
		this.year = year;
	}


	/**
	* 取得メソッド を取得
	* @return resultString
	*/
	public String getResultString() {
		return resultString;
	}


	/**
	* 設定メソッド を設定
	* @param resultString
	*/
	public void setResultString(String resultString) {
		this.resultString = resultString;
	}





}
