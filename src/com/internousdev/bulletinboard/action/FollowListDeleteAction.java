/**
 *
 */
package com.internousdev.bulletinboard.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bulletinboard.dao.FollowListDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internousdev
 *
 */
public class FollowListDeleteAction extends ActionSupport implements SessionAware {


	private Map<String, Object> session;
	private int userId;
	private int viewId;


	public String execute(){

		if(session.containsKey("userId")){

			userId = (int) session.get("userId");
			}
		if(session.containsKey("viewId")){
			viewId=(int) session.get("viewId");
		}

		FollowListDeleteDAO dao=new FollowListDeleteDAO();
		if(dao.delete(userId,viewId)>0){
			return SUCCESS;
		}else{
			return ERROR;
		}
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

}
