/**
 *
 */
package com.internousdev.openconnect.project.progress.action;


import com.internousdev.openconnect.project.progress.dao.ProjectProgressDeleteDAO;
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
	private int progressId;
	/**
	 * 実行メソッド DAOにデータを渡して、結果を返す
	 * @author TATUHUMI ITOU
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute(){
		ProjectProgressDeleteDAO dao = new ProjectProgressDeleteDAO();
		String result = ERROR;
		int count = 0;
		count = dao.delete(progressId);
		if(count > 0){
			result = SUCCESS;
		}
		return result;
	}
	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return progressId
	*/
	public int getProgressId() {
		return progressId;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param progressId
	*/
	public void setProgressId(int progressId) {
		this.progressId = progressId;
	}






}
