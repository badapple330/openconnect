package com.internousdev.bulletinboard.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class FriendSearchSessionAction extends ActionSupport implements SessionAware{

	private int talkflg;

	private String userName;

	private int userId;

	private int viewId;

	private Map<String,Object> session;


	public String execute() {
		String result = ERROR;

			if (session.containsKey("userId")) {
				userId = (int) session.get("userId");
			}
			if(userId==0){return result;}

			/*session.put("viewId", viewId);

			if(talkflg==1){session.put("talkflg",talkflg);}
			else{session.put("talkflg",0);}
		if(talkflg==1){
		session.put("talkflg", talkflg);
		}else{session.put("talkflg",0);}

		session.put("userName",userName);*/


		result=SUCCESS;
		return result;
	}


	/**
	 * @return talkflg
	 */
	public int getTalkflg() {
		return talkflg;
	}


	/**
	 * @param talkflg セットする talkflg
	 */
	public void setTalkflg(int talkflg) {
		this.talkflg = talkflg;
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