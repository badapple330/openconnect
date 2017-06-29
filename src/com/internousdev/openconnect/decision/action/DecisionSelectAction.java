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
	 * 決裁番号
	 */
	private int decisionId;

	/**
	 * 起案者ユーザーID
	 *
	 */
	private int jDrafterId;

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

	/**
	 *承認者ユーザーID1(リーダー)
	 */
	public int jPermiterId1;

	/**
	 *承認者ユーザーID2(リーダー)
	 */
	public int jPermiterId2;

	/**
	 *承認者ユーザーID3(先生)
	 */
	public int jPermiterId3;


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
	 * 承認者1人目の情報のリスト
	 */
	private ArrayList<DecisionDTO> jPermiter1nameList = new ArrayList<DecisionDTO>();
	/**
	 * 承認者2人目の情報のリスト
	 */
	private ArrayList<DecisionDTO> jPermiter2nameList = new ArrayList<DecisionDTO>();
	/**
	 * 承認者3人目の情報のリスト
	 */
	private ArrayList<DecisionDTO> jPermiter3nameList = new ArrayList<DecisionDTO>();

	/**
	 * エラーメッセージ
	 */
	private String resultString = "	表示できません。";

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
		decisionList=dao.select(decisionId);
		nameList = dao.selectByIds(jDrafterId);
       } catch (UnknownException e) {
		e.printStackTrace();
       }
		if(nameList != null){
			int i =0;
	try {

       	jDrafterId = decisionList.get(i).getJDrafterId();
				nameList=dao.selectByIds(jDrafterId);
				jPermiter1nameList = dao.selectByJPermiterId1(jPermiterId1);
				jPermiter2nameList = dao.selectByJPermiterId2(jPermiterId2);
				jPermiter3nameList = dao.selectByJPermiterId3(jPermiterId3);
			} catch (UnknownException e) {
				e.printStackTrace();
			}
		}

		result=SUCCESS;
		resultString ="表示しました。";

		return result;

       }




	/**
	* 取得メソッド を取得
	* @return decisionId
	*/
	public int getDecisionId() {
		return decisionId;
	}


	/**
	* 設定メソッド を設定
	* @param decisionId
	*/
	public void setDecisionId(int decisionId) {
		this.decisionId = decisionId;
	}


	/**
	* 取得メソッド を取得
	* @return jDrafterId
	*/
	public int getJDrafterId() {
		return jDrafterId;
	}


	/**
	* 設定メソッド を設定
	* @param jDrafterId
	*/
	public void setJDrafterId(int jDrafterId) {
		this.jDrafterId = jDrafterId;
	}


	/**
	* 取得メソッド を取得
	* @return decisionName
	*/
	public String getDecisionName() {
		return decisionName;
	}


	/**
	* 設定メソッド を設定
	* @param decisionName
	*/
	public void setDecisionName(String decisionName) {
		this.decisionName = decisionName;
	}


	/**
	* 取得メソッド を取得
	* @return jImpId
	*/
	public String getJImpId() {
		return jImpId;
	}


	/**
	* 設定メソッド を設定
	* @param jImpId
	*/
	public void setJImpId(String jImpId) {
		this.jImpId = jImpId;
	}


	/**
	* 取得メソッド を取得
	* @return jDecId
	*/
	public String getJDecId() {
		return jDecId;
	}


	/**
	* 設定メソッド を設定
	* @param jDecId
	*/
	public void setJDecId(String jDecId) {
		this.jDecId = jDecId;
	}


	/**
	* 取得メソッド を取得
	* @return kImpId
	*/
	public String getKImpId() {
		return kImpId;
	}


	/**
	* 設定メソッド を設定
	* @param kImpId
	*/
	public void setKImpId(String kImpId) {
		this.kImpId = kImpId;
	}


	/**
	* 取得メソッド を取得
	* @return kDecId
	*/
	public String getKDecId() {
		return kDecId;
	}


	/**
	* 設定メソッド を設定
	* @param kDecId
	*/
	public void setKDecId(String kDecId) {
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
	public void setJkDecId(String jkDecId) {
		this.jkDecId = jkDecId;
	}


	/**
	* 取得メソッド を取得
	* @return bildCost
	*/
	public float getBildCost() {
		return bildCost;
	}


	/**
	* 設定メソッド を設定
	* @param bildCost
	*/
	public void setBildCost(float bildCost) {
		this.bildCost = bildCost;
	}


	/**
	* 取得メソッド を取得
	* @return benefit
	*/
	public float getBenefit() {
		return benefit;
	}


	/**
	* 設定メソッド を設定
	* @param benefit
	*/
	public void setBenefit(float benefit) {
		this.benefit = benefit;
	}


	/**
	* 取得メソッド を取得
	* @return amountAll
	*/
	public float getAmountAll() {
		return amountAll;
	}


	/**
	* 設定メソッド を設定
	* @param amountAll
	*/
	public void setAmountAll(float amountAll) {
		this.amountAll = amountAll;
	}





	/**
	* 取得メソッド を取得
	* @return decisionList
	*/
	public ArrayList<DecisionDTO> getDecisionList() {
		return decisionList;
	}


	/**
	* 設定メソッド を設定
	* @param decisionList
	*/
	public void setDecisionList(ArrayList<DecisionDTO> decisionList) {
		this.decisionList = decisionList;
	}


	/**
	* 取得メソッド を取得
	* @return nameList
	*/
	public ArrayList<DecisionDTO> getNameList() {
		return nameList;
	}


	/**
	* 設定メソッド を設定
	* @param nameList
	*/
	public void setNameList(ArrayList<DecisionDTO> nameList) {
		this.nameList = nameList;
	}


	/**
	* 取得メソッド を取得
	* @return session
	*/
	public Map<String, Object> getSession() {
		return session;
	}


	/**
	* 設定メソッド を設定
	* @param session
	*/
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	/**
	* 取得メソッド を取得
	* @return jPermiter1nameList
	*/
	public ArrayList<DecisionDTO> getJPermiter1nameList() {
		return jPermiter1nameList;
	}


	/**
	* 設定メソッド を設定
	* @param jPermiter1nameList
	*/
	public void setJPermiter1nameList(ArrayList<DecisionDTO> jPermiter1nameList) {
		this.jPermiter1nameList = jPermiter1nameList;
	}


	/**
	* 取得メソッド を取得
	* @return jPermiter2nameList
	*/
	public ArrayList<DecisionDTO> getJPermiter2nameList() {
		return jPermiter2nameList;
	}


	/**
	* 設定メソッド を設定
	* @param jPermiter2nameList
	*/
	public void setJPermiter2nameList(ArrayList<DecisionDTO> jPermiter2nameList) {
		this.jPermiter2nameList = jPermiter2nameList;
	}


	/**
	* 取得メソッド を取得
	* @return jPermiter3nameList
	*/
	public ArrayList<DecisionDTO> getJPermiter3nameList() {
		return jPermiter3nameList;
	}


	/**
	* 設定メソッド を設定
	* @param jPermiter3nameList
	*/
	public void setJPermiter3nameList(ArrayList<DecisionDTO> jPermiter3nameList) {
		this.jPermiter3nameList = jPermiter3nameList;
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
