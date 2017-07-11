package com.internousdev.bulletinboard.action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bulletinboard.dao.ColorChangeDAO;
import com.internousdev.bulletinboard.dao.FooterInfoDAO;
import com.internousdev.bulletinboard.dao.TalkListDAO;
import com.internousdev.bulletinboard.dto.MessageDTO;
import com.internousdev.bulletinboard.util.GroupComparator;
import com.opensymphony.xwork2.ActionSupport;

public class GoTalkListAction extends ActionSupport implements SessionAware{

	/** ユーザーID */
	private int userId=0;


	private int talkInfo=0;
	private int groupInfo=0;

	/** グループリスト */
	public ArrayList<MessageDTO> talkList = new ArrayList<MessageDTO>();




	/** セッション */
	private Map<String,Object> session;

	public String execute() {



	String result = ERROR;
	if (session.containsKey("userId")) {
		userId = (int) session.get("userId");
	}
	if(userId==0){return result;}

	ColorChangeDAO cdao=new ColorChangeDAO();
	String hColor=cdao.getColor(userId).gethColor();
	String bColor=cdao.getColor(userId).getbColor();
	String fColor= cdao.getColor(userId).getfColor();
	session.put("hColor",hColor);
	session.put("bColor",bColor);
	session.put("fColor", fColor);



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

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public ArrayList<MessageDTO> getTalkList() {
		return talkList;
	}

	public void setTalkList(ArrayList<MessageDTO> talkList) {
		this.talkList = talkList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public int getTalkInfo() {
		return talkInfo;
	}

	public void setTalkInfo(int talkInfo) {
		this.talkInfo = talkInfo;
	}

	public int getGroupInfo() {
		return groupInfo;
	}

	public void setGroupInfo(int groupInfo) {
		this.groupInfo = groupInfo;
	}
}
