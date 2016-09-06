package com.internousdev.footprinter.action;

import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.internousdev.footprinter.dao.PurchaseRegistrationDAO;
import com.opensymphony.xwork2.ActionSupport;


/**
 * DBに購入内容登録クラス
 * @author 丹下 陽平
 * @since 1.0
 * @version 1.0
 */
public class PurchaseRegistrationAction extends ActionSupport implements SessionAware {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 4718841496011055292L;

	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * 購入内容をDBに登録メソッド
	 * @return String
	 */
	public String execute() {
		if (!session.containsKey("tourId") ) {
			return ERROR;
		}
		int tourId = (int) session.get("tourId");
		if(tourId == 0){
			return ERROR;
		}
		
		if (!session.containsKey("loginId") ) {
			return "nologin";
		}
		int loginId = (int) session.get("loginId");
		if (loginId == 0) {
			return "nologin";
		}
		tourId = (int) session.get("tourId");
		loginId = (int) session.get("loginId");
		float amount = Float.valueOf((String) session.get("amount"));

		PurchaseRegistrationDAO dao = new PurchaseRegistrationDAO();
		if (!dao.checkRemaining(tourId)) {
			return ERROR;			
		}
		dao.decrease(tourId);
		int result = dao.insert(tourId, loginId, amount);
		if(result == 0){
			return ERROR;
		}
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
}