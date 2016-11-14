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
import com.internousdev.openconnect.students.dto.StudentsDTO;
import com.internousdev.util.DBConnector;

/**
 * 出席状況についてデータベースに問い合わせをおこないます。
 * @author MINORI SUNAGAWA
 * @author TAKUMA INOUE
 * @since 2016/09/04
 * @version 1.0
 */
public class AttendanceDAO {

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
	public ArrayList<AttendanceDTO> select(String year, String month, String date, String familyName, String givenName){

		Connection con = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql").getConnection();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

		ArrayList<AttendanceDTO> attendanceList = new ArrayList<AttendanceDTO>();

		try{
			String sql = "select * from attendance join users on attendance.user_id = users.user_id "+ "where attendance.date like '%" + date +
					"%' and users.year like '%" + year +
					"%' and users.month like '%" + month +
					"%' and users.family_name_kana like '%" + familyName +
					"%' and users.given_name_kana like '%" + givenName + "%'";
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
//				dto.setFamilyNameKana( rs.getString( "family_name_kana" ));
//				dto.setGivenNameKana( rs.getString( "given_name_kana" ));
				dto.setAttendance(rs.getInt("attendance"));
				dto.setInterview(rs.getInt("interview"));
				dto.setAttendanceString( ATTENDANCE_STR[ dto.getAttendance() ] );
				dto.setInterviewString( INTERVIEW_STR[ dto.getInterview() ] );

				if( dto.getAttendance() == 0 ){
					dto.setAttendance( 1 );
				}

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

	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 * @author MINORI SUNAGAWA
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public int update( String date, int userId, int attendance, int interview ){
		int count=0;

		Connection conn=new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql").getConnection();
		String sql="update attendance set attendance=?, interview=? where user_id=? and date=?";

		try{
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setInt(1, attendance);
			ps.setInt(2, interview);
			ps.setInt(3,  userId);
			ps.setString(4, date);

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
