package com.internousdev.openconnect.decision.detail.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;
/**
 * 決裁手続き一覧から更新したい内容を、DBへ転送する為のクラス
 * @author TATSUHUMI ITOU
 */
public class DecisionDetailApplicationDAO{
	 /**
     * 更新メソッド  更新したい内容を、DBへ転送する為のメソッド
     */
	public int update(String decisionStatus,int decisionId){
		int count = 0;
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");
		Connection con = db.getConnection();

		String sql = "UPDATE decision SET decision_status = ? where decision_id = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,decisionStatus);
			ps.setInt(2,decisionId);
			count =ps.executeUpdate();

		}catch (SQLException e) {
			e.printStackTrace();
		}finally{

				try {
					con.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}

		}
		return count;
	}
}