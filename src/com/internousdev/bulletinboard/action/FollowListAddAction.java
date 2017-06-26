/**
 *
 */
package com.internousdev.bulletinboard.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bulletinboard.dao.FollowListAddDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internousdev
 *
 */
public class FollowListAddAction extends ActionSupport implements SessionAware{



	private Map<String,Object> session;

	private int userId;

	private int Do;

	private int done;

	private int viewId;

	private int followNum;

	public String execute(){

		int talkflg = 0;

		String result = SUCCESS;
		boolean followCheckFlag = false;
		boolean followFlag = false; //true or false
		boolean insertFlag =false;


		if(session.containsKey("userId")){
			userId = (int) session.get("userId");
            viewId = (int) session.get("viewId");
            talkflg = (int) session.get("talkflg");
		}

			FollowListAddDAO dao=new FollowListAddDAO();

			followCheckFlag = dao.select(userId, viewId);

			if(!followCheckFlag){
			followFlag = dao.insert(userId,viewId);
			insertFlag = dao.insertString(userId,viewId);

			if(viewId < 0){
				if(!dao.select(viewId, userId)){
					dao.insert(viewId, userId);
					dao.insertString(viewId, userId);
				}
			}
			}
			/* 失敗ならばERROR */
			else{
				if(followCheckFlag = true){
					return SUCCESS;
				}
			}
			if (!followFlag){
				if(!insertFlag){
				return ERROR;
			}

				if(talkflg ==1){result = "GoTalk";}

				}

		return result;
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
		return done;
	}

	/**
	 * @param done セットする done
	 */
	public void setDone(int done) {
		this.done = done;
	}

	/**
	 * @return viewId
	 */
	public int getViewId() {
		return viewId;
	}

	/**
	 * @param viewId セットする viewId
	 */
	public void setViewId(int viewId) {
		this.viewId = viewId;
	}

/**
 * @return followNum
 */
public int getFollowNum() {
	return followNum;
}


/**
 * @param followNum セットする followNum
 */
public void setFollowNum(int followNum) {
	this.followNum = followNum;
}

}
