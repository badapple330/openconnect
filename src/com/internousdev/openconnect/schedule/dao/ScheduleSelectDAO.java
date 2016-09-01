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

	private List<ScheduleSelectDTO> list = new ArrayList<ScheduleSelectDTO>();

	public List<ScheduleSelectDTO> select() {

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();
		String sql = "select * from schedule where title=?";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

            while(rs.next()) {
            	ScheduleSelectDTO dto = new ScheduleSelectDTO();
            	dto.setId(rs.getInt("id"));
            	dto.setStartdate(rs.getString("Startdate"));
              	dto.setEnddate(rs.getString("Enddate"));
              	dto.setTitle(rs.getString("title"));
              	dto.setContent(rs.getString("content"));
            	list.add(dto);
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
         return list;

	}

}

