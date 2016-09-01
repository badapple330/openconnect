package com.internousdev.openconnect.projectProgress.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.projectProgress.dao.ProjectProgressUpdateDAO;
import com.opensymphony.xwork2.ActionSupport;
//データベースにユーザー情報を削除させる為のクラス
public class ProjectProgressUpdateAction extends ActionSupport  {
	/**
	 * 	シリアルID
	 */
	private static final long serialVersionUID = -3541224046836562290L;

	/**
	 * ID
	 */
	private List<Integer> projectIdList = new ArrayList<Integer>();
	private List<String> projectDayList = new ArrayList<String>();
	private List<String> projectnameList = new ArrayList<String>();
	private List<String> projectPlanList = new ArrayList<String>();
	private List<String> projectResultList = new ArrayList<String>();
	private List<String> otherList = new ArrayList<String>();

	/**
	 * ユーザー情報を更新できたか否か判定するメソッド
	 * @result ERROR ヴァリデーションによるエラーメッセージ
	 * @return result データベースのuser,passwordを更新できたか否か
	 * @throws SQLException
	 */
	public String execute() throws SQLException{


		String result =ERROR;
		ProjectProgressUpdateDAO dao = new ProjectProgressUpdateDAO();
		int count = 0;

		for(int i=0;i<projectIdList.size();++i){
			count = dao.select(projectIdList.get(i),projectDayList.get(i),projectnameList.get(i),projectPlanList.get(i),projectResultList.get(i),otherList.get(i));}
		if(count > 0){
			result = SUCCESS;
		}

		return result;
	}

	/**
	 * @return projectIdList
	 */
	public List<Integer> getProjectIdList() {
		return projectIdList;
	}

	/**
	 * @param projectIdList セットする projectIdList
	 */
	public void setProjectIdList(List<Integer> projectIdList) {
		this.projectIdList = projectIdList;
	}

	/**
	 * @return projectDayList
	 */
	public List<String> getProjectDayList() {
		return projectDayList;
	}

	/**
	 * @param projectDayList セットする projectDayList
	 */
	public void setProjectDayList(List<String> projectDayList) {
		this.projectDayList = projectDayList;
	}

	/**
	 * @return projectnameList
	 */
	public List<String> getProjectnameList() {
		return projectnameList;
	}

	/**
	 * @param projectnameList セットする projectnameList
	 */
	public void setProjectnameList(List<String> projectnameList) {
		this.projectnameList = projectnameList;
	}

	/**
	 * @return projectPlanList
	 */
	public List<String> getProjectPlanList() {
		return projectPlanList;
	}

	/**
	 * @param projectPlanList セットする projectPlanList
	 */
	public void setProjectPlanList(List<String> projectPlanList) {
		this.projectPlanList = projectPlanList;
	}

	/**
	 * @return projectResultList
	 */
	public List<String> getProjectResultList() {
		return projectResultList;
	}

	/**
	 * @param projectResultList セットする projectResultList
	 */
	public void setProjectResultList(List<String> projectResultList) {
		this.projectResultList = projectResultList;
	}

	/**
	 * @return otherList
	 */
	public List<String> getOtherList() {
		return otherList;
	}

	/**
	 * @param otherList セットする otherList
	 */
	public void setOtherList(List<String> otherList) {
		this.otherList = otherList;
	}

	/**
	 * @return projectIdList
	 */

}
