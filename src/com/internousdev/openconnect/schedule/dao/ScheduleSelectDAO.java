package com.internousdev.openconnect.schedule.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.schedule.dto.ScheduleSelectDTO;
import com.internousdev.util.DBConnector;


public class ScheduleSelectDAO {

	public List<ScheduleSelectDTO> schedulelist = new ArrayList<ScheduleSelectDTO>();

	public List<ScheduleSelectDTO> select(String search){

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();
		String sql = "select * from schedule where title LIKE '%" + search + "%'";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

            while(rs.next()) {
            	System.out.println("リストへ追加:");
            	ScheduleSelectDTO dto = new ScheduleSelectDTO();
            	dto.setId(rs.getInt("id"));
            	try { dto.setStartdate(rs.getDate("Startdate")); }catch(Exception e){}
            	try { dto.setEnddate(rs.getDate("Enddate")); }catch(Exception e){}
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

		System.out.println(search + " " + schedulelist.size() + sql);
         return schedulelist;

	}

}
