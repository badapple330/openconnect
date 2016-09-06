/*
 * タイトル：トップページに季節のオススメを表示する為のクラス
 * 説明    ：top_page.jspに季節のオススメを表示する.
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 *変更履歴：
 */
package com.internousdev.kinnosawa.action;

import java.util.ArrayList;

import com.internousdev.kinnosawa.dao.GoTopPageDAO;
import com.internousdev.kinnosawa.dto.GoTopPageDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * トップページに季節のオススメを表示する為のクラス
 * @author S.Sugimoto
 * @version 1.0
 * @since 1.0
 */
public class GoTopPageAction extends ActionSupport{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 8415057256160356484L;

	/**
	 * トップページに表示する季節のオススメを格納するリスト
	 */
	private ArrayList<GoTopPageDTO> itemList = new ArrayList<GoTopPageDTO>();

	/**
	 * トップページに商品を表示させる為のメソッド
	 *  @return result DBの商品情報を取得出来ていたらSUCCESS、出来ていなければERRORを返す
	 */
	public String execute(){

		String result = ERROR;
		GoTopPageDAO dao = new GoTopPageDAO();

		if(dao.select()){
			itemList = dao.getTopPage();
			result = SUCCESS;
		}
		return result;
	}

	/**
	 * トップページに表示する季節のオススメを格納するリストを取得する為のメソッド
	 * @return itemList トップページに表示する季節のオススメを格納するリスト
	 */
	public ArrayList<GoTopPageDTO> getItemList() {
		return itemList;
	}

	/**
	 * トップページに表示する季節のオススメを格納するリストを格納する為のメソッド
	 * @param itemList トップページに表示する季節のオススメを格納するリスト
	 */
	public void setItemList(ArrayList<GoTopPageDTO> itemList) {
		this.itemList = itemList;
	}

}