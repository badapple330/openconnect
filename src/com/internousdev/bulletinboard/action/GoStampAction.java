
package com.internousdev.bulletinboard.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bulletinboard.dao.StampDAO;
import com.internousdev.bulletinboard.dto.StampPackageDTO;
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
	/** スタンプパッケージリスト */
	public ArrayList<StampPackageDTO> stampPackageList = new ArrayList<StampPackageDTO>();
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

		StampDAO dao = new StampDAO();
		stampPackageList = dao.getStampPackageList(userId);
		return result;
	}

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public ArrayList<StampPackageDTO> getStList() {
		return stampPackageList;
	}
	public void setStList(ArrayList<StampPackageDTO> stList) {
		this.stampPackageList = stList;
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
