/**
 *
 */
package com.internousdev.openconnect.decision.action;

import java.util.ArrayList;
import java.util.Map;

import org.omg.CORBA.portable.UnknownException;

import com.internousdev.openconnect.decision.dao.DecisionPreviewDAO;
import com.internousdev.openconnect.decision.dto.DecisionDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Hideyuki Nozawa
 * @since 2017/06/19
 * @version 1.0
 *
 */
public class DecisionPreviewAction extends ActionSupport {

	/**
	 * 決裁ID
	 *
	 */
	private int decisionId;

	/**
	 * 起案者ユーザーID
	 *
	 */
	private int jDrafterId;

	/**
	 * 起案者ユーザーID
	 *
	 */
	private int kDrafterId;

	/**
	 * ユーザーID
	 */
	private int userId;



	/**
	 *姓（漢字）
	 */
	public String familyNameKanji;

	/**
	 *名（漢字）
	 */
	public String givenNameKanji;

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


	/**
	 * 決裁手続きの情報をリスト化
	 */
	private ArrayList<DecisionDTO> decisionPreviewList = new  ArrayList<DecisionDTO>();

	/**
	 * 実施起案者の情報のリスト
	 */
	private ArrayList<DecisionDTO> JNameList = new ArrayList<DecisionDTO>();

	/**
	 * 契約起案者の情報のリスト
	 */
	private ArrayList<DecisionDTO> KNameList = new ArrayList<DecisionDTO>();

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
	 * セッション情報
	 */
	private Map<String,Object> session;


	public String execute(){
		String result = ERROR;
		DecisionPreviewDAO dao = new DecisionPreviewDAO();
		try {
			decisionPreviewList=dao.select(decisionId);
		} catch (UnknownException e) {
		e.printStackTrace();
		}

		if(decisionPreviewList!=null){

				try {
					jDrafterId = decisionPreviewList.get(0).getJDrafterId();
					JNameList = dao.selectByJDrafterIds(jDrafterId);
					kDrafterId = decisionPreviewList.get(0).getKDrafterId();
					KNameList = dao.selectByKDrafterIds(kDrafterId);
					jPermiterId1 = decisionPreviewList.get(0).getJPermiterId1();
					jPermiter1nameList = dao.selectByJPermiterId1(jPermiterId1);
					jPermiterId2 = decisionPreviewList.get(0).getJPermiterId2();
					jPermiter2nameList = dao.selectByJPermiterId2(jPermiterId2);
					jPermiterId3 = decisionPreviewList.get(0).getJPermiterId3();
					jPermiter3nameList = dao.selectByJPermiterId3(jPermiterId3);
				} catch (UnknownException e) {
					e.printStackTrace();
				}
			}

		/**
		if(decisionPreviewList!=null){

			for(int i=0 ; i < decisionPreviewList.size(); i++){
				try {
					jDrafterId = decisionPreviewList.get(i).getJDrafterId();
					nameList = dao.selectByIds(jDrafterId);
					jPermiterId1 = decisionPreviewList.get(i).getJPermiterId1();
					jPermiter1nameList = dao.selectByJPermiterId1(jPermiterId1);
					jPermiterId2 = decisionPreviewList.get(i).getJPermiterId2();
					jPermiter2nameList = dao.selectByJPermiterId2(jPermiterId2);
					jPermiterId3 = decisionPreviewList.get(i).getJPermiterId3();
					jPermiter3nameList = dao.selectByJPermiterId3(jPermiterId3);
				} catch (UnknownException e) {
					e.printStackTrace();
				}
			}
		}
		*/

		result=SUCCESS;
		return result;
		}




	/**
	 * @return decisionId
	 */
	public int getDecisionId() {
		return decisionId;
	}

	/**
	 * @param decisionId セットする userId
	 */
	public void setDecisionId(int decisionId) {
		this.decisionId = decisionId;
	}
	/**
	 * @return userId
	 */
	public int getJDrafterId() {
		return jDrafterId;
	}

	/**
	 * @param userId セットする userId
	 */
	public void setJDrafterId(int jDrafterId) {
		this.jDrafterId = jDrafterId;
	}

	/**
	* 取得メソッド を取得
	* @return KDrafterId
	*/
	public int getKDrafterId() {
		return kDrafterId;
	}




	/**
	* 設定メソッド を設定
	* @param KDrafterId
	*/
	public void setKDrafterId(int kDrafterId) {
		this.kDrafterId = kDrafterId;
	}




	/**
	* 取得メソッド を取得
	* @return userId
	*/
	public int getUserId() {
		return userId;
	}


	/**
	* 設定メソッド を設定
	* @param userId
	*/
	public void setUserId(int userId) {
		this.userId = userId;
	}




	/**
	 * 承認者1人目の情報のリストを取得します。
	 * @return 承認者1人目の情報のリスト
	 */
	public ArrayList<DecisionDTO> getJPermiter1nameList() {
	    return jPermiter1nameList;
	}


	/**
	 * 承認者1人目の情報のリストを設定します。
	 * @param jPermiter1nameList 承認者1人目の情報のリスト
	 */
	public void setJPermiter1nameList(ArrayList<DecisionDTO> jPermiter1nameList) {
	    this.jPermiter1nameList = jPermiter1nameList;
	}


	/**
	 * 承認者2人目の情報のリストを取得します。
	 * @return 承認者2人目の情報のリスト
	 */
	public ArrayList<DecisionDTO> getJPermiter2nameList() {
	    return jPermiter2nameList;
	}


	/**
	 * 承認者2人目の情報のリストを設定します。
	 * @param jPermiter2nameList 承認者2人目の情報のリスト
	 */
	public void setJPermiter2nameList(ArrayList<DecisionDTO> jPermiter2nameList) {
	    this.jPermiter2nameList = jPermiter2nameList;
	}


	/**
	 * 承認者3人目の情報のリストを取得します。
	 * @return 承認者3人目の情報のリスト
	 */
	public ArrayList<DecisionDTO> getJPermiter3nameList() {
	    return jPermiter3nameList;
	}


	/**
	 * 承認者3人目の情報のリストを設定します。
	 * @param jPermiter3nameList 承認者3人目の情報のリスト
	 */
	public void setJPermiter3nameList(ArrayList<DecisionDTO> jPermiter3nameList) {
	    this.jPermiter3nameList = jPermiter3nameList;
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
	 * @return decisionPreviewList
	 */
	public ArrayList<DecisionDTO> getDecisionPreviewList() {
		return decisionPreviewList;
	}

	/**
	 * @param decisionPreviewList セットする decisionPreviewList
	 */
	public void setDecisionPreviewList(ArrayList<DecisionDTO> decisionPreviewList) {
		this.decisionPreviewList = decisionPreviewList;
	}




	/**
	* 取得メソッド を取得
	* @author KOHEI NITABARU
	* @return nameList
	*/
	public ArrayList<DecisionDTO> getNameList() {
		return JNameList;
	}

	/**
	* 設定メソッド を設定
	* @author KOHEI NITABARU
	* @param nameList
	*/
	public void setJNameList(ArrayList<DecisionDTO> JNameList) {
		this.JNameList = JNameList;
	}

	/**
	* 取得メソッド を取得
	* @return KNameList
	*/
	public ArrayList<DecisionDTO> getKNameList() {
		return KNameList;
	}




	/**
	* 設定メソッド を設定
	* @param KNameList
	*/
	public void setKNameList(ArrayList<DecisionDTO> KNameList) {
		this.KNameList = KNameList;
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

	/**
	 * 承認者ユーザーID1(リーダー)を取得します。
	 * @return 承認者ユーザーID1(リーダー)
	 */
	public int getJPermiterId1() {
	    return jPermiterId1;
	}


	/**
	 * 承認者ユーザーID1(リーダー)を設定します。
	 * @param JPermiterId1 承認者ユーザーID1(リーダー)
	 */
	public void setJPermiterId1(int jPermiterId1) {
	    this.jPermiterId1 = jPermiterId1;
	}


	/**
	 * 承認者ユーザーID2(リーダー)を取得します。
	 * @return 承認者ユーザーID2(リーダー)
	 */
	public int getJPermiterId2() {
	    return jPermiterId2;
	}


	/**
	 * 承認者ユーザーID2(リーダー)を設定します。
	 * @param JPermiterId2 承認者ユーザーID2(リーダー)
	 */
	public void setJPermiterId2(int jPermiterId2) {
	    this.jPermiterId2 = jPermiterId2;
	}


	/**
	 * 承認者ユーザーID3(先生)を取得します。
	 * @return 承認者ユーザーID3(先生)
	 */
	public int getJPermiterId3() {
	    return jPermiterId3;
	}


	/**
	 * 承認者ユーザーID3(先生)を設定します。
	 * @param JPermiterId3 承認者ユーザーID3(先生)
	 */
	public void setJPermiterId3(int jPermiterId3) {
	    this.jPermiterId3 = jPermiterId3;
	}

}
