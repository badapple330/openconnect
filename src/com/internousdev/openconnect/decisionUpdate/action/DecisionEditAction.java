package com.internousdev.openconnect.decisionUpdate.action;

import com.internousdev.openconnect.decisionUpdate.dao.DecisionEditDAO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * DBの情報を画面に表示する為のクラス
 * @author TATUHUMI ITOU
 * @since 2016/09/04
 * @version 1.0
 */

public class DecisionEditAction extends ActionSupport {
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
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 * @author TATUHUMI ITOU
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute() {
		String result =ERROR;
		DecisionEditDAO dao = new DecisionEditDAO();
		int count = 0;
		count = dao.select(day,decisionType,userId,itemName,
				summary,cause,startDay,endDay,plan,persons,decisionDetailId);
		if(count > 0){
			result = SUCCESS;
		}
		return result;
	}
	/**
	 * 取得メソッド
	 * @author TATUHUMI ITOU
	 * @return day
	 */
	public String getDay() {
		return day;
	}
	/**
	 * 設定メソッド
	 * @author TATUHUMI ITOU
	 * @param day
	 */
	public void setDay(String day) {
		this.day = day;
	}
	/**
	 * 取得メソッド
	 * @author TATUHUMI ITOU
	 * @return decisionType
	 */
	public String getDecisionType() {
		return decisionType;
	}
	/**
	 * 設定メソッド
	 * @author TATUHUMI ITOU
	 * @param decisionType
	 */
	public void setDecisionType(String decisionType) {
		this.decisionType = decisionType;
	}
	/**
	 * 取得メソッド
	 * @author TATUHUMI ITOU
	 * @return userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * 設定メソッド
	 * @author TATUHUMI ITOU
	 * @param userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * 取得メソッド
	 * @author TATUHUMI ITOU
	 * @return itemName
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * 設定メソッド
	 * @author TATUHUMI ITOU
	 * @param itemName
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * 取得メソッド
	 * @author TATUHUMI ITOU
	 * @return summary
	 */
	public String getSummary() {
		return summary;
	}
	/**
	 * 設定メソッド
	 * @author TATUHUMI ITOU
	 * @param summary
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}
	/**
	 * 取得メソッド
	 * @author TATUHUMI ITOU
	 * @return cause
	 */
	public String getCause() {
		return cause;
	}
	/**
	 * 設定メソッド
	 * @author TATUHUMI ITOU
	 * @param cause
	 */
	public void setCause(String cause) {
		this.cause = cause;
	}
	/**
	 * 取得メソッド
	 * @author TATUHUMI ITOU
	 * @return startDay
	 */
	public String getStartDay() {
		return startDay;
	}
	/**
	 * 設定メソッド
	 * @author TATUHUMI ITOU
	 * @param startDay
	 */
	public void setStartDay(String startDay) {
		this.startDay = startDay;
	}
	/**
	 * 取得メソッド
	 * @author TATUHUMI ITOU
	 * @return endDay
	 */
	public String getEndDay() {
		return endDay;
	}
	/**
	 * 設定メソッド
	 * @author TATUHUMI ITOU
	 * @param endDay
	 */
	public void setEndDay(String endDay) {
		this.endDay = endDay;
	}
	/**
	 * 取得メソッド
	 * @author TATUHUMI ITOU
	 * @return plan
	 */
	public String getPlan() {
		return plan;
	}
	/**
	 * 設定メソッド
	 * @author TATUHUMI ITOU
	 * @param plan
	 */
	public void setPlan(String plan) {
		this.plan = plan;
	}
	/**
	 * 取得メソッド
	 * @author TATUHUMI ITOU
	 * @return persons
	 */
	public String getPersons() {
		return persons;
	}
	/**
	 * 設定メソッド
	 * @author TATUHUMI ITOU
	 * @param persons
	 */
	public void setPersons(String persons) {
		this.persons = persons;
	}
	/**
	 * 取得メソッド
	 * @author TATUHUMI ITOU
	 * @return decisionDetailId
	 */
	public int getDecisionDetailId() {
		return decisionDetailId;
	}
	/**
	 * 設定メソッド
	 * @author TATUHUMI ITOU
	 * @param decisionDetailId
	 */
	public void setDecisionDetailId(int decisionDetailId) {
		this.decisionDetailId = decisionDetailId;
	}
	/**
	 * 取得メソッド
	 * @author TATUHUMI ITOU
	 * @return
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
