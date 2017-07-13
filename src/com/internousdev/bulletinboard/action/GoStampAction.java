
package com.internousdev.bulletinboard.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bulletinboard.dao.StampDAO;
import com.internousdev.bulletinboard.dto.StampDTO;
import com.internousdev.bulletinboard.dto.StampTypeDTO;
import com.internousdev.bulletinboard.dto.UserDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * スタンプの一覧をデータベースから取得する
 * @author Takahiro Adachi
 * @since 1.0
 */
public class GoStampAction extends ActionSupport implements SessionAware {
	/** シリアルID */
	private static final long serialVersionUID = -7129551593360374656L;
	/** * ユーザーID */
	private int userId = 0;
	/** 受取人ID */
	private int receiverId = 0;
	/** スタンプリスト */
	public ArrayList<StampTypeDTO> stList = new ArrayList<StampTypeDTO>();
	/** スタンプ種類 */
	public int count = 0;
	/** 投稿件数 */
	private int msgCount = 0;
	/** 通知リスト */
	public ArrayList<UserDTO> msgList = new ArrayList<UserDTO>();
	private Map<String, Object> session;

	@Override
	public String execute() {
		String result = ERROR;
		if (session.containsKey("userId")) {
			userId = (int) session.get("userId");
		}
		if (userId == 0) {
			return result;
		}

		ArrayList<StampDTO> stampList = new ArrayList<StampDTO>();
		StampDAO stampdao = new StampDAO();
		stampList = stampdao.stampGet(userId);

		StampIndex stInd = new StampIndex();
		stList = stInd.StampOrder(stampList);
		count = stList.size();
		return result;
	}

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getReceiverId() {
		return receiverId;
	}
	public void setReceiverId(int receiverId) {
		this.receiverId = receiverId;
	}
	public ArrayList<StampTypeDTO> getStList() {
		return stList;
	}
	public void setStList(ArrayList<StampTypeDTO> stList) {
		this.stList = stList;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getMsgCount() {
		return msgCount;
	}
	public void setMsgCount(int msgCount) {
		this.msgCount = msgCount;
	}
	public ArrayList<UserDTO> getMsgList() {
		return msgList;
	}
	public void setMsgList(ArrayList<UserDTO> msgList) {
		this.msgList = msgList;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
