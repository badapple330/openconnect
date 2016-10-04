/**
 *
 */
package com.internousdev.openconnect.attendance.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.openconnect.students.dto.StudentsDTO;
import com.internousdev.util.DBConnector;

/**
 * DBの情報を追加する為のクラス
 * @author MINORI SUNAGAWA
 * @since 2016/09/04
 * @version 1.0
 */
public class AttendanceInsertDAO {

	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 * @author MINORI SUNAGAWA
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public int insert(String date, int userId){

		int count = 0;

		Connection con = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql").getConnection();


		String sql = "insert into attendance( date, user_id ) values( ?, ? )";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,date);
			ps.setInt(2,userId);

			count = ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return count;
	}

	/**
	 * DBの情報を取得する為のクラス
	 * @author MINORI SUNAGAWA
	 * @since 2016/09/04
	 * @version 1.0
	 */
	public ArrayList<StudentsDTO> select(String year, String month){

		Connection con = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql").getConnection();

		ArrayList<StudentsDTO> usersList = new ArrayList<StudentsDTO>();

		try{
			String sql = "select*from users where year=? and month=?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString( 1, year );
			ps.setString( 2, month );

			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				StudentsDTO dto = new StudentsDTO();
				dto.setUserId( rs.getInt("user_id") );

				usersList.add( dto );
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return usersList;
	}

	/**
	 * DBの情報があるかどうか確認する為のクラス
	 * @author MINORI SUNAGAWA
	 * @since 2016/09/04
	 * @version 1.0
	 */
	public boolean check(String date, int userId){

		Connection con = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql").getConnection();

		try{
			String sql = "select * from attendance where date=? and user_id=?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString( 1, date );
			ps.setInt( 2, userId );

			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				return true;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return false;
	}

}
