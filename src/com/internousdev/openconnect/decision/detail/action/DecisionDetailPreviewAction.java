package com.internousdev.openconnect.decision.detail.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.decision.detail.dao.DecisionDetailPreviewDAO;
import com.internousdev.openconnect.decision.detail.dto.DecisionDetailDTO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * DBの情報を画面に表示する為のクラス
 * @author TATUHUMI ITOU
 * @since 2016/09/04
 * @version 1.0
 */

public class DecisionDetailPreviewAction extends ActionSupport {
	/**
	 * ID
	 */
	private int decisionDetailId;
	/**
	 * 決裁手続きリスト
	 */
	private List<DecisionDetailDTO> decisionDetailList = new ArrayList<DecisionDetailDTO>();
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
		String result = ERROR;
		DecisionDetailPreviewDAO dao = new DecisionDetailPreviewDAO();

		 decisionDetailList = dao.select(decisionDetailId);
		if (!( decisionDetailList == null)) {
			result = SUCCESS;

		}
		return result;
	}
	/**
	* 取得メソッド リスト形式の決裁手続きを取得
	* @author TATUHUMI ITOU
	* @return decisionDetailList
	*/
	public List<DecisionDetailDTO> getDecisionDetailList() {
		return decisionDetailList;
	}
	/**
	* 設定メソッド リスト形式の決裁手続きを設定
	* @author TATUHUMI ITOU
	* @param decisionDetailList
	*/
	public void setDecisionDetailList(List<DecisionDetailDTO> decisionDetailList) {
		this.decisionDetailList = decisionDetailList;
	}
	/**
	* 取得メソッド 決裁手続きIDを取得
	* @author TATUHUMI ITOU
	* @return decisionDetailId
	*/
	public int getDecisionDetailId() {
		return decisionDetailId;
	}
	/**
	* 設定メソッド 決裁手続きIDを設定
	* @author TATUHUMI ITOU
	* @param decisionDetailId
	*/
	public void setDecisionDetailId(int decisionDetailId) {
		this.decisionDetailId = decisionDetailId;
	}

}
