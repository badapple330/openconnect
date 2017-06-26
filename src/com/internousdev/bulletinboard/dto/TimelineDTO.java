package com.internousdev.bulletinboard.dto;






public class TimelineDTO {

	/**
	 * タイムラインID
	 */
	private int timelineId;

	/**
	 * 送信者ID
	 */
	private int senderId;

	/**
	 * フォロワーID
	 */
	private int followerId;

	/**
	 * 送信内容
	 */
	private  String sendContents;

	/**
	 * 添付画像
	 */
	private String img;

	/**
	 * 送信日時
	 */
	private String sendAt;

	/**
	 * 名前
	 */
	private String userName;

	/**
	 * 写真
	 */
	private String userImg;

	/**
	 * ポイント
	 */
	private int point;

	/**
	 * いいねフラグ
	 */
	private boolean goodFlg;

	/**
	 * 返信先のタイムラインID
	 */
	private int reTimelineId;

	/**
	 * 返信先のユーザーID
	 */
	private int reUserId;

	/**
	 * 返信先のユーザー名
	 */
	private String reUserName;

	/**
	 * 返信先の投稿内容
	 */
	private String reSendContents;

	/**
	 * 返信先の投稿日時
	 */
	private String reSendAt;

	/**
	 * 返信先の画像
	 */
	private String reImg;


	/**
	 * @return timelineId
	 */
	public int getTimelineId() {
		return timelineId;
	}

	/**
	 * @param timelineId セットする timelineId
	 */
	public void setTimelineId(int timelineId) {
		this.timelineId = timelineId;
	}

	/**
	 * @return senderId
	 */
	public int getSenderId() {
		return senderId;
	}

	/**
	 * @param senderId セットする senderId
	 */
	public void setSenderId(int senderId) {
		this.senderId = senderId;
	}

	/**
	 * @return followerId
	 */
	public int getFollowerId() {
		return followerId;
	}

	/**
	 * @param followerId セットする followerId
	 */
	public void setFollowerId(int followerId) {
		this.followerId = followerId;
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
	 * @return img
	 */
	public String getImg() {
		return img;
	}

	/**
	 * @param img セットする img
	 */
	public void setImg(String img) {
		this.img = img;
	}

	/**
	 * @return sendAt
	 */
	public String getSendAt() {
		return sendAt;
	}

	/**
	 * @param sendAt セットする sendAt
	 */
	public void setSendAt(String sendAt) {
		this.sendAt = sendAt;
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
	 * @return goodFlg
	 */
	public boolean isGoodFlg() {
		return goodFlg;
	}

	/**
	 * @param goodFlg セットする goodFlg
	 */
	public void setGoodFlg(boolean goodFlg) {
		this.goodFlg = goodFlg;
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
	 * @return reUserId
	 */
	public int getReUserId() {
		return reUserId;
	}

	/**
	 * @param reUserId セットする reUserId
	 */
	public void setReUserId(int reUserId) {
		this.reUserId = reUserId;
	}

	/**
	 * @return reUserName
	 */
	public String getReUserName() {
		return reUserName;
	}

	/**
	 * @param reUserName セットする reUserName
	 */
	public void setReUserName(String reUserName) {
		this.reUserName = reUserName;
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

	/**
	 * @return reSendAt
	 */
	public String getReSendAt() {
		return reSendAt;
	}

	/**
	 * @param reSendAt セットする reSendAt
	 */
	public void setReSendAt(String reSendAt) {
		this.reSendAt = reSendAt;
	}

	/**
	 * @return reImg
	 */
	public String getReImg() {
		return reImg;
	}

	/**
	 * @param reImg セットする reImg
	 */
	public void setReImg(String reImg) {
		this.reImg = reImg;
	}

}
