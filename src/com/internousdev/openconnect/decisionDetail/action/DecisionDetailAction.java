package com.internousdev.openconnect.decisionDetail.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.decisionDetail.dao.DecisionDetailDAO;
import com.internousdev.openconnect.decisionDetail.dto.DecisionDetailDTO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * DBの情報を画面に表示する為のクラス
 * @author TATUHUMI ITOU
 * @since 2016/09/04
 * @version 1.0
 */

public class DecisionDetailAction extends ActionSupport {
	/**
	 * プロジェクトリスト
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
		DecisionDetailDAO dao = new DecisionDetailDAO();

		 decisionDetailList = dao.select();
		if (!( decisionDetailList == null)) {
			result = SUCCESS;
		}
		return result;
	}
	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return
	*/
	public List<DecisionDetailDTO> getDecisionDetailList() {
		return decisionDetailList;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param
	*/
	public void setDecisionDetailList(List<DecisionDetailDTO> decisionDetailList) {
		this.decisionDetailList = decisionDetailList;
	}

	/**
	 *  取得メソッドプロジェクトリストを取得する
	 * @author TATUHUMI ITOU
	 * @return projectList
	 */


}