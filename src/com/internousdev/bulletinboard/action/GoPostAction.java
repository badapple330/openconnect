package com.internousdev.bulletinboard.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;



public class GoPostAction extends ActionSupport implements SessionAware{
///ユーザー一覧またはグループ一覧から
///ユーザーID,受取人ID,受け取り人名,または
///ユーザーID,グループID,グループ名,を取得する。
	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -7129551593360374656L;


	/**
	 * ユーザーID
	 */
	private int userId=0;
	/**
	 * 受取人ID
	 */
	private int receiverId;
	/**
	 * 受取人名
	 */
	private String receiverName="(・ω・）";
	/**
	 * グループID
	 */
	private int groupId=0;
	/**
	 * グループ名
	 */
	private String groupName="（・ω・）" ;


	private Map<String,Object> session;



	/**
	 *チャット画面遷移時に、送信内容をセッションに追加するメソッド。
	 *
	 */
	public String execute() {
		String result = ERROR;
		if (session.containsKey("userId")) {
			userId = (int) session.get("userId");
		}
		if(userId==0){return result;}

		session.put("userId", userId);
		session.put("receiverId", receiverId);
		session.put("receiverName", receiverName);
		session.put("groupId", groupId);
		session.put("groupName", groupName);
		result=SUCCESS;
		return result;
	}


	/**
	 * @return userId
	 */
	public int getUserId() {
		return userId;
	}


	/**
	 * @return receiverId
	 */
	public int getReceiverId() {
		return receiverId;
	}


	/**
	 * @return groupId
	 */
	public int getGroupId() {
		return groupId;
	}



	/**
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}


	/**
	 * @param userId セットする userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}


	/**
	 * @param receiverId セットする receiverId
	 */
	public void setReceiverId(int receiverId) {
		this.receiverId = receiverId;
	}


	/**
	 * @param groupId セットする groupId
	 */
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	/**
	 * @param session セットする session
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
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
