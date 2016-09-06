/*
 * タイトル  : カテゴリーから商品一覧情報のデータを取得する為の処理
 * 説明    ：DAOから受けとったデータをリストに格納をして、item.jspに送る。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.action;

import java.util.ArrayList;

import com.internousdev.kinnosawa.dao.GoItemDAO;
import com.internousdev.kinnosawa.dto.GoItemDTO;
import com.opensymphony.xwork2.ActionSupport;


/**
 * 商品一覧画面に遷移する為のクラス
 * @author S.Kobata
 * @version 1.0
 * @since 1.0
 */
public class GoItemAction extends ActionSupport {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 8944739381937615656L;

	/**
	 * 商品のカテゴリー
	 */
	private String category;

	/**
	 * 商品一覧情報リスト
	 */
	private ArrayList<GoItemDTO> list = new ArrayList<GoItemDTO>();

	/**
	 * 一覧表示エラー
	 */
	private String error;

	/**
	 * データベース内の商品一覧情報をリストに格納できたか判定する為のメソッド
	 * @return result データベースから商品一覧情報を格納できればSUCCESS、できなければERRORを返す
	 */
	public String execute(){

		String result = ERROR;

		GoItemDAO dao = new GoItemDAO();

		if(dao.select(category)){
			list = dao.getList();
			result =SUCCESS;
		}else{
			error = (getText("item_details.noData"));
		}
		return result;
	}

	/**
	 * 商品のカテゴリーを取得する為のメソッド
	 * @return category 商品のカテゴリー
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * 商品のカテゴリーを格納する為のメソッド
	 * @param category 商品のカテゴリー
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * 商品一覧情報リストを取得する為のメソッド
	 * @return list 商品一覧情報リスト
	 */
	public ArrayList<GoItemDTO> getList() {
		return list;
	}

	/**
	 * 商品一覧情報リストを格納する為のメソッド
	 * @param list 商品一覧情報リスト
	 */
	public void setList(ArrayList<GoItemDTO> list) {
		this.list = list;
	}

	/**
	 * 一覧表示エラーを取得する為のメソッド
	 * @return error 一覧表示エラー
	 */
	public String getError() {
		return error;
	}

	/**
	 * 一覧表示エラーを格納する為のメソッド
	 * @param error 一覧表示エラー
	 */
	public void setError(String error) {
		this.error = error;
	}

}