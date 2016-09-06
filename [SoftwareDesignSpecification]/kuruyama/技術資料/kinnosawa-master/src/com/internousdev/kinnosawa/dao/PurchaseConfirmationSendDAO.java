/*
 * タイトル：購入確認画面にユーザーの注文情報を取得する為の処理
 * 説明    ：データベースの会員情報、カート情報、商品情報のテーブルから、注文情報を取得する
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 */
	package com.internousdev.kinnosawa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.kinnosawa.dto.PurchaseConfirmationDTO;
import com.internousdev.kinnosawa.util.DBConnector;

/**
 * 会員情報、カート履歴、商品情報を検索して、注文情報を取得する為のクラス
 * @author K.Kamijo
 * @version 1.0
 * @since 1.0
 */
public class PurchaseConfirmationSendDAO {

	/**
	 * 消費税
	 */
	private final double TAX = 0.08;

	/**
	 * 金額
	 */
	private int subTotal;

	/**
	 * 数量
	 */
	private int subNumber;

	/**
	 * 計算後の消費税
	 */
	private int tax;

	/**
	 * 送料
	 */
	private int sendPrice;

	/**
	 * 合計金額
	 */
	private int totalPrice;

	/**
	 * 会員情報、カート履歴、商品情報を検索して、注文情報を取得する為のメソッド
	 * @param userId ユーザーID
	 * @param address 住所
	 * @param priceList 注文情報のリスト
	 * @return 注文情報を取得できた場合はsuccess、できなかった場合はerrorを返す
	 */
	public String search(int userId, String address, ArrayList<PurchaseConfirmationDTO> priceList){

		String result = "error";
		Connection con = null;

		try{
			con = DBConnector.getConnection();
			String sql = "select goods.name, cart.number, goods.price * cart.number "
					+ "from user inner join cart inner join goods "
					+ "where user.id = ? and user.id = cart.user_id and goods.id = cart.goods_id;";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,userId);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				PurchaseConfirmationDTO dto = new PurchaseConfirmationDTO();
				dto.setGoodsName(rs.getString(1));
				dto.setGoodsNumber(rs.getInt(2));
				dto.setGoodsSubTotal(rs.getInt(3));
				subTotal += dto.getGoodsSubTotal();
				subNumber += dto.getGoodsNumber();
				priceList.add(dto);
			}
			String subAddress = address.substring(0, 2);
			sql = "select price from send_price where prefectures = ?;";
			ps = con.prepareStatement(sql);
			ps.setString(1, subAddress);
			rs = ps.executeQuery();
			if(rs.next()){
				sendPrice = rs.getInt(1);
			}else{
				return "住所は都道府県から正確に入力して下さい";
			}
			tax = (int) (subTotal * TAX);
			totalPrice = subTotal + tax + sendPrice;
			result = "success";
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * 金額を取得する為のメソッド
	 * @return subTotal 金額
	 */
	public int getSubTotal() {
		return subTotal;
	}

	/**
	 * 金額を格納する為のメソッド
	 * @param subTotal 金額
	 */
	public void setSubTotal(int subTotal) {
		this.subTotal = subTotal;
	}

	/**
	 * 数量を取得する為のメソッド
	 * @return subNumber 数量
	 */
	public int getSubNumber() {
		return subNumber;
	}

	/**
	 * 数量を格納する為のメソッド
	 * @param subNumber 数量
	 */
	public void setSubNumber(int subNumber) {
		this.subNumber = subNumber;
	}

	/**
	 * 計算後の消費税を取得する為のメソッド
	 * @return tax 計算後の消費税
	 */
	public int getTax() {
		return tax;
	}

	/**
	 * 計算後の消費税を格納する為のメソッド
	 * @param tax 計算後の消費税
	 */
	public void setTax(int tax) {
		this.tax = tax;
	}

	/**
	 * 送料を取得する為のメソッド
	 * @return sendPrice 送料
	 */
	public int getSendPrice() {
		return sendPrice;
	}

	/**
	 * 送料を格納する為のメソッド
	 * @param sendPrice 送料
	 */
	public void setSendPrice(int sendPrice) {
		this.sendPrice = sendPrice;
	}

	/**
	 * 合計金額を取得する為のメソッド
	 * @return totalPrice 合計金額
	 */
	public int getTotalPrice() {
		return totalPrice;
	}

	/**
	 * 合計金額を格納する為のメソッド
	 * @param totalPrice 合計金額
	 */
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	/**
	 * 消費税を取得する為のメソッド
	 * @return TAX 消費税
	 */
	public double getTAX() {
		return TAX;
	}
}
