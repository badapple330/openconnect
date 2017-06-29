/**
 *
 */
package com.internousdev.openconnect.decision.detail.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import com.internousdev.util.DBConnector;

/**
 * [変更申請]決裁手続き一覧から更新したい内容を、DBへ転送する為のクラス
 * @author SOSHI AZUMA
 * @since 2017/06/28
 * @version 1.0
 */
public class DecisionDetailChangeDAO {

	/**
     * [変更申請]起案番号発行を伴わない申請時の情報更新メソッド  更新したい内容を、DBへ転送する為のメソッド
     */
	public int change( String decisionType, int decisionId ) {

		SimpleDateFormat sdf = new SimpleDateFormat("YYYY年MM月dd日");
		String applyDay = sdf.format(System.currentTimeMillis());
		int count = 0;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");
		Connection con = db.getConnection();

		String sql;

		if(decisionType.equals("実施")) {
			sql = "UPDATE decision SET decision_status = 4, decision_type = '実施', k_apply_day = null, j_drafter_id = null, k_drafter_id = null"
					+", j_permiter_id1 = null, j_permiter_id2 = null, j_permiter_id3 = null, k_permiter_id1 = null, k_permiter_id2 = null, k_permiter_id3 = null"
					+", j_apply_day = ? where decision_id = ?";
		}
		else {
			sql = "UPDATE decision SET decision_status = 4, k_apply_day = ? where decision_id = ?";
		}

		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, applyDay);
			ps.setInt(1, decisionId);

			count =ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

				try {
					con.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}

		}
		return count;
	}



}