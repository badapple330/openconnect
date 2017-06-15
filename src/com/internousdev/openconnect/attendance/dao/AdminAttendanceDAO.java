package com.internousdev.openconnect.attendance.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException; //public class SQLException extends Exception implements Iterable<Throwable>APIのクラス
import java.util.ArrayList;

import com.internousdev.openconnect.attendance.dto.AttendanceDTO;
import com.internousdev.util.DBConnector;

/**
 * 管理者販売履歴の表示に関するメソッド
 *
 * @author Atsushi Suzuki
 * @since 2017/06/01
 * @version 1.0
 */
public class AdminAttendanceDAO {




	/**
	 * 購入履歴を格納する
	 */
	public ArrayList<AttendanceDTO> searchList  = new ArrayList<AttendanceDTO>();

	/**
	 * 商品IDで販売履歴を取得しリストに格納するメソッド
	 * @param itemId 商品ID
	 * @return adminhistorylist 販売履歴
	 *
	 * @author kota.miyazato
	 * @since 2017/05/12
	 * @version 1.0
	 */
	public ArrayList<AttendanceDTO> select(int atYear,int atMonth,int atDay,String familyNameKanji,String givenNameKanji,String teamName) {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root", "mysql");
		Connection con = db.getConnection();

		ArrayList<AttendanceDTO> searchList = new ArrayList<AttendanceDTO>();

		int k = 0;
		String sql = null;
		
		
		if(atYear!=0 && atMonth!=0 && atDay!=0 && (familyNameKanji).equals("") && (givenNameKanji).equals("")){
			sql = "select * from attendance left join users on attendance.user_id = users.user_id where at_year = ? AND at_month=? AND at_day=?";
			k=1;
		}else if(atYear==0 && atMonth==0 && atDay==0 && !((familyNameKanji).equals("")) && !((givenNameKanji).equals(""))){
			sql = "select * from attendance left join users on attendance.user_id = users.user_id where family_name_kanji=? AND given_name_kanji=?";
		    k=2;
		}
	    else if(atYear!=0 && atMonth!=0 && atDay!=0 && !((familyNameKanji).equals("")) && !((givenNameKanji).equals(""))){
	    	sql = "select * from attendance left join users on attendance.user_id = users.user_id where at_year = ? AND at_month=? AND at_day=? AND family_name_kanji=? AND given_name_kanji=?";
	        k=3;
	    }else if(atYear!=0 && atMonth!=0 && atDay!=0 && (familyNameKanji).equals("") && (givenNameKanji).equals("") && !((teamName).equals(""))){
	    	sql = "select * from attendance left join users on attendance.user_id = users.user_id where atYear = ? AND atMonth = ? AND atDay = ? AND teamName = ?";
	    	k=4;
	    }
		
		
		try {
			PreparedStatement ps = con.prepareStatement(sql); //「?」のパラメーターを持つSQLを実行するためのインターフェイス。SQLコンテナ
			if(k == 1){
			          ps.setInt(1, atYear); //ps内の?への値のセット。第1引数には?のインデックスナンバーを指定する。第2引数にはセットする値を指定する。
			          ps.setInt(2, atMonth);
			          ps.setInt(3, atDay);
			}else if(k == 2){
				      ps.setString(1, familyNameKanji);
		              ps.setString(2, givenNameKanji);
			}else if(k == 3){
				      ps.setInt(1, atYear);
		              ps.setInt(2, atMonth);
		              ps.setInt(3, atDay);
		              ps.setString(4, familyNameKanji);
		              ps.setString(5, givenNameKanji);
			}else if(k == 4){
				      ps.setInt(1, atYear);
	                  ps.setInt(2, atMonth);
	                  ps.setInt(3, atDay);
			          ps.setString(4, teamName);
			}


			ResultSet rs = ps.executeQuery(); //SQL文の実行インターフェース。

			while (rs.next()) {
				AttendanceDTO dto = new AttendanceDTO();
				dto.setAtDate(rs.getString("at_date"));
				dto.setMonth(rs.getString("month"));
				dto.setFamilyNameKanji(rs.getString("family_name_kanji"));
				dto.setGivenNameKanji(rs.getString("given_name_kanji"));
				dto.setTeamName(rs.getString("team_name"));
				dto.setAttendance(rs.getString("attendance"));
				dto.setReason(rs.getString("reason"));
				searchList.add(dto);
			}
			rs.close();
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
		return searchList;
	}

}
