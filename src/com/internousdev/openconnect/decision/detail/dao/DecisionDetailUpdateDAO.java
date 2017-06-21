/**
 *
 */
package com.internousdev.openconnect.decision.detail.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;


/**
 * 画面で追加した一覧情報をDBへ転送する為のクラス
 * @author SOSHI AZUMA
 * @since 2017/06/16
 * @version 1.0
 */
public class DecisionDetailUpdateDAO {


	/**
     * 差し戻しボタン押下時メソッド  差し戻しによる値の更新する為のメソッド
     */
	public int remand( String decisionType, int permitStatus, int decisionId ) {

		int count = 0;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection con = db.getConnection();
		String sql = "update decision set permit_status = ?";

		if(decisionType.equals("実施")) {
			sql = sql + ", decision_status1 = 0 where decision_id = ?";
		}
		else {
			sql = sql + ", decision_status2 = 0 where decision_id = ?";
		}

		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, permitStatus);
			ps.setInt(2, decisionId);

			count = ps.executeUpdate();


		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return count;

	}



	/**
     * 却下ボタン押下時メソッド  却下による値の更新する為のメソッド
     */
	public int reject( String decisionType, int decisionId ) {

		int count1 = 0;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection con = db.getConnection();
		String sql = "update decision set permit_status = 0";

		if(decisionType.equals("実施")) {
			sql = sql + ", decision_status1 = 3 where decision_id = ?";
		}
		else {
			sql = sql + ", decision_status2 = 3 where decision_id = ?";
		}

		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, decisionId);

			count1 = ps.executeUpdate();


		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return count1;

	}


}
