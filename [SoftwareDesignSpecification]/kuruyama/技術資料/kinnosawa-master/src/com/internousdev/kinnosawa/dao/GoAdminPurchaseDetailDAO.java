/*
 * タイトル：ユーザーから指定された注文番号の詳細データを取得する為の処理
 * 説明    ：ユーザーから指定された注文番号の詳細データを取得する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.internousdev.kinnosawa.dto.GoAdminPurchaseDetailDTO;
import com.internousdev.kinnosawa.util.DBConnector;

/**
 * 購入詳細情報をデータベースから取得する為のクラス
 * @author K.Hagiwara
 * @version 1.0
 * @since 1.0
 */
public class GoAdminPurchaseDetailDAO {

	/**
	 * 購入商品一覧を格納するリスト
	 */
	private ArrayList<GoAdminPurchaseDetailDTO> goodsList = new ArrayList<GoAdminPurchaseDetailDTO>();

	/**
	 * 受け渡された注文番号を元に購入詳細情報をデータベースから格納する為のメソッド
	 * @param orderNumber 注文番号
	 * @return 格納できたらtrue、できなかったらfalseを返す
	 */
	public boolean select(int orderNumber) {
		boolean result = false;

		Connection conn = DBConnector.getConnection();
		String sql =  "SELECT goods_id,goods.name,user.name,send_address.address,user.tel_num,user.email,order_history.created_at,SUM(order_history.number)FROM user INNER JOIN (send_address INNER JOIN (goods INNER JOIN order_history ON goods.id = order_history.goods_id)ON send_address.user_id = order_history.user_id)ON user.id = send_address.user_id WHERE order_history.order_number ="+ orderNumber +" GROUP BY goods.id";
		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				GoAdminPurchaseDetailDTO dto = new GoAdminPurchaseDetailDTO();
				dto.setUserName(rs.getString("user.name"));
				dto.setAddress(rs.getString("send_address.address"));
				dto.setTelNumber(rs.getString("user.tel_num"));
				dto.setMail(rs.getString("user.email"));
				String buyDate = new SimpleDateFormat("yyyy'/'MM'/'dd'/'HH':'mm").format(rs.getTimestamp("order_history.created_at"));
              	dto.setBuyDate(buyDate);
              	dto.setGoodsName(rs.getString("goods.name"));
				dto.setBuyNumber(rs.getInt("SUM(order_history.number)"));
				goodsList.add(dto);
              	result = true;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * 購入商品一覧 を取得する為のメソッド
	 * @return goodsList 購入商品一覧
	 */
	public ArrayList<GoAdminPurchaseDetailDTO> getGoodsList() {
		return goodsList;
	}

	/**
	 * 購入商品一覧 を格納する為のメソッド
	 * @param goodsList 購入商品一覧
	 */
	public void setGoodsList(ArrayList<GoAdminPurchaseDetailDTO> goodsList) {
		this.goodsList = goodsList;
	}
}
