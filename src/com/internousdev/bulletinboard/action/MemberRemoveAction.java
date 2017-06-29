package com.internousdev.bulletinboard.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bulletinboard.dao.GroupDAO;
import com.internousdev.bulletinboard.dao.UserDAO;
import com.opensymphony.xwork2.ActionSupport;

public class MemberRemoveAction extends ActionSupport implements SessionAware{

	/**
	 * ユーザーID
	 */
	private int userId=0;

	/**
	 * セッション
	 */
	private Map<String,Object> session;

	/**
	 * グループID
	 */
	private int groupId;



	public String execute() {
		String result = ERROR;
		if (session.containsKey("userId")) {
			userId = (int) session.get("userId");
		}
		if(userId==0){return result;}



		GroupDAO dao = new GroupDAO();
		if(dao.memberRemove(userId, groupId) !=0){
			if(dao.memberRemoveSend(userId, groupId) != 0){
				UserDAO msgDao = new UserDAO();
				msgDao.msgSet(userId, "グループを脱退しました");
				if (session.containsKey("groupId")) {
					session.remove("groupId");
				}
				result = SUCCESS;
			}
		}

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
	 * @return groupId
	 */
	public int getGroupId() {
		return groupId;
	}



	/**
	 * @param groupId セットする groupId
	 */
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

}