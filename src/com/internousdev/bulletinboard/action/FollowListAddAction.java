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



	/** セッション */
	private Map<String,Object> session;

	/** ユーザーID */
	private int userId;

	/** フォローする側のID */
	private int Do;

	/** フォローされる側のID */
	private int done;

	/**  */
	private int viewId;
	
	/** フォロー番号 */
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

	
	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getDo() {
		return Do;
	}

	public void setDo(int do1) {
		this.Do = do1;
	}

	public int getDone() {
		return done;
	}

	public void setDone(int done) {
		this.done = done;
	}

	public int getViewId() {
		return viewId;
	}

	public void setViewId(int viewId) {
		this.viewId = viewId;
	}

	public int getFollowNum() {
		return followNum;
	}
	
	public void setFollowNum(int followNum) {
		this.followNum = followNum;
	}

}
