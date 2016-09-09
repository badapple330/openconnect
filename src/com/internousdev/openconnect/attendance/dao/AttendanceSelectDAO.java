/**
 *
 */
package com.internousdev.openconnect.attendance.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.internousdev.openconnect.attendance.dto.AttendanceDTO;
import com.internousdev.util.DBConnector;

/**
 * DBの情報を画面に表示する為のクラス
 * @author MINORI SUNAGAWA
 * @since 2016/09/04
 * @version 1.0
 */
public class AttendanceSelectDAO {

	/**
	 * 勤怠文字
	 */
	private final String ATTENDANCE_STR[] = { "", "出席", "遅刻(連絡有)", "遅刻(連絡無)", "欠席(連絡有)", "欠席(連絡無)", "連絡無し" };
	/**
	 * 面談文字
	 */
	private final String INTERVIEW_STR[] = { "", "面談有", "面談無" };
	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 * @author MINORI SUNAGAWA
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public ArrayList<AttendanceDTO> select(String year, String month, String date){

		Connection con = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql").getConnection();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

		ArrayList<AttendanceDTO> attendanceList = new ArrayList<AttendanceDTO>();

		try{
			String sql = "select * from attendance join users on attendance.user_id = users.user_id "
					+ "where attendance.date like '%" + date + "%' and users.year like '%" + year + "%' and users.month like '%" + month + "%'";

			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				AttendanceDTO dto = new AttendanceDTO();
				dto.setDate( sdf.format( rs.getDate("date") ).toString() );
				dto.setUserId(rs.getInt("user_id"));
				dto.setYear( rs.getString( "year" ) );
				dto.setMonth( rs.getString( "month" ) );
				dto.setFamilyNameKanji( rs.getString( "family_name_kanji" ) );
				dto.setGivenNameKanji( rs.getString( "given_name_kanji" ) );
				dto.setAttendance(rs.getInt("attendance"));
				dto.setInterview(rs.getInt("interview"));
				dto.setAttendanceString( ATTENDANCE_STR[ dto.getAttendance() ] );
				dto.setInterviewString( INTERVIEW_STR[ dto.getInterview() ] );
				attendanceList.add(dto);
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
		return attendanceList;
	}
	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 * @author MINORI SUNAGAWA
	 */
	public void select(){

	}

}
