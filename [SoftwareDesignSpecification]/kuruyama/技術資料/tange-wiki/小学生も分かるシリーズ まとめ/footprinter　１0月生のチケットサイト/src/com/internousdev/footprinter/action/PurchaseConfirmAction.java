package com.internousdev.footprinter.action;

import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.internousdev.footprinter.dao.PurchaseConfirmDAO;
import com.internousdev.footprinter.dto.PurchaseConfirmDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * PurchaseConfirmAction イベントチケット購入に関する表示に関するクラス
 * @author 丹下 陽平
 * @since  1.0
 * @version 1.0
 */
public class PurchaseConfirmAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -2900061635843960410L;

	/**
	 * セッション取得
	 */
	private Map<String, Object> session;

	/**
	 * 郵便番号
	 */
	private String postalCode;

	/**
	 * 住所
	 */
	private String address;

	/**
	 * クレジットカード番号
	 */
	private String creditNum;

	/**
	 * イベント名
	 */
	private String eventName;

	/**
	 * イベント金額
	 */
	private String price;

	/**
	 * イベント実施日
	 */
	private String eventDate;
	
	/**
	 * 購入が初めてか登録済みかの判断フラグ
	 */
	private boolean paymentFlag = true;

	/**
	 * 購入画面での支払い情報に関する処理メソッド
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
		PurchaseConfirmDTO dto = new PurchaseConfirmDTO();
		PurchaseConfirmDAO dao = new PurchaseConfirmDAO();
		boolean result = dao.selectToUser(dto, loginId);
		if (!result) {
			return ERROR;
		}
		String creditToken = dto.getCreditToken();
		if (creditToken == null) {
			paymentFlag = false;
		}
		result = dao.selectByEvent(dto, tourId);
		if (!result) {
			return ERROR;
		}
		
		postalCode = dto.getPostalCode();
		address = dto.getAddress();
		creditNum = dto.getCreditNum();
		eventName = dto.getEventName();
		price = dto.getPrice();
		eventDate = dto.getEventDate();
		
		session.put("tourId", tourId);
		session.put("amount", price);
		session.put("loginId", loginId);

		return SUCCESS;
	}

	/**
	 * sessionのゲッターメソッド
	 * @return session
	 */
	public Map<String,Object> getSession(){
		return session;
	}

	/**
	 * sessionのセッターメソッド
	 * @param session セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	/**
	 * postalCodeのゲッターメソッド
	 * @return postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * postalCodeのセッターメソッド
	 * @param postalCode 郵便番号
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * addressのゲッターメソッド
	 * @return address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * addressのセッターメソッド
	 * @param address 住所
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * creditNumのゲッターメソッド
	 * @return creditNum
	 */
	public String getCreditNum() {
		return creditNum;
	}

	/**
	 *  creditNumのセッターメソッド
	 * @param  creditNum クレジットナンバー
	 */
	public void setCreditNum(String creditNum) {
		this.creditNum = creditNum;
	}
	
	/**
	 * eventNameのゲッターメソッド
	 * @return eventName
	 */
	public String getEventName() {
		return eventName;
	}

	/**
	 * eventNameのセッターメソッド
	 * @param  eventName イベント名
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	/**
	 * priceのゲッターメソッド
	 * @return price
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * priceのセッターメソッド
	 * @param price イベント料
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/**
	 * eventDateのゲッターメソッド
	 * @return eventDate
	 */
	public String getEventDate() {
		return eventDate;
	}

	/**
	 *  eventDateのセッターメソッド
	 * @param eventDate イベント日
	 */
	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	/**
	 * paymentFlagのゲッターメソッド
	 * @return paymentFlag
	 */
	public boolean getPaymentFlag() {
		return paymentFlag;
	}
	
	/**
	 * paymentFlagのセッターメソッド
	 * @param paymentFlag 支払い情報登録済み
	 */
	public void setPaymentFlag(boolean paymentFlag) {
		this.paymentFlag = paymentFlag;
	}
}
