package com.internousdev.bulletinboard.dto;

import java.util.Date;

import com.internousdev.bulletinboard.util.SafeDateFormat;

public class MessageDTO {
	/**
	 * 投稿情報に関するDTOクラス
	 * @author JUN KIKUCHI
	 * @since 2017/05/08
	 * @version 1.0
	 */

	/** 投稿ID */
	private int messageId;
	/** 送信者ID */
	private int senderId;
	/** 送信者名 */
	private String senderName;
	/** 送信者画像 */
	private String senderImg;
	/** 受取人ID */
	private int receiverId;
	/** グループID */
	private int groupId;
	/** グループ名 */
	private String groupName;
	/** 送信内容 */
	private String text;
	/** スタンプID */
	private int stampId;
	/** スタンプ */
	private String stamp;
	/** 投稿日時 */
	private Date createdAt ;
	private String creationDate;
	private String creationTime;
	/** グループイメージ */
	private String groupIcon;
	private int notRead=0;
	private boolean isRead;


	private void culcLastMsgDate() {
		SafeDateFormat.applyPattern("MM/dd(E)");
		if(!(this.createdAt == null)){
			this.creationDate = SafeDateFormat.format(createdAt);
		}
	}
	private void culcLastMsgTime() {
		SafeDateFormat.applyPattern("HH:mm");
		if(!(this.createdAt == null)){
			this.creationTime = SafeDateFormat.format(createdAt);
		}
	}

	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public int getSenderId() {
		return senderId;
	}
	public void setSenderId(int senderId) {
		this.senderId = senderId;
	}
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public String getSenderImg() {
		return senderImg;
	}
	public void setSenderImg(String senderImg) {
		this.senderImg = senderImg;
	}
	public int getReceiverId() {
		return receiverId;
	}
	public void setReceiverId(int receiverId) {
		this.receiverId = receiverId;
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getStampId() {
		return stampId;
	}
	public void setStampId(int stampId) {
		this.stampId = stampId;
	}
	public String getStamp() {
		return stamp;
	}
	public void setStamp(String stamp) {
		this.stamp = stamp;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
		culcLastMsgDate();
		culcLastMsgTime();
	}
	public String getCreationDate() {
		return creationDate;
	}
	public String getCreationTime() {
		return creationTime;
	}
	public String getGroupIcon() {
		return groupIcon;
	}
	public void setGroupIcon(String groupIcon) {
		this.groupIcon = groupIcon;
	}
	public int getNotRead() {
		return notRead;
	}
	public void setNotRead(int notRead) {
		this.notRead = notRead;
	}
	public boolean getIsRead() {
		return isRead;
	}
	public void setIsRead(boolean isRead) {
		this.isRead = isRead;
	}
}
