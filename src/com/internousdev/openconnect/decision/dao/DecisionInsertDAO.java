/**
 *
 */
package com.internousdev.openconnect.decision.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import com.internousdev.util.DBConnector;

/**
 * @author MASAHIRO KEDSUKA
 *
 */
public class DecisionInsertDAO {
	/**
	 * 更新メソッド  画面で受け取った更新情報を、DBへ転送し、更新する為のメソッド
	 * @author KENICHI HORIGUCHI,KOUHEI NITABARU
	 */
	public int insert(
			String day, int userId, int projectId, String projectName, String summary){

		int count = 0;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");

		Connection con = db.getConnection();

		String sql = "insert into decision(registration, user_id, project_id, decision_name, detail, i_drafting_id, i_approval_id, a_drafting_id, cd_id, i_a_d_id, i_a_id)values(?,?,?,?,?,?,?,?,?,?,?)";
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd");
		day = sdf.format(System.currentTimeMillis());

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,day);
			ps.setInt(2,userId);
			ps.setInt(3,projectId);
			ps.setString(4,projectName);
			ps.setString(5,summary);
			ps.setString(6,"-");
			ps.setString(7,"-");
			ps.setString(8,"-");
			ps.setString(9,"-");
			ps.setString(10,"-");
			ps.setString(11,"-");
			count = ps.executeUpdate();

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
