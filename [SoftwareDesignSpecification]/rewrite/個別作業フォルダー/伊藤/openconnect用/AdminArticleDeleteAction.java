/**
 *
 */
package com.internousdev.openconnect.action;


import com.internousdev.openconnect.dao.AdminArticleDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 記事を削除するクラス
 * @author SANSHIRO KOCHO
 * @since 2016/8/23
 */
public class AdminArticleDeleteAction extends ActionSupport{
	/*
	 * タイトル
	 */
	private int projectId;
	/**
	 * 記事を削除するメソッド
	 * @author SANSHIRO KOCHO
	 * @return DBから記事内容を削除できたらSUCCESS、失敗したらERROR
	 */
	public String execute(){
		AdminArticleDeleteDAO dao = new AdminArticleDeleteDAO();
		String result = ERROR;
		int count = 0;
		count = dao.delete(projectId);
		if(count > 0){
			result = SUCCESS;
		}
		return result;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}




}
