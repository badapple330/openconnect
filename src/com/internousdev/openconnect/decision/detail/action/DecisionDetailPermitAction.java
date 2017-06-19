/**
 *
 */
package com.internousdev.openconnect.decision.detail.action;


import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.openconnect.decision.detail.dao.DecisionDetailApplicationDAO;
import com.internousdev.openconnect.decision.detail.dao.DecisionDetailPermitDAO;
import com.internousdev.openconnect.decision.detail.dto.DecisionDetailDTO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 決裁手続き画面で新規に追加した情報を、DBに追加する為のクラス
 * @author SOSHI AZUMA
 * @since 2017/06/16
 * @version 1.0
 */
public class DecisionDetailPermitAction extends ActionSupport implements SessionAware {


	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -3834616624579202920L;
	/**
	 * 決裁ID
	 */
	private int decisionId;
	/**
	 * 承認状況
	 */
	private int permitStatus;
	/**
	 * 決裁種類
	 */
	private String decisionType;
	/**
	 * エラーメッセージ
	 */
	private String resultString = "承認できませんでした。";
	/**
	 * 管理者権限メソッド
	 */
	public Map<String, Object> session;
	/**
	 * ID番号振り分けリスト
	 */
	private List<DecisionDetailDTO> idNumList = new ArrayList<DecisionDetailDTO>();



	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute() {

		String result=ERROR;

		//現在日時を取得する
        Calendar c = Calendar.getInstance();
        //フォーマットパターンを指定して表示する
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String num = sdf.format( c.getTime() );

		//決裁番号の生成
		String iApprovalId = "J-" + num + "-";
		String cdId = "K-" + num + "-";
		String iAId = "JK-" + num + "-";//????

		//番号末尾を100桁表示に変換
		DecimalFormat dformat = new DecimalFormat("000");

		//DecisionDetailDTO dto = new DecisionDetailDTO();
		DecisionDetailPermitDAO daoPer = new DecisionDetailPermitDAO();
		DecisionDetailApplicationDAO daoApp = new DecisionDetailApplicationDAO();

		//TypeとpermitStatusをjspからもらえればいい

		//jspのformで送らなくてもこれでもたぶんOK
		//int permitUserId1 = (int)dto.getPermitUserId1();
		//int permitUserId2;
		int permitUserId3;


		String idNum = "";
		int count = 0;


		//リーダーの承認
		if(permitStatus == 1 || permitStatus == 2) {
			int userId = (int) session.get("userId");
			count = daoPer.updateP(permitStatus, userId, decisionId);
		}






		//先生の承認
		if(permitStatus == 0) {
			permitUserId3 = (int) session.get("userId");

			//実施決裁の承認
			if(decisionType.equals("実施")) {

				idNum = iApprovalId;
				idNumList = daoApp.select(decisionType, idNum);
				if(idNumList.size() > 0) {
					int a = idNumList.size() + 1;
					String b = dformat.format(a);
					iApprovalId = iApprovalId + b;
				}
				else {
					iApprovalId = iApprovalId + "001";
				}
				count = daoPer.updatePJ( iApprovalId, permitUserId3, decisionId );//DAOでTypeを契約にする＋permitStatusを０にする＋decisionStatus1を２にする
			}


			//契約決裁の承認
			else if(decisionType.equals("契約")) {

				idNum = cdId;
				idNumList = daoApp.select(decisionType, idNum);
				if(idNumList.size() > 0) {
					int a = idNumList.size() + 1;
					String b = dformat.format(a);
					cdId = cdId + b;
				}
				else {
					cdId = cdId + "001";
				}
				count = daoPer.updatePK( cdId, permitUserId3, decisionId );//DAOでpermitStatusを０にする＋decisionStatus2を２にする
			}


			//実施兼契約決裁の承認
			else  {

				idNum = iAId;
				idNumList = daoApp.select(decisionType, idNum);
				if(idNumList.size() > 0) {
					int a = idNumList.size() + 1;
					String b = dformat.format(a);
					iAId = iAId + b;
				}
				else {
					iAId = iAId + "001";
				}
				count = daoPer.updatePJK( iAId, permitUserId3, decisionId );//DAOでpermitStatusを０にする＋decisionStatus2を２にする
			}

		}






		if (count > 0 ) {
			result = SUCCESS;
			resultString = "承認できました! ";
		}
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
	* @return permitStatus
	*/
	public int getPermitStatus() {
		return permitStatus;
	}



	/**
	* 設定メソッド を設定
	* @param permitStatus
	*/
	public void setPermitStatus(int permitStatus) {
		this.permitStatus = permitStatus;
	}



	public String getDecisionType() {
		return decisionType;
	}



	public void setDecisionType(String decisionType) {
		this.decisionType = decisionType;
	}



	/**
	* 取得メソッド 結果を取得
	* @return resultString
	*/
	public String getResultString() {
		return resultString;
	}

	/**
	* 設定メソッド 結果を設定
	* @param resultString
	*/
	public void setResultString(String resultString) {
		this.resultString = resultString;
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



	public List<DecisionDetailDTO> getIdNumList() {
		return idNumList;
	}



	public void setIdNumList(List<DecisionDetailDTO> idNumList) {
		this.idNumList = idNumList;
	}



}
