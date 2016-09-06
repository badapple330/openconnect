/*
 * タイトル：カート内情報、ユーザー情報を取得する為のクラス
 * 説明    ：MySQLに接続し、カート内情報、ユーザー情報を取得
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *        ：
 */
package com.internousdev.kinnosawa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.kinnosawa.dto.GoPurchaseDTO;
import com.internousdev.kinnosawa.util.DBConnector;

/**
 * カート内情報、ユーザー情報を取得する為のクラス
 * @author K.Abe
 * @version 1.1
 * @since 1.0
 *
 */
public class GoPurchaseDAO {

	/**
	 * 購入手続き画面に表示する商品のリスト
	 */
	private List<GoPurchaseDTO> kinnosawaList = new ArrayList<GoPurchaseDTO>();

	/**
	 * 登録している名前
	 */
	private String userName;

	/**
	 * 登録している電話番号
	 */
	private String phoneNumber;

	/**
	 * 登録している郵便番号
	 */
	private String postalCode;

	/**
	 * 登録している住所
	 */
	private String streetAddress;

	/**
	 * クレッジトカード番号
	 */
	private String cardNumber;


	/**
     * カートの情報を取得する為のメソッド
     * @param userId ユーザーID
     * @return result 商品の情報が取得できたらtrue、失敗したらfalseを返す。
     */
    public boolean selectCart(int userId){

        boolean result = false;
        Connection con = DBConnector.getConnection();

        try {
            String sql = "select cart.user_id,cart.goods_id,cart.number,goods.name,goods.price,goods.img_path FROM "
            			+"cart INNER JOIN goods ON cart.goods_id = goods.id "
            			+"WHERE user_id ="+ userId;
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            		GoPurchaseDTO dto = new GoPurchaseDTO();
                    dto.setGoodsId(rs.getInt("goods_id"));
                    dto.setGoodsNumber(rs.getInt("number"));
                    dto.setGoodsName(rs.getString("name"));
                    dto.setGoodsPrice(rs.getInt("price"));
                    dto.setImgPath(rs.getString("img_path"));
                    kinnosawaList.add(dto);
                }
                result = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    /**
     * ユーザーの情報を取得する為のメソッド
     * @param id ユーザーID
     * @return result ユーザーの情報が取得できたらtrueを返す。
     */
    public boolean selectUser(int id){
        boolean result = false;
        Connection con = DBConnector.getConnection();

        try {
            String sql = "select id,name,tel_num,postal_code,address,card_num from user where id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            	userName = rs.getString("name");
            	phoneNumber = rs.getString("tel_num");
                postalCode = rs.getString("postal_code");
                streetAddress = rs.getString("address");
    			cardNumber = rs.getString("card_num");
            }
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }


	/**
	 * 購入手続き画面に表示する商品のリストを取得する為のメソッド
	 * @return kinnosawaList 購入手続き画面に表示する商品のリスト
	 */
	public List<GoPurchaseDTO> getKinnosawaList() {
		return kinnosawaList;
	}

	/**
	 * 購入手続き画面に表示する商品のリストを格納する為のメソッド
	 * @param kinnosawaList 購入手続き画面に表示する商品のリスト
	 */
	public void setKinnosawaList(List<GoPurchaseDTO> kinnosawaList) {
		this.kinnosawaList = kinnosawaList;
	}

	/**
	 * 登録している名前を取得する為のメソッド
	 * @return userName 登録している名前
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 登録している名前を格納する為のメソッド
	 * @param userName 登録している名前
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * 登録している電話番号を取得する為のメソッド
	 * @return phoneNumber 登録している電話番号
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * 登録している電話番号を格納する為のメソッド
	 * @param phoneNumber 登録している電話番号
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * 登録している郵便番号を取得する為のメソッド
	 * @return postalCode 登録している郵便番号
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * 登録している郵便番号を格納する為のメソッド
	 * @param postalCode 登録している郵便番号
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * 登録している住所を取得する為のメソッド
	 * @return streetAddress 登録している住所
	 */
	public String getStreetAddress() {
		return streetAddress;
	}

	/**
	 * 登録している住所を格納する為のメソッド
	 * @param streetAddress 登録している住所
	 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	/**
	 * クレッジトカード番号を取得する為のメソッド
	 * @return cardNumber クレッジトカード番号
	 */
	public String getCardNumber() {
		return cardNumber;
	}

	/**
	 * クレッジトカード番号を格納する為のメソッド
	 * @param cardNumber クレッジトカード番号
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}


}