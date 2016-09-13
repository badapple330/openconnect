package com.internousdev.openconnect.schedule.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.schedule.dto.ScheduleDTO;
import com.internousdev.util.DBConnector;


/**
 * スケジュール一覧をはじめに開いたときにDBを検索するクラス。
 * @author MASAHIRO KEDSUKA
 * @since 2016/09/07
 */
public class ScheduleFirstrunDAO {

	/**
	 * @author MASAHIRO KEDSUKA
	 * スケジュールリスト
	 */
	public List<ScheduleDTO> scheduleList = new ArrayList<ScheduleDTO>();

	/**
	 * スケジュール一覧のDB検索するメソッド。
	 * @author MASAHIRO KEDSUKA
	 * @param search
	 * @return schedulelist
	 */
	public List<ScheduleDTO> select(String search){

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();
		String sql = "select * from schedule";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				ScheduleDTO dto = new ScheduleDTO();
				dto.setId(rs.getInt("id"));
				dto.setStartDay(rs.getString("start_day"));
				dto.setEndDay(rs.getString("end_day"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				scheduleList.add(dto);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try{
				conn.close();
			}catch (SQLException e){
				e.printStackTrace();
			}
		}
		return scheduleList;

	}

}