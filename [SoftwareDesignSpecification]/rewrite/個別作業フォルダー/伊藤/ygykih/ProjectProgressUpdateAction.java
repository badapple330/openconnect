package com.internousdev.openconnect.projectProgress.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.projectProgress.dao.ProjectProgressUpdateDAO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 画面で受け取った更新情報を、DBへ転送する為のクラス
 * @author TATUHUMI ITOU
 * @since 2016/09/04
 * @version 1.0
 */
public class ProjectProgressUpdateAction extends ActionSupport  {
	/**
	 * 	シリアルID
	 */
	private static final long serialVersionUID = -3541224046836562290L;

	/**
	 * ID,日付、プロジェクト名、進捗予定、進捗結果、その他報告リスト
	 */
	private List<Integer> projectIdList = new ArrayList<Integer>();
	private List<String> projectDayList = new ArrayList<String>();
	private List<String> projectPlanList = new ArrayList<String>();
	private List<String> projectResultList = new ArrayList<String>();
	private List<String> otherList = new ArrayList<String>();

	/**
	 * ユーザー情報を更新できたか否か判定するメソッド
	 * @result ERROR ヴァリデーションによるエラーメッセージ
	 * @return result データベースの情報を更新できたか否か
	 * @throws SQLException
	 */
	public String execute() throws SQLException{


		String result =ERROR;
		ProjectProgressUpdateDAO dao = new ProjectProgressUpdateDAO();
		int count = 0;

		for(int i=0;i<projectIdList.size();++i){
			count = dao.select(projectIdList.get(i),projectDayList.get(i),projectPlanList.get(i),projectResultList.get(i),otherList.get(i));}
		if(count > 0){
			result = SUCCESS;
		}

		return result;
	}

	/**
	 *  取得メソッド IDリストを取得する
	 * @author TATUHUMI ITOU
	 * @return projectIdList
	 */
	public List<Integer> getProjectIdList() {
		return projectIdList;
	}

	/**
	 *   格納メソッド IDリストを格納する
	 * @author TATUHUMI ITOU
	 * @param projectIdList セットする projectIdList
	 */
	public void setProjectIdList(List<Integer> projectIdList) {
		this.projectIdList = projectIdList;
	}

	/**
	 * *  取得メソッド 日付リストを取得する
	 * @author TATUHUMI ITOU
	 * @return projectDayList
	 */
	public List<String> getProjectDayList() {
		return projectDayList;
	}

	/**
	 * *   格納メソッド 日付リストを格納する
	 * @author TATUHUMI ITOU
	 * @param projectDayList セットする projectDayList
	 */
	public void setProjectDayList(List<String> projectDayList) {
		this.projectDayList = projectDayList;
	}



	/**
	 *   取得メソッド 進捗予定リストを取得する
	 * @author TATUHUMI ITOU
	 * @return projectPlanList
	 */
	public List<String> getProjectPlanList() {
		return projectPlanList;
	}

	/**
	 * *   格納メソッド 進捗予定リストを格納する
	 * @author TATUHUMI ITOU
	 * @param projectPlanList セットする projectPlanList
	 */
	public void setProjectPlanList(List<String> projectPlanList) {
		this.projectPlanList = projectPlanList;
	}

	/**
	 * 取得メソッド 進捗結果リストを取得する
	 * @author TATUHUMI ITOU
	 * @return projectResultList
	 */
	public List<String> getProjectResultList() {
		return projectResultList;
	}

	/**
	 * *   格納メソッド 進捗結果リストを格納する
	 * @author TATUHUMI ITOU
	 * @param projectResultList セットする projectResultList
	 */
	public void setProjectResultList(List<String> projectResultList) {
		this.projectResultList = projectResultList;
	}

	/**
	 *   取得メソッド その他報告リストを取得する
	 * @author TATUHUMI ITOU
	 * @return otherList
	 */
	public List<String> getOtherList() {
		return otherList;
	}

	/**
	 * *   格納メソッド その他報告リストを格納する
	 * @author TATUHUMI ITOU
	 * @param otherList セットする otherList
	 */
	public void setOtherList(List<String> otherList) {
		this.otherList = otherList;
	}

	/**
	 * @return projectIdList
	 */

}
