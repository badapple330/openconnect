package com.internousdev.openconnect.decisionDetail.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

public class DecisionDetailApplicationDAO{

	public int update(String decisionStatus,int decisiondetailid){
		int count = 0;
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");
		Connection con = db.getConnection();

		String sql = "UPDATE decision_detail SET  decision_status=? where decision_detail_id=?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,decisionStatus);
			ps.setInt(2,decisiondetailid);
			count =ps.executeUpdate();

		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch (SQLException e){
				e.printStackTrace();
			}
		}
		return count;
	}
}