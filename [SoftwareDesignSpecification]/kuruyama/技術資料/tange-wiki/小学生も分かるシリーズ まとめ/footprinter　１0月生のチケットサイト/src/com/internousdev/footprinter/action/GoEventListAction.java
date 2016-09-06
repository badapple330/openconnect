package com.internousdev.footprinter.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.footprinter.dao.AdminEventListDAO;
import com.internousdev.footprinter.dto.AdminEventListDTO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * イベントリストページへの遷移クラス
 * @author 冨内 峻太朗
 * @version 1.0
 * @since version 1.0
 */
public class GoEventListAction extends ActionSupport implements SessionAware{
	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 5179498542389099227L;
	/**
	 * イベントリスト
	 */
	private ArrayList<AdminEventListDTO> adminEventList = new ArrayList<AdminEventListDTO>();
	/**
	 * イベント名
	 */
	private String name;
	/**
	 * ページャーの値
	 */
	private int page;

	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * 実行メソッド
	 * @return SUCCESS ERROR 結果
	 */
	public String execute() {
		boolean result = false;
		if (!session.containsKey("adminId") ) {
			return ERROR;
		}
		String adminId = (String) session.get("adminId");
		if(adminId == null){
			return ERROR;
		}

		AdminEventListDAO dao = new AdminEventListDAO();
		result = dao.select(adminEventList, name, page);

		return SUCCESS;
	}
	/**
	 * AdminEventListDTO取得メソッド
	 * @return adminEventList　iteratorの中身
	 */
	public ArrayList<AdminEventListDTO> getAdminEventList(){
		return adminEventList;
	}
	/**
	 * イベント名取得メソッド
	 * @return name イベント名
	 */
	public String getName() {
		return name;
	}
	/**
	 * イベント名登録メソッド
	 * @param name イベント名
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * ページャー情報取得メソッド
	 * @return page ページャーの情報　
	 */
	public int getPage() {
		return page;
	}
	/**
	 * ページャー情報登録メソッド
	 * @param page ページャーの情報　
	 */
	public void setPage(int page) {
		this.page = page;
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
}