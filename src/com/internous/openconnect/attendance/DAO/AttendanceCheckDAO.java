/**
 *
 */
package com.internous.openconnect.attendance.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.chocotime.util.DBConnector;

import jp.co.internous.util.DBconnector;

/**
 * @author internous
 *
 */
public class AttendanceCheckDAO {

	/* DBから生徒登録情報を持ってくるメソッド
	 *@author KOCHO SANSHIRO
	 *
	 */
	public int insert(String userName) {

		DBconnector db = new DBConnector();
		Connection con = db.getConnection();

		try{
			String sql = "SELECT * FROM user_history WHERE name =? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userName);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				productName.add(rs.getString("product_name"));
				price.add(rs.getFloat("price"));
				number.add(rs.getInt("number"));
			}
		} catch(SQLException e){
			e.printStackTrace();
		}
	}

}
