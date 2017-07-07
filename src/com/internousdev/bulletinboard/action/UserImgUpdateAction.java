/**
 *
 */
package com.internousdev.bulletinboard.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bulletinboard.dao.ImgChangeDAO;
import com.opensymphony.xwork2.ActionSupport;


public class UserImgUpdateAction extends ActionSupport implements SessionAware{

		/** シリアルID */
		private static final long serialVersionUID = -7129551593360374656L;

		/** ユーザーID */
		private int userId=0;

		/** 画像URL */
		private String url;

		/** セッション */
		private Map<String,Object> session;
		

		/** ユーザーのポストリストの生成メソッド */
		public String execute() {
			String result = ERROR;
			if (session.containsKey("userId")) {
				userId = (int) session.get("userId");
			}



			if(userId==0){return result;}


				ImgChangeDAO set = new ImgChangeDAO();
				if(0<set.setUserImg(userId,url)){
					result=SUCCESS;
				}

			return result;
		}





		public int getUserId() {
			return userId;
		}

		public String getUrl() {
			return url;
		}

		public Map<String, Object> getSession() {
			return session;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public void setSession(Map<String, Object> session) {
			this.session = session;
		}

}
