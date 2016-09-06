package com.internousdev.footprinter.action;

import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.internousdev.footprinter.dao.EventEntryRegistrationDAO;
import com.internousdev.footprinter.dto.EventEntryRegistrationDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 登録されたイベントをDBへ登録処理クラス
 * @author 北山 菜穂
 * @since 1.0
 * @version 1.0
 */
public class EventEntryRegistrationAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 7187179247679368835L;

	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * DBへイベント登録アクションメソッド
	 * @return SUCCESS ERROR
	 */
	public String execute(){
		if (!session.containsKey("adminId") ) {
			return ERROR;
		}
		String tourId = (String) session.get("adminId");
		if(tourId == null){
			return ERROR;
		}

		EventEntryRegistrationDTO dto = new EventEntryRegistrationDTO();
		dto.setEventName((String) session.get("eventName"));
		dto.setEventDate((String) session.get("eventDate"));
		dto.setPrice((float) session.get("price"));
		dto.setNumOfTickets((int) session.get("numOfTickets"));
		dto.setEventDetail((String) session.get("eventDetail"));
		dto.setImgPath((String) session.get("imgPath"));
		dto.setCategory((int)session.get("category"));
		EventEntryRegistrationDAO dao = new EventEntryRegistrationDAO();
		int result = dao.insert(dto);
		if(result == 0){
			return ERROR;
		}
		return SUCCESS;
	}

	/**
	 * sessionのゲッターメソッド
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * sessionのセッターメソッド
	 * @param session セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
