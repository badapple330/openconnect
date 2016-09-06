/*
 * タイトル  ：商品詳細情報のデータを取得する為の処理
 * 説明    ：DAOから受けとったデータをリストに格納をして、item_details.jspに送る。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kinnosawa.dao.GoCartDAO;
import com.internousdev.kinnosawa.dao.GoItemDetailsDAO;
import com.internousdev.kinnosawa.dto.GoItemDetailsDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 商品詳細画面に遷移する為のクラス
 * @author S.Kobata
 * @version 1.0
 * @since 1.0
 */
public class GoItemDetailsAction extends ActionSupport implements SessionAware {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -2389180070966642992L;

	/**
	 * 商品名
	 */
	private String name;

	/**
	 * 商品ID
	 */
	private int id;

	/**
	 * 値段
	 */
	private int price;

	/**
	 * 商品詳細
	 */
	private String detail;

	/**
	 * 画像パス
	 */
	private String imgPath;

	/**
	 * 箱入り画像パス
	 */
	private String setImgPath;

	/**
	 * アレルギー項目
	 */
	private String allergie;

	/**
	 * ユーザーへのメッセージ
	 */
	private String message;

	/**
	 * 購入予定数が最大になったときのメッセージ
	 */
	private String maxMessage;

	/**
	 * ログイン判定のセッション
	 */
	private Map<String, Object> session;

	/**
	 * 購入予定商品のID
	 */
	private String itemId;

	/**
	 * 購入予定数
	 */
	private String cnt;

	/**
	 * データベース内の商品詳細情報を取得できたか判定する為のメソッド
	 * @return result データベースから商品詳細情報を格納できればSUCCESS、できなければERRORを返す
	 */
	public String execute(){

		String result = ERROR;
		GoItemDetailsDAO dao = new GoItemDetailsDAO();
		GoItemDetailsDTO dto = new GoItemDetailsDTO();

		if(dao.select(name ,dto)){
			id = dto.getId();
			name = dto.getName();
			price = dto.getPrice();
			detail = dto.getDetail();
			imgPath = dto.getImgPath();
			setImgPath = dto.getSetImgPath();
			allergie = dto.getAllergie();
			result = SUCCESS;
		}else{
			message = (getText("item_details.noData"));
		}
		return result;
	}

	/**
	 * データベースのカートテーブルに商品を登録できたか判定する為のメソッド
	 * @return result カートのテーブルに商品が登録できたらSUCCESSできなければERRORを返す
	 */
	public String intoCartReturn(){

		String result = ERROR;

		if(session.containsKey("userId")){
			int userId = (int)(session.get("userId"));

			try{
				int count = Integer.parseInt(cnt);
				int goodsId = Integer.parseInt(itemId);
				if(count>0){
					GoCartDAO dao = new GoCartDAO();
					int daoCount = 0;
					daoCount = dao.insert(userId, goodsId, count);

					if(daoCount==1){
						message = (getText("cart.cartIn"));
						result = SUCCESS;
					}else if (daoCount==2) {
						maxMessage =(getText("cart.itemMax"));
						result = SUCCESS;
					}else{
						message = (getText("cart.inFailed"));
					}

				}else{
					result=SUCCESS;
				}

			}catch(NumberFormatException e){
				message =(getText("cart.failedNumber"));
			}

			GoItemDetailsDAO dao = new GoItemDetailsDAO();
			GoItemDetailsDTO dto = new GoItemDetailsDTO();
			if(dao.select(name ,dto)){
				id = dto.getId();
				name = dto.getName();
				price = dto.getPrice();
				detail = dto.getDetail();
				imgPath = dto.getImgPath();
				setImgPath = dto.getSetImgPath();
				allergie = dto.getAllergie();
			}

		}else{
			result = "loginError";
		}
		return result;
	}

	/**
	 * 商品名を取得する為のメソッド
	 * @return name 商品名
	 */
	public String getName() {
		return name;
	}

	/**
	 * 商品名を格納する為のメソッド
	 * @param name 商品名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 一覧表示エラーを取得する為のメソッド
	 * @return message 一覧表示エラー
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * 一覧表示エラーを格納する為のメソッド
	 * @param message 一覧表示エラー
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * 商品IDを取得する為のメソッド
	 * @return id 商品ID
	 */
	public int getId() {
		return id;
	}

	/**
	 * 商品IDを格納する為のメソッド
	 * @param id 商品ID
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 値段を取得する為のメソッド
	 * @return price 値段
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * 値段を格納する為のメソッド
	 * @param price 値段
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * 商品詳細を取得する為のメソッド
	 * @return detail 商品詳細
	 */
	public String getDetail() {
		return detail;
	}

	/**
	 * 商品詳細を格納する為のメソッド
	 * @param detail 商品詳細
	 */
	public void setDetail(String detail) {
		this.detail = detail;
	}

	/**
	 * 画像パスを取得する為のメソッド
	 * @return imgPath 画像パス
	 */
	public String getImgPath() {
		return imgPath;
	}

	/**
	 * 画像パスを格納する為のメソッド
	 * @param imgPath 画像パス
	 */
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	/**
	 * 箱入り画像パスを取得する為のメソッド
	 * @return setImgPath 箱入り画像パス
	 */
	public String getSetImgPath() {
		return setImgPath;
	}

	/**
	 * 箱入り画像パスを格納する為のメソッド
	 * @param setImgPath 箱入り画像パス
	 */
	public void setSetImgPath(String setImgPath) {
		this.setImgPath = setImgPath;
	}

	/**
	 * アレルギー項目を取得する為のメソッド
	 * @return allergie アレルギー項目
	 */
	public String getAllergie() {
		return allergie;
	}

	/**
	 * アレルギー項目を格納する為のメソッド
	 * @param allergie アレルギー項目
	 */
	public void setAllergie(String allergie) {
		this.allergie = allergie;
	}

	/**
	 * ログイン判定のセッションを取得する為のメソッド
	 * @return session ログイン判定のセッション
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * ログイン判定のセッションを格納する為のメソッド
	 * @param session ログイン判定のセッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * 購入予定商品のIDを取得する為のメソッド
	 * @return itemId 購入予定商品ID
	 */
	public String getItemId() {
		return itemId;
	}

	/**
	 * 購入予定商品IDを格納する為のメソッド
	 * @param itemId 購入予定商品のID
	 */
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	/**
	 * 購入予定数を取得する為のメソッド
	 * @return cnt 購入予定数
	 */
	public String getCnt() {
		return cnt;
	}

	/**
	 * 購入予定数を格納する為のメソッド
	 * @param cnt 購入予定数
	 */
	public void setCnt(String cnt) {
		this.cnt = cnt;
	}

	/**
	 * 購入予定数が最大になったときのメッセージを取得する為のメソッド
	 * @return maxMessage 購入予定数が最大になったときのメッセージ
	 */
	public String getMaxMessage() {
		return maxMessage;
	}

	/**
	 * 購入予定数が最大になったときのメッセージを格納する為のメソッド
	 * @param maxMessage 購入予定数が最大になったときのメッセージ
	 */
	public void setMaxMessage(String maxMessage) {
		this.maxMessage = maxMessage;
	}

}