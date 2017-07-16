/**
 *
 */
package com.internousdev.bulletinboard.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bulletinboard.dao.ChangeIconDAO;
import com.opensymphony.xwork2.ActionSupport;


public class ChangeUserIconAction extends ActionSupport implements SessionAware{

		/** シリアルID */
		private static final long serialVersionUID = -7129551593360374656L;

		/** ユーザーID */
		private int userId=0;

		/** 画像URL */
		private String icon;

		/** セッション */
		private Map<String,Object> session;


		/** ユーザーのポストリストの生成メソッド */
		public String execute() {
			String result = ERROR;
			if (session.containsKey("userId")) {
				userId = (int) session.get("userId");
			}



			if(userId==0){return result;}


				ChangeIconDAO set = new ChangeIconDAO();
				if(0<set.setUserIcon(userId,icon)){
					result=SUCCESS;
				}

			return result;
		}





		public int getUserId() {
			return userId;
		}

		public String getIcon() {
			return icon;
		}

		public Map<String, Object> getSession() {
			return session;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}

		public void setIcon(String icon) {
			this.icon = icon;
		}

		public void setSession(Map<String, Object> session) {
			this.session = session;
		}

}
