/*
 * タイトル：ユーザーのIDからそのユーザーのカート情報を操作する処理
 * 説明    ：ユーザーのIDからそのユーザーの情報を操作する
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
import java.util.ArrayList;

import com.internousdev.kinnosawa.dto.GoCartDTO;
import com.internousdev.kinnosawa.util.DBConnector;

/**
 * ユーザーの操作によってカートの中に商品を追加、削除、変更、一覧表示する為のクラス
 * @author S.Kobata
 * @version 1.0
 * @since 1.0
 */
public class GoCartDAO {

	/**
	 * カート情報リスト
	 */
	private ArrayList<GoCartDTO> list = new ArrayList<GoCartDTO>();

	/**
	 * ユーザーのカート情報を取得する為のメソッド
	 * @param userId ユーザーID
	 * @return ユーザーのカート情報を取得できればtrue、できなければfalesを返す
	 */
	public boolean select(int userId){

		boolean result = false;
		Connection conn = DBConnector.getConnection();
		String sql = "SELECT cart.user_id,cart.goods_id,goods.name,goods.price,goods.img_path,cart.number FROM "
					+"cart INNER JOIN goods ON cart.goods_id=goods.id "
					+"WHERE user_id="+userId;
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				GoCartDTO dto = new GoCartDTO();
				dto.setGoodsId(rs.getInt("goods_id"));
				dto.setName(rs.getString("name"));
				dto.setPrice((int)(rs.getFloat("price")));
				dto.setImgPath(rs.getString("img_path"));
				dto.setCount(rs.getInt("number"));
				dto.setCountPrice(((int)(rs.getFloat("price")))*rs.getInt("number"));
				list.add(dto);
			}
			result = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * カートのDBに新しく購入予定商品を登録する為のメソッド
	 * @param userId ユーザーID
	 * @param id 商品ID
	 * @param cnt 購入予定数
	 * @return count 購入予定商品を登録できれば1、できなければ0を、購入予定数が限界値(99)なら2を返す
	 */
	public int insert(int userId,int id,int cnt){

		int count = 0;
		int items = 0;
		Connection conn =  DBConnector.getConnection();

		try {
			String sql = "SELECT COUNT(goods_id) FROM cart WHERE user_id = ? AND goods_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, userId);
			ps.setInt(2, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				items = rs.getInt("count(goods_id)");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		Connection connection = DBConnector.getConnection();
		if(items == 0 ){
			String sql = "INSERT INTO cart(user_id,goods_id,number) values(?,?,?)";
			try {
				PreparedStatement ps = connection.prepareStatement(sql);
				ps.setInt(1, userId);
				ps.setInt(2, id);
				ps.setInt(3, cnt);
				count = ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return count;
		}else{
			int already = 0;
			try {
				String sql = "SELECT * FROM cart WHERE user_id = ? AND goods_id = ?";
				PreparedStatement ps = connection.prepareStatement(sql);
				ps.setInt(1, userId);
				ps.setInt(2, id);
				ResultSet rs = ps.executeQuery();
				while(rs.next()){
				already = rs.getInt("number");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			Connection dbc = DBConnector.getConnection();
			try {
				String sql = "UPDATE cart SET number = ? WHERE user_id = ? AND goods_id = ?";
				PreparedStatement ps = dbc.prepareStatement(sql);
				int upCount = already+cnt;
				if(upCount>=100){
					upCount=99;
					ps.setInt(1, upCount);
					ps.setInt(2, userId);
					ps.setInt(3, id);
					ps.executeUpdate();
					count = 2;
				}else{
					ps.setInt(1, upCount);
					ps.setInt(2, userId);
					ps.setInt(3, id);
					count = ps.executeUpdate();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					dbc.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return count;
		}
	}

	/**
	 * カートのなかの商品ごとの購入予定数を変更する為のメソッド
	 * @param userId ユーザーID
	 * @param id 商品ID
	 * @param cnt 購入予定数
	 * @return count 購入予定数を変更できれば1、できなければ0を返す
	 */
	public int update(int userId,int id,int cnt){

		int count = 0;
		Connection conn =  DBConnector.getConnection();

		if(cnt >0){
			String sql = "UPDATE cart SET number = ? WHERE user_id = ? AND goods_id = ?";
			try {
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, cnt);
				ps.setInt(2, userId);
				ps.setInt(3, id);
				count = ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}else{
			delete(userId, id);
			count = 1;
		}
		return count;
	}

	/**
	 * カートの中の購入予定商品を削除する為のメソッド
	 * @param userId ユーザーID
	 * @param id 商品ID
	 * @return count 購入予定商品を削除できれば1、できなければ0を返す
	 */
	public int delete(int userId,int id){

		int count = 0;
		Connection conn =  DBConnector.getConnection();
		String sql = "Delete FROM cart WHERE user_id = ? AND goods_id = ?";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, userId);
			ps.setInt(2, id);
			count = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
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

}
