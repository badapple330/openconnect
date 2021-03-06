
package com.internousdev.bulletinboard.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bulletinboard.dao.LikeDAO;
import com.opensymphony.xwork2.ActionSupport;

public class LikeAction extends ActionSupport implements SessionAware {
	/** ユーザーID */
	private int userId = 0;
	/** 送信者ID */
	private int senderId;
	/** 投稿ID */
	private int postId;
	/** お気に入りフラグ */
	private int btn_flg = 0;
	/** セッション */
	private Map<String, Object> session;

	public String execute() {
		String result = ERROR;
		if (session.containsKey("userId")) {
			userId = (int) session.get("userId");
		}
		if (userId == 0) {
			return result;
		}

		LikeDAO dao = new LikeDAO();
		if (btn_flg == 1) {
			if (!(dao.isLiked(userId, postId))) {
				dao.pointPlus(senderId, postId);
				dao.insertLike(userId, postId);
				result = SUCCESS;
			}
		}
		return result;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getSenderId() {
		return senderId;
	}

	public void setSenderId(int senderId) {
		this.senderId = senderId;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public int getBtn_flg() {
		return btn_flg;
	}

	public void setBtn_flg(int btn_flg) {
		this.btn_flg = btn_flg;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
