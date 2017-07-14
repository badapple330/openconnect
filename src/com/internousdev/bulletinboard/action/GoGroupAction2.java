package com.internousdev.bulletinboard.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bulletinboard.dao.GroupDAO;
import com.internousdev.bulletinboard.dto.GroupDTO;
import com.internousdev.bulletinboard.util.SafeDateFormat;
import com.opensymphony.xwork2.ActionSupport;

public class GoGroupAction2 extends ActionSupport implements SessionAware {
	private int userId;
	private ArrayList<GroupDTO> groupList;
	private String today;
	private Map<String, Object> session;
	private String errorMsg;
	@Override
	public String execute(){
		String ret = ERROR;
		if(!session.containsKey("userId")){
			ret = "login";
			System.out.println("GoGroupListAction: " + ret);
			return ret;
		}
		userId = (int)session.get("userId");
		System.out.println("GoGroupListAction: userId = " + userId);

		GroupDAO dao = new GroupDAO();
		groupList = dao.getGroups(userId);

		if(groupList.isEmpty()){
			errorMsg = "グループがありません";
		}

		SafeDateFormat.applyPattern("MM/dd(E)");
		today = SafeDateFormat.format(new Date());

		ret = SUCCESS;
		System.out.println("GoGroupListAction: " + ret + ", errorMsg = " + errorMsg);
		return ret;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public ArrayList<GroupDTO> getGroupList() {
		return groupList;
	}
	public void setGroupList(ArrayList<GroupDTO> groupList) {
		this.groupList = groupList;
	}
	public String getToday() {
		return today;
	}
	public void setToday(String today) {
		this.today = today;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
