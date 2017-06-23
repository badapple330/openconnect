/**
 *
 */
package com.internousdev.openconnect.decision.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.openconnect.decision.dao.DecisionDAO;
import com.internousdev.openconnect.decision.dto.DecisionDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author KOTA MIYAZATO
 *
 */
public class DecisionUpdateAction extends ActionSupport implements SessionAware{






	/**
	 * 案件名
	 *
	 */
	private String decisionName;

	/**
	 * 実施起案番号
	 *
	 */
	private String iDraftingId;
	/**
	 * 実施決裁番号
	 *
	 */
	private String iApprovalId;
	/**
	 * 契約起案番号
	 *
	 */
	private String aDraftingId;
	/**
	 * 契約決裁番号
	 *
	 */
	private String cdId;
	/**
	 * 実施兼契約起案番号
	 *
	 */
	private String iADId;
	/**
	 * 実施兼契約番号
	 *
	 */

	private String iAId;


	/**
	 * 理由・目的
	 */
	private String cause;



	/**
	 * 建設費用
	 */
	private float bildCost;

	/**
	 * 損益費用
	 */
	private float benefit;

	/**
	 * 合計金額
	 */
	private float amountAll;

	/**
	 * 概要
	 */
	private String summary;

	/**
	 * 開始日
	 */
	private String startDay;

	/**
	 * 終了日
	 */
	public String endDay;

	/**
	 * 開発端末料
	 */
	private int prove;

	/**
	 * リリース環境使用料
	 */
	private float re;

	/**
	 *回線使用料
	 */
	private int line;


	/**
	 *施設使用料
	 */
	private float room;

	/**
	 *開発要員
	 */
	private int human;

	/**
	 * 人数
	 */
	private int persons;


	/**
	 *雑費
	 */
	private float etc;

	/**
	 *姓（漢字）
	 */
	private String familyNameKanji;

	/**
	 *名（漢字）
	 */
	public String givenNameKanji;


	/*
	 * decisionList コレクションクラスのオブジェクト宣言
	 * @author kota.miyazato
     * @since 2017/06/07
     * @version 1.0
     */

	/**
	 * 決裁手続きの情報をリスト化
	 */
	private ArrayList<DecisionDTO> decisionList = new  ArrayList<DecisionDTO>();

	/**
	 * セッション情報
	 */
	private Map<String,Object> session;



	/**
	 * エラーメッセージ
	 */
	private String resultString = "更新できません。";


	/**
     * 決裁手続きの情報をリストを更新する
     * @author kota.miyazato
     * @since 2017/06/07
     * @version 1.0
     */

	public String execute() {
		String result =ERROR;
         DecisionDAO dao= new DecisionDAO();
         int count=0;


         int totalProve = prove * persons;

         float totalRe = re * (float)persons;

         int totalLine = line * persons;

         float totalRoom = room * 1;

         int totalHuman = human * persons;

         float totalEtc = etc * (float)persons;

         float benefit = totalHuman + totalEtc;

         float bildCost = (float)totalProve + totalRe + totalLine + (float)totalRoom;

         float amountAll = benefit + bildCost;

         count=dao.update(decisionName,summary,cause,startDay,endDay,persons,totalProve,totalRe,totalLine,totalRoom,totalHuman,totalEtc,benefit,bildCost,amountAll);

			if(count>0){
				result = SUCCESS;
				resultString = "更新しました。";
			}



			return result;
}







	/**
	 * @return decisionName
	 */
	public String getDecisionName() {
		return decisionName;
	}

	/**
	 * @param decisionName セットする decisionName
	 */
	public void setDecisionName(String decisionName) {
		this.decisionName = decisionName;
	}

	/**
	 * @return iDraftingId
	 */
	public String getiDraftingId() {
		return iDraftingId;
	}

	/**
	 * @param iDraftingId セットする iDraftingId
	 */
	public void setiDraftingId(String iDraftingId) {
		this.iDraftingId = iDraftingId;
	}

	/**
	 * @return iApprovalId
	 */
	public String getiApprovalId() {
		return iApprovalId;
	}

	/**
	 * @param iApprovalId セットする iApprovalId
	 */
	public void setiApprovalId(String iApprovalId) {
		this.iApprovalId = iApprovalId;
	}

	/**
	 * @return aDraftingId
	 */
	public String getaDraftingId() {
		return aDraftingId;
	}

	/**
	 * @param aDraftingId セットする aDraftingId
	 */
	public void setaDraftingId(String aDraftingId) {
		this.aDraftingId = aDraftingId;
	}

	/**
	 * @return cdId
	 */
	public String getCdId() {
		return cdId;
	}

	/**
	 * @param cdId セットする cdId
	 */
	public void setCdId(String cdId) {
		this.cdId = cdId;
	}

	/**
	 * @return iADId
	 */
	public String getiADId() {
		return iADId;
	}

	/**
	 * @param iADId セットする iADId
	 */
	public void setiADId(String iADId) {
		this.iADId = iADId;
	}

	/**
	 * @return iAId
	 */
	public String getiAId() {
		return iAId;
	}

	/**
	 * @param iAId セットする iAId
	 */
	public void setiAId(String iAId) {
		this.iAId = iAId;
	}


	/**
	 * @return bildCost
	 */
	public float getBildCost() {
		return bildCost;
	}

	/**
	 * @param bildCost セットする bildCost
	 */
	public void setBildCost(float bildCost) {
		this.bildCost = bildCost;
	}

	/**
	 * @return benefit
	 */
	public float getBenefit() {
		return benefit;
	}

	/**
	 * @param benefit セットする benefit
	 */
	public void setBenefit(float benefit) {
		this.benefit = benefit;
	}

	/**
	 * @return amountAll
	 */
	public float getAmountAll() {
		return amountAll;
	}

	/**
	 * @param amountAll セットする amountAll
	 */
	public void setAmountAll(float amountAll) {
		this.amountAll = amountAll;
	}

	/**
	 * @return session
	 */
	public Map<String,Object> getSession() {
		return session;
	}

	/**
	 * @param session セットする session
	 */
	public void setSession(Map<String,Object> session) {
		this.session = session;
	}

	/**
	 * @return decisionList
	 */
	public ArrayList<DecisionDTO> getDecisionList() {
		return decisionList;
	}

	/**
	 * @param decisionList セットする decisionList
	 */
	public void setDecisionList(ArrayList<DecisionDTO> decisionList) {
		this.decisionList = decisionList;
	}




	/**
	 * @return cause
	 */
	public String getCause() {
		return cause;
	}




	/**
	 * @param cause セットする cause
	 */
	public void setCause(String cause) {
		this.cause = cause;
	}



	/**
	 * @return summary
	 */
	public String getSummary() {
		return summary;
	}


	/**
	 * @param summary セットする summary
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}


	/**
	 * @return startDay
	 */
	public String getStartDay() {
		return startDay;
	}

	/**
	 * @param startDay セットする startDay
	 */
	public void setStartDay(String startDay) {
		this.startDay = startDay;
	}


	/**
	 * @return endDay
	 */
	public String getEndDay() {
		return endDay;
	}



	/**
	 * @param endDay セットする endDay
	 */
	public void setEndDay(String endDay) {
		this.endDay = endDay;
	}


	/**
	 * @return prove
	 */
	public int getProve() {
		return prove;
	}
	/**
	 * @param prove セットする prove
	 */
	public void setProve(int prove) {
		this.prove = prove;
	}
	/**
	 * @return re
	 */
	public float getRe() {
		return re;
	}
	/**
	 * @param re セットする re
	 */
	public void setRe(float re) {
		this.re = re;
	}
	/**
	 * @return line
	 */
	public int getLine() {
		return line;
	}
	/**
	 * @param line セットする line
	 */
	public void setLine(int line) {
		this.line = line;
	}
	/**
	 * @return room
	 */
	public float getRoom() {
		return room;
	}
	/**
	 * @param room セットする room
	 */
	public void setRoom(float room) {
		this.room = room;
	}
	/**
	 * @return human
	 */
	public int getHuman() {
		return human;
	}
	/**
	 * @param human セットする human
	 */
	public void setHuman(int human) {
		this.human = human;
	}
	/**
	 * @return etc
	 */
	public float getEtc() {
		return etc;
	}
	/**
	 * @param etc セットする etc
	 */
	public void setEtc(float etc) {
		this.etc = etc;
	}





	/**
	* 取得メソッド を取得
	* @return persons
	*/
	public int getPersons() {
		return persons;
	}





	/**
	* 設定メソッド を設定
	* @param persons
	*/
	public void setPersons(int persons) {
		this.persons = persons;
	}





	/**
	* 取得メソッド を取得
	* @author KOHEI NITABARU
	* @return resultString
	*/
	public String getResultString() {
		return resultString;
	}



	/**
	* 設定メソッド を設定
	* @author KOHEI NITABARU
	* @param resultString
	*/
	public void setResultString(String resultString) {
		this.resultString = resultString;
	}





	/**
	* 取得メソッド を取得
	* @return familyNameKanji
	*/
	public String getFamilyNameKanji() {
		return familyNameKanji;
	}





	/**
	* 設定メソッド を設定
	* @param familyNameKanji
	*/
	public void setFamilyNameKanji(String familyNameKanji) {
		this.familyNameKanji = familyNameKanji;
	}





	/**
	* 取得メソッド を取得
	* @return givenNameKanji
	*/
	public String getGivenNameKanji() {
		return givenNameKanji;
	}





	/**
	* 設定メソッド を設定
	* @param givenNameKanji
	*/
	public void setGivenNameKanji(String givenNameKanji) {
		this.givenNameKanji = givenNameKanji;
	}



}








