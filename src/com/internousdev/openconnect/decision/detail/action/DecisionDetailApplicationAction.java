package com.internousdev.openconnect.decision.detail.action;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import com.internousdev.openconnect.decision.detail.dao.DecisionDetailApplicationDAO;
import com.internousdev.openconnect.decision.detail.dto.DecisionDetailDTO;
import com.opensymphony.xwork2.ActionSupport;


/**
* 決裁手続き画面の申請ボタンに付加された情報をDBに送る為のクラス
* @author SOSHI AZUMA
* @since 2017/06/16
* @version 1.0
*/
public class DecisionDetailApplicationAction extends ActionSupport {

	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = 1352806033937058670L;
	/**
	 * 決裁ID
	 */
	private int decisionId;
	/**
	 * 決裁種類
	 */
	private String decisionType;
	/**
	 * 管理者権限メソッド
	 */
	public Map<String, Object> session;
	/**
	 * エラーメッセージ
	 */
	private String resultString = "申請できませんでした。";
	/**
	 * ID番号振り分けリスト
	 */
	private List<DecisionDetailDTO> idNumList = new ArrayList<DecisionDetailDTO>();



	/**
	 * 実行メソッド DAOに情報を渡して、結果を返す
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute() throws Exception {

		String result=ERROR;

		//現在日時を取得する
        Calendar c = Calendar.getInstance();
        //フォーマットパターンを指定して表示する
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String num = sdf.format( c.getTime() );

		//起案番号の生成
		String iDraftingId = "KN-" + num + "-";
		String aDraftingId = "K-KN-" + num + "-";
		String iADId = "KN-" + num + "-";

		//番号末尾を100桁表示に変換
		DecimalFormat dformat = new DecimalFormat("000");

		DecisionDetailApplicationDAO dao = new DecisionDetailApplicationDAO();


		String idNum = "";
		int count = 0;


		//実施決裁の申請
		if(decisionType.equals("実施")) {

			idNum = iDraftingId;
			idNumList = dao.select(decisionType, idNum);
			if(idNumList.size() > 0) {
				int a = idNumList.size() + 1;
				String b = dformat.format(a);
				iDraftingId = iDraftingId + b;
			}
			else {
				iDraftingId = iDraftingId + "001";
			}
			count = dao.updateAJ( iDraftingId, decisionId );
		}

		//契約決裁の申請
		else if(decisionType.equals("契約")) {

			idNum = aDraftingId;
			idNumList = dao.select(decisionType, idNum);
			if(idNumList.size() > 0) {
				int a = idNumList.size() + 1;
				String b = dformat.format(a);
				aDraftingId = aDraftingId + b;
			}
			else {
				aDraftingId = aDraftingId + "001";
			}
			count = dao.updateAK( aDraftingId, decisionId );
		}

		//実施兼契約決裁の申請
		else {

			idNum = iADId;
			idNumList = dao.select(decisionType, idNum);
			if(idNumList.size() > 0) {
				int a = idNumList.size() + 1;
				String b = dformat.format(a);
				iADId = iADId + b;
			}
			else {
				iADId = iADId + "001";
			}
			count = dao.updateAJK( iADId, decisionId );
		}


		if (count > 0 ) {
			result = SUCCESS;
			resultString = "申請できました! ";
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



	/**
	* 取得メソッド を取得
	* @return idNumList
	*/
	public List<DecisionDetailDTO> getIdNumList() {
		return idNumList;
	}



	/**
	* 設定メソッド を設定
	* @param idNumList
	*/
	public void setIdNumList(List<DecisionDetailDTO> idNumList) {
		this.idNumList = idNumList;
	}



}
