/**
 *
 */
package com.internousdev.openconnect.decision.detail.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

/**
 * 却下ボタン押下時に決裁のDB情報を更新するクラス
 * @author SOSHI AZUMA
 * @since 2017/06/21
 * @version 1.0
 */
public class DecisionDetailRejectDAO {

	/**
     * 却下ボタン押下時メソッド  却下による値の更新をする為のメソッド
     */
	public int reject( String decisionType, int decisionId ) {

		int count = 0;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection con = db.getConnection();
		String sql = "";

		if(decisionType.equals("実施")) {
			sql = "update decision set permit_statusJ = 0, j_apply_day = null, decision_status = 2, j_imp_id = null, j_permiter_id1 = null, j_permiter_id2 = null where decision_id = ?";
		}
		else {
			sql = "update decision set permit_statusK = 0, k_apply_day = null, decision_status = 2, k_imp_id = null, k_permiter_id1 = null, k_permiter_id2 = null where decision_id = ?";
		}

		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, decisionId);

			count = ps.executeUpdate();

		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return count;

	}

}
