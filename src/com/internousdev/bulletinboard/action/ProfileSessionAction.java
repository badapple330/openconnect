/**
 *
 */
package com.internousdev.bulletinboard.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bulletinboard.dao.ProfileDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internousdev
 *
 */

//viewIdをsessionにputしなおすaction
public class ProfileSessionAction extends ActionSupport implements SessionAware{

	private int userId;

	private int viewId;

	private String userName;

	private Map<String,Object> session;


	public String execute() {
		String result = ERROR;
		if (session.containsKey("userId")) {
			userId = (int) session.get("userId");
		}
		if(userId==0){return result;}

		if(userName != null){
			ProfileDAO dao = new ProfileDAO();
			viewId = dao.viewIdGet(userName.substring(1));
		}
		session.put("viewId", viewId);

		result=SUCCESS;
		return result;
	}

	/**
	 * @return userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId セットする userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return viewId
	 */
	public int getViewId() {
		return viewId;
	}

	/**
	 * @param viewId セットする viewId
	 */
	public void setViewId(int viewId) {
		this.viewId = viewId;
	}

	/**
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * @param session セットする session
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName セットする userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

}