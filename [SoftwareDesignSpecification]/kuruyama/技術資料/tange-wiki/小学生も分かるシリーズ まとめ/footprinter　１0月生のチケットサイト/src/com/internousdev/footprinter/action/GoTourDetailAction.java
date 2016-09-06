package com.internousdev.footprinter.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.footprinter.dao.TourDetailDAO;
import com.internousdev.footprinter.dto.TourDetailDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 旅詳細画面へ遷移する際のクラス
 * @author 細谷 香菜
 * @version 1.0
 * @since 1.0
 */
public class GoTourDetailAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -3436522748436162437L;
	/**
	 * イベントID
	 */
	private int tourId;
	/**
	 * イベント名
	 */
	private String eventName;
	/**
	 * イベント日
	 */
	private String eventDate;
	/**
	 * チケット価格
	 */
	private String price;
	/**
	 * 申し込み残数
	 */
	private int remaining;
	/**
	 * 画像パス
	 */
	private String imgPath;
	/**
	 * ツアー詳細
	 */
	private String detail;
	/**
	 * コメント処理ができたか判断
	 */
	private boolean result;
	/**
	 * コメント
	 */
	private String comment;
	/**
	 * コメント取得用リスト
	 */
	private List<TourDetailDTO> list;
	/**
	 * セッション取得用
	 */
	private Map<String,Object> session;
	
	/**
	 * 旅詳細画面へ遷移するときの処理メソッド
	 * @return SUCCESS ERROR
	 */
	public String execute(){
		
		TourDetailDTO dto = new TourDetailDTO();
		TourDetailDAO dao = new TourDetailDAO();
		result = dao.select(dto,tourId);
		
		list = new ArrayList<TourDetailDTO>();
		list = dao.selectComment(tourId);
		if(!result){
			return ERROR;
		}
		
		eventName = dto.getEventName();
		eventDate = dto.getEventDate();
		price = dto.getPrice();
		remaining = dto.getRemaining();
		imgPath = dto.getImgPath();
		detail = dto.getDetail();
		session.put("tourId",tourId);
		return SUCCESS;
	}
	/**
	 * Listを取得するメソッド
	 * @return commentのlistを返す
	 */
	public List<TourDetailDTO> getList(){
		return list;
	}
	
	/**
	 * Listを設定するメソッド
	 * @param list comment and userName
	 */
	public void setList(List<TourDetailDTO> list){
		this.list = list;
	}
	
	/**
	 * tourIdを設定するメソッド
	 * @param tourId 各イベント固有のid
	 */
	public void setTourId(int tourId){
		this.tourId = tourId;
	}
	
	/**
	 * tourIdを取得するメソッド
	 * @return tourId 各イベント固有のid
	 */
	public int getTourId(){
		return tourId;
	}
	
	/**
	 * eventNameを設定するメソッド
	 * @param eventName イベント名
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	
	/**eventNameを取得するメソッド
	 * @return eventName 各イベント固有のid
	 */
	public String getEventName() {
		return eventName;
	}
	
	/**
	 * eventDateを設定するメソッド
	 * @param eventDate イベント開催日
	 */
	public void setEventDate(String eventDate){
		this.eventDate = eventDate;
	}
	
	/**
	 * eventDateを取得するメソッド
	 * @return eventDate イベント開催日
	 */
	public String getEventDate(){
		return eventDate;
	}
	
	/**
	 * priceを設定するメソッド
	 * @param price チケットの値段
	 */
	public void setPrice(String price){
		this.price = price;
	}
	
	/**
	 * Priceを取得するメソッド
	 * @return price チケットの値段
	 */
	public String getPrice(){
		return price;
	}
	
	/**
	 * remainingを設定するメソッド
	 * @param remaining 申し込み残数
	 */
	public void setRemaining(int remaining){
		this.remaining = remaining;
	}
	
	/**
	 * remainingを取得するメソッド
	 * @return remaining 申し込み残数
	 */
	public int getRemaining(){
		return remaining;
	}
	
	/**
	 * detailを設定するメソッド
	 * @param detail イベント詳細説明文
	 */
	public void setDetail(String detail){
		this.detail = detail;
	}
	
	/**
	 * detailを取得するメソッド
	 * @return detail イベント詳細説明文
	 */
	public String getDetail(){
		return detail;
	}
	
	/**
	 * imgPathを設定するメソッド
	 * @param imgPath 画像のパス
	 */
	public void setImgPath(String imgPath){
		this.imgPath = imgPath;
	}
	
	/**
	 * imgPathを取得するメソッド
	 * @return imgPath 画像のパス
	 */
	public String getImgPath(){
		return imgPath;
	}
	
	/**
	 * commentを取得するメソッド
	 * @return comment コメント
	 */
	public String getComment(){
		return comment;
	}
	
	/**
	 * commentを設定するメソッド
	 * @param comment コメント
	 */
	public void setComment(String comment){
		this.comment = comment;
	}

	/**
	 * sessionを設定するメソッド
	 * @param session セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	/**
	 * sessionを取得するメソッド
	 * @return session 
	 */
	public Map<String, Object> getSession() {
		return session;
	}


}

