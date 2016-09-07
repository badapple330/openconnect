package com.internousdev.openconnect.schedule.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;


/**
 * 情報を受け取ってDBにある情報を削除するクラス。
 * @author MASAHIRO KEDSUKA
 * @since 2016/09/07
 */
public class ScheduleDeleteDAO {


	/**
	 * DBから情報を削除するメソッド。
	 * @param scheduleId
	 * @return count
	 * @throws SQLException
	 */
	public int delete(int scheduleId)  throws SQLException{

		int count = 0;
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
        Connection conn =  db.getConnection();
        String sql = "Delete from schedule WHERE id= ?";

         try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,scheduleId);
            count =ps.executeUpdate();

         }catch (SQLException e) {
 	           e.printStackTrace();
 	     }finally{
 	           try{
 	        	   conn.close();
 	           }catch (SQLException e){
 	        	   e.printStackTrace();
 	           }
 	     }
         return count;

	}

}
