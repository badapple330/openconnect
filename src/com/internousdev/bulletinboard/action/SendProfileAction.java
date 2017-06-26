package com.internousdev.bulletinboard.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bulletinboard.dao.ProfileDAO;
import com.internousdev.bulletinboard.dto.UserDTO;
import com.opensymphony.xwork2.ActionSupport;

public class SendProfileAction extends ActionSupport implements SessionAware{

	/**
	 * ユーザーID
	 */
	private int userId=0;

	/**
	 * 写真
	 */
	private String userImg="";

	/**
	 * 名前
	 */
	private String userName;

	/**
	 * プロフィール
	 */
	private String profile="";

	/**
	 *
	 */
	private int deleteFlg=1;



	private Map<String,Object> session;



	private ArrayList<UserDTO> profileData = new ArrayList<UserDTO>();

	private ArrayList<UserDTO> profileList = new ArrayList<UserDTO>();


	public String execute(){
		String result = ERROR;
		ProfileDAO dao=new ProfileDAO();
		if(session.containsKey("userId")){
			userId = (int) session.get("userId");
			}

		if(userId==0){
			return result;
		}
			int updated=dao.profileSend(userId,profile,userImg);

				if(updated>0){
					result = SUCCESS;
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
	 * @return deleteFlg
	 */
	public int getDeleteFlg() {
		return deleteFlg;
	}


	/**
	 * @param deleteFlg セットする deleteFlg
	 */
	public void setDeleteFlg(int deleteFlg) {
		this.deleteFlg = deleteFlg;
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
	 * @return profileData
	 */
	public ArrayList<UserDTO> getProfileData() {
		return profileData;
	}


	/**
	 * @param profileData セットする profileData
	 */
	public void setProfileData(ArrayList<UserDTO> profileData) {
		this.profileData = profileData;
	}


	/**
	 * @return profileList
	 */
	public ArrayList<UserDTO> getProfileList() {
		return profileList;
	}


	/**
	 * @param profileList セットする profileList
	 */
	public void setProfileList(ArrayList<UserDTO> profileList) {
		this.profileList = profileList;
	}

}
