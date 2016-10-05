package com.internousdev.openconnect.schedule.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.schedule.dto.ScheduleDTO;
import com.internousdev.util.DBConnector;


/**
 * スケジュール一覧をActionから受け取った検索文を検索するクラス。
 * @author MASAHIRO KEDSUKA
 * @since 2016/09/07
 */
public class ScheduleSelectDAO {

	/**
	 * リスト形式のスケジュール一覧
	 * @author MASAHIRO KEDSUKA
	 */
	public List<ScheduleDTO> scheduleList = new ArrayList<ScheduleDTO>();


	/**
	 * スケジュール一覧を検索するメソッド。
	 * @author MASAHIRO KEDSUKA
	 * @param search
	 * @return schedulelist
	 */
	public List<ScheduleDTO> select(String search){

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();
		String sql = "select * from schedule where id LIKE '%" + search + "%' OR title LIKE '%" + search + "%'"
				+ " OR content LIKE '%" + search + "%'";

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");


		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				ScheduleDTO dto = new ScheduleDTO();
				dto.setId(rs.getInt("id"));
				try { dto.setStartDay(sdf.format(rs.getDate("start_day")).toString()); }catch(Exception e){}
				try { dto.setEndDay(sdf.format(rs.getDate("end_day")).toString()); }catch(Exception e){}
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
