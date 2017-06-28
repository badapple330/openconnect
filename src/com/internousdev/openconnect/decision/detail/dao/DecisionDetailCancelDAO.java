/**
 *
 */
package com.internousdev.openconnect.decision.detail.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

/**
 * 申請取り消しボタン押下時に決裁のDB情報を更新するクラス
 * @author SOSHI AZUMA
 * @since 2017/06/23
 * @version 1.0
 */
public class DecisionDetailCancelDAO {


	/**
     * 申請取り消しボタン押下時メソッド  申請取り消しによる値の更新をする為のメソッド
     */
	public int cancel(int decisionStatus, int decisionId ) {

		int count = 0;

		if(decisionStatus == 3) {
			decisionStatus = 0;
		}
		else {
			decisionStatus = 5;
		}

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection con = db.getConnection();
		String sql = "update decision set decision_status = ? where decision_id = ?";


		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, decisionStatus);
			ps.setInt(2, decisionId);

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
