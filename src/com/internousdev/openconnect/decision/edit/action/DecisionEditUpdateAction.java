package com.internousdev.openconnect.decision.edit.action;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.internousdev.openconnect.decision.edit.dao.DecisionEditUpdateDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * DBの情報を画面に表示する為のクラス
 * @author TATUHUMI ITOU
 * @since 2016/09/04
 * @version 1.0
 */

public class DecisionEditUpdateAction extends ActionSupport {
	/**
	 * ファイル
	 */
	private List<File> myFile = new ArrayList<File>();
	/**
	 * ファイル種類
	 */
	private String myFileContentType;
	/**
	 * ファイル名
	 */
	private List<String> myFileFileName = new ArrayList<String>();
	/**
	 * 保存場所
	 */
	private String destPath;
	/**
	 * 日付
	 */
	private String day;
	/**
	 * 決裁分類
	 */
	private String decisionType;
	/**
	 * 起案者
	 */
	private int userId;
	/**
	 * 案件名
	 */
	private String itemName;
	/**
	 * 概要
	 */
	private String summary;
	/**
	 * 理由
	 */
	private String cause;
	/**
	 * 実地開始日
	 */
	private String startDay;
	/**
	 * 実地終了日
	 */
	private String endDay;
	/**
	 * 実地計画資料
	 */
	private String plan;
	/**
	 * 人数
	 */
	private String persons;
	/**
	 * 決裁手続きID
	 */
	private int decisionDetailId;;
	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -7586577377473680450L;
	/**
	 * エラーメッセージ
	 */
	private String resultString = "編集できませんでした。";
	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 * @author TATUHUMI ITOU
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute() {
		String result =ERROR;
		DecisionEditUpdateDAO dao = new DecisionEditUpdateDAO();
		int count = 0;
		count = dao.update(day,decisionType,userId,itemName,
				summary,cause,startDay,endDay,plan,persons,decisionDetailId);

		//ここでファイルの保存場所を決めています。
		//		destPath = "C:/plea/filetest/";
		destPath = System.getProperty("user.home") + File.separator + "temp" + File.separator;

		try{
			System.out.println("Src File name: " + myFile);
			System.out.println("Dst File name: " + myFileFileName);
			System.out.println(destPath);

			for(int i=0;i<myFile.size();i++){
				File destFile  = new File(destPath, myFileFileName.get(i));
				FileUtils.copyFile(myFile.get(i), destFile);
			}

		}catch(IOException e){
			e.printStackTrace();
		}
		if(count > 0){
			result = SUCCESS;
			resultString = "編集しました。";
		}

		return result;
	}
	/**
	 * ファイル取得メソッド
	 * @author TATUHUMI ITOU
	 * @return myFile
	 */
	public List<File> getMyFile() {
		return myFile;
	}
	/**
	 * ファイル設定メソッド
	 * @author TATUHUMI ITOU
	 * @param myFile
	 */
	public void setMyFile(List<File> myFile) {
		this.myFile = myFile;
	}
	/**
	 * ファイル種類取得メソッド
	 * @author TATUHUMI ITOU
	 * @return myFileContentType
	 */
	public String getMyFileContentType() {
		return myFileContentType;
	}
	/**
	 * ファイル種類設定メソッド
	 * @author TATUHUMI ITOU
	 * @param myFileContentType
	 */
	public void setMyFileContentType(String myFileContentType) {
		this.myFileContentType = myFileContentType;
	}
	/**
	 * ファイル名取得メソッド
	 * @author TATUHUMI ITOU
	 * @return myFileFileName
	 */
	public List<String> getMyFileFileName() {
		return myFileFileName;
	}
	/**
	 * ファイル名設定メソッド
	 * @author TATUHUMI ITOU
	 * @param myFileFileName
	 */
	public void setMyFileFileName(List<String> myFileFileName) {
		this.myFileFileName = myFileFileName;
	}
	/**
	 * 保存場所取得メソッド
	 * @author TATUHUMI ITOU
	 * @return destPath
	 */
	public String getDestPath() {
		return destPath;
	}

	/**
	 * 保存場所設定メソッド
	 * @author TATUHUMI ITOU
	 * @param destPath
	 */
	public void setDestPath(String destPath) {
		this.destPath = destPath;
	}

	/**
	 * 日付取得メソッド
	 * @author TATUHUMI ITOU
	 * @return day
	 */
	public String getDay() {
		return day;
	}
	/**
	 * 日付設定メソッド
	 * @author TATUHUMI ITOU
	 * @param day
	 */
	public void setDay(String day) {
		this.day = day;
	}
	/**
	 * 決裁分類取得メソッド
	 * @author TATUHUMI ITOU
	 * @return decisionType
	 */
	public String getDecisionType() {
		return decisionType;
	}
	/**
	 * 決裁分類設定メソッド
	 * @author TATUHUMI ITOU
	 * @param decisionType
	 */
	public void setDecisionType(String decisionType) {
		this.decisionType = decisionType;
	}
	/**
	 * 起案者取得メソッド
	 * @author TATUHUMI ITOU
	 * @return userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * 起案者設定メソッド
	 * @author TATUHUMI ITOU
	 * @param userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * 案件名取得メソッド
	 * @author TATUHUMI ITOU
	 * @return itemName
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * 案件名設定メソッド
	 * @author TATUHUMI ITOU
	 * @param itemName
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * 概要取得メソッド
	 * @author TATUHUMI ITOU
	 * @return summary
	 */
	public String getSummary() {
		return summary;
	}
	/**
	 * 概要設定メソッド
	 * @author TATUHUMI ITOU
	 * @param summary
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}
	/**
	 * 理由取得メソッド
	 * @author TATUHUMI ITOU
	 * @return cause
	 */
	public String getCause() {
		return cause;
	}
	/**
	 * 理由設定メソッド
	 * @author TATUHUMI ITOU
	 * @param cause
	 */
	public void setCause(String cause) {
		this.cause = cause;
	}
	/**
	 * 実施開始日取得メソッド
	 * @author TATUHUMI ITOU
	 * @return startDay
	 */
	public String getStartDay() {
		return startDay;
	}
	/**
	 * 実施開始日設定メソッド
	 * @author TATUHUMI ITOU
	 * @param startDay
	 */
	public void setStartDay(String startDay) {
		this.startDay = startDay;
	}
	/**
	 * 実施終了日取得メソッド
	 * @author TATUHUMI ITOU
	 * @return endDay
	 */
	public String getEndDay() {
		return endDay;
	}
	/**
	 * 実施終了日設定メソッド
	 * @author TATUHUMI ITOU
	 * @param endDay
	 */
	public void setEndDay(String endDay) {
		this.endDay = endDay;
	}
	/**
	 * 実地計画取得メソッド
	 * @author TATUHUMI ITOU
	 * @return plan
	 */
	public String getPlan() {
		return plan;
	}
	/**
	 * 実地計画設定メソッド
	 * @author TATUHUMI ITOU
	 * @param plan
	 */
	public void setPlan(String plan) {
		this.plan = plan;
	}
	/**
	 * 人数取得メソッド
	 * @author TATUHUMI ITOU
	 * @return persons
	 */
	public String getPersons() {
		return persons;
	}
	/**
	 * 人数設定メソッド
	 * @author TATUHUMI ITOU
	 * @param persons
	 */
	public void setPersons(String persons) {
		this.persons = persons;
	}
	/**
	 * 決裁手続きID取得メソッド
	 * @author TATUHUMI ITOU
	 * @return decisionDetailId
	 */
	public int getDecisionDetailId() {
		return decisionDetailId;
	}
	/**
	 * 決裁手続きID設定メソッド
	 * @author TATUHUMI ITOU
	 * @param decisionDetailId
	 */
	public void setDecisionDetailId(int decisionDetailId) {
		this.decisionDetailId = decisionDetailId;
	}
	/**
	 * 決裁手続きID取得メソッド
	 * @author TATUHUMI ITOU
	 * @return
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * エラーメッセージ取得メソッド
	 * @author TATUHUMI ITOU
	 * @return resultString
	 */
	public String getResultString() {
		return resultString;
	}
	/**
	 * エラーメッセージ設定メソッド
	 * @author TATUHUMI ITOU
	 * @param resultString
	 */
	public void setResultString(String resultString) {
		this.resultString = resultString;
	}


}
