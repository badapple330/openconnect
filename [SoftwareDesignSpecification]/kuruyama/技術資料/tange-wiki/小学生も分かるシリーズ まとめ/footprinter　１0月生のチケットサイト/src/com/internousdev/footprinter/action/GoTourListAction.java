package com.internousdev.footprinter.action;

import java.util.ArrayList;
import java.util.Map;

import javax.websocket.Session;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.footprinter.dao.TourListDAO;
import com.internousdev.footprinter.dto.TourListDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ツアー一覧画面へ遷移するためのクラス
 * @author 小澤 竜樹
 * @since 1.0
 */
public class GoTourListAction extends ActionSupport implements SessionAware{
	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -2079451776229453010L;
	/**
	 * 配列tourList
	 */
	private ArrayList<TourListDTO> tourList = new ArrayList<TourListDTO>();
	/**
	 * 大陸ごとのID
	 */
	private int categoryId = 0;
	/**
	 * 旅ごとのID
	 */
	private int id = 0;
	/**
	 * ページ
	 */
	private int page;
	/**
	 * 言語 国際化
	 */
	private String lang;
	/**
	 * 日時
	 */
	private String eventDate;
	
	private Map<String, Object>session;

	/**
	 * LANGにgetTextを格納 カテゴリーID、ページ、言語を取得
	 * @return SUCCESS ERROR
	 */
	public String execute() {
		boolean result = false;
		TourListDAO dao = new TourListDAO();
		lang = getText("lang.tour-list.language");
		session.put("categoryId", categoryId);
		result = dao.select(tourList, categoryId, page, lang);

		if (!result) {
			return ERROR;
		}
		
		return SUCCESS;
	}

	/**
	 * tourList配列の作成
	 * @return tourList
	 */
	public ArrayList<TourListDTO> getTourList() {
		return tourList;
	}

	/**
	 * tourListの格納メソッド
	 * @param tourList ツアーリスト
	 */
	public void setTourList(ArrayList<TourListDTO> tourList) {
		this.tourList = tourList;
	}

	/**
	 * 大陸ごとのIDの取得メソッド
	 * @return categoryId
	 */
	public int getCategoryId() {
		return categoryId;
	}

	/**
	 * 大陸ごとのIDの格納メソッド
	 * @param categoryid カテゴリId
	 */
	public void setCategoryId(int categoryid) {
		this.categoryId = categoryid;
	}

	/**
	 * 旅ごとのIDの取得メソッド
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * 旅ごとのIDの格納メソッド
	 * @param id ツアーId
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * ページの取得メソッド
	 * @return page
	 */
	public int getPage() {
		return page;
	}

	/**
	 * ページの格納メソッド
	 * @param page ページ
	 */
	public void setPage(int page) {
		this.page = page;
	}

	/**
	 * 日時の取得メソッド
	 * @return eventDate
	 */
	public String getEventDate() {
		return eventDate;
	}

	/**
	 * 日時の格納メソッド
	 * @param eventdate イベント日
	 */
	public void setEventDate(String eventdate) {
		this.eventDate = eventdate;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
		
	}

}
