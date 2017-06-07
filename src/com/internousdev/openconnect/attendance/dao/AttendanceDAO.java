/**
 *
 */
package com.internousdev.openconnect.attendance.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;


/**
 * 出席状況についてデータベースに問い合わせをおこないます。
 * @author Matsumoto Teppei
 * @since 2017/06/02
 * @version 1.0
 */
public class AttendanceDAO {


	/**
	 * userIdからユーザーの名前を取得し画面に表示するメソッド
	 * @param familyNameKanji
	 * @param givenNameKanji
	 * @return
	 */
	public int select(String familyNameKanji,String givenNameKanji) {
		DBConnector db=new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
		Connection con =db.getConnection();

		try {
			String sql = "select * from attendance left join users on attendance.user_id = users.user_id=?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1,familyNameKanji);
			ps.setString(2,givenNameKanji);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				return rs.getInt("book_id");/*????????????明日ここら辺から*/
				}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

	/**
	 * 勤怠の入力内容をDBに追加するメソッド
	 *@param user_id 	ユーザー番号
	 *@param attendance 出欠状況
	 *@param atYear		報告年
	 *@param atDay		報告日
	 *@param atMonth	報告月
	 *@param reason		備考
	 *@param atDate		日時
	 *@return ret
	 */
	public int insert(int userId,int atYear,int atMonth, int atDay, int attendance, String reason){

		DBConnector db=new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
		Connection con =db.getConnection();
		int ret = 0;
		String sql = "insert into attendance(user_id,at_year,at_month,at_day,attendance,reason) values(?,?,?,?,?,?)";


		try{
	            PreparedStatement ps = con.prepareStatement(sql);
	            ps.setInt(1, userId);
	            ps.setInt(2,atYear);
	            ps.setInt(3,atMonth);
	            ps.setInt(4,atDay);
	            ps.setInt(5, attendance);
	            ps.setString(6, reason);

	            ret = ps.executeUpdate();

	        }catch (SQLException e){
	            e.printStackTrace();
	        }finally{
	                try{
	                    con.close();
	                }catch (SQLException e){
	                    e.printStackTrace();
	                }
	            }
		return ret;
	}
}