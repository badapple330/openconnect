package com.internousdev.bulletinboard.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;





public class btnDAO {



	public int pointPlus(int senderId,int timelineId){

		LvDAO Lv =new LvDAO();

		DBConnector db=new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
		Connection con=db.getConnection();
		Connection con2=db.getConnection();
		int inserted=0;
		int inserted2=0;

		String sql = "update users set point = point+100 where user_id = ?";
		String sql2 ="update send_timeline set good = good+1 where timeline_id = ?";

		try{
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setInt(1,senderId);
		inserted=ps.executeUpdate();

			ps.close();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}

		try{
			PreparedStatement ps2= con2.prepareStatement(sql2);
			ps2.setInt(1,timelineId);
			inserted2=ps2.executeUpdate();

			ps2.close();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con2.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		//経験値が1000以上だった場合にレベルUP
		Lv.Lv_up(senderId);
		return inserted;

	}


}







