package com.internousdev.openconnect.attendance.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.openconnect.attendance.dto.AttendanceDTO;
import com.internousdev.util.DBConnector;

/**
 * 管理者販売履歴の表示に関するメソッド
 *
 * @author kota.miyazato
 * @since 2017/05/12
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
	 * @author kota.miyazato
	 * @since 2017/05/12
	 * @version 1.0
	 */
	public ArrayList<AttendanceDTO> select(String atDate) {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root", "mysql");
		Connection con = db.getConnection();

		ArrayList<AttendanceDTO> searchList = new ArrayList<AttendanceDTO>();

		int k = 0;
		String sql;

        //SQL文の分岐。何も入力しなければ全件表示、入力するればそれに一致するものを表示
		if(atDate == "null"){
			sql = "select * from attendance left join users on attendance.user_id = users.user_id";
		}else{
			sql = "select * from attendance left join users on attendance.user_id = users.user_id where attendance.at_date = ?";
		k=1;
		}
		try {
			PreparedStatement ps = con.prepareStatement(sql); //「?」のパラメーターを持つSQLを実行するためのインターフェイス
			if(k == 1){
			          ps.setString('1', atDate); //?への値のセット。第1引数には?のインデックスナンバーを指定する。第2引数にはセットする値を指定する。
			}

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				AttendanceDTO dto = new AttendanceDTO();

				dto.setAtDate(rs.getString("at_date"));
				dto.setMonth(rs.getString("month"));
				dto.setFamilyNameKanji(rs.getString("family_name_kanji"));
				dto.setGivenNameKanji(rs.getString("given_name_kanji"));
				dto.setAttendance(rs.getInt("attendance"));
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



