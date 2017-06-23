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
     * 実施決裁の先生承認時メソッド  承認による値の更新と実施_承認者ID(3人目:先生)の登録をする為のメソッド
     */
	public int updatePJ( String jDecId, int jpermiterId3, int decisionId ) {

		int count = 0;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();
		String sql = "update decision set decision_type = '契約', decision_status1 = 2, permit_status = 0, j_dec_id = ?, j_permiter_id3 = ? where decision_id = ?";

		try{
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, jDecId);
			ps.setInt(2, jpermiterId3);
			ps.setInt(3, decisionId);

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
     * 契約決裁の先生承認時メソッド  承認による値の更新と契約_承認者ID(3人目:先生)の登録をする為のメソッド
     */
	public int updatePK( String kDecId, int kPermiterId3, int decisionId ) {

		int count = 0;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();
		String sql = "update decision set decision_status2 = 2, permit_status = 0, k_dec_id = ?, k_permiter_id3 = ? where decision_id = ?";

		try{
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, kDecId);
			ps.setInt(2, kPermiterId3);
			ps.setInt(3, decisionId);

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
     * 実施兼契約決裁の先生承認時メソッド  承認による値の更新と実施兼契約_承認者ID(3人目:先生)の登録をする為のメソッド
     */
	public int updatePJK( String jkDecId, int jkPermiterId3, int decisionId ) {

		int count = 0;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();
		String sql = "update decision set decision_status2 = 2, permit_status = 0, jk_dec_id = ?, jk_permiter_id3 = ? where decision_id = ?";

		try{
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, jkDecId);
			ps.setInt(2, jkPermiterId3);
			ps.setInt(3, decisionId);

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
     * リーダー承認時メソッド  承認による値の更新と承認者ID(リーダー)の登録をする為のメソッド
     */
	public int updateP( String decisionType, int permitStatus, int userId, int decisionId ) {

		int count = 0;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection con = db.getConnection();
		String sql = "update decision set permit_status = ?";

		if(decisionType.equals("実施")) {
			if(permitStatus == 1) {
			sql = sql + ", j_permiter_id1 = ? where decision_id = ?";
			}
			if(permitStatus == 2) {
			sql = sql + ", j_permiter_id2 = ? where decision_id = ?";
			}
		}
		else {
			if(permitStatus == 1) {
			sql = sql + ", k_permiter_id1 = ? where decision_id = ?";
			}
			if(permitStatus == 2) {
			sql = sql + ", k_permiter_id2 = ? where decision_id = ?";
			}
		}

		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, permitStatus);

			if(decisionType.equals("実施")) {
				if(permitStatus == 1) {
					int jPermiterId1 = userId;
					ps.setInt(2, jPermiterId1);
				}
				if(permitStatus == 2) {
					int jPermiterId2 = userId;
					ps.setInt(2, jPermiterId2);
				}
			}
			else {
				if(permitStatus == 1) {
					int kPermiterId1 = userId;
					ps.setInt(2, kPermiterId1);
				}
				if(permitStatus == 2) {
					int kPermiterId2 = userId;
					ps.setInt(2, kPermiterId2);
				}
			}
			ps.setInt(3, decisionId);

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


}
