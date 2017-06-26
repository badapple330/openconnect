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
		String sql = "update decision set permit_status = 0";

		if(decisionType.equals("実施")) {
			sql = sql + ", decision_status1 = 3 where decision_id = ?";
		}
		else {
			sql = sql + ", decision_status2 = 3 where decision_id = ?";
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
