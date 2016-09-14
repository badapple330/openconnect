/**
 *
 */
package com.internousdev.openconnect.decision.detail.action;


import com.internousdev.openconnect.decision.detail.dao.DecisionDetailInsertDAO;
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
	 * プロジェクトID
	 */
	private int projectId;
	/**
	 * パスワード
	 */
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
	* @author TATUHUMI ITOU
	* @return password
	*/
	public String getPassword() {
		return password;
	}

	/**
	* 設定メソッド
	* @author TATUHUMI ITOU
	* @param password
	*/
	public void setPassword(String password) {
		this.password = password;
	}



}