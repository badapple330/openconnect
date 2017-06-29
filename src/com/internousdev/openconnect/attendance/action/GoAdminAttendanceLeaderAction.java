/**
 *
 */
package com.internousdev.openconnect.attendance.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.openconnect.attendance.dao.GoAttendanceDAO;
import com.internousdev.openconnect.attendance.dto.AttendanceDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internousdev
 *
 */
public class GoAdminAttendanceLeaderAction extends ActionSupport implements SessionAware{



private static final long serialVersionUID = 1181846755041839614L;

/**
 * セッション
 */
private Map<String,Object> session;

/**
 * ユーザーリスト
 */
private ArrayList<AttendanceDTO> atUserList = new ArrayList<AttendanceDTO>();

/**
 * ユーザID
 */
private int userId;

/**
 * チーム名
 */

private String teamName;


public String execute() {
	String result = ERROR;

	if(session.get("userId") != null){
		int userId = (int) session.get("userId");

		GoAttendanceDAO dao = new GoAttendanceDAO();
	atUserList = dao.select(userId);

	if(atUserList.size() > 0){
		result=SUCCESS;
	}
	}
return result;
}




/**
* 取得メソッド を取得
* @return session
*/
public Map<String, Object> getSession() {
	return session;
}

/**
* 設定メソッド を設定
* @param session
*/
public void setSession(Map<String, Object> session) {
	this.session = session;
}

/**
* 取得メソッド を取得
* @return atUserList
*/
public ArrayList<AttendanceDTO> getAtUserList() {
	return atUserList;
}

/**
* 設定メソッド を設定
* @param atUserList
*/
public void setAtUserList(ArrayList<AttendanceDTO> atUserList) {
	this.atUserList = atUserList;
}

/**
* 取得メソッド を取得
* @return userId
*/
public int getUserId() {
	return userId;
}

/**
* 設定メソッド を設定
* @param userId
*/
public void setUserId(int userId) {
	this.userId = userId;
}

/**
* 取得メソッド を取得
* @return teamName
*/
public String getTeamName() {
	return teamName;
}

/**
* 設定メソッド を設定
* @param teamName
*/
public void setTeamName(String teamName) {
	this.teamName = teamName;
}


}