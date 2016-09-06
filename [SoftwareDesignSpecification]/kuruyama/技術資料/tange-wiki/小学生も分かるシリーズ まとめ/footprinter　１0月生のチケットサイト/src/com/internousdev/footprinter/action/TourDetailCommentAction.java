package com.internousdev.footprinter.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.footprinter.dao.TourDetailCommentDAO;
import com.internousdev.footprinter.dto.TourDetailDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ユーザレビューを処理するクラス
 * @author 細谷 香菜
 * @version 1.0
 * @since 1.0
 */
public class TourDetailCommentAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 8257910475774891777L;
	/**
	 * セッション取得
	 */
	private Map<String, Object> session;
	/**
	 * コメントリスト取得
	 */
	private ArrayList<TourDetailDTO> commentList;
	/**
	 * イベントID
	 */
	private int tourId;
	/**
	 * コメント
	 */
	private String comment;
	/**
	 * 旅詳細画面でユーザーのコメントレビューに関する処理メソッド
	 * @return SUCCESS ERROR
	 */
	public String execute(){
		boolean result;
		int loginId;
		String userName;
		
		loginId = (int) session.get("loginId");
		userName = (String) session.get("userName");
		tourId = (int) session.get("tourId");
		TourDetailDTO dto = new TourDetailDTO();
		TourDetailCommentDAO dao = new TourDetailCommentDAO();
		if(!"".equals(comment)){
			String outputData = comment;
		    outputData = outputData.replace("&", "&amp;");
		    outputData = outputData.replace("\"", "&quot;");
		    outputData = outputData.replace("<", "&lt;");
		    outputData = outputData.replace(">", "&gt;");
		    outputData = outputData.replace("'", "&#39;");
			result = dao.insert(loginId,tourId, userName,outputData);
			if (!result) {
				return ERROR;
			}
		}
		
		commentList = dao.selectComment(tourId);
		result = dao.selectToUser(dto, loginId);
		if(!result){
			return ERROR;
		}
		
		userName = dto.getUserName();
		return SUCCESS;
	}
	
	/**
	 * commentListを取得するメソッド
	 * @return commentList コメント全件を保持
	 */
	public ArrayList<TourDetailDTO> getCommentList() {
		return commentList;
	}
	
	/**
	 * sessionを設定するメソッド
	 * @param session セッション
	 */
	public void setSession(Map<String,Object>session){
		this.session = session;
	}
	
	/**
	 * tourIdを取得するメソッド
	 * @return tourId イベントid
	 */
	public int getTourId() {
		return tourId;
	}

	/**
	 * tourIdを設定するメソッド
	 * @param tourId イベントid
	 */
	public void setTourId(int tourId) {
		this.tourId = tourId;
	}

	/**
	 * commentを取得するメソッド
	 * @return comment コメント
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * commentを設定するメソッド
	 * @param comment コメント
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
}
 