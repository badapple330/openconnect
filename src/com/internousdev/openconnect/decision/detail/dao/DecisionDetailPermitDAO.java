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
public class DecisionDetailPermitDAO {
	 /**
     * 挿入メソッド  画面で受け取った追加情報を、DBへ転送し、追加する為のメソッド
     * @author SOHI AZUMA
     */
	public int update1(int permitStatus, int decisionStatus1, int decisionStatus2, String decisionType, int permitUserId1, int decisionId) {

		int count = 0;
		if(decisionStatus1 == 2) {
			decisionType = "契約";
		}


		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();
		String sql = "update decision set permit_status = ?, decision_status1 = ?, decision_status2 = ?, decision_type = ?, permit_user_id1 = ? where decision_id = ?";
		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,permitStatus);
			ps.setInt(2,decisionStatus1);
			ps.setInt(3,decisionStatus2);
			ps.setString(4,decisionType);
			ps.setInt(5,permitUserId1);
			ps.setInt(6,decisionId);
			count = ps.executeUpdate();


		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try{
				conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return count;

	}


	/**
     * 挿入メソッド  画面で受け取った追加情報を、DBへ転送し、追加する為のメソッド
     * @author SOHI AZUMA
     */
	public int updateP2(int permitStatus, int decisionStatus1, int decisionStatus2, String decisionType, int permitUserId2, int decisionId) {

		int count = 0;
		if(decisionStatus1 == 2) {
			decisionType = "契約";
		}


		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();
		String sql = "update decision set permit_status = ?, decision_status1 = ?, decision_status2 = ?, decision_type = ?, permit_user_id2 = ? where decision_id = ?";
		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,permitStatus);
			ps.setInt(2,decisionStatus1);
			ps.setInt(3,decisionStatus2);
			ps.setString(4,decisionType);
			ps.setInt(5,permitUserId2);
			ps.setInt(6,decisionId);
			count = ps.executeUpdate();


		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try{
				conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return count;

	}


	/**
     * 挿入メソッド  画面で受け取った追加情報を、DBへ転送し、追加する為のメソッド
     * @author SOHI AZUMA
     */
	public int updateP3(int permitStatus, int decisionStatus1, int decisionStatus2, String decisionType, int permitUserId3, int decisionId) {

		int count = 0;
		if(decisionStatus1 == 2) {
			decisionType = "契約";
		}


		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();
		String sql = "update decision set permit_status = ?, decision_status1 = ?, decision_status2 = ?, decision_type = ?, permit_user_id3 = ? where decision_id = ?";
		try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,permitStatus);
			ps.setInt(2,decisionStatus1);
			ps.setInt(3,decisionStatus2);
			ps.setString(4,decisionType);
			ps.setInt(5,permitUserId3);
			ps.setInt(6,decisionId);
			count = ps.executeUpdate();


		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try{
				conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return count;

	}

}
