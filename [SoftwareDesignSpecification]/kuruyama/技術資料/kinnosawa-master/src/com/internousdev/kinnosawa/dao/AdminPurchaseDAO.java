/*
 * タイトル：ユーザーから指定された購入情報データを取得する為の処理
 * 説明    ：ユーザーから指定された購入者名を元に購入情報を取得する
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

import com.internousdev.kinnosawa.dto.AdminPurchaseDTO;
import com.internousdev.kinnosawa.util.DBConnector;

/**
 * 購入情報一覧を取得する為のクラス
 * @author K.Hagiwara
 * @version 1.0
 * @since 1.0
 */
public class AdminPurchaseDAO {

	/**
	 * 購入情報一覧を格納するリスト
	 */
		private ArrayList<AdminPurchaseDTO> purchaseList = new ArrayList<AdminPurchaseDTO>();


		/**
		 * 入力されたユーザー名を元に購入情報を検索する為のメソッド
		 * @param purchaseName 入力されたユーザー名
		 * @return 検索結果を格納できたら true できなかったら false
		 */
		public boolean AdminPurchaseSearch(String purchaseName) {
			boolean result = false;
			Connection conn = DBConnector.getConnection();
			String sql = "SELECT user.id,send_address.id,order_number,user.name,order_history.number,order_history.created_at FROM user INNER JOIN "
					+ "(send_address INNER JOIN "
					+ "(goods INNER JOIN order_history ON goods.id = order_history.goods_id)"
					+ "ON send_address.user_id = order_history.user_id)"
					+ "ON user.id = send_address.user_id WHERE user.name LIKE '%" + purchaseName + "%'"
					+ "GROUP BY order_number "
					+ "ORDER BY order_number DESC ";
			try{
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            while(rs.next()){
	    			AdminPurchaseDTO dto = new AdminPurchaseDTO();
	    			dto.setUserId(rs.getInt("user.id"));
	    			dto.setOrderNumber(rs.getInt("order_number"));
	    			dto.setAddressId(rs.getInt("send_address.id"));
	    			dto.setUserName(rs.getString("user.name"));
	    			String buyDate = new SimpleDateFormat("yyyy'/'MM'/'dd'/'HH':'mm").format(rs.getTimestamp("order_history.created_at"));
	              	dto.setBuyDate(buyDate);
	            	purchaseList.add(dto);
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
		 * 購入情報一覧を取得する為のメソッド
		 * @return purchaseList 購入情報一覧
		 */
		public ArrayList<AdminPurchaseDTO> getPurchaseList() {
			return purchaseList;
		}


		/**
		 * 購入情報一覧を格納する為のメソッド
		 * @param purchaseList 購入情報一覧
		 */
		public void setPurchaseList(ArrayList<AdminPurchaseDTO> purchaseList) {
			this.purchaseList = purchaseList;
		}
}
