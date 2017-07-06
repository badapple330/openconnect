package com.internousdev.bulletinboard.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bulletinboard.dao.ChatDAO;
import com.internousdev.bulletinboard.dto.PostDTO;
import com.internousdev.bulletinboard.util.BotTalk;
import com.opensymphony.xwork2.ActionSupport;



public class SubmitMessageAction extends ActionSupport implements SessionAware{
	/** シリアルID */
	private static final long serialVersionUID = -7129551593360374656L;
	/** ユーザーID */
	private int userId = 0;
	/** 送信者名 */
	private String senderName;
	/** 送信者画像 */
	private String senderImg;
	/** 受取人ID */
	private int receiverId;
	/** 受取人名 */
	private String receiverName;
	/** グループID */
	private int groupId;
	/** 送信内容 */
	private String postContents="";
	/** 添付画像 */
	private String url="";
	/** 投稿日時 */
	private String postAt ;
	private Map<String,Object> session;
	/** ポストリスト */
	public ArrayList<PostDTO> postList = new ArrayList<PostDTO>();
	/** 投稿件数 */
	private int postCount=0;
	/** グループ名 */
	private String groupName="（・ω・）" ;

	/**
	 *ユーザーのポストリストの生成メソッド
	 */
	public String execute() {
		String result = ERROR;
		if (session.containsKey("userId")) {
			userId = (int) session.get("userId");
		}

		if(session.containsKey("receiverId")){
			receiverId = (int) session.get("receiverId");
			receiverName = session.get("receiverName").toString();
			groupId = (int) session.get("groupId");
			groupName = session.get("groupName").toString();
		}

		if(userId == 0){
			return result;
		}


		//送信内容がある場合に送信内容送信
		if (!postContents.equals("")){
			ChatDAO chatDAO = new ChatDAO();
			if(chatDAO.insertMessage(userId, receiverId, groupId, postContents, url) != 0){
				//botと話す場合の処理
				if(receiverId < 0){
					BotTalk bot = new BotTalk(receiverId,userId,postContents);
					String response = bot.talkContents();
					if(response != null){
						bot.botSet(userId,response);
						result=SUCCESS;
					}
				}else{
					result=SUCCESS;
				}
			}
		//スタンプだった場合にスタンプ送信
		} else if(!url.equals("")) {
			postContents="スタンプを投稿しました";
			ChatDAO set = new ChatDAO();
			if(set.insertMessage(userId, receiverId, groupId, postContents, url) != 0){
				if(receiverId < 0){
					BotTalk bot = new BotTalk(receiverId,userId,postContents);
					String response = bot.talkContents();
					if(response != null){
						bot.botSet(userId,response);
						result=SUCCESS;
					}
				}else{
					result=SUCCESS;
				}
			}

		}else{
			result=SUCCESS;
		}
		return result;
	}


	public int getUserId() {
		return userId;
	}
	public int getReceiverId() {
		return receiverId;
	}
	public int getGroupId() {
		return groupId;
	}
	public String getPostContents() {
		return postContents;
	}
	public String getUrl() {
		return url;
	}
	public String getPostAt() {
		return postAt;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public ArrayList<PostDTO> getPostList() {
		return postList;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setReceiverId(int receiverId) {
		this.receiverId = receiverId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public void setPostContents(String postContents) {
		this.postContents = postContents;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setPostAt(String postAt) {
		this.postAt = postAt;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public void setPostList(ArrayList<PostDTO> postList) {
		this.postList = postList;
	}


	/**
	 * @return senderName
	 */
	public String getSenderName() {
		return senderName;
	}


	/**
	 * @return senderImg
	 */
	public String getSenderImg() {
		return senderImg;
	}


	/**
	 * @param senderName セットする senderName
	 */
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}


	/**
	 * @param senderImg セットする senderImg
	 */
	public void setSenderImg(String senderImg) {
		this.senderImg = senderImg;
	}


	/**
	 * @return postCount
	 */
	public int getPostCount() {
		return postCount;
	}


	/**
	 * @param postCount セットする postCount
	 */
	public void setPostCount(int postCount) {
		this.postCount = postCount;
	}




	/**
	 * @return groupName
	 */
	public String getGroupName() {
		return groupName;
	}


	/**
	 * @param groupName セットする groupName
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}




	/**
	 * @return receiverName
	 */
	public String getReceiverName() {
		return receiverName;
	}


	/**
	 * @param receiverName セットする receiverName
	 */
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}










}
