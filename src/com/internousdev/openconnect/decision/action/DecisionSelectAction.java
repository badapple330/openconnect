/**
 *
 */
package com.internousdev.openconnect.decision.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.omg.CORBA.portable.UnknownException;

import com.internousdev.openconnect.decision.dao.DecisionDAO;
import com.internousdev.openconnect.decision.dto.DecisionDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internousdev
 *
 */
public class DecisionSelectAction extends ActionSupport implements SessionAware{


	/**
	 * ユーザーID
	 *
	 */
	private int userId;

	/**
	 * 案件名
	 *
	 */
	private String decisionName;

	/**
	 * 実施起案番号
	 *
	 */
	private String jImpId;
	/**
	 * 実施決裁番号
	 *
	 */
	private String jDecId;
	/**
	 * 契約起案番号
	 *
	 */
	private String kImpId;
	/**
	 * 契約決裁番号
	 *
	 */
	private String kDecId;
	/**
	 * 実施兼契約起案番号
	 *
	 */
	private String jkImpId;
	/**
	 * 実施兼契約番号
	 *
	 */

	private String jkDecId;



	/**
	 * 理由・目的
	 */
	public String cause;


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
	public String summary;

	/**
	 * 開始日
	 */
	public String startDay;

	/**
	 * 終了日
	 */
	public String endDay;


	/**
	 * 開発端末料
	 */
	public int prove;

	/**
	 * 合計開発端末料
	 */
	public int totalProve;

	/**
	 * リリース環境使用料
	 */
	public float re;

	/**
	 * 合計リリース環境使用料
	 */
	public float totalRe;



	/**
	 *回線使用料
	 */
	public int line;

	/**
	 *合計回線使用料
	 */
	public int totalLine;

	/**
	 *施設使用料
	 */
	public float room;

	/**
	 *合計施設使用料
	 */
	public float totalRoom;

	/**
	 *開発要員
	 */
	public int human;

	/**
	 *合計開発要員
	 */
	public int totalHuman;

	/**
	 *雑費
	 */
	public float etc;

	/**
	 *合計雑費
	 */
	public float totalEtc;

    /**
     * 人数
     */
    public int persons;





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
	 * 起案者の情報のリスト
	 */
	private ArrayList<DecisionDTO> nameList = new ArrayList<DecisionDTO>();

	/**
	 * セッション情報
	 */
	private Map<String,Object> session;



	/**
     * DAOに入力されたデータを渡して、結果を返す

     * @author kota.miyazato
     * @since 2017/06/07
     * @version 1.0
     */

	public String execute(){
		String result = ERROR;
		DecisionDAO dao = new DecisionDAO();

		try {
		decisionList=dao.select();
		} catch (UnknownException e) {
		e.printStackTrace();
		}

		if(decisionList!=null){

			DecisionDAO decisionDAO = new DecisionDAO();
			try {
				nameList = decisionDAO.selectByUserId(userId);
			} catch (UnknownException e) {
				e.printStackTrace();
			}

		}

		result=SUCCESS;
		return result;
		}

	/**
	 * @return userId
	 */
	public int getUserId() {
		return userId;
	}





	/**
	 * @param userId セットする userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
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
	* 取得メソッド を取得
	* @return iImpId
	*/
	public String getiJImpId() {
		return jImpId;
	}

	/**
	* 設定メソッド を設定
	* @param iImpId
	*/
	public void setJImpId(String jImpId) {
		this.jImpId = jImpId;
	}

	/**
	* 取得メソッド を取得
	* @return jDecId
	*/
	public String getjDecId() {
		return jDecId;
	}

	/**
	* 設定メソッド を設定
	* @param jDecId
	*/
	public void setjDecId(String jDecId) {
		this.jDecId = jDecId;
	}

	/**
	* 取得メソッド を取得
	* @return kImpId
	*/
	public String getkImpId() {
		return kImpId;
	}

	/**
	* 設定メソッド を設定
	* @param kImpId
	*/
	public void setkImpId(String kImpId) {
		this.kImpId = kImpId;
	}

	/**
	* 取得メソッド を取得
	* @return kDecId
	*/
	public String getkDecId() {
		return kDecId;
	}

	/**
	* 設定メソッド を設定
	* @param kDecId
	*/
	public void setkDecId(String kDecId) {
		this.kDecId = kDecId;
	}

	/**
	* 取得メソッド を取得
	* @return jkImpId
	*/
	public String getJkImpId() {
		return jkImpId;
	}

	/**
	* 設定メソッド を設定
	* @param jkImpId
	*/
	public void setJkImpId(String jkImpId) {
		this.jkImpId = jkImpId;
	}

	/**
	* 取得メソッド を取得
	* @return jkDecId
	*/
	public String getJkDecId() {
		return jkDecId;
	}

	/**
	* 設定メソッド を設定
	* @param jkDecId
	*/
	public void setjkDecId(String jkDecId) {
		this.jkDecId = jkDecId;
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
	* 取得メソッド を取得
	* @author KOHEI NITABARU
	* @return nameList
	*/
	public ArrayList<DecisionDTO> getNameList() {
		return nameList;
	}

	/**
	* 設定メソッド を設定
	* @author KOHEI NITABARU
	* @param nameList
	*/
	public void setNameList(ArrayList<DecisionDTO> nameList) {
		this.nameList = nameList;
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
	* @return totalProve
	*/
	public int getTotalProve() {
		return totalProve;
	}

	/**
	* 設定メソッド を設定
	* @param totalProve
	*/
	public void setTotalProve(int totalProve) {
		this.totalProve = totalProve;
	}

	/**
	* 取得メソッド を取得
	* @return totalRe
	*/
	public float getTotalRe() {
		return totalRe;
	}

	/**
	* 設定メソッド を設定
	* @param totalRe
	*/
	public void setTotalRe(float totalRe) {
		this.totalRe = totalRe;
	}

	/**
	* 取得メソッド を取得
	* @return totalLine
	*/
	public int getTotalLine() {
		return totalLine;
	}

	/**
	* 設定メソッド を設定
	* @param totalLine
	*/
	public void setTotalLine(int totalLine) {
		this.totalLine = totalLine;
	}

	/**
	* 取得メソッド を取得
	* @return totalRoom
	*/
	public float getTotalRoom() {
		return totalRoom;
	}

	/**
	* 設定メソッド を設定
	* @param totalRoom
	*/
	public void setTotalRoom(float totalRoom) {
		this.totalRoom = totalRoom;
	}

	/**
	* 取得メソッド を取得
	* @return totalHuman
	*/
	public int getTotalHuman() {
		return totalHuman;
	}

	/**
	* 設定メソッド を設定
	* @param totalHuman
	*/
	public void setTotalHuman(int totalHuman) {
		this.totalHuman = totalHuman;
	}

	/**
	* 取得メソッド を取得
	* @return totalEtc
	*/
	public float getTotalEtc() {
		return totalEtc;
	}

	/**
	* 設定メソッド を設定
	* @param totalEtc
	*/
	public void setTotalEtc(float totalEtc) {
		this.totalEtc = totalEtc;
	}






}
