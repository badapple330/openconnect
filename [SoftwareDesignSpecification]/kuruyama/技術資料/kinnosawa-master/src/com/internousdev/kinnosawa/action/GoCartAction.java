/*
 * タイトル  : ユーザーのカート情報のデータを取得する為の処理
 * 説明    ：DAOから受けとったデータをリストに格納をして、cart.jspに送る。
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
import com.internousdev.kinnosawa.util.Register;
import com.opensymphony.xwork2.ActionSupport;

/**
 * カート情報を変更、追加、削除、表示する為のクラス
 * @author S.Kobata
 * @version 1.0
 * @since 1.0
 */
public class GoCartAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -5700993451340620883L;

	/**
	 * カート情報リスト
	 */
	private ArrayList<GoCartDTO> list = new ArrayList<GoCartDTO>();

	/**
	 * ログイン判定のセッション
	 */
	private Map<String, Object> session;

	/**
	 * 取得エラー
	 */
	private String message;

	/**
	 * 商品ID
	 */
	private String id;

	/**
	 * 購入予定数
	 */
	private String cnt;

	/**
	 * 小計
	 */
	private int allPrice;

	/**
	 * 消費税
	 */
	private int tax;

	/**
	 * 税込価格
	 */
	private int taxPrice;

	/**
	 * データベース内のカート一覧情報をリストに格納できたか判定する為のメソッド
	 * @return result データベースからカート一覧情報を格納できればSUCCESS、できなければmessage、ログインしていなければloginErrorを返す
	 */
	public String execute(){

		String result = message;

		if(session.containsKey("userId")){
			int userId = (int)(session.get("userId"));
			GoCartDAO dao = new GoCartDAO();

			if(dao.select(userId)){
				list = dao.getList();
				int[] price=new int[list.size()];
				int[] number= new int[list.size()];
				for(int i=1; i<=list.size(); i++){
					price[i-1]=list.get(i-1).getPrice();
					number[i-1]=list.get(i-1).getCount();
				}
				Register reg= new Register();
				reg.taxCalculation(price,number);
				tax=reg.getTax();
				allPrice=reg.getSubtotal();
				taxPrice=reg.getTotal();
				result = SUCCESS;
			}
		}else{
			result = "loginError";
		}
		return result;
	}

	/**
	 * ユーザの操作によってカート情報をデータベースに追加できたか判定する為のメソッド
	 * @return result データベースへカート情報を追加できればSUCCESS、できなければmessage、ログインしていなければloginErrorを返す
	 */
	public String insert(){

		String result = message;

		if(session.containsKey("userId")){
			int userId = (int)(session.get("userId"));

			try{
				int count = Integer.parseInt(cnt);
				int goodsId = Integer.parseInt(id);
				GoCartDAO dao = new GoCartDAO();
				int daoCount = 0;
				daoCount = dao.insert(userId, goodsId, count);

				if(daoCount>0){
					message =(getText("cart.cartIn"));
					result = SUCCESS;
				}else{
					message =(getText("cart.inFailed"));
				}

			}catch(NumberFormatException e){
				message = (getText("cart.failedNumber"));
			}

		}else{
			result = "loginError";
		}
		return result;
	}

	/**
	 * ユーザの操作によってデータベース上のカート情報を更新できたか判定する為のメソッド
	 * @return result データベース上のカート情報を更新できればSUCCESS、できなければmessage、ログインしていなければloginErrorを返す
	 */
	public String update(){

		String result = message;

		if(session.containsKey("userId")){
			int userId = (int)(session.get("userId"));

			try{
				int count = Integer.parseInt(cnt);
				int goodsId = Integer.parseInt(id);
				GoCartDAO dao = new GoCartDAO();
				int daoCount = 0;
				daoCount = dao.update(userId, goodsId, count);
				if(daoCount>0){
					message =(getText("cart.update"));
					result = SUCCESS;
				}else{
					message =(getText("cart.updateFailed"));
				}
				execute();
			}catch(NumberFormatException e){
				message = (getText("cart.failedNumber"));
			}
		}else{
			result = "loginError";
		}
		return result;
	}

	/**
	 * ユーザの操作によってデータベース上のカート情報を削除できたか判定する為のメソッド
	 * @return result データベース上のカート情報を削除できればSUCCESS、できなければmessage、ログインしていなければloginErrorを返す
	 */
	public String delete(){

		String result = message;

		if(session.containsKey("userId")){
			int userId = (int)(session.get("userId"));

			try{
				int goodsId = Integer.parseInt(id);
				GoCartDAO dao = new GoCartDAO();
				int daoCount = 0;
				daoCount = dao.delete(userId, goodsId);

				if(daoCount>0){
					message =(getText("cart.update"));
					result = SUCCESS;
				}else{
					message =(getText("cart.updateFailed"));
				}
				execute();
			}catch(Exception e){
				e.getStackTrace();
				message = (getText("cart.failedNumber"));
			}

		}else{
			result = "loginError";
		}
		return result;
	}

	/**
	 * カート情報リストを取得する為のメソッド
	 * @return list カート情報リスト
	 */
	public ArrayList<GoCartDTO> getList() {
		return list;
	}

	/**
	 * カート情報リストを格納する為のメソッド
	 * @param list カート情報リスト
	 */
	public void setList(ArrayList<GoCartDTO> list) {
		this.list = list;
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
	 * 取得エラーを取得する為のメソッド
	 * @return message 取得エラー
	 */
	public String getmessage() {
		return message;
	}

	/**
	 * 取得エラーを格納する為のメソッド
	 * @param message 取得エラー
	 */
	public void setmessage(String message) {
		this.message = message;
	}

	/**
	 * 商品IDを取得する為のメソッド
	 * @return id 商品ID
	 */
	public String getId() {
		return id;
	}

	/**
	 * 商品IDを格納する為のメソッド
	 * @param id 商品ID
	 */
	public void setId(String id) {
		this.id = id;
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
	 * 小計を取得する為のメソッド
	 * @return allPrice 小計
	 */
	public int getAllPrice() {
		return allPrice;
	}

	/**
	 * 小計を格納する為のメソッド
	 * @param allPrice 小計
	 */
	public void setAllPrice(int allPrice) {
		this.allPrice = allPrice;
	}

	/**
	 * 消費税を取得する為のメソッド
	 * @return tax 消費税
	 */
	public int getTax() {
		return tax;
	}

	/**
	 * 消費税を格納する為のメソッド
	 * @param tax 消費税
	 */
	public void setTax(int tax) {
		this.tax = tax;
	}

	/**
	 * 税込価格を取得する為のメソッド
	 * @return taxPrice 税込価格
	 */
	public int getTaxPrice() {
		return taxPrice;
	}

	/**
	 * 税込価格を格納する為のメソッド
	 * @param taxPrice 税込価格
	 */
	public void setTaxPrice(int taxPrice) {
		this.taxPrice = taxPrice;
	}

}