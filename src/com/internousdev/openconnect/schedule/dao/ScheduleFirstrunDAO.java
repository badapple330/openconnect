package com.internousdev.openconnect.schedule.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.schedule.dto.ScheduleSelectDTO;
import com.internousdev.util.DBConnector;


/**
 * はじめに画面を開いたときにDBを検索するクラス。
 * @author MASAHIRO KEDSUKA
 * @since 2016/09/07
 */
public class ScheduleFirstrunDAO {

	/**
	 * @author MASAHIRO KEDSUKA
	 * スケジュールリスト
	 */
	public List<ScheduleSelectDTO> schedulelist = new ArrayList<ScheduleSelectDTO>();

	/**
	 * DB検索するメソッド。
	 * @author MASAHIRO KEDSUKA
	 * @param search
	 * @return schedulelist
	 */
	public List<ScheduleSelectDTO> select(String search){

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();
		String sql = "select * from schedule";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

            while(rs.next()) {
            	ScheduleSelectDTO dto = new ScheduleSelectDTO();
            	dto.setId(rs.getInt("id"));
            	dto.setStart_day(rs.getDate("start_day"));
              	dto.setEnd_day(rs.getDate("end_day"));
              	dto.setTitle(rs.getString("title"));
              	dto.setContent(rs.getString("content"));
            	schedulelist.add(dto);
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
         return schedulelist;

	}

}