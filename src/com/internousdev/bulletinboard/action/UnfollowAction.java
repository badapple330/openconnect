/**
 *
 */
package com.internousdev.bulletinboard.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bulletinboard.dao.FollowDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internousdev
 *
 */
public class UnfollowAction extends ActionSupport implements SessionAware {

	/** セッション */
	private Map<String, Object> session;

	/** ユーザーID */
	private int userId;

	/** */
	private int viewId;

	public String execute() {

		if (session.containsKey("userId")) {
			userId = (int) session.get("userId");
		}

		FollowDAO dao = new FollowDAO();
		if (dao.unfollow(userId, viewId)) {
			return SUCCESS;
		} else {
			return ERROR;
		}
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getViewId() {
		return viewId;
	}

	public void setViewId(int viewId) {
		this.viewId = viewId;
	}

}
