package com.internousdev.footprinter.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;

import com.internousdev.footprinter.dto.PurchaseConfirmDTO;
import com.internousdev.footprinter.util.DBConnector;

/**
 * 購入用にユーザーとイベントの情報をDBから取得処理DAO
 * @author 丹下 陽平
 * @since 1.0
 * @version 1.0
 */
public class PurchaseConfirmDAO {
	/**
	 * DBコネクション
	 */
	private DBConnector dbCon = new DBConnector("footprinter");
	/**
	 * コネクション
	 */
	private Connection con = null;

	/**
	 * ログインIDからユーザ情報をDTOに格納
	 * @param dto PurchaseConfirmDTO ユーザー情報格納ようDTO
	 * @param loginId ログインID
	 * @return result
	 */
	public boolean selectToUser(PurchaseConfirmDTO dto, int loginId){
		boolean result = false;
		con = dbCon.getConnection();
		String sql = "SELECT * FROM user WHERE id = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, loginId);
			ResultSet resultSet = ps.executeQuery();
			if(resultSet.next()){
				dto.setAddress(resultSet.getString("address"));
				dto.setCreditNum(resultSet.getString("credit_num"));
				dto.setCreditToken(resultSet.getString("credit_token"));
				dto.setPostalCode(resultSet.getString("postal_code"));
				result = true;
			}
		}catch (SQLException e){
			e.printStackTrace();
		}
		if (con != null){
			try{
				con.close();
			}catch (SQLException e){
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * イベントIDからイベント情報をDTOに格納
	 * @param dto PurchaseConfirmDTO イベント格納用DTO
	 * @param tourId ツアーID
	 * @return result
	 */
	public boolean selectByEvent(PurchaseConfirmDTO dto, int tourId) {
		boolean result = false;
		con = dbCon.getConnection() ;

		String sql = "SELECT * FROM event WHERE id = ?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, tourId);
			ResultSet resultSet = ps.executeQuery();

			if(resultSet.next()){
				result = true;
				DecimalFormat decimalFormat = new DecimalFormat("0.##");
				String price = decimalFormat.format(resultSet.getInt(4));
				dto.setEventName(resultSet.getString(2));
				dto.setPrice(price);
				dto.setEventDate(resultSet.getString(3));
			}
		}catch (SQLException e){
			e.printStackTrace();
		}finally {
			try{
				con.close();
			}catch (SQLException e){
				e.printStackTrace();
			}
		}
		return result;
	}
}
