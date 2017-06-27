package com.internousdev.bulletinboard.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bulletinboard.dao.GroupDAO;
import com.internousdev.bulletinboard.dao.UserDAO;
import com.internousdev.bulletinboard.dto.UserDTO;
import com.opensymphony.xwork2.ActionSupport;

public class GoGroupMemberAddAction extends ActionSupport implements SessionAware{

	/**
	 * ユーザーID
	 */
	private int userId=0;

	/**
	 * タイムラインのリスト
	 */
	private ArrayList<UserDTO> followList = new ArrayList<UserDTO>();

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
		followList = dao.followGet(userId,groupId);
		if(followList.size() != 0){
			result = SUCCESS;
		}else{
			UserDAO msgDao = new UserDAO();
			msgDao.msgSet(userId, "フォロワー全員が加入しています");
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
	 * @return followList
	 */
	public ArrayList<UserDTO> getFollowList() {
		return followList;
	}


	/**
	 * @param followList セットする followList
	 */
	public void setFollowList(ArrayList<UserDTO> followList) {
		this.followList = followList;
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
