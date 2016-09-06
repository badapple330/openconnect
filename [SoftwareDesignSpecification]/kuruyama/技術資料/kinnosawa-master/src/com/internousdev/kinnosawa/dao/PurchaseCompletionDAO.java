/*
 * タイトル：データーベースお届け先と、購入履歴を登録する為のクラス
 * 説明    ：MySQLに接続し、届け先と、購入履歴を登録
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *        ：
 */
package com.internousdev.kinnosawa.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.internousdev.kinnosawa.util.DBConnector;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

/**
 * データーベースお届け先と、購入履歴を登録する為のクラス
 * @author K.Sugano
 * @version 1.1
 * @since 1.0
 *
 */
public class PurchaseCompletionDAO {

	/**
	 * カート内の商品の一覧
	 */
	private List<Integer> goodsIdList= new ArrayList<Integer>();

	/**
	 * カート内の購入枚数の一覧
	 */
	private List<Integer> numberList= new ArrayList<Integer>();

	/**
	 * お届け先ID
	 */
	private int sendId;

	/**
	 * 注文ID
	 */
	private int orderNum;

	/**
	 * コネクション
	 */
	Connection con=null;

	/**
	 * カートの情報をデーターベースから取得する為のメソッド
	 * @param userId ユーザーID
	 * @return result 処理が成功すればtrue、失敗すればfaleを返す
	 */
	public boolean selectCart(int userId){

		boolean result=false;
		con=(Connection) DBConnector.getConnection();

		try{
			String sql ="SELECT goods_id,number FROM cart WHERE user_id = ?;";
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setInt(1, userId);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				goodsIdList.add(rs.getInt("goods_id"));
				numberList.add(rs.getInt("number"));
				result = true;
			}
		}catch(Exception e){
			e.printStackTrace();
			result = false;
		}finally {
			if(con!=null){
				try{
					con.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	/**
	 * お届け先をデーターベースに登録する為のメソッド
	 * @param userId ユーザーID
	 * @param userName お届け先名
	 * @param phoneNumber 電話番号
	 * @param postalCode 郵便番号
	 * @param streetAddress 住所
	 * @param createdAt 作成日時
	 * @return count 処理が成功すれば1、失敗すれば0を返す
	 */
	public int insert(int userId,String userName, String phoneNumber, int postalCode,String streetAddress,String createdAt){

		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		createdAt=sdf.format(date);
		int count=0;
		con=(Connection) DBConnector.getConnection();
		String sql= "INSERT INTO send_address (user_id,send_name,tel_num,postal_code,address,created_at) VALUE (?,?,?,?,?,?);";

		try{
			PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql);
			ps.setInt(1, userId);
			ps.setString(2, userName);
			ps.setString(3, phoneNumber);
			ps.setInt(4, postalCode);
			ps.setString(5, streetAddress);
			ps.setString(6, createdAt);
			count=ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			if(con!=null){
				try{
					con.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
		return count;
	}

	/**
	 * お届け先IDを取得する為のメソッド
	 * @param streetAddress 住所
	 * @return result 処理が成功すればtrue、失敗すればfaleを返す
	 */
	public boolean selectId(String streetAddress){

		boolean result=false;
		con=(Connection) DBConnector.getConnection();
		String sql= "SELECT id FROM send_address WHERE address = ?";

		try{
			PreparedStatement ps= (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, streetAddress);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				setSendId(rs.getInt("id"));
				result=true;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			if(con!=null){
				try{
				con.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	/**
	 * 注文IDを取得する為のメソッド
	 * @return result 処理が成功すればtrue、失敗すればfaleを返す
	 */
	public boolean select(){

		boolean result=false;
		con=(Connection) DBConnector.getConnection();
		String sql="SELECT MAX(order_number) FROM order_history;";

		try{
			PreparedStatement ps= (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				setOrderNum(rs.getInt("MAX(order_number)")+1);
				result=true;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			if(con != null){
				try{
					con.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	/**
	 * 購入履歴をデータベースに登録する為のメソッド
	 * @param orderNum 注文ID
	 * @param userId ユーザーID
	 * @param sendId お届け先ID
	 * @param goodsId 商品ID
	 * @param number 購入枚数
	 * @param createdAt 作成日時
	 * @return count 処理に成功すれば1、失敗すれば0を返す
	 */
	public int insert(int orderNum, int userId, int sendId, int goodsId,int number,String createdAt){

		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		createdAt=sdf.format(date);
		int count=0;
		con=(Connection) DBConnector.getConnection();
		String sql="INSERT INTO order_history (order_number,user_id,send_id,goods_id,number,created_at) VALUE (?,?,?,?,?,?);";

		try{
			PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql);
			ps.setInt(1, orderNum);
			ps.setInt(2, userId);
			ps.setInt(3, sendId);
			ps.setInt(4, goodsId);
			ps.setInt(5, number);
			ps.setString(6, createdAt);
			count=ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			if(con!=null){
				try{
					con.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
		return count;
	}

	/**
	 * カート内の商品の一覧を取得する為のメソッド
	 * @return goodsIdList カート内の商品の一覧
	 */
	public List<Integer> getGoodsIdList() {
		return goodsIdList;
	}

	/**
	 * カート内の商品の一覧を格納する為のメソッド
	 * @param goodsIdList カート内の商品の一覧
	 */
	public void setGoodsIdList(List<Integer> goodsIdList) {
		this.goodsIdList = goodsIdList;
	}

	/**
	 * カート内の購入枚数の一覧を取得する為のメソッド
	 * @return numberList カート内の購入枚数の一覧
	 */
	public List<Integer> getNumberList() {
		return numberList;
	}

	/**
	 * カート内の購入枚数の一覧を格納する為のメソッド
	 * @param numberList カート内の購入枚数の一覧
	 */
	public void setNumberList(List<Integer> numberList) {
		this.numberList = numberList;
	}

	/**
	 * お届け先IDを取得する為のメソッド
	 * @return sendId お届け先ID
	 */
	public int getSendId() {
		return sendId;
	}

	/**
	 * お届け先IDを格納する為のメソッド
	 * @param sendId お届け先ID
	 */
	public void setSendId(int sendId) {
		this.sendId = sendId;
	}

	/**
	 * 注文IDを取得する為のメソッド
	 * @return orderNum 購入履歴の件数
	 */
	public int getOrderNum() {
		return orderNum;
	}

	/**
	 * 注文IDを格納する為のメソッド
	 * @param orderNum 購入履歴の件数
	 */
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

}
