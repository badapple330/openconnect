package com.internousdev.footprinter.action;

import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.internousdev.footprinter.dao.PaymentRegistrationDAO;
import com.internousdev.util.CreditCard;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 未登録の購入者情報をDAOクラスに渡すアクションクラス
 * @author 田原 一樹
 * @since  1.0
 * @version 1.0
 */
public class PaymentRegistrationAction extends ActionSupport implements SessionAware {
	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -2224886763226456652L;
	/**
	 * セッション
	 */
	private Map<String, Object> session;
	/**
	 * エラーメッセージ
	 */
	private String errorMsg;
	
	/**
	 * 未登録の購入者情報をDBに登録処理メソッド
	 * @return SUCCESS ERROR
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
		int ret = 0;
		CreditCard credit = new CreditCard();
		String postalCode =(String)session.get("postalCode");
		String address = (String) session.get("address");
		String creditNum = (String)session.get("creditNum");
		String expiredDate = (String)session.get("expiredDate");
		String securityCode = (String)session.get("securityCode");
		
		boolean result = credit.insert(creditNum,expiredDate,securityCode,loginId);
		if(result == true){
			String getCreditNum4 = credit.getCardNumber();
			String getCredit_token = credit.getToken();
			
			PaymentRegistrationDAO dao = new PaymentRegistrationDAO();
			ret = dao.insert(address,getCredit_token,getCreditNum4,loginId,postalCode);
		}
		else{
			errorMsg = (getText("lang.login.validAlreadyCredit"));
		}
		if(ret == 0){
			return ERROR;
		}
		return SUCCESS;
	}
	/**
	 * セッション取得メソッド
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}
	/**
	 * セッション格納メソッド
	 */
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	/**
	 * エラーメッセージ取得メソッド
	 * @return errorMsg
	 */
	public String getErrorMsg() {
		return errorMsg;
	}
	/**
	 * エラーメッセージ格納メソッド
	 * @param errorMsg エラーメッセージ
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
}