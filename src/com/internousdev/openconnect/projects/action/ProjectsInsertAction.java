package com.internousdev.openconnect.projects.action;

import java.util.List;

import com.internousdev.openconnect.project.status.dao.ProjectStatusInsertDAO;
import com.internousdev.openconnect.projects.dao.ProjectsInsertDAO;
import com.internousdev.openconnect.projects.dao.ProjectsSelectDAO;
import com.internousdev.openconnect.projects.dto.ProjectsSelectDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 画面から追加された情報をＤＢに追加するクラス
 *
 * @author YUICHI KIRIU
 * @since 2016/09/07
 */
public class ProjectsInsertAction extends ActionSupport {

	/**
	 * シリアルＩＤ
	 */
	private static final long serialVersionUID = -3262256805448882848L;

	/**
	 * プロジェクトＩＤ
	 */
	private int projectId;

	/**
	 * プロジェクト名
	 */
	private String projectName;

	/**
	 * 管理者名（リーダー）
	 */
	private int managerId;

	/**
	 * 管理者名（サブ）
	 */
	private int subManagerId;

	/**
	 * 開始日
	 */
	private String startDate;

	/**
	 * 結果文字
	 */
	private String resultString = "";

	/* テスト */
	private String manager_family_name;
	private String manager_given_name;

	/**
	 * 取得メソッド を取得
	 *
	 * @return manager_family_name
	 */
	public String getManager_family_name() {
		return manager_family_name;
	}

	/**
	 * 設定メソッド を設定
	 *
	 * @param manager_family_name
	 */
	public void setManager_family_name(String manager_family_name) {
		this.manager_family_name = manager_family_name;
	}

	/**
	 * 取得メソッド を取得
	 *
	 * @return manager_given_name
	 */
	public String getManager_given_name() {
		return manager_given_name;
	}

	/**
	 * 設定メソッド を設定
	 *
	 * @param manager_given_name
	 */
	public void setManager_given_name(String manager_given_name) {
		this.manager_given_name = manager_given_name;
	}

	private String submanager_family_name;
	private String submanager_given_name;

	/**
	 * 取得メソッド を取得
	 *
	 * @return submanager_family_name
	 */
	public String getSubmanager_family_name() {
		return submanager_family_name;
	}

	/**
	 * 設定メソッド を設定
	 *
	 * @param submanager_family_name
	 */
	public void setSubmanager_family_name(String submanager_family_name) {
		this.submanager_family_name = submanager_family_name;
	}

	/**
	 * 取得メソッド を取得
	 *
	 * @return submanager_given_name
	 */
	public String getSubmanager_given_name() {
		return submanager_given_name;
	}

	/**
	 * 設定メソッド を設定
	 *
	 * @param submanager_given_name
	 */
	public void setSubmanager_given_name(String submanager_given_name) {
		this.submanager_given_name = submanager_given_name;
	}

	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 *
	 * @author YUICHI KIRIU
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute() {

		String result = ERROR;
		ProjectsInsertDAO dao = new ProjectsInsertDAO();
		ProjectsSelectDTO dtoByManager = new ProjectsSelectDTO();
		ProjectsSelectDTO dtoBySubManager = new ProjectsSelectDTO();

		dtoByManager = dao.managerIdFinder(manager_family_name, manager_given_name);
		dtoBySubManager = dao.subManagerIdFinder(submanager_family_name, submanager_given_name);

		int managerId = 0;
		int subManagerId = 0;

		if (dtoByManager != null && dtoBySubManager != null) {
			managerId = dtoByManager.getManagerId();
			subManagerId = dtoBySubManager.getSubManagerId();
		}

		int count = 0;
		count = dao.insert(projectName, managerId, subManagerId, startDate);

		if (count > 0) {
			result = SUCCESS;

			resultString = "追加に成功しました";

			int maxId = 0;

			ProjectsSelectDAO selectDao = new ProjectsSelectDAO();

			List<ProjectsSelectDTO> list = selectDao.select("");

			for (int i = 0; i < list.size(); i++) {

				if (list.get(i).getProjectId() > maxId)
					maxId = list.get(i).getProjectId();
			}

			ProjectStatusInsertDAO insertDao = new ProjectStatusInsertDAO();

			insertDao.insert(maxId);
		} else {
			resultString = "追加に失敗しました";
		}

		return result;
	}

	/**
	 * 取得メソッド プロジェクトＩＤを取得
	 *
	 * @author YUICHI KIRIU
	 * @return projectId
	 */
	public int getProjectId() {
		return projectId;
	}

	/**
	 * 設定メソッド プロジェクトＩＤを設定
	 *
	 * @author YUICHI KIRIU
	 * @param projectId
	 */
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	/**
	 * 取得メソッド プロジェクト名を取得
	 *
	 * @author YUICHI KIRIU
	 * @return projectName
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * 設定メソッド プロジェクト名を設定
	 *
	 * @author YUICHI KIRIU
	 * @param projectName
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	/**
	 * 取得メソッド 管理者ＩＤ（リーダー）を取得
	 *
	 * @author YUICHI KIRIU
	 * @return managerId
	 */
	public int getManagerId() {
		return managerId;
	}

	/**
	 * 設定メソッド 管理者ＩＤ（リーダー）を設定
	 *
	 * @author YUICHI KIRIU
	 * @param managerId
	 */
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	/**
	 * 取得メソッド 管理者ＩＤ（サブ）を取得
	 *
	 * @author YUICHI KIRIU
	 * @return subManagerId
	 */
	public int getSubManagerId() {
		return subManagerId;
	}

	/**
	 * 設定メソッド管理者ＩＤ（サブ）を設定
	 *
	 * @author YUICHI KIRIU
	 * @param subManagerId
	 */
	public void setSubManagerId(int subManagerId) {
		this.subManagerId = subManagerId;
	}

	/**
	 * 取得メソッド 開始日を取得
	 *
	 * @author YUICHI KIRIU
	 * @return startDate
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * 設定メソッド 開始日を設定
	 *
	 * @author YUICHI KIRIU
	 * @param startDate
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	/**
	 * 取得メソッド 結果文字を取得
	 *
	 * @author YUICHI KIRIU
	 * @return resultString
	 */
	public String getResultString() {
		return resultString;
	}

	/**
	 * 設定メソッド 結果文字を設定
	 *
	 * @author YUICHI KIRIU
	 * @param resultString
	 */
	public void setResultString(String resultString) {
		this.resultString = resultString;
	}

}
