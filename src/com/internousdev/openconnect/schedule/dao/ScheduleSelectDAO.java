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
 * 画面から検索するクラス。
 * @author MASAHIRO KEDSUKA
 * @since 2016/09/07
 */
public class ScheduleSelectDAO {

	/**
	 * スケジュールリスト
	 * @author MASAHIRO KEDSUKA
	 */
	public List<ScheduleSelectDTO> schedulelist = new ArrayList<ScheduleSelectDTO>();


	/**
	 * 画面から検索するメソッド。
	 * @author MASAHIRO KEDSUKA
	 * @param search
	 * @return schedulelist
	 */
	public List<ScheduleSelectDTO> select(String search){

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();
		String sql = "select * from schedule where title LIKE '%" + search + "%'";


		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

            while(rs.next()) {
            	ScheduleSelectDTO dto = new ScheduleSelectDTO();
            	dto.setId(rs.getInt("id"));
            	try { dto.setStart_day(rs.getDate("start_day")); }catch(Exception e){}
            	try { dto.setEnd_day(rs.getDate("end_day")); }catch(Exception e){}
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
