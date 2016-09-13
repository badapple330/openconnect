package com.internousdev.openconnect.projects.action;

import com.internousdev.openconnect.projects.dao.ProjectsDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * DBの情報を削除するクラス。
 * @author YUICHI KIRIU
 * @since 2016/09/09
 */
public class ProjectsDeleteAction extends ActionSupport {

	/**
	 * シリアル番号
	 */
	private static final long serialVersionUID = -758470450L;
	/**
	 * プロジェクト
	 */
	private int projectId;
	/**
	 * 実行メソッド DAOにデータを渡して、結果を返す
	 * @author YUICHI KIRIU
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute(){
		ProjectsDeleteDAO dao = new ProjectsDeleteDAO();
		String result = ERROR;
		int count = 0;
		System.out.println(projectId);
		count = dao.delete(projectId);
		if(count > 0){
			result = SUCCESS;
		}
		return result;
	}
	/**
	 * 取得メソッド  プロジェクトＩＤ
	 * @author YUICHI KIRIU
	 * @return projectId
	 */
	public int getProjectId() {
		return projectId;
	}
	/**
	 * 設定メソッド プロジェクトＩＤ
	 * @author YUICHI KIRIU
	 * @param projectId
	 */
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}


}


