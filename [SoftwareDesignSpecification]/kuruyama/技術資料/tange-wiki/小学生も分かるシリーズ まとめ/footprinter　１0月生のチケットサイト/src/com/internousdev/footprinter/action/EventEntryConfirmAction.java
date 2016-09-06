package com.internousdev.footprinter.action;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.footprinter.util.CategoryList;
import com.opensymphony.xwork2.ActionSupport;

/**
 * イベント登録内容を格納するクラス
 * @author 北山 菜穂
 * @since 1.0
 * @version 1.0
 */
public class EventEntryConfirmAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -8998238637271900906L;

	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * イベントの名前
	 */
	private String eventName;

	/**
	 * イベント実施日
	 */
	private String eventDate;

	/**
	 * イベントの値段
	 */
	private float price;

	/**
	 * イベントのチケット枚数
	 */
	private int numOfTickets;

	/**
	 * イベントのカテゴリーID
	 */
	private int categoryId;

	/**
	 * イベントの詳細
	 */
	private String eventDetail;

	/**
	 * イベント画像ファイル
	 */
	private File eventImage;

	/**
	 * イベント画像ファイルの名前
	 */
	private String eventImageFileName;

	/**
	 * イベント登録画面で入力された内容を格納しているメソッド
	 * @return SUCCESS ERROR
	 */
	public String execute() {
		System.out.println(session.containsKey("adminId"));
		if (!session.containsKey("adminId") ) {
			return ERROR;
		}
		String adminId = (String) session.get("adminId");
		if(adminId == null){
			return ERROR;
		}
		
		session.put("eventName", eventName);
		session.put("eventDate", eventDate);
		session.put("price", price);
		int showPrice = (int)price;
		session.put("showPrice",showPrice);
		session.put("numOfTickets", numOfTickets);
		session.put("eventDetail", eventDetail);
		ServletContext context = ServletActionContext.getServletContext();
		String Path = context.getRealPath("/img");
		File fileToCreate = new File(Path,this.eventImageFileName);
		try {
			FileUtils.copyFile(this.getEventImage(), fileToCreate);
		} catch (IOException e) {
			e.printStackTrace();
		}
		session.put("imgPath", eventImageFileName);
		session.put("category",categoryId);
		CategoryList categoryList = new CategoryList();
		HashMap<Integer,String> category = categoryList.getCategory();
		String categoryName = category.get(categoryId);
		session.put("categoryName",categoryName);
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

	/**
	 * eventNameのゲッターメソッド
	 * @return eventName
	 */
	public String getEventName() {
		return eventName;
	}

	/**
	 * eventNameのセッターメソッド
	 * @param eventName イベント名
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	/**
	 * eventDateのゲッターメソッド
	 * @return eventDate
	 */
	public String getEventDate() {
		return eventDate;
	}

	/**
	 * eventDateのセッターメソッド
	 * @param eventDate イベント日
	 */
	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	/**
	 * priceのゲッターメソッド
	 * @return price
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * priceのセッターメソッド
	 * @param price イベント料
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * numOfTicketsのゲッターメソッド
	 * @return numOfTickets
	 */
	public int getNumOfTickets() {
		return numOfTickets;
	}

	/**
	 * numOfTicketsのセッターメソッド
	 * @param numOfTickets 申し込み限度
	 */
	public void setNumOfTickets(int numOfTickets) {
		this.numOfTickets = numOfTickets;
	}

	/**
	 * categoryIdのゲッターメソッド
	 * @return categoryId
	 */
	public int getCategoryId() {
		return categoryId;
	}

	/**
	 * categoryIdのセッターメソッド
	 * @param categoryId カテゴリID
	 */
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * eventDetailのゲッターメソッド
	 * @return eventDetail
	 */
	public String getEventDetail() {
		return eventDetail;
	}

	/**
	 * eventDetailのセッターメソッド
	 * @param eventDetail イベント詳細
	 */
	public void setEventDetail(String eventDetail) {
		this.eventDetail = eventDetail;
	}
	/**
	 * eventImageのゲッターメソッド
	 * @return eventImage
	 */
	public File getEventImage() {
		return eventImage;
	}

	/**
	 * eventImageのセッターメソッド
	 * @param eventImage イベント画像パス
	 */
	public void setEventImage(File eventImage) {
		this.eventImage = eventImage;
	}

	/**
	 * eventImageFileNameのゲッターメソッド
	 * @return eventImageFileName
	 */
	public String getEventImageFileName() {
		return eventImageFileName;
	}

	/**
	 * eventImageFileNameのセッターメソッド
	 * @param eventImageFileName イベント画像ファイル名
	 */
	public void setEventImageFileName(String eventImageFileName) {
		this.eventImageFileName = eventImageFileName;
	}
}
