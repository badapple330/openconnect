package com.internousdev.bulletinboard.dto;




public class UserDTO {

	/**
	 * ユーザーID
	 */
	private int userId;

	/**
	 * 写真
	 */
	private String userImg;

	/**
	 * 名前
	 */
	private String userName;

	/**
	 * ポイント
	 */
	private int point;

	/**
	 * レベル
	 */
	private int lv;

	/**
	 * プロフィール
	 */
	private String profile;

	/**
	 * 削除フラグ
	 */
	private boolean deleteFlg;

	/**
	 * 通知文
	 */
	private String msg;

	private int Do;

	private int Done;


	//以下アクセサリー



	/**
	 * ユーザーIDを取得するメソッド
	 * @return userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * ユーザーIDを格納するメソッド
	 * @param userId セットする userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * 画像を取得するメソッド
	 * @return userImg
	 */
	public String getUserImg() {
		return userImg;
	}

	/**
	 * 画像を格納するメソッド
	 * @param userImg セットする userImg
	 */
	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}

	/**
	 * 名前を取得するメソッド
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 名前を格納するメソッド
	 * @param userName セットする userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * ポイントを取得するメソッド
	 * @return point
	 */
	public int getPoint() {
		return point;
	}

	/**
	 * ポイントを格納するメソッド
	 * @param point セットする point
	 */
	public void setPoint(int point) {
		this.point = point;
	}

	/**
	 * レベルを取得するメソッド
	 * @return lv
	 */
	public int getLv() {
		return lv;
	}

	/**
	 * レベルを格納するメソッド
	 * @param lv セットする lv
	 */
	public void setLv(int lv) {
		this.lv = lv;
	}

	/**
	 * プロフィールを取得するメソッド
	 * @return profile
	 */
	public String getProfile() {
		return profile;
	}

	/**
	 * プロフィールを格納するメソッド
	 * @param profile セットする profile
	 */
	public void setProfile(String profile) {
		this.profile = profile;
	}

	/**
	 * デリートフラグを取得するメソッド
	 * @return deleteFlg
	 */
	public boolean isDeleteFlg() {
		return deleteFlg;
	}

	/**
	 * デリートフラグを格納するメソッド
	 * @param deleteFlg セットする deleteFlg
	 */
	public void setDeleteFlg(boolean deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

	/**
	 * @return msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg セットする msg
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

/**
 * @return do
 */
public int getDo() {
	return Do;
}

/**
 * @param do1 セットする do
 */
public void setDo(int do1) {
	Do = do1;
}

/**
 * @return done
 */
public int getDone() {
	return Done;
}

/**
 * @param done セットする done
 */
public void setDone(int done) {
	Done = done;
}

}