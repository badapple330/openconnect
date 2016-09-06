package com.internousdev.footprinter.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.footprinter.dao.UserListDAO;
import com.internousdev.footprinter.dto.UserListDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 管理者用、ユーザーリスト画面へ遷移するためのクラス
 * @author 小澤 竜樹
 */
public class GoUserListAction extends ActionSupport implements SessionAware {
	/**
	 * シリアル
	 */
	private static final long serialVersionUID = -3335974196635659908L;
	/**
	 * 配列
	 */
	private ArrayList<UserListDTO> userList = new ArrayList<UserListDTO>();
	/**
	 * ページ
	 */
	private int page;
	/**
	 * 名前
	 */
	private String name;
	/**
	 * セッション
	 */
	private Map<String, Object> session;


	/**
	 * 配列userListにuseList,page,nameを取得
	 * @return  SUCCESS ERROR
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

		UserListDAO dao = new UserListDAO();
		result = dao.select(userList, page, name);
		return SUCCESS;
	}

	/**
	 * 配列取得メソッド
	 * @return userList
	 */
	public ArrayList<UserListDTO> getUserList() {
		return userList;
	}

	/**
	 * 配列格納メソッド
	 * @param userList ユーザーリスト
	 */
	public void setUserList(ArrayList<UserListDTO> userList) {
		this.userList = userList;
	}

	/**
	 * ページ取得メソッド
	 * @return page
	 */
	public int getPage() {
		return page;
	}

	/**
	 * ページ格納メソッド
	 * @param page ページ
	 */
	public void setPage(int page) {
		this.page = page;
	}

	/**
	 * 名前取得メソッド
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 名前格納メソッド
	 * @param name ユーザー名
	 */
	public void setName(String name) {
		this.name = name;

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
