package com.internousdev.openconnect.decision.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

public class DecisionInsertDAO {

	public int insert(Date registration,int user_id,int project_id,int decision_id,String decision_name,String detail,String i_drafting_id,String i_approval_id,String a_drafting_id,String cd_id,String i_a_d_id,String i_a_id){

		int count = 0;


		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();
		String sql = "INSERT INTO projects(registration,user_id,project_id,decision_id,decision_name,detail,i_drafthing_id,i_approval_id,a_drafthing_id,cd_id,i_a_d_id,i_a_id)VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setDate(1,registration);
			ps.setInt(2,user_id);
			ps.setInt(3,project_id);
			ps.setInt(4,decision_id);
			ps.setString(5,decision_name);
			ps.setString(6,detail);
			ps.setString(7,i_drafting_id);
			ps.setString(8,i_approval_id);
			ps.setString(9,a_drafting_id);
			ps.setString(10,cd_id);
			ps.setString(11,i_a_d_id);
			ps.setString(12,i_a_id);

			count = ps.executeUpdate();


		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try{
				conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return count;
	}

}
