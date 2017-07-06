package com.internousdev.bulletinboard.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bulletinboard.dao.TimelineDAO;
import com.internousdev.bulletinboard.dao.UserDAO;
import com.internousdev.bulletinboard.dto.PostDTO;
import com.opensymphony.xwork2.ActionSupport;

public class SubmitPostAction extends ActionSupport implements SessionAware{
	/** ユーザーID */
	private int userId;
	/** 送信内容 */
	private String sendContents;
	/** 返信先のタイムラインID */
	private int reTimelineId;
	/** 返信先のユーザー名 */
	private String userName;
	/** 返信内容 */
	private String reSendContents;
	/** セッション */
	private Map<String,Object> session;
	/** タイムラインのリスト */
	private ArrayList<PostDTO> followerList = new ArrayList<PostDTO>();

	public String execute(){
		String result = ERROR;

		if (session.containsKey("userId")) {
			userId = (int) session.get("userId");
		}
		if(userId==0){return result;}

		TimelineDAO dao = new TimelineDAO(userId);
		PostDTO dto = new PostDTO();
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

			//ポイントを20加算
			if(dao.pointPlus(userId) != 0){
			//通知をインサート
			msgDao.msgSet(userId, "投稿が完了しました");
				result = SUCCESS;
			}
		}
		return result;
	}







	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getSendContents() {
		return sendContents;
	}

	public void setSendContents(String sendContents) {
		this.sendContents = sendContents;
	}

	public int getReTimelineId() {
		return reTimelineId;
	}

	public void setReTimelineId(int reTimelineId) {
		this.reTimelineId = reTimelineId;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public ArrayList<PostDTO> getFollowerList() {
		return followerList;
	}

	public void setFollowerList(ArrayList<PostDTO> followerList) {
		this.followerList = followerList;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getReSendContents() {
		return reSendContents;
	}

	public void setReSendContents(String reSendContents) {
		this.reSendContents = reSendContents;
	}

}
