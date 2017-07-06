package com.internousdev.bulletinboard.dto;

public class TimelineDTO {

	/** タイムラインID */
	private int timelineId;

	/** 送信者ID */
	private int senderId;

	/** フォロワーID */
	private int followerId;

	/** 送信内容 */
	private  String sendContents;

	/** 添付画像 */
	private String img;

	/** 送信日時 */
	private String sendAt;

	/** 名前 */
	private String userName;

	/** 写真 */
	private String userImg;

	/** ポイント */
	private int point;

	/** いいねフラグ */
	private boolean goodFlg;

	/** 返信先のタイムラインID */
	private int reTimelineId;

	/** 返信先のユーザーID　*/
	private int reUserId;

	/** 返信先のユーザー名　*/
	private String reUserName;

	/** 返信先の投稿内容　*/
	private String reSendContents;

	/** 返信先の投稿日時　*/
	private String reSendAt;

	/** 返信先の画像　*/
	private String reImg;
	
	
	
	public int getTimelineId() {
		return timelineId;
	}

	public void setTimelineId(int timelineId) {
		this.timelineId = timelineId;
	}

	public int getSenderId() {
		return senderId;
	}

	public void setSenderId(int senderId) {
		this.senderId = senderId;
	}

	public int getFollowerId() {
		return followerId;
	}

	public void setFollowerId(int followerId) {
		this.followerId = followerId;
	}

	public String getSendContents() {
		return sendContents;
	}

	public void setSendContents(String sendContents) {
		this.sendContents = sendContents;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getSendAt() {
		return sendAt;
	}

	public void setSendAt(String sendAt) {
		this.sendAt = sendAt;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserImg() {
		return userImg;
	}

	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public boolean isGoodFlg() {
		return goodFlg;
	}

	public void setGoodFlg(boolean goodFlg) {
		this.goodFlg = goodFlg;
	}

	public int getReTimelineId() {
		return reTimelineId;
	}

	public void setReTimelineId(int reTimelineId) {
		this.reTimelineId = reTimelineId;
	}

	public int getReUserId() {
		return reUserId;
	}

	public void setReUserId(int reUserId) {
		this.reUserId = reUserId;
	}

	public String getReUserName() {
		return reUserName;
	}

	public void setReUserName(String reUserName) {
		this.reUserName = reUserName;
	}

	public String getReSendContents() {
		return reSendContents;
	}

	public void setReSendContents(String reSendContents) {
		this.reSendContents = reSendContents;
	}

	public String getReSendAt() {
		return reSendAt;
	}

	public void setReSendAt(String reSendAt) {
		this.reSendAt = reSendAt;
	}

	public String getReImg() {
		return reImg;
	}

	public void setReImg(String reImg) {
		this.reImg = reImg;
	}

}
