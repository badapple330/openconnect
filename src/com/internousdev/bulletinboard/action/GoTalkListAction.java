package com.internousdev.bulletinboard.action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bulletinboard.dao.FooterInfoDAO;
import com.internousdev.bulletinboard.dao.TalkListDAO;
import com.internousdev.bulletinboard.dao.colorChangeDAO;
import com.internousdev.bulletinboard.dto.PostDTO;
import com.internousdev.bulletinboard.util.GroupComparator;
import com.opensymphony.xwork2.ActionSupport;

public class GoTalkListAction extends ActionSupport implements SessionAware{

	/**
	 * ユーザーID
	 */
	private int userId=0;


	private int talkInfo=0;
	private int groupInfo=0;

	/**
	 * グループリスト
	 */
	public ArrayList<PostDTO> talkList = new ArrayList<PostDTO>();




	/**
	 * セッション
	 */
	private Map<String,Object> session;

	public String execute() {



	String result = ERROR;
	if (session.containsKey("userId")) {
		userId = (int) session.get("userId");
	}
	if(userId==0){return result;}

	colorChangeDAO cdao=new colorChangeDAO();

	session.put("color", cdao.getColor(userId));




	TalkListDAO dao = new TalkListDAO();
	talkList = dao.talkGet(userId);
	if(talkList != null){
		Collections.sort(talkList, new GroupComparator());
	}

	result =SUCCESS;



	FooterInfoDAO infodao = new FooterInfoDAO();
	groupInfo=infodao.groupInfoGet(userId);
	talkInfo=infodao.talkInfoGet(userId);










	return result;
	}

	/**
	 * @return userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId セットする userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return groupList
	 */
	public ArrayList<PostDTO> getTalkList() {
		return talkList;
	}

	/**
	 * @param groupList セットする groupList
	 */
	public void setTalkList(ArrayList<PostDTO> talkList) {
		this.talkList = talkList;
	}

	/**
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * @param session セットする session
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * @return talkInfo
	 */
	public int getTalkInfo() {
		return talkInfo;
	}

	/**
	 * @param talkInfo セットする talkInfo
	 */
	public void setTalkInfo(int talkInfo) {
		this.talkInfo = talkInfo;
	}

	/**
	 * @return groupInfo
	 */
	public int getGroupInfo() {
		return groupInfo;
	}

	/**
	 * @param groupInfo セットする groupInfo
	 */
	public void setGroupInfo(int groupInfo) {
		this.groupInfo = groupInfo;
	}





}
