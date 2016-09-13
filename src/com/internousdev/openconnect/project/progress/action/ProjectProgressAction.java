package com.internousdev.openconnect.project.progress.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.project.progress.dao.ProjectProgressDAO;
import com.internousdev.openconnect.project.progress.dto.ProjectProgressDTO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * DBの情報を画面に表示する為のクラス
 * @author TATUHUMI ITOU
 * @since 2016/09/04
 * @version 1.0
 */

public class ProjectProgressAction extends ActionSupport {
	/**
	 * プロジェクトリスト
	 */
	private List<ProjectProgressDTO> projectList = new ArrayList<ProjectProgressDTO>();
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
		ProjectProgressDAO dao = new ProjectProgressDAO();

		projectList = dao.select();
		if (!(projectList == null)) {
			result = SUCCESS;
		}
		return result;
	}

	/**
	 *  取得メソッドプロジェクトリストを取得する
	 * @author TATUHUMI ITOU
	 * @return projectList
	 */
	public List<ProjectProgressDTO> getProjectList() {
		return projectList;
	}
	/**
	 *   格納メソッド プロジェクトリストを格納する
	 * @author TATUHUMI ITOU
	 * @param projectList
	 */
	public void setProjectList(List<ProjectProgressDTO> projectList) {
		this.projectList = projectList;
	}


}
