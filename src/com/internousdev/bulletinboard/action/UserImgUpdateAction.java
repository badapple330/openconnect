/**
 *
 */
package com.internousdev.bulletinboard.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bulletinboard.dao.UserImgDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 *
 */
public class UserImgUpdateAction extends ActionSupport implements SessionAware{

		/**
		 * シリアルID
		 */
		private static final long serialVersionUID = -7129551593360374656L;


		/**
		 * ユーザーID
		 */
		private int userId=0;

		/**
		 * グループID
		private int groupId;
		*/

		/**
		 * 画像URL
		 */
		private String url;


		private Map<String,Object> session;

		/**
		 * グループ名

		private String groupName="（・ω・）" ;
		*/



		/**
		 *ユーザーのポストリストの生成メソッド
		 */
		public String execute() {
			String result = ERROR;
			if (session.containsKey("userId")) {
				userId = (int) session.get("userId");
			}



			if(userId==0){return result;}


				UserImgDAO set = new UserImgDAO();
				if(0<set.setUserImg(userId,url)){
					result=SUCCESS;
				}

			return result;
		}





		/**
		 * @return userId
		 */
		public int getUserId() {
			return userId;
		}


		/**
		 * @return groupId

		public int getGroupId() {
			return groupId;
		}
		*/



		/**
		 * @return img
		 */
		public String getUrl() {
			return url;
		}


		/**
		 * @return session
		 */
		public Map<String, Object> getSession() {
			return session;
		}


		/**
		 * @param userId セットする userId
		 */
		public void setUserId(int userId) {
			this.userId = userId;
		}

		/**
		 * @param groupId セットする groupId
		public void setGroupId(int groupId) {
			this.groupId = groupId;
		}
		*/

		/**
		 * @param url セットする url
		 */
		public void setUrl(String url) {
			this.url = url;
		}


		/**
		 * @param session セットする session
		 */
		public void setSession(Map<String, Object> session) {
			this.session = session;
		}

		/**
		 * @return groupName

		public String getGroupName() {
			return groupName;
		}
		*/


		/**
		 * @param groupName セットする groupName

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}
		*/

}
