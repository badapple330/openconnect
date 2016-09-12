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
	 * 決裁手続きリスト
	 */

	private String day;
	private String decisionType;
	private int userId;
	private String itemName;
	private String summary;
	private String cause;
	private String startDay;
	private String endDay;
	private String plan;
	private String persons;
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
		System.out.println(1);
		count = dao.select(day,decisionType,userId,itemName,
				summary,cause,startDay,endDay,plan,persons,decisionDetailId);
		System.out.println(3);
		if(count > 0){
			result = SUCCESS;
		}
		return result;
	}
	/**
	 * 取得メソッド
	 * @author KENICHI HORIGUCHI
	 * @return
	 */
	public String getDay() {
		return day;
	}
	/**
	 * 設定メソッド
	 * @author KENICHI HORIGUCHI
	 * @param
	 */
	public void setDay(String day) {
		this.day = day;
	}
	/**
	 * 取得メソッド
	 * @author KENICHI HORIGUCHI
	 * @return

	/**
	 * 取得メソッド
	 * @author KENICHI HORIGUCHI
	 * @return
	 */
	public String getDecisionType() {
		return decisionType;
	}
	/**
	 * 設定メソッド
	 * @author KENICHI HORIGUCHI
	 * @param
	 */
	public void setDecisionType(String decisionType) {
		this.decisionType = decisionType;
	}
	/**
	 * 取得メソッド
	 * @author KENICHI HORIGUCHI
	 * @return
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * 設定メソッド
	 * @author KENICHI HORIGUCHI
	 * @param
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * 取得メソッド
	 * @author KENICHI HORIGUCHI
	 * @return
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * 設定メソッド
	 * @author KENICHI HORIGUCHI
	 * @param
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * 取得メソッド
	 * @author KENICHI HORIGUCHI
	 * @return
	 */
	public String getSummary() {
		return summary;
	}
	/**
	 * 設定メソッド
	 * @author KENICHI HORIGUCHI
	 * @param
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}
	/**
	 * 取得メソッド
	 * @author KENICHI HORIGUCHI
	 * @return
	 */
	public String getCause() {
		return cause;
	}
	/**
	 * 設定メソッド
	 * @author KENICHI HORIGUCHI
	 * @param
	 */
	public void setCause(String cause) {
		this.cause = cause;
	}
	/**
	 * 取得メソッド
	 * @author KENICHI HORIGUCHI
	 * @return
	 */
	public String getStartDay() {
		return startDay;
	}
	/**
	 * 設定メソッド
	 * @author KENICHI HORIGUCHI
	 * @param
	 */
	public void setStartDay(String startDay) {
		this.startDay = startDay;
	}
	/**
	 * 取得メソッド
	 * @author KENICHI HORIGUCHI
	 * @return
	 */
	public String getEndDay() {
		return endDay;
	}
	/**
	 * 設定メソッド
	 * @author KENICHI HORIGUCHI
	 * @param
	 */
	public void setEndDay(String endDay) {
		this.endDay = endDay;
	}
	/**
	 * 取得メソッド
	 * @author KENICHI HORIGUCHI
	 * @return
	 */
	public String getPlan() {
		return plan;
	}
	/**
	 * 設定メソッド
	 * @author KENICHI HORIGUCHI
	 * @param
	 */
	public void setPlan(String plan) {
		this.plan = plan;
	}
	/**
	 * 取得メソッド
	 * @author KENICHI HORIGUCHI
	 * @return
	 */
	public String getPersons() {
		return persons;
	}
	/**
	 * 設定メソッド
	 * @author KENICHI HORIGUCHI
	 * @param
	 */
	public void setPersons(String persons) {
		this.persons = persons;
	}
	/**
	 * 取得メソッド
	 * @author KENICHI HORIGUCHI
	 * @return
	 */
	public int getDecisionDetailId() {
		return decisionDetailId;
	}
	/**
	 * 設定メソッド
	 * @author KENICHI HORIGUCHI
	 * @param
	 */
	public void setDecisionDetailId(int decisionDetailId) {
		this.decisionDetailId = decisionDetailId;
	}
	/**
	 * 取得メソッド
	 * @author KENICHI HORIGUCHI
	 * @return
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
