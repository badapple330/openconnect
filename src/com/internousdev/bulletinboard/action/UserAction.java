package com.internousdev.bulletinboard.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bulletinboard.dao.UserDAO;
import com.internousdev.bulletinboard.dto.UserDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport implements SessionAware{

	private Map<String,Object> session;

	private ArrayList<UserDTO> userList = new ArrayList<UserDTO>();

	private int userId;

	private String userName;

	private int point;

	private int lv;

	private String profile;

	private boolean deletflg;

	public String execute(){
		if(session.get("userId") == null) {
			return ERROR;
		}

		userId = (int) session.get("userId");
		UserDAO userdao = new UserDAO();

		userList = userdao.select(userId);

		if(userList.size()== 0){
			return ERROR;
		}else{
			return SUCCESS;
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
	 * @return userList
	 */
	public ArrayList<UserDTO> getUserList() {
		return userList;
	}

	/**
	 * @param userList セットする userList
	 */
	public void setUserList(ArrayList<UserDTO> userList) {
		this.userList = userList;
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
	 * @return point
	 */
	public int getPoint() {
		return point;
	}

	/**
	 * @param point セットする point
	 */
	public void setPoint(int point) {
		this.point = point;
	}

	/**
	 * @return lv
	 */
	public int getLv() {
		return lv;
	}

	/**
	 * @param lv セットする lv
	 */
	public void setLv(int lv) {
		this.lv = lv;
	}

	/**
	 * @return profile
	 */
	public String getProfile() {
		return profile;
	}

	/**
	 * @param profile セットする profile
	 */
	public void setProfile(String profile) {
		this.profile = profile;
	}

	/**
	 * @return deletflg
	 */
	public boolean isDeletflg() {
		return deletflg;
	}

	/**
	 * @param deletflg セットする deletflg
	 */
	public void setDeletflg(boolean deletflg) {
		this.deletflg = deletflg;
	}

}
