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


	/** ユーザーID */
	private int userId;

	/** タイムラインID */
	private int timelineId;


	public int getUserId() {
		return userId;
	}

	public int getTimelineId() {
		return timelineId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setTimelineId(int timelineId) {
		this.timelineId = timelineId;
	}


}
