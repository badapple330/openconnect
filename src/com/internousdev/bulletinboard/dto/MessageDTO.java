package com.internousdev.bulletinboard.dto;






public class MessageDTO {


	/**
	 * 投稿情報に関するDTOクラス
	 *
	 * @author JUN KIKUCHI
	 * @since 2017/05/08
	 * @version 1.0
	 *
	 */


	/**
	 * 投稿ID
	 */
	private int postId;


	/**
	 * 送信者ID
	 */
	private int senderId;


	/**
	 * 送信者名
	 */
	private String senderName;

	/**
	 * 送信者画像
	 */
	private String senderImg;


	/**
	 * 受取人ID
	 */
	private int receiverId;

	/**
	 * グループID
	 */
	private int groupId;

	/**
	 * 送信内容
	 */
	private String postContents;

	/**
	 * 添付画像
	 */
	private String img;

	/**
	 * 投稿日時
	 */
	private String postAt ;

	/**
	 * グループ名
	 */
	private String groupName;

	/**
	 * グループイメージ
	 */
	private String groupImg;

	private int notRead=0;

	private int readFlg=0;


	//以下アクセサリー

	/**
	 * 投稿IDを取得するメソッド
	 * @return postId
	 */
	public int getPostId() {
		return postId;
	}

	/**
	 * 送信者IDを取得するメソッド
	 * @return senderId
	 */
	public int getSenderId() {
		return senderId;
	}

	/**
	 * 送信者名を取得するメソッド
	 * @return senderId
	 */
	public String getSenderName() {
		return senderName;
	}

	/**
	 * 送信者画像を取得するメソッド
	 * @return senderId
	 */
	public String getSenderImg() {
		return senderImg;
	}


	/**
	 * 受取人IDを取得するメソッド
	 * @return receiverId
	 */
	public int getReceiverId() {
		return receiverId;
	}

	/**
	 * グループIDを取得するメソッド
	 * @return groupId
	 */
	public int getGroupId() {
		return groupId;
	}

	/**
	 * 送信内容を取得するメソッド
	 * @return postContents
	 */
	public String getPostContents() {
		return postContents;
	}

	/**
	 * 添付画像を取得するメソッド
	 * @return img
	 */
	public String getImg() {
		return img;
	}

	/**
	 * 投稿日時を取得するメソッド
	 * @return postAt
	 */
	public String getPostAt() {
		return postAt;
	}

	/**
	 * 投稿IDを格納するメソッド
	 * @param postId セットする postId
	 */
	public void setPostId(int postId) {
		this.postId = postId;
	}

	/**
	 * 送信者IDを格納するメソッド
	 * @param senderId セットする senderId
	 */
	public void setSenderId(int senderId) {
		this.senderId = senderId;
	}

	/**
	 * 送信者名を格納するメソッド
	 * @param senderName セットする senderName
	 */
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	/**
	 * 送信者画像を格納するメソッド
	 * @param senderImg セットする senderImg
	 */
	public void setSenderImg(String senderImg) {
		this.senderImg = senderImg;
	}

	/**
	 * 受取人IDを格納するメソッド
	 * @param receiverId セットする receiverId
	 */
	public void setReceiverId(int receiverId) {
		this.receiverId = receiverId;
	}

	/**
	 * グループIDを格納するメソッド
	 * @param groupId セットする groupId
	 */
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	/**
	 * 送信内容を格納するメソッド
	 * @param postContents セットする postContents
	 */
	public void setPostContents(String postContents) {
		this.postContents = postContents;
	}

	/**
	 * 添付画像を格納するメソッド
	 * @param img セットする img
	 */
	public void setImg(String img) {
		this.img = img;
	}

	/**
	 * 投稿日時を格納するメソッド
	 * @param postAt セットする postAt
	 */
	public void setPostAt(String postAt) {
		this.postAt = postAt;
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
	 * @return groupImg
	 */
	public String getGroupImg() {
		return groupImg;
	}

	/**
	 * @param groupImg セットする groupImg
	 */
	public void setGroupImg(String groupImg) {
		this.groupImg = groupImg;
	}

	/**
	 * @return readFlg
	 */
	public int getReadFlg() {
		return readFlg;
	}

	/**
	 * @param readFlg セットする readFlg
	 */
	public void setReadFlg(int readFlg) {
		this.readFlg = readFlg;
	}

	/**
	 * @return notRead
	 */
	public int getNotRead() {
		return notRead;
	}

	/**
	 * @param notRead セットする notRead
	 */
	public void setNotRead(int notRead) {
		this.notRead = notRead;
	}



}
