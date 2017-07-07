package com.internousdev.bulletinboard.dto;

public class PostDTO {

	/** タイムラインID */
	private int postId;

	/** 送信者ID */
	private int senderId;

	/** フォロワーID */
	private int followerId;

	/** 送信内容 */
	private  String text;

	/** 添付画像 */
	private String img;

	/** 送信日時 */
	private String createdAt;

	/** 名前 */
	private String userName;

	/** 写真 */
	private String userImg;

	/** ポイント */
	private int point;

	/** いいねフラグ */
	private boolean goodFlg;

	/** 返信先のタイムラインID */
	private int rePostId;

	/** 返信先のユーザーID　*/
	private int reUserId;

	/** 返信先のユーザー名　*/
	private String reUserName;

	/** 返信先の投稿内容　*/
	private String reText;

	/** 返信先の投稿日時　*/
	private String reCreatedAt;

	/** 返信先の画像　*/
	private String reImg;
	
	
	
	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
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

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
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

	public int getRePostId() {
		return rePostId;
	}

	public void setRePostId(int rePostId) {
		this.rePostId = rePostId;
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

	public String getReText() {
		return reText;
	}

	public void setReText(String reText) {
		this.reText = reText;
	}

	public String getReCreatedAt() {
		return reCreatedAt;
	}

	public void setReCreatedAt(String reCreatedAt) {
		this.reCreatedAt = reCreatedAt;
	}

	public String getReImg() {
		return reImg;
	}

	public void setReImg(String reImg) {
		this.reImg = reImg;
	}

}
