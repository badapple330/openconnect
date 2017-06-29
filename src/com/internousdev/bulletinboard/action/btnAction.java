
package com.internousdev.bulletinboard.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bulletinboard.dao.GoodDAO;
import com.internousdev.bulletinboard.dao.btnDAO;
import com.opensymphony.xwork2.ActionSupport;


public class btnAction extends ActionSupport  implements SessionAware{

 private int userId=0;

 private int senderId;

 private int timelineId;

 private int btn_flg =0;

 private Map<String,Object> session;

 btnDAO dao = new btnDAO();
 GoodDAO dao2 = new GoodDAO();

 public String execute(){
	 GoodDAO good = new GoodDAO();
	 String result = ERROR;
	 if (session.containsKey("userId")) {
			userId = (int) session.get("userId");
		}
		if(userId==0){return result;}


	 if(btn_flg==1){
			if(!(good.isGood(userId,timelineId))){
				btnDAO dao2 = new btnDAO();
				GoodDAO dao3 = new GoodDAO();
				dao2.pointPlus(senderId,timelineId);
				dao3.goodSet(userId,timelineId);

				result=SUCCESS;

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

 public int getTimelineId() {
	 return timelineId;
 }

 public void setTimelineId(int timelineId) {
	 this.timelineId = timelineId;
 }

/**
 * @return btn_flg
 */
public int getBtn_flg() {
	return btn_flg;
}

/**
 * @param btn_flg セットする btn_flg
 */
public void setBtn_flg(int btn_flg) {
	this.btn_flg = btn_flg;
}

/**
 * @return session
 */
public Map<String,Object> getSession() {
	return session;
}

/**
 * @param session セットする session
 */
public void setSession(Map<String,Object> session) {
	this.session = session;
}


}



