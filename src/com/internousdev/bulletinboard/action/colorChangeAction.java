/**
 *
 */
package com.internousdev.bulletinboard.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bulletinboard.dao.colorChangeDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internousdev
 *
 */
public class colorChangeAction extends ActionSupport implements SessionAware{

	private int userId;

	private String hColor;

	private String bColor;

	private String fColor;


	private Map<String,Object> session;



	public String execute() {
		colorChangeDAO dao = new colorChangeDAO();
		String result = ERROR;
		if (session.containsKey("userId")) {
			userId = (int) session.get("userId");
		}
		if(userId==0){return result;}


		dao.colorChange( userId, hColor,bColor,fColor);
		session.put("hColor", dao.getColor(userId).gethColor());
		session.put("bColor", dao.getColor(userId).getbColor());
		session.put("fColor",dao.getColor(userId).getfColor());
		result=SUCCESS;
		return result;
	}




	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}



	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}




	/**
	* 取得メソッド を取得
	* @return hColor
	*/
	public String gethColor() {
		return hColor;
	}




	/**
	* 設定メソッド を設定
	* @param hColor
	*/
	public void sethColor(String hColor) {
		this.hColor = hColor;
	}




	/**
	* 取得メソッド を取得
	* @return bColor
	*/
	public String getbColor() {
		return bColor;
	}




	/**
	* 設定メソッド を設定
	* @param bColor
	*/
	public void setbColor(String bColor) {
		this.bColor = bColor;
	}




	/**
	* 取得メソッド を取得
	* @return fColor
	*/
	public String getfColor() {
		return fColor;
	}




	/**
	* 設定メソッド を設定
	* @param fColor
	*/
	public void setfColor(String fColor) {
		this.fColor = fColor;
	}

}

