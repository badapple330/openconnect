package com.internousdev.bulletinboard.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bulletinboard.dao.FollowListDAO;
import com.internousdev.bulletinboard.dao.FollowerDAO;
import com.internousdev.bulletinboard.dao.FooterInfoDAO;
import com.internousdev.bulletinboard.dao.ProfileDAO;
import com.internousdev.bulletinboard.dto.UserDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ProfileAction extends ActionSupport implements SessionAware{



	private Map<String,Object> session;

	private int userId;

	private String userName;

	private String userImg;

	private int Do;

	private int done;

	private int followNum;

	private int followerNum;

	private int point;

	private int lv;

	private String profile;

	private int talkInfo=0;
	private int groupInfo=0;

	private ArrayList<UserDTO> myDate = new ArrayList<UserDTO>();



	private ArrayList<UserDTO> followList = new ArrayList<UserDTO>();

	private ArrayList<UserDTO> followerList = new ArrayList<UserDTO>();


	/**
	 * @return followerList
	 */
	public ArrayList<UserDTO> getFollowerList() {
		return followerList;
	}


	/**
	 * @param followerList セットする followerList
	 */
	public void setFollowerList(ArrayList<UserDTO> followerList) {
		this.followerList = followerList;
	}


	public String execute(){

		String result = ERROR;

		if(session.containsKey("userId")){

			userId = (int) session.get("userId");
			}


			if(userId == 0){
				return result;
			};


		ProfileDAO dao = new ProfileDAO();
		setMyDate(dao.select(userId));

		followList = dao.getFollow(userId);
		setFollowNum((followList.size()));

		setFollowerList(dao.getFollower(userId));
		setFollowerNum((followerList.size()));


		FollowListDAO fdao = new FollowListDAO();

		followList = fdao.getFollow(userId);

		FollowerDAO frdao = new FollowerDAO();

		followerList = frdao.getFollower(userId);






		FooterInfoDAO infodao = new FooterInfoDAO();
		setGroupInfo(infodao.groupInfoGet(userId));
		setTalkInfo(infodao.talkInfoGet(userId));


		result=SUCCESS;
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
	 * @return followList
	 */
	public ArrayList<UserDTO> getfollowList() {
		return followList;
	}


	/**
	 * @param followList セットする followList
	 */
	public void setfollowList(ArrayList<UserDTO> followList) {
		this.followList = followList;
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
	 * @return followerNum
	 */
	public int getFollowerNum() {
		return followerNum;
	}


	/**
	 * @param followerNum セットする followerNum
	 */
	public void setFollowerNum(int followerNum) {
		this.followerNum = followerNum;
	}


	/**
	 * @return followNum
	 */
	public int getFollowNum() {
		return followNum;
	}


	/**
	 * @param followNum セットする followNum
	 */
	public void setFollowNum(int followNum) {
		this.followNum = followNum;
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
	 * @return myDate
	 */
	public ArrayList<UserDTO> getMyDate() {
		return myDate;
	}


	/**
	 * @param myDate セットする myDate
	 */
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


	/**
	 * @return talkInfo
	 */
	public int getTalkInfo() {
		return talkInfo;
	}


	/**
	 * @param talkInfo セットする talkInfo
	 */
	public void setTalkInfo(int talkInfo) {
		this.talkInfo = talkInfo;
	}


	/**
	 * @return groupInfo
	 */
	public int getGroupInfo() {
		return groupInfo;
	}


	/**
	 * @param groupInfo セットする groupInfo
	 */
	public void setGroupInfo(int groupInfo) {
		this.groupInfo = groupInfo;
	}




}
