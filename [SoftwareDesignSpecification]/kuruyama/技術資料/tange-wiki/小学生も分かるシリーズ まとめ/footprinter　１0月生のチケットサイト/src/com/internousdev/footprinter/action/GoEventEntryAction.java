package com.internousdev.footprinter.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.footprinter.util.CategoryList;
import com.opensymphony.xwork2.ActionSupport;

/**
 * イベント登録画面への遷移クラス
 * @author 北山 菜穂
 * @since 1.0
 * @version 1.0
 */
public class GoEventEntryAction extends ActionSupport implements SessionAware{
	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -5783098456354814175L;

	/**
	 * カテゴリーの中身をMapに格納
	 */
	private HashMap<Integer,String> category = new HashMap<Integer,String>();
	
	/**
	 * セッション取得
	 */
	private Map<String, Object> session;

	/**
	 * イベント登録画面で表示のカテゴリーの中身をMapに格納しているメソッド
	 * @return SUCCESS ERROR
	 */
	public String execute(){
		if (!session.containsKey("adminId") ) {
			return ERROR;
		}
		String adminId = (String) session.get("adminId");
		if(adminId == null){
			return ERROR;
		}
		CategoryList categoryList = new CategoryList();
		category = categoryList.getCategory();
		return SUCCESS;
	}

	/**
	 * categoryのゲッターメソッド
	 * @return category
	 */
	public HashMap<Integer,String> getCategory(){
		return category;
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
