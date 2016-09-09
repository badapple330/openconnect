package com.internousdev.openconnect.decision.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

/**
 * 画面で受け取った更新情報を、DBへ転送する為のクラス
 * @author KENICHI HORIGUCHI
 * @since 2016/09/08
 * @version 1.0
 */
public class DecisionUpdateDAO {
	  /**
     * 更新メソッド  画面で受け取った更新情報を、DBへ転送し、更新する為のメソッド
     * @author KENICHI HORIGUCHI
     */
	public int update(
			String registration, int userId, int projectId, int decisionId,
			String decisionName, String  detail, String iDraftingId,
			String iApprovalId, String aDraftingId, String cdId, String iADId, String iAId ){

		int count = 0;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");

		Connection con = db.getConnection();

		String sql = " UPDATE decision SET "
				+ "registration=?, user_id=?, project_id=?, decision_id =?, decision_name=?, "
				+ "detail=?, i_drafting_id=?, i_approval_id=?, a_drafting_id=?, "
				+ "cd_id=?, i_a_d_id=?, i_a_id =? where  decision_id =?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,registration);
			ps.setInt(2,userId);
			ps.setInt(3,projectId);
			ps.setInt(4,decisionId);
			ps.setString(5,decisionName);
			ps.setString(6,detail);
			ps.setString(7,iDraftingId);
			ps.setString(8,iApprovalId);
			ps.setString(9,aDraftingId);
			ps.setString(10,cdId);
			ps.setString(11,iADId);
			ps.setString(12,iAId);
			ps.setInt(13, decisionId);

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


