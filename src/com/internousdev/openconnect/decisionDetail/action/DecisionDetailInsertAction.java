/**
 *
 */
package com.internousdev.openconnect.decisionDetail.action;


import com.internousdev.openconnect.decisionDetail.dao.DecisionDetailInsertDAO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 画面で新規に追加した情報を、DBに追加する為のクラス
 * @author TATUHUMI ITOU
 * @since 2016/09/04
 * @version 1.0
 */
public class DecisionDetailInsertAction extends ActionSupport{
	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -7584789844350L;
	/**
	 * 日付、プロジェクト名、進捗予定、進捗結果、その他報告
	 */
	private int projectId;
private String password;
	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 * @author TATUHUMI ITOU
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute(){

		String result=ERROR;
		DecisionDetailInsertDAO dao = new DecisionDetailInsertDAO();
		int count = 0;
		count = dao.insert(projectId,password);
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
	* @author KENICHI HORIGUCHI
	* @return
	*/
	public String getPassword() {
		return password;
	}

	/**
	* 設定メソッド
	* @author KENICHI HORIGUCHI
	* @param
	*/
	public void setPassword(String password) {
		this.password = password;
	}



}
