/**
 *
 */
package com.internousdev.openconnect.projectProgress.action;


import com.internousdev.openconnect.projectProgress.dao.ProjectProgressDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 画面で受け取ったIDを元にして、DBの情報を削除する為のクラス
 * @author TATUHUMI ITOU
 * @since 2016/09/04
 * @version 1.0
 */
public class ProjectProgressDeleteAction extends ActionSupport{
	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -758470450L;
	/**
	 * プロジェクトID
	 */
	private int projectId;
	/**
	 * 実行メソッド DAOにデータを渡して、結果を返す
	 * @author TATUHUMI ITOU
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute(){
		ProjectProgressDeleteDAO dao = new ProjectProgressDeleteDAO();
		String result = ERROR;
		int count = 0;
		count = dao.delete(projectId);
		if(count > 0){
			result = SUCCESS;
		}
		return result;
	}
	/**
	 *  取得メソッド プロジェクトIDを取得する
	 * @author TATUHUMI ITOU
	 * @return projectId
	 */
	public int getProjectId() {
		return projectId;
	}
	/**
	 *   格納メソッド プロジェクトIDを格納する
	 * @author TATUHUMI ITOU
	 * @param projectId セットする　projectId
	 */
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}




}
