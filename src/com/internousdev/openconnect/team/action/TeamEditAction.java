/**
 *
 */
package com.internousdev.openconnect.team.action;

import com.internousdev.openconnect.team.dao.TeamEditDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * チーム情報の編集を行うクラス
 * @author Teppei Matsumoto
 *@since 2017/06/14
 *@version 1.0
 */
public class TeamEditAction extends ActionSupport{

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


	public String execute(){
		String result = ERROR;
		TeamEditDAO dao = new TeamEditDAO();

		int con = dao.update(teamName,userFlg,userId);
		if(con > 0){
			result = SUCCESS;
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

}
