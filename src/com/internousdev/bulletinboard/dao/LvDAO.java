package com.internousdev.bulletinboard.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.bulletinboard.util.DBConnector;

public class LvDAO {



	public int Lv_up(int userId){

		DBConnector db=new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "bulletinboard", "root","mysql");
		Connection con=db.getConnection();
		Connection con2=db.getConnection();
		int inserted= 0;
		int ex=0;

		String sql ="select point from users where user_id=?";
		String sql2 ="update users set Lv = Lv+1,point =point-1000 where user_id = ?";


		try{
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setInt(1,userId);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
			ex = rs.getInt("point");
			}
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

		if(ex>=1000){
			try{
				PreparedStatement ps2= con2.prepareStatement(sql2);
				ps2.setInt(1,userId);
				inserted=ps2.executeUpdate();

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

		}
		return inserted;

	}

}