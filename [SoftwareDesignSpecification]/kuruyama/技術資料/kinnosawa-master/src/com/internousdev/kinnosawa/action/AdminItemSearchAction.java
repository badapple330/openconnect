/*
 * タイトル：商品データを検索する為の処理
 * 説明    ：DAOから受け取った商品のデータをリストに格納し admin_item.jspに送る。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.action;

import java.io.File;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kinnosawa.dao.AdminItemSearchDAO;
import com.internousdev.kinnosawa.dto.AdminItemDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 商品情報をデータベースから検索する為のクラス
 * @author K.Hagiwara
 * @version 1.0
 * @since 1.0
 */
public class AdminItemSearchAction extends ActionSupport implements SessionAware{

	/**
	 *シリアルID
	 */
	private static final long serialVersionUID = -714883242134098226L;

	/**
	 * 商品一覧情報を格納するリスト
	 */
	private ArrayList<AdminItemDTO> itemList = new ArrayList<AdminItemDTO>();

	/**
	 * 検索する商品名
	 */
	private String goodsName;

	/**
	 * セッション
	 */
	private Map<String, Object> session;

	private ArrayList<String> imageList = new ArrayList<String>();
	private ArrayList<String> setImageList = new ArrayList<String>();




	/**
	 * 検索結果を表示する為のメソッド
	 * @return result 検索結果の表示に成功したらSUCCESS、失敗したらERRORを返す
	 */
	public String execute() {

		if(goodsName == null){
			goodsName = "";
		}

		String realPath = ServletActionContext.getServletContext().getRealPath("/images/slide");
		String realSetPath = ServletActionContext.getServletContext().getRealPath("/images/itemDetails");

	    File cdirectory = new File(realPath);
	    File setCdirectory = new File(realSetPath);

	    String filelist[] = cdirectory.list();
	    String[] images = new String[filelist.length];
	    for (int i = 0 ; i < filelist.length ; i++){
	    	images[i] = "images/slide/" + filelist[i];
	    	imageList.add(i,images[i] );
	    }




	    String fileSetlist[] = setCdirectory.list();
	    String[] setImages = new String[fileSetlist.length];
	    for (int j = 0 ; j < fileSetlist.length ; j++){
	    	setImages[j] = "images/itemDetails/" + fileSetlist[j];
	    	setImageList.add(j,setImages[j]);
	    	 }

		String result = ERROR;


		if(session.containsKey("adminId")){
			AdminItemSearchDAO dao = new AdminItemSearchDAO();

			if(dao.AdminItemSearch(goodsName)){
				itemList = dao.getItemList();

				 if ( goodsName.length() == 0 ) {
					 addActionMessage (getText("admin_item.searchComment") +" "+ itemList.size()+ " " + getText("admin_item.searchMessage"));
			            return result;
				 }

				 if ( goodsName.length() > 0 ) {
					 addActionMessage(getText("admin_item.searchComment" )+ " " + itemList.size() + getText("admin_item.searchResult"));
			            return result;
				 }


				 result = SUCCESS;

				 if(session.containsKey("searchKey")){
					 session.remove("searchKey");
				 }

			}else{
				addActionMessage(getText("admin_item.searchError"));
			}

		}else{
		result="LogInError";
		}
		return result;
	}

	/**
	 * 商品情報リストを取得する為のメソッド
	 * @return itemList 商品情報リスト
	 */
	public ArrayList<AdminItemDTO> getItemList() {
		return itemList;
	}

	/**
	 * 商品情報リストを格納する為のメソッド
	 * @param itemList 商品情報リスト
	 */
	public void setItemList(ArrayList<AdminItemDTO> itemList) {
		this.itemList = itemList;
	}

	/**
	 * 検索する商品名を取得する為のメソッド
	 * @return goodsName 検索する商品名
	 */
	public String getGoodsName() {
		return goodsName;
	}

	/**
	 * 検索する商品名を格納する為のメソッド
	 * @param goodsName 検索する商品名
	 */
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	/**
	 * セッションを取得する為のメソッド
	 * @return session セッション
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッションを格納する為のメソッド
	 * @param session セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * imageList を取得する為のメソッド
	 * @return imageList imageList
	 */
	public ArrayList<String> getImageList() {
		return imageList;
	}

	/**
	 * imageList を格納する為のメソッド
	 * @param imageList imageList
	 */
	public void setImageList(ArrayList<String> imageList) {
		this.imageList = imageList;
	}

	/**
	 * setImageList を取得する為のメソッド
	 * @return setImageList setImageList
	 */
	public ArrayList<String> getSetImageList() {
		return setImageList;
	}

	/**
	 * setImageList を格納する為のメソッド
	 * @param setImageList setImageList
	 */
	public void setSetImageList(ArrayList<String> setImageList) {
		this.setImageList = setImageList;
	}
}