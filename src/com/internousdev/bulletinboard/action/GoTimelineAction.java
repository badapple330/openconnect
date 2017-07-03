package com.internousdev.bulletinboard.action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bulletinboard.dao.FooterInfoDAO;
import com.internousdev.bulletinboard.dao.TimelineDAO;
import com.internousdev.bulletinboard.dao.UserDAO;
import com.internousdev.bulletinboard.dto.TimelineDTO;
import com.internousdev.bulletinboard.dto.UserDTO;
import com.internousdev.bulletinboard.util.TimelineComparator;
import com.opensymphony.xwork2.ActionSupport;

/**
 * タイムラインを表示するためのクラス
 * @author internousdev
 * @since 2017/06/07
 * @version 1.0
 */
public class GoTimelineAction extends ActionSupport implements SessionAware{

	/**
	 * ユーザーID
	 */
	private int userId=0;

	 /**
	  * 通知リスト
	  */
	 ArrayList<UserDTO> msgList = new ArrayList<UserDTO>();


	/**
	 * 名前
	 */
	private String userName;


	private int talkInfo=0;
	private int groupInfo=0;

	/**
	 * タイムラインのリスト
	 */
	private ArrayList<TimelineDTO> tlList = new ArrayList<TimelineDTO>();

	/**
	 * セッション
	 */
	private Map<String,Object> session;

	public String execute() {
		String result = ERROR;

		if (session.containsKey("userId")) {
			userId = (int) session.get("userId");
		}
		if(userId==0){return result;}



		TimelineDAO dao = new TimelineDAO(userId);
		tlList = dao.TimelineGet();
		if(tlList.size() != 0){
			Collections.sort(tlList, new TimelineComparator());

			//通知を追加
			UserDAO msgDao = new UserDAO();
			msgList = msgDao.msgSelect(userId);
			msgDao.msgDelete(userId);

		}

		FooterInfoDAO infodao = new FooterInfoDAO();
		setGroupInfo(infodao.groupInfoGet(userId));
		setTalkInfo(infodao.talkInfoGet(userId));

		result = SUCCESS;
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
	 * @return tlList
	 */
	public ArrayList<TimelineDTO> getTlList() {
		return tlList;
	}

	/**
	 * @param tlList セットする tlList
	 */
	public void setTlList(ArrayList<TimelineDTO> tlList) {
		this.tlList = tlList;
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
	 * @return msgList
	 */
	public ArrayList<UserDTO> getMsgList() {
		return msgList;
	}



	/**
	 * @param msgList セットする msgList
	 */
	public void setMsgList(ArrayList<UserDTO> msgList) {
		this.msgList = msgList;
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
