package com.internousdev.openconnect.attendance.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.openconnect.attendance.dto.AttendanceDTO;
import com.internousdev.util.DBConnector;

/**
 * DBの情報を画面に表示する為のクラス
 * @author MINORI SUNAGAWA
 * @since 2016/09/04
 * @version 1.0
 */
public class AttendanceUpDAO {

	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 * @author MINORI SUNAGAWA
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public int update(AttendanceDTO dto){
		int count=0;

		Connection conn=new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql").getConnection();
		String sql="update attendance set date=?,attendance=?,interview=?";

		try{
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, dto.getDate());
			ps.setInt(2, dto.getAttendance());
			ps.setInt(3, dto.getInterview());

			count = ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return count;
	}
}
