/*
 * タイトル：ユーザーの購入履歴を取得する為の処理

 * 説明    ：データベースの会員情報、購入履歴、商品情報、お届け先情報のテーブルから、購入履歴を取得する
 *
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
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.internousdev.kinnosawa.dto.MyPageGoodsDTO;
import com.internousdev.kinnosawa.dto.MyPageOrderHistoryDTO;
import com.internousdev.kinnosawa.dto.MyPageSendAddressDTO;
import com.internousdev.kinnosawa.dto.MyPageUserDTO;
import com.internousdev.kinnosawa.util.DBConnector;

	    /**
	     * 会員情報、購入履歴、商品情報、お届け先情報を検索して購入履歴を取得する為のクラス
	     * @author K.Kamijo
	     * @version 1.0
         * @since 1.0
	     */
	 public class MyPageDAO {

	 	/**
	 	 * 会員情報
	 	 */
		private MyPageUserDTO personal = new MyPageUserDTO();

	 	/**
	 	 * 購入履歴情報
	 	 */
	 	private ArrayList<MyPageOrderHistoryDTO> historyList = new ArrayList<MyPageOrderHistoryDTO>();

	 	/**
	 	 * 商品情報
	 	 */
	 	private MyPageGoodsDTO goods = new MyPageGoodsDTO();

	 	/**
	 	 * お届け先情報
	 	 */
	 	private MyPageSendAddressDTO sendAddress = new MyPageSendAddressDTO();

	 	/**
		 * 購入履歴情報を取得する為のメソッド
		 * @param userId ユーザーID
		 * @return result 処理が成功すればtrue、失敗すればfalseを返す
		 */
	 	public boolean select(int userId){

	 		boolean result = false;
	 		Connection con = DBConnector.getConnection();

	 		try {
	 			String sql = "SELECT order_history.order_number,goods.name,order_history.number,order_history.created_at,send_address.address,"
	 			+ "order_history.goods_id,goods.price FROM order_history INNER JOIN user ON order_history.user_id=user.id "
	 			+ "INNER JOIN goods ON order_history.goods_id=goods.id "
	 			+ "INNER JOIN send_address ON order_history.send_id=send_address.id "
	 			+ "where order_history.user_id=? ORDER BY order_history.created_at DESC";
	 			PreparedStatement ps;
	 			ps = con.prepareStatement(sql);
	 			ps.setInt(1,userId);
	 			ResultSet rs = ps.executeQuery();
	 			while (rs.next()) {
	 				MyPageOrderHistoryDTO dto = new MyPageOrderHistoryDTO();
	 				dto.setOrderNumber(rs.getInt("order_number"));
	 				dto.setName(rs.getString("name"));
	 				dto.setNumber(rs.getInt("number"));
	 				Timestamp time=rs.getTimestamp("created_at");
	 				String day=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(time);
	 				dto.setCreatedAt(day);
	 				dto.setAddress(rs.getString("address"));
	 				dto.setGoodsId(rs.getInt("goods_id"));
	 				dto.setPrice((int)rs.getFloat("price"));
	 				 historyList.add(dto);
	 				result = true;
	 			}
	 			}
	 			catch (Exception e){
	 				e.printStackTrace();
	 				}
	 				finally{
	 					try {
	 						con.close();
	 					}
	 					catch (SQLException e) {
	 						e.printStackTrace();
	 					}
	 				}
	 		return result;
	 	}

		/**
		 * 会員情報を取得する為のメソッド
		 * @return personal 会員情報
		 */
		public MyPageUserDTO getPersonal() {
			return personal;
		}

		/**
		 * 会員情報を格納する為のメソッド
		 * @param personal 会員情報
		 */
		public void setPersonal(MyPageUserDTO personal) {
			this.personal = personal;
		}

		/**
		 * 購入履歴を取得する為のメソッド
		 * @return historyList 購入履歴
		 */
		public ArrayList<MyPageOrderHistoryDTO> getHistoryList() {
			return historyList;
		}

		/**
		 * 購入履歴を格納する為のメソッド
		 * @param historyList 購入履歴
		 */
		public void setHistoryList(ArrayList<MyPageOrderHistoryDTO> historyList) {
			this.historyList = historyList;
		}

		/**
		 * 商品情報を取得する為のメソッド
		 * @return goods 商品情報
		 */
		public MyPageGoodsDTO getGoods() {
			return goods;
		}

		/**
		 * 商品情報を格納する為のメソッド
		 * @param goods 商品情報
		 */
		public void setGoods(MyPageGoodsDTO goods) {
			this.goods = goods;
		}

		/**
		 * お届け先情報を取得する為のメソッド
		 * @return sendAddress お届け先情報
		 */
		public MyPageSendAddressDTO getSendAddress() {
			return sendAddress;
		}

		/**
		 * お届け先情報を格納する為のメソッド
		 * @param sendAddress お届け先情報
		 */
		public void setSendAddress(MyPageSendAddressDTO sendAddress) {
			this.sendAddress = sendAddress;
		}
}
