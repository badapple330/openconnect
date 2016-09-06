/*
 * タイトル  ：カート内の商品データを更新する為の処理
 * 説明    ：cart.jspから受けとったデータを元にcartテーブルの情報を更新します。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *        
 */
package com.internousdev.kinnosawa.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kinnosawa.dao.GoCartDAO;
import com.internousdev.kinnosawa.dto.GoCartDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * カート情報を更新する為のクラス
 * @author S.Kobata
 * @version 1.0
 * @since 1.0
 */
public class CartUpdateAction extends ActionSupport implements SessionAware {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -8993958250738400282L;

	/**
	 * ログイン判定のセッション
	 */
	private Map<String, Object> session;

	/**
	 * メッセージ
	 */
	private String updateMessage;

	/**
	 * 商品IDの配列
	 */
	private String[] id;

	/**
	 * 購入予定数の配列
	 */
	private String[] cnt;

	/**
	 * カートに登録されている商品の情報を一括更新する為のメソッド
	 * @return result 情報を更新できればSUCCESS、できなければERRORを返す
	 */
	public String execute(){

		String result = ERROR;
		int userId=0;
		for(int i=0; i<cnt.length; i++){
			String stringId = id[i];
			String stringCnt = cnt[i];

			if(session.containsKey("userId")){
				userId = (int)(session.get("userId"));

				try{
					int count = Integer.parseInt(stringCnt);
					int goodsId = Integer.parseInt(stringId);
					GoCartDAO dao = new GoCartDAO();
					int daoCount = 0;
					daoCount = dao.update(userId, goodsId, count);

					if(daoCount>0){
						updateMessage =(getText("cart.update"));
						result = SUCCESS;
					}else{
						updateMessage =(getText("cart.updateFailed"));
					}

				}catch(NumberFormatException e){
					e.printStackTrace();
					updateMessage =(getText("cart.failedNumber"));
				}
			}else{
				result = "loginError";
			}

		 }
		if(session.containsKey("userId")){
			GoCartDAO dao= new GoCartDAO();
			ArrayList<GoCartDTO> list = new ArrayList<GoCartDTO>();
			dao.select(userId);
			list=dao.getList();
			if(list.size()==0){
				result = ERROR;
			}
		}
		 return result;
	 }

	/**
	 * ログイン判定のメソッドを取得する為のメソッド
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
	 * メッセージを取得する為のメソッド
	 * @return updateMessage メッセージ
	 */
	public String getUpdateMessage() {
		return updateMessage;
	}

	/**
	 * メッセージを格納する為のメソッド
	 * @param updateMessage メッセージ
	 */
	public void setUpdateMessage(String updateMessage) {
		this.updateMessage = updateMessage;
	}

	/**
	 * 商品IDの配列を取得する為のメソッド
	 * @return id 商品IDの配列
	 */
	public String[] getId() {
		return id;
	}

	/**
	 * 商品IDの配列を格納する為のメソッド
	 * @param id 商品IDの配列
	 */
	public void setId(String id) {
		this.id = id.split(", ", 0);
	}

	/**
	 * 購入予定数の配列を取得する為のメソッド
	 * @return cnt 購入予定数の配列
	 */
	public String[] getCnt() {
		return cnt;
	}

	/**
	 * 購入予定数の配列を格納する為のメソッド
	 * @param cnt 購入予定数の配列
	 */
	public void setCnt(String cnt) {
		this.cnt = cnt.split(", ",0);
	}

}