package com.internousdev.openconnect.decision.detail.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.decision.dao.DecisionInsertDAO;
import com.internousdev.openconnect.decision.detail.dao.DecisionDetailApplicationDAO;
import com.internousdev.openconnect.decision.detail.dao.DecisionDetailSelectDAO;
import com.internousdev.openconnect.decision.detail.dto.DecisionDetailDTO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 決裁手続き一覧の情報をDBに格納する為のクラス
 * @author TATSUHUMI ITOU
 * * @since 2016/09/04
 * @version 1.0
 */
public class DecisionDetailApplicationAction  extends ActionSupport{
	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -758470450L;
	/**
	 * 決裁状況
	 */
	private String decisionStatus;
	/**
	 * 決裁ID
	 */
	private int decisionDetailId;
	/**
	 * 決裁手続きリスト
	 */
	private List<DecisionDetailDTO> decisionDetailInsList = new ArrayList<DecisionDetailDTO>();


	/**
	 *  プロジェクトID
	 */
	private int projectId;
	/**
	 *  日付
	 */
	private String day;
	/**
	 *  ユーザーID
	 */
	private int userId;
	/**
	 *  案件名
	 */
	private String projectName;
	/**
	 *  決裁ID
	 */
	private int decisionId;
	/**
	 *  概要
	 */
	private String summary;

	/**
	 * 実行メソッド DAOのメソッドにデータを渡して、その結果が１つでもあればSUCCESSを返す
	 * @author TATUHUMI ITOU
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute(){



		DecisionDetailApplicationDAO dao = new DecisionDetailApplicationDAO();
		String result = ERROR;

		int count = 0;

		if(decisionStatus.equals("承認")){
			DecisionDetailSelectDAO daos = new DecisionDetailSelectDAO();
			decisionDetailInsList = daos.selectins( decisionDetailId );

			day = decisionDetailInsList.get(0).getDay();
			projectName = decisionDetailInsList.get(0).getProjectName();
			summary = decisionDetailInsList.get(0).getSummary();
			projectId = decisionDetailInsList.get(0).getProjectId();
			userId = decisionDetailInsList.get(0).getUserId();

			DecisionInsertDAO daoi = new DecisionInsertDAO();
			daoi.insert(day,userId,projectId,projectName,summary);

		}

		count = dao.update(decisionStatus,decisionDetailId);
		if(count > 0){
			result = SUCCESS;

		}
		return result;
	}
	/**
	 * 取得メソッド 決裁状況を取得
	 * @author TATSUHUMI ITOU
	 * @return decisionStatus
	 */
	public String getDecisionStatus() {
		return decisionStatus;
	}
	/**
	 * 設定メソッド 決裁状況を設定
	 * @author TATSUHUMI ITOU
	 * @param decisionStatus
	 */
	public void setDecisionStatus(String decisionStatus) {
		this.decisionStatus = decisionStatus;
	}
	/**
	 * 取得メソッド 決裁手続きIDを取得
	 * @author TATSUHUMI ITOU
	 * @return decisionDetailId
	 */
	public int getDecisionDetailId() {
		return decisionDetailId;
	}
	/**
	 * 設定メソッド 決裁手続きIDを設定
	 * @author TATSUHUMI ITOU
	 * @param decisionDetailId
	 */
	public void setDecisionDetailId(int decisionDetailId) {
		this.decisionDetailId = decisionDetailId;
	}
	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return
	 */
	public List<DecisionDetailDTO> getDecisionDetailInsList() {
		return decisionDetailInsList;
	}
	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param
	 */
	public void setDecisionDetailInsList(List<DecisionDetailDTO> decisionDetailInsList) {
		this.decisionDetailInsList = decisionDetailInsList;
	}
	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return
	 */
	public int getProjectId() {
		return projectId;
	}
	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param
	 */
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return
	 */
	public String getDay() {
		return day;
	}
	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param
	 */
	public void setDay(String day) {
		this.day = day;
	}
	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return
	 */
	public String getProjectName() {
		return projectName;
	}
	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return
	 */
	public int getDecisionId() {
		return decisionId;
	}
	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param
	 */
	public void setDecisionId(int decisionId) {
		this.decisionId = decisionId;
	}
	/**
	 * 取得メソッド
	 * @author MASAHIRO KEDSUKA
	 * @return
	 */
	public String getSummary() {
		return summary;
	}
	/**
	 * 設定メソッド
	 * @author MASAHIRO KEDSUKA
	 * @param
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}

}