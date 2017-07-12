/**
 *
 */
package com.internousdev.openconnect.attendance.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.internousdev.openconnect.attendance.dto.AttendanceDTO;
import com.internousdev.util.DBConnector;

/**
 * 検索情報を編集するクラス
 * @author kawamura
 * @since 7/11
 * @version 1.0.0
 */
public class AdminAttendanceUpdateDAO {

	/**
	 * 検索情報をもとに勤怠と備考を編集するメソッド
	 * @param userId
	 * @param attendance
	 * @param reason
	 * @param atYear
	 * @param atMonth
	 * @param atDay
	 * @return result
	 */
	 public int update(int userId,String attendance,String reason,int atYear,int atMonth,int atDay) {

	        DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/", "openconnect","root","mysql");
	        Connection con = db.getConnection();
	        int result = 0;
	        String sql = "update attendance set attendance=?,reason=? where user_id=? AND at_year=? AND at_month=? AND at_day=?";
	        try {
	            PreparedStatement ps = con.prepareStatement(sql);
	            ps.setString(1, attendance);
	            ps.setString(2, reason);
	            ps.setInt(3,userId);
	            ps.setInt(4,atYear);
	            ps.setInt(5,atMonth);
	            ps.setInt(6,atDay);


	            result = ps.executeUpdate();
	            ps.close();

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
	 /**
	  * 編集を実行した時に検索もする為のメソッド
	  * @param atYear
	  * @param atMonth
	  * @param atDay
	  * @param teamName
	  * @return searchList
	  */
	 public ArrayList<AttendanceDTO> select(int atYear, int atMonth, int atDay, String teamName){
		 DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/", "openconnect","root","mysql");
		 Connection con = db.getConnection();
		 Statement statement = null;

		 /* 検索結果格納DTO */
		 ArrayList<AttendanceDTO> searchList = new ArrayList<AttendanceDTO>();

		 String sql = "select * from attendance left join users on attendance.user_id=users.user_id where at_year="+ atYear+" and at_month="+ atMonth+" and at_day="+ atDay+" and team_name='"+ teamName+"' and attendance !='出席'";

		 try {
			 statement = con.createStatement();
			 ResultSet rs = statement.executeQuery(sql);

			 while (rs.next()) {
				 AttendanceDTO dto = new AttendanceDTO();
				 dto.setAtDate(rs.getString("at_date"));
					dto.setMonth(rs.getString("month"));
					dto.setFamilyNameKanji(rs.getString("family_name_kanji"));
					dto.setGivenNameKanji(rs.getString("given_name_kanji"));
					dto.setTeamName(rs.getString("team_name"));
					dto.setAttendance(rs.getString("attendance"));
					dto.setReason(rs.getString("reason"));
					dto.setUserId(rs.getInt("user_Id"));
					dto.setAtYear(rs.getInt("at_year"));
					dto.setAtMonth(rs.getInt("at_month"));
					dto.setAtDay(rs.getInt("at_day"));
					dto.setUserName(rs.getString("user_name"));
					searchList.add(dto);
			 }

		 } catch (SQLException e) {
			 e.printStackTrace();
		 } finally {
			 try {
				 con.close();
				 statement.close();
			 } catch (SQLException e) {
				 e.printStackTrace();
			 }
		 }
		 return searchList;
	 }

	}


