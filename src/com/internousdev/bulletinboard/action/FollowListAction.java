package com.internousdev.bulletinboard.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bulletinboard.dao.FollowListDAO;
import com.internousdev.bulletinboard.dto.UserDTO;
import com.opensymphony.xwork2.ActionSupport;

public class FollowListAction extends ActionSupport implements SessionAware{

	private Map<String,Object> session;

	private int userId;

	private String userName;

	private String userImg;

	private int followId;

	private int Do;

	private int done;

	private ArrayList<UserDTO> myDate = new ArrayList<UserDTO>();

	private ArrayList<UserDTO> followList = new ArrayList<UserDTO>();

	public String execute(){
		String result =ERROR;

		if(session.containsKey(userId)){
			userId = (int) session.get(userId);
		}
		userId = 1;
	if(userId == 0){
		return result;
	}

	FollowListDAO dao = new FollowListDAO();

	followList = dao.getFollow(userId);

		result = SUCCESS;


	return result;

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
	 * @return userImg
	 */
	public String getUserImg() {
		return userImg;
	}
	/**
	 * @param userImg セットする userImg
	 */
	public void setUserImg(String userImg) {
		this.userImg = userImg;
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
	 * @return followId
	 */
	public int getFollowId() {
		return followId;
	}

	/**
	 * @param followId セットする followId
	 */
	public void setFollowId(int followId) {
		this.followId = followId;
	}

	/**
	 * @return do
	 */
	public int getDo() {
		return Do;
	}
	/**
	 * @param do1 セットする do
	 */
	public void setDo(int Do) {
		this.Do = Do;
	}
	/**
	 * @return done
	 */
	public int getDone() {
		return done;
	}

	/**
	 * @param done セットする done
	 */
	public void setDone(int done) {
		this.done = done;
	}

	public ArrayList<UserDTO> getMyDate() {
		return myDate;
	}
	public void setMyDate(ArrayList<UserDTO> myDate) {
		this.myDate = myDate;
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
	}
