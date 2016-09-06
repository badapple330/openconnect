/*
 * タイトル：商品データを追加する為の処理
 * 説明    ：admin_item.jspから受け取った商品データをDAOに引渡しデータベースに追加する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kinnosawa.dao.AdminItemInsertDAO;
import com.internousdev.kinnosawa.dto.AdminItemDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 商品情報をデータベースに追加する為のクラス
 * @author H.Hagiwara
 * @version 1.0
 * @since 1.0
 */
public class AdminItemInsertAction extends ActionSupport implements SessionAware {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 9157503520445610045L;

	/**
	 * 商品名
	 */
	private String name;

	/**
	 * 価格
	 */
	private float price;

	/**
	 * 画像パス
	 */
	private String imgPath;

	/**
	 * セット画像パス
	 */
	private String setImgPath;

	/**
	 * アレルギー食材
	 */
	private String allergie;

	/**
	 * カテゴリー
	 */
	private String category;

	/**
	 * イチオシ
	 */
	private boolean closeUp;

	/**
	 * 商品詳細
	 */
	private String detail;

	/**
	 * 商品情報を格納するリスト
	 */
	private ArrayList<AdminItemDTO> itemList = new ArrayList<AdminItemDTO>();

	/**
	 * エラーメッセージ
	 */
	private String message;

	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * 商品情報を追加する為のメソッド
	 * @return result 成功したらSUCCESS、失敗したらERRORを返す
	 */
	public String execute() throws SQLException{

		String result =ERROR;

		if(session.containsKey("adminId")){
			try{
				//追加判定
				AdminItemInsertDAO dao =new AdminItemInsertDAO();
				int count = 0;
				count = dao.insert(name, price, imgPath, setImgPath, allergie, category, closeUp, detail, closeUp);

				if(count > 0){
					message = (getText("admin_item.insertSuccess"));
				      result= SUCCESS;
			    }else{
			    	message = (getText("admin_item.insertError"));
			    }

			}catch(Exception e){
				message = (getText("admin_item.insertErrorMiss"));
			}
		}else{
			result="LogInError";
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
	 * 価格を取得する為のメソッド
	 * @return price 価格
	 */
	public float getPrice() {
	    return price;
	}

	/**
	 * 価格を格納する為のメソッド
	 * @param price 価格
	 */
	public void setPrice(float price) {
	    this.price = price;
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
	 * セット画像パスを取得する為のメソッド
	 * @return setImgPath セット画像パス
	 */
	public String getSetImgPath() {
	    return setImgPath;
	}

	/**
	 * セット画像パスを格納する為のメソッド
	 * @param setImgPath セット画像パス
	 */
	public void setSetImgPath(String setImgPath) {
	    this.setImgPath = setImgPath;
	}

	/**
	 * アレルギー食材を取得する為のメソッド
	 * @return allergie アレルギー食材
	 */
	public String getAllergie() {
	    return allergie;
	}

	/**
	 * アレルギー食材を格納する為のメソッド
	 * @param allergie アレルギー食材
	 */
	public void setAllergie(String allergie) {
	    this.allergie = allergie;
	}

	/**
	 * カテゴリーを取得する為のメソッド
	 * @return category カテゴリー
	 */
	public String getCategory() {
	    return category;
	}

	/**
	 * カテゴリーを格納する為のメソッド
	 * @param category カテゴリー
	 */
	public void setCategory(String category) {
	    this.category = category;
	}

	/**
	 * イチオシを取得する為のメソッド
	 * @return closeUp イチオシ
	 */
	public boolean getCloseUp() {
	    return closeUp;
	}

	/**
	 * イチオシを格納する為のメソッド
	 * @param closeUp イチオシ
	 */
	public void setCloseUp(boolean closeUp) {
	    this.closeUp = closeUp;
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
	 * エラーメッセージ を取得する為のメソッド
	 * @return message エラーメッセージ
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * エラーメッセージ を格納する為のメソッド
	 * @param message エラーメッセージ
	 */
	public void setMessage(String message) {
		this.message = message;
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

}