package com.internousdev.footprinter.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.internousdev.footprinter.util.DBConnector;

/**
 * 購入者情報をデータベースへ登録するDAO
 * @author 田原 一樹
 * @since  1.0
 * @version 1.0
 */
public class PaymentRegistrationDAO {
	/**
	 * データベースへ各値を登録するメソッド
	 * @param address 住所
	 * @param creditToken クレジットトークン
	 * @param creditNum クレジットカード番号
	 * @param loginId ログインID
	 * @param postalCode 郵便番号
	 * @return　result
	 */
	public int insert(String address,String creditToken,String creditNum,int loginId,String postalCode) {
		int result = 0;	
		Connection con = null;
		DBConnector dbCon = new DBConnector("footprinter");
		con = dbCon.getConnection();
		String sql = "UPDATE user SET address= ?,credit_token= ?,credit_num= ?,postal_code=? WHERE id = ? ";		
		try {
			PreparedStatement ps = con.prepareStatement(sql);	
			ps.setString(1, address);
			ps.setString(2, creditToken);
			ps.setString(3, creditNum);
			ps.setString(4, postalCode);
			ps.setInt(5, loginId);			
			result = ps.executeUpdate();		
		} catch (SQLException e) {
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
}
