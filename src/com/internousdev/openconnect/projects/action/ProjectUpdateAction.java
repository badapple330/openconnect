package com.internousdev.openconnect.projects.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.projects.dao.ProjectUpdateDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ProjectUpdateAction extends ActionSupport{

	private List<Integer> projectUserIdList= new ArrayList<Integer>();
	private List<String> projectNameList = new ArrayList<String>();
	private List<String> projectManagerList = new ArrayList<String>();
	private List<String> projectSubManagerList = new ArrayList<String>();
	private List<String> projectStartDateList = new ArrayList<String>();
	private List<String> projectEndDateList = new ArrayList<String>();
	private List<String> projectNoteList = new ArrayList<String>();

	/**
	 * ユーザー情報を更新できたか否か判定するメソッド
	 * @result ERROR ヴァリデーションによるエラーメッセージ
	 * @return result データベースの情報を更新できたか否か
	 * @throws SQLException
	 */
	public String execute() throws SQLException{


		String result =ERROR;
		ProjectUpdateDAO dao = new ProjectUpdateDAO();
		int count = 0;

		for(int i=0;i<projectUserIdList.size();++i){
			count = dao.select(projectUserIdList.get(i),projectNameList.get(i),projectManagerList.get(i),projectSubManagerList.get(i),projectStartDateList.get(i),projectEndDateList.get(i),projectNameList.get(i));}
		if(count > 0){
			result = SUCCESS;
		}

		return result;
	}



	public List<Integer> getProjectUserIdList() {
		return projectUserIdList;
	}



	public void setProjectUserIdList(List<Integer> projectUserIdList) {
		this.projectUserIdList = projectUserIdList;
	}



	public List<String> getProjectNameList() {
		return projectNameList;
	}

	public void setProjectNameList(List<String> projectNameList) {
		this.projectNameList = projectNameList;
	}

	public List<String> getProjectManagerList() {
		return projectManagerList;
	}

	public void setProjectManagerList(List<String> projectManagerList) {
		this.projectManagerList = projectManagerList;
	}

	public List<String> getProjectSubManagerList() {
		return projectSubManagerList;
	}

	public void setProjectSubManagerList(List<String> projectSubManagerList) {
		this.projectSubManagerList = projectSubManagerList;
	}

	public List<String> getProjectStartDateList() {
		return projectStartDateList;
	}

	public void setProjectStartDateList(List<String> projectStartDateList) {
		this.projectStartDateList = projectStartDateList;
	}

	public List<String> getProjectEndDateList() {
		return projectEndDateList;
	}

	public void setProjectEndDateList(List<String> projectEndDateList) {
		this.projectEndDateList = projectEndDateList;
	}

	public List<String> getProjectNoteList() {
		return projectNoteList;
	}

	public void setProjectNoteList(List<String> projectNoteList) {
		this.projectNoteList = projectNoteList;
	}



}
