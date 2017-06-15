/**
 *
 */
package com.internousdev.openconnect.team.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.openconnect.team.dao.TeamEditDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * チーム情報の編集を行うクラス
 * @author Teppei Matsumoto
 *@since 2017/06/14
 *@version 1.0
 */
public class TeamEditAction extends ActionSupport implements SessionAware{



	/**
	 * ユーザーID
	 */
	private int userId;

	/**
	 * チーム名
	 */
	private String teamName;

	/**
	 * ユーザーフラグ
	 */
	private int userFlg;

	/**
	 * エラーメッセージ
	 */
	private String teamMes;

	/**
	 * セッション
	 */
	public Map<String, Object> session;


	public String execute() throws SQLException{
		String result = ERROR;
		TeamEditDAO dao = new TeamEditDAO();

		int count = dao.update(teamName,userFlg,userId);
		if(count > 0){
			result = SUCCESS;
		}else{
			teamMes = "変更に失敗しました";
		}
		return result;
	}


	/**
	* 取得メソッド を取得
	* @author TEPPEI MATSUMOTO
	* @return userId
	*/
	public int getUserId() {
		return userId;
	}


	/**
	* 設定メソッド を設定
	* @author TEPPEI MATSUMOTO
	* @param userId
	*/
	public void setUserId(int userId) {
		this.userId = userId;
	}


	/**
	* 取得メソッド を取得
	* @author TEPPEI MATSUMOTO
	* @return teamName
	*/
	public String getTeamName() {
		return teamName;
	}


	/**
	* 設定メソッド を設定
	* @author TEPPEI MATSUMOTO
	* @param teamName
	*/
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	/**
	* 取得メソッド を取得
	* @author TEPPEI MATSUMOTO
	* @return userFlg
	*/
	public int getUserFlg() {
		return userFlg;
	}


	/**
	* 設定メソッド を設定
	* @author TEPPEI MATSUMOTO
	* @param userFlg
	*/
	public void setUserFlg(int userFlg) {
		this.userFlg = userFlg;
	}


	/**
	* 取得メソッド を取得
	* @author TEPPEI MATSUMOTO
	* @return teamMes
	*/
	public String getTeamMes() {
		return teamMes;
	}


	/**
	* 設定メソッド を設定
	* @author TEPPEI MATSUMOTO
	* @param teamMes
	*/
	public void setTeamMes(String teamMes) {
		this.teamMes = teamMes;
	}


	/**
	* 取得メソッド を取得
	* @author TEPPEI MATSUMOTO
	* @return session
	*/
	public Map<String, Object> getSession() {
		return session;
	}


	/**
	* 設定メソッド を設定
	* @author TEPPEI MATSUMOTO
	* @param session
	*/
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
