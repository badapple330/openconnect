package com.internousdev.footprinter.action;

import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.internousdev.footprinter.dao.NewMemSuccessDAO;
import com.opensymphony.xwork2.ActionSupport;


/**
 * 新規顧客情報内容をDAOクラスへ渡すためのクラス
 *@author 田原 一樹
 *@version 1.0
 *@since  1.0
 */
public class SignUpRegistrationAction extends ActionSupport implements SessionAware{
	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 2477662509153091857L;
	/**
	 * セッション
	 */
	private Map<String, Object> session;
	/**
	 * 取得した値をDAOクラスへ渡し、結果をもらうためのメソッド
	 *@return SUCCESS ERROR
	 */
	public String execute(){
		int result = 0;

		NewMemSuccessDAO dao = new NewMemSuccessDAO();

		String getEmail = (String) session.get("email");
		String getPass = (String) session.get("pass");
		String getName = (String) session.get("name");
		String getKana = (String) session.get("kana");
		String getTel = (String) session.get("tel");

		try {
			result = dao.insert(getEmail,getPass,getName,getKana,getTel);
			if(result == 0){
				return ERROR;
			}
		} catch (Exception e) {

		}
		session.clear();

		return SUCCESS;
	}
	/**
	 * sessionのセッターメソッド
	 * @param session セッション
	 */
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	/**
	 * セッション
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}
}

