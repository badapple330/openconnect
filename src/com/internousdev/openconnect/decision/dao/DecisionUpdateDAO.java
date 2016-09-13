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
			/**
			 *登録日
			 */
			ps.setString(1,registration);
			/**
			 *ユーザーID
			 */
			ps.setInt(2,userId);
			/**
			 *プロジェクトID
			 */
			ps.setInt(3,projectId);
			/**
			 *案件番号
			 */
			ps.setInt(4,decisionId);
			/**
			 *案件名
			 */
			ps.setString(5,decisionName);
			/**
			 *詳細
			 */
			ps.setString(6,detail);
			/**
			 *実施起案番号
			 */
			ps.setString(7,iDraftingId);
			/**
			 *実施決裁番号
			 */
			ps.setString(8,iApprovalId);
			/**
			 *契約起案番号
			 */
			ps.setString(9,aDraftingId);
			/**
			 *契約決番号
			 */
			ps.setString(10,cdId);
			/**
			 *実施兼契約起案番号
			 */
			ps.setString(11,iADId);
			/**
			 *実施兼契約番号
			 */
			ps.setString(12,iAId);
			/**
			 *案件番号
			 */
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


