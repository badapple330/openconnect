/**
 *
 */
package com.internousdev.openconnect.projectStatus.action;

import java.util.ArrayList;

import com.internousdev.openconnect.projectStatus.dao.ProjectStatusUpdateDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * DBの情報を更新する為のクラス
 * @author KOHEI NITABARU
 * @since 2016/09/04
 * @version 1.0
 */
public class ProjectStatusUpdateAction extends ActionSupport{

	/**
	 * シリアル番号
	 */
	private static final long serialVersionUID = 671961516965709160L;
	/**
	 * A環境開始日
	 */
	private ArrayList<String> aEnvStartList = new ArrayList<String>();
	/**
	 * A環境終了日
	 */
	private ArrayList<String> aEnvEndList = new ArrayList<String>();
	/**
	 * B環境開始日
	 */
	private ArrayList<String> bEnvStartList = new ArrayList<String>();
	/**
	 * B環境終了日
	 */
	private ArrayList<String> bEnvEndList = new ArrayList<String>();
	/**
	 * リリース環境開始日
	 */
	private ArrayList<String> rEnvStartList = new ArrayList<String>();
	/**
	 * リリース環境終了日
	 */
	private ArrayList<String> rEnvEndList = new ArrayList<String>();
	/**
	 * リリース状況
	 */
	private ArrayList<String> awsStatusList = new ArrayList<String>();
	/**
	 * 備考
	 */
	private ArrayList<String> noteList = new ArrayList<String>();
	/**
	 * リリース状況ID
	 */
	private ArrayList<Integer> statusIdList = new ArrayList<Integer>();
	/**
	 * 結果文字
	 */
	private String resultString = "";

	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 * @author KOHEI NITABARU
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute(){
		String result = ERROR;
		ProjectStatusUpdateDAO dao = new ProjectStatusUpdateDAO();

		int count = 0;

		for( int i=0; i<statusIdList.size(); i++ ){

			count += dao.update( aEnvStartList.get(i), aEnvEndList.get(i), bEnvStartList.get(i),
					bEnvEndList.get(i), rEnvStartList.get(i), rEnvEndList.get(i), awsStatusList.get(i), noteList.get(i), statusIdList.get(i) );
		}

		if( count != 0 ){

			result = SUCCESS;
			resultString = "更新に成功しました";
		}

		return result;
	}

	/**
	 * 取得メソッド
	 * @author KOHEI NITABARU
	 * @return aEnvStartList
	 */
	public ArrayList<String> getaEnvStartList() {
		return aEnvStartList;
	}

	/**
	 * 設定メソッド
	 * @author KOHEI NITABARU
	 * @param aEnvStartList
	 */
	public void setaEnvStartList(ArrayList<String> aEnvStartList) {
		this.aEnvStartList = aEnvStartList;
	}

	/**
	 * 取得メソッド
	 * @author KOHEI NITABARU
	 * @return aEnvEndList
	 */
	public ArrayList<String> getaEnvEndList() {
		return aEnvEndList;
	}

	/**
	 * 設定メソッド
	 * @author KOHEI NITABARU
	 * @param aEnvEndList
	 */
	public void setaEnvEndList(ArrayList<String> aEnvEndList) {
		this.aEnvEndList = aEnvEndList;
	}

	/**
	 * 取得メソッド
	 * @author KOHEI NITABARU
	 * @return bEnvStartList
	 */
	public ArrayList<String> getbEnvStartList() {
		return bEnvStartList;
	}

	/**
	 * 設定メソッド
	 * @author KOHEI NITABARU
	 * @param bEnvStartList
	 */
	public void setbEnvStartList(ArrayList<String> bEnvStartList) {
		this.bEnvStartList = bEnvStartList;
	}

	/**
	 * 取得メソッド
	 * @author KOHEI NITABARU
	 * @return bEnvEndList
	 */
	public ArrayList<String> getbEnvEndList() {
		return bEnvEndList;
	}

	/**
	 * 設定メソッド
	 * @author KOHEI NITABARU
	 * @param bEnvEndList
	 */
	public void setbEnvEndList(ArrayList<String> bEnvEndList) {
		this.bEnvEndList = bEnvEndList;
	}

	/**
	 * 取得メソッド
	 * @author KOHEI NITABARU
	 * @return rEnvStartList
	 */
	public ArrayList<String> getrEnvStartList() {
		return rEnvStartList;
	}

	/**
	 * 設定メソッド
	 * @author KOHEI NITABARU
	 * @param rEnvStartList
	 */
	public void setrEnvStartList(ArrayList<String> rEnvStartList) {
		this.rEnvStartList = rEnvStartList;
	}

	/**
	 * 取得メソッド
	 * @author KOHEI NITABARU
	 * @return rEnvEndList
	 */
	public ArrayList<String> getrEnvEndList() {
		return rEnvEndList;
	}

	/**
	 * 設定メソッド
	 * @author KOHEI NITABARU
	 * @param rEnvEndList
	 */
	public void setrEnvEndList(ArrayList<String> rEnvEndList) {
		this.rEnvEndList = rEnvEndList;
	}

	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return awsStatusList
	*/
	public ArrayList<String> getAwsStatusList() {
		return awsStatusList;
	}

	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param awsStatusList
	*/
	public void setAwsStatusList(ArrayList<String> awsStatusList) {
		this.awsStatusList = awsStatusList;
	}

	/**
	 * 取得メソッド
	 * @author KOHEI NITABARU
	 * @return noteList
	 */
	public ArrayList<String> getNoteList() {
		return noteList;
	}

	/**
	 * 設定メソッド
	 * @author KOHEI NITABARU
	 * @param noteList
	 */
	public void setNoteList(ArrayList<String> noteList) {
		this.noteList = noteList;
	}

	/**
	 * 取得メソッド
	 * @author KOHEI NITABARU
	 * @return statusIdList
	 */
	public ArrayList<Integer> getStatusIdList() {
		return statusIdList;
	}

	/**
	 * 設定メソッド
	 * @author KOHEI NITABARU
	 * @param statusIdList
	 */
	public void setStatusIdList(ArrayList<Integer> statusIdList) {
		this.statusIdList = statusIdList;
	}

	/**
	 * 取得メソッド
	 * @author KOHEI NITABARU
	 * @return resultString
	 */
	public String getResultString() {
		return resultString;
	}

	/**
	 * 設定メソッド
	 * @author KOHEI NITABARU
	 * @param resultString
	 */
	public void setResultString(String resultString) {
		this.resultString = resultString;
	}

	/**
	 * 取得メソッド
	 * @author KOHEI NITABARU
	 * @return serialVersionUID
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
