/**
 *
 */
package com.internousdev.openconnect.project.progress.action;


import com.internousdev.openconnect.project.progress.dao.ProjectProgressInsertDAO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 画面で新規に追加した情報を、DBに追加する為のクラス
 * @author TATUHUMI ITOU
 * @since 2016/09/04
 * @version 1.0
 */
public class ProjectProgressInsertAction extends ActionSupport{
	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -7584789844350L;
	/**
	 * プロジェクトID
	 */
	private int projectId;
	/**
	 * 日付
	 */
	private String projectDay;
	/**
	 * 進捗予定
	 */
	private String projectPlan;
	/**
	 * 進捗結果
	 */
	private String projectResult;
	/**
	 * その他報告
	 */
	private String other;

	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 * @author TATUHUMI ITOU
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute(){

		String result=ERROR;
		ProjectProgressInsertDAO dao = new ProjectProgressInsertDAO();
		int count = 0;
		count = dao.insert(projectId,projectDay,projectPlan,projectResult,other);
		if (count > 0) {
			result = SUCCESS;
		}
		return result;
	}

	/**
	* 取得メソッド
	* @author TATUHUMI ITOU
	* @return projectId
	*/
	public int getProjectId() {
		return projectId;
	}
	/**
	* 設定メソッド
	* @author TATUHUMI ITOU
	* @param projectId
	*/
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	/**
	* 取得メソッド
	* @author TATUHUMI ITOU
	* @return
	*/
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 *  取得メソッド キーワード日付を取得する
	 * @author TATUHUMI ITOU
	 * @return projectDay
	 */
	public String getProjectDay() {
		return projectDay;
	}
	/**
	 *   格納メソッド キーワード日付を格納する
	 * @author TATUHUMI ITOU
	 * @param  projectDay セットする　 projectDay
	 */
	public void setProjectDay(String projectDay) {
		this.projectDay = projectDay;
	}
	/**
	 *  取得メソッド 進捗予定を取得する
	 * @author TATUHUMI ITOU
	 * @return projectPlan
	 */
	public String getProjectPlan() {
		return projectPlan;
	}
	/**
	 *   格納メソッド 進捗予定を格納する
	 * @author TATUHUMI ITOU
	 * @param search セットする　search
	 */
	public void setProjectPlan(String projectPlan) {
		this.projectPlan = projectPlan;
	}
	/**
	 *  取得メソッド 進捗結果を取得する
	 * @author TATUHUMI ITOU
	 * @return projectResult
	 */
	public String getProjectResult() {
		return projectResult;
	}
	/**
	 *   格納メソッド 進捗結果を格納する
	 * @author TATUHUMI ITOU
	 * @param projectResult セットする　projectResult
	 */
	public void setProjectResult(String projectResult) {
		this.projectResult = projectResult;
	}
	/**
	 *  取得メソッド  その他報告を取得する
	 * @author TATUHUMI ITOU
	 * @return other
	 */
	public String getOther() {
		return other;
	}
	/**
	 *   格納メソッド その他報告を格納する
	 * @author TATUHUMI ITOU
	 * @param other セットする　other
	 */
	public void setOther(String other) {
		this.other = other;
	}

}
