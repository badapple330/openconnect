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
     * 実施決裁の先生承認時メソッド  承認による値の更新と承認者ID3の登録をする為のメソッド
     */
	public int updateJ( String iApprovalId, int permitUserId3, int decisionId ) {

		int count = 0;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();
		String sql = "update decision set decision_type = '契約', decision_status1 = 2, permit_status = 0, i_approval_id = ?, permit_user_id3 = ? where decision_id = ?";

		try{
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, iApprovalId);
			ps.setInt(2, permitUserId3);
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
     * 契約決裁の先生承認時メソッド  承認による値の更新と承認者ID3の登録をする為のメソッド
     */
	public int updateK( String cdId, int permitUserId3, int decisionId ) {

		int count = 0;
		//updateK( cdId, permitUserId3, decisionId );//DAOでpermitStatusを０にする＋decisionStatus2を２にする
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();
		String sql = "update decision set decision_status2 = 2, permit_status = 0, cd_id = ?, permit_user_id3 = ? where decision_id = ?";

		try{
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, cdId);
			ps.setInt(2, permitUserId3);
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
     * 契約決裁の先生承認時メソッド  承認による値の更新と承認者ID3の登録をする為のメソッド
     */
	public int updateJK( String iAId, int permitUserId3, int decisionId ) {

		int count = 0;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();
		String sql = "update decision set decision_status2 = 2, permit_status = 0, i_a_id = ?, permit_user_id3 = ? where decision_id = ?";

		try{
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, iAId);
			ps.setInt(2, permitUserId3);
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
     * リーダー承認時メソッド  承認による値の更新と承認者ID1及び2の登録をする為のメソッド
     */
	public int update( int permitStatus, int permitUserId1, int permitUserId2, int decisionId ) {

		int count = 0;
//update(permitStatus, permitUserId1, permitUserId2, decisionId);
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();
		String sql = "update decision set permit_status = ?, permit_user_id1 = ?, permit_user_id2 = ? where decision_id = ?";

		try{
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setInt(1, permitStatus);
			ps.setInt(2, permitUserId1);
			ps.setInt(3, permitUserId2);
			ps.setInt(4, decisionId);

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
