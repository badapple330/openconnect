/**
 *
 */
package com.internousdev.openconnect.attendance.dao;

/**
 * @author internous
 *
 */
public class AttendanceRegisterDAO {

	/* DBに出欠情報を登録するメソッド
	 *@author KOCHO SANSHIRO
	 *
	 */
}
/*
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
	｝
*/