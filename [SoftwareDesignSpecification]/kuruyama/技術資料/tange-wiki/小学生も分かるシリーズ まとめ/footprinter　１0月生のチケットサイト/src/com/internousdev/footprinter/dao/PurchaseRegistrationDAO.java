package com.internousdev.footprinter.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.internousdev.footprinter.util.DBConnector;

/**
 * 購入完了情報をDBに格納処理DAO
 * @author 丹下 陽平
 * @since 1.0
 * @version 1.0
 */
public class PurchaseRegistrationDAO {
	/**
	 * チケットの枚数(現在は1枚ずつの購入)
	 */
	private int numOfTickets = 1;

	/**
	 * 購入完了後の情報をDBに格納メソッド
	 * @param tourId ツアーID
	 * @param loginId ログインID
	 * @param amount 購入料金
	 * @return result
	 */
	public int insert(int tourId, int loginId,float amount){
		int result = 0;
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String sdfTime = sdf.format(c.getTime());

		Connection con = null;
		DBConnector dbCon = new DBConnector("footprinter");
		con = dbCon.getConnection();
		String sql = "INSERT INTO order_info (user_id,event_id,purchase_date,num_of_tickets,amount,created_at,updated_at) value (?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, loginId);
			ps.setInt(2, tourId);
			ps.setString(3, sdfTime);
			ps.setInt(4, numOfTickets);
			ps.setFloat(5, amount);
			ps.setString(6, sdfTime);
			ps.setString(7, sdfTime);

			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	/**
	 * チケット残数を1減らすメソッド
	 * @param tourId ツアーId
	 * @return rescount
	 */
	public int decrease(int tourId){
		int rescount = 0;
		Connection con = null;
		DBConnector dbCon = new DBConnector("footprinter");
		con = dbCon.getConnection();
		String sql = "UPDATE event SET remaining = remaining-1 WHERE id = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, tourId );
			rescount = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rescount;
	}
	
	/**
	 * チケット残数を確認するためのメソッド
	 * @param tourId　ツアーID
	 * @return result
	 */
	@SuppressWarnings("javadoc")
	public boolean checkRemaining(int tourId){
		boolean result = false;
		Connection con = null;
		DBConnector dbCon = new DBConnector("footprinter");
		con = dbCon.getConnection();
		String sql = "SELECT * FROM event WHERE id = ?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, tourId);
			ResultSet resultSet = ps.executeQuery();
			if (resultSet.next()) {
				if (resultSet.getInt("remaining")>0) {
					result = true;
				}
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