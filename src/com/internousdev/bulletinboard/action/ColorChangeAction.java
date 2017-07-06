/**
 *
 */
package com.internousdev.bulletinboard.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bulletinboard.dao.ColorChangeDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internousdev
 *
 */
public class ColorChangeAction extends ActionSupport implements SessionAware{

	private int userId;
	
	//ヘッダーの色
	private String ColorH;
	
	//ボディの色
	private String ColorB;
	
	//フッターの色
	private String ColorF;
	
	/*デフォルトの色
	private String ColorD;
	*/


	private Map<String,Object> session;



	public String execute() {
		ColorChangeDAO dao = new ColorChangeDAO();
		String result = ERROR;
		if (session.containsKey("userId")) {
			userId = (int) session.get("userId");
		}
		if(userId==0){return result;}


		dao.ColorChange( userId, ColorH,ColorB,ColorF);
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
	* @return ColorH
	*/
	public String getColorH() {
		return ColorH;
	}




	/**
	* 取得メソッド を取得
	* @return ColorB
	*/
	public String getColorB() {
		return ColorB;
	}




	/**
	* 取得メソッド を取得
	* @return ColorF
	*/
	public String getColorF() {
		return ColorF;
	}




	/**
	* 設定メソッド を設定
	* @param ColorH
	*/
	public void setColorH(String colorH) {
		ColorH = colorH;
	}




	/**
	* 設定メソッド を設定
	* @param ColorB
	*/
	public void setColorB(String colorB) {
		ColorB = colorB;
	}




	/**
	* 設定メソッド を設定
	* @param ColorF
	*/
	public void setColorF(String colorF) {
		ColorF = colorF;
	}


}

