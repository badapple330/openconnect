package com.internousdev.bulletinboard.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bulletinboard.dao.TimelineDAO;
import com.internousdev.bulletinboard.dao.UserDAO;
import com.internousdev.bulletinboard.dto.TimelineDTO;
import com.opensymphony.xwork2.ActionSupport;

public class SendTimelineAction extends ActionSupport implements SessionAware{

	/**
	 * ユーザーID
	 */
	private int userId;
	/**
	 * 送信内容
	 */
	private String sendContents;
	/**
	 * 返信先のタイムラインID
	 */
	private int reTimelineId;
	/**
	 * 返信先のユーザー名
	 */
	private String userName;
	/**
	 * 返信内容
	 */
	private String reSendContents;
	/**
	 * セッション
	 */
	private Map<String,Object> session;
	/**
	 * タイムラインのリスト
	 */
	private ArrayList<TimelineDTO> followerList = new ArrayList<TimelineDTO>();



	public String execute(){
		String result = ERROR;

		if (session.containsKey("userId")) {
			userId = (int) session.get("userId");
		}
		if(userId==0){return result;}

		TimelineDAO dao = new TimelineDAO(userId);
		TimelineDTO dto = new TimelineDTO();
		UserDAO msgDao = new UserDAO();

		//返信の場合は「＠名前 内容」という形に変える
		if(reTimelineId != 0){
			sendContents = ("@" + userName + " " + reSendContents);
		}

		//同じ情報を連投してた場合の処理
		dto = dao.timelineCheck();
		if(dto.getSendContents() != null){
			if(dto.getSendContents().equals(sendContents)){
				msgDao.msgSet(userId, "同じ内容は連投できません");
				return result;
			}
		}

		//タイムライン投稿情報にインサートする
		if(dao.timelineSend(sendContents, reTimelineId) != 0){
			//通知をインサート
			msgDao.msgSet(userId, "投稿が完了しました");
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
	 * @return sendContents
	 */
	public String getSendContents() {
		return sendContents;
	}

	/**
	 * @param sendContents セットする sendContents
	 */
	public void setSendContents(String sendContents) {
		this.sendContents = sendContents;
	}

	/**
	 * @return reTimelineId
	 */
	public int getReTimelineId() {
		return reTimelineId;
	}

	/**
	 * @param reTimelineId セットする reTimelineId
	 */
	public void setReTimelineId(int reTimelineId) {
		this.reTimelineId = reTimelineId;
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
	 * @return followerList
	 */
	public ArrayList<TimelineDTO> getFollowerList() {
		return followerList;
	}

	/**
	 * @param followerList セットする followerList
	 */
	public void setFollowerList(ArrayList<TimelineDTO> followerList) {
		this.followerList = followerList;
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
	 * @return reSendContents
	 */
	public String getReSendContents() {
		return reSendContents;
	}


	/**
	 * @param reSendContents セットする reSendContents
	 */
	public void setReSendContents(String reSendContents) {
		this.reSendContents = reSendContents;
	}

}
