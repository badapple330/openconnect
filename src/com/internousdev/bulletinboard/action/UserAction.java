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

	
	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public ArrayList<UserDTO> getUserList() {
		return userList;
	}

	public void setUserList(ArrayList<UserDTO> userList) {
		this.userList = userList;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public boolean isDeletflg() {
		return deletflg;
	}

	public void setDeletflg(boolean deletflg) {
		this.deletflg = deletflg;
	}

}
