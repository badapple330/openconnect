package com.internousdev.openconnect.decision.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

/**
 * 画面で受け取った情報をDTOに格納する
 *
 * @author KENICHI HORIGUCHI
 *
 */
public class DecisionUpdateDAO {

	public int select(String registration,int user_id,int project_id,int decision_id,String decision_name, String detail,String i_drafting_id,String i_approval_id,String a_drafting_id,String cd_id,String i_a_d_id,String i_a_id
){
		int count = 0;
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");
		Connection con = db.getConnection();
		System.out.println(3);
		String sql = "UPDATE decision SET registration=?, user_id=?, project_id=?, decision_id=? , decision_name=? , detail=?,manager_id=?,i_drafting_id_id=? ,i_approval_id=?,a_drafting_id=?,cd_id=?,i_a_d_id,i_a_id=? where  decision_id=?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,registration);
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
			ps.setInt(13,decision_id);

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


