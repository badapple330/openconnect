package com.internousdev.bulletinboard.dto;

public class GoodDTO {


	/**
	 * いいね情報に関するDTOクラス
	 *
	 * @author JUN KIKUCHI
	 * @since 2017/05/08
	 * @version 1.0
	 *
	 */


	/**
	 * ユーザーID
	 */
	private int userId;

	/**
	 * タイムラインID
	 */
	private int timelineId;


	/**
	 * ユーザーIDを取得するメソッド
	 * @return userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * タイムラインIDを取得するメソッド
	 * @return timelineId
	 */
	public int getTimelineId() {
		return timelineId;
	}
	/**
	 * ユーザーIDを格納するメソッド
	 * @param userId セットする userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * タイムラインIDを格納するメソッド
	 * @param gtimelineId セットする timelineId
	 */
	public void setTimelineId(int timelineId) {
		this.timelineId = timelineId;
	}


}
