package com.internousdev.openconnect.decision.detail.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.decision.detail.dto.DecisionDetailDTO;
import com.internousdev.util.DBConnector;
/**
 * 決裁手続き一覧から更新したい内容を、DBへ転送する為のクラス
 * @author SOSHI AZUMA
 */
public class DecisionDetailApplicationDAO {



	/**
	 * 表示メソッド  表示したい内容を、DBから取り出しDTOへ転送する為のメソッド
	 */
	public List<DecisionDetailDTO> select(String decisionType, String idNum) {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
		Connection con = null;
		con = db.getConnection();

		String sql = "select * from decision where";

		if(decisionType.equals("実施")) {
			sql = sql + " i_drafting_id like '" + idNum + "%'";
		}
		else if(decisionType.equals("契約")) {
			sql = sql + " a_drafting_id like '" + idNum + "%'";
		}
		else {
			sql = sql + " i_a_d_id like '" + idNum + "%'";
		}

		List<DecisionDetailDTO> idNumList = new ArrayList<DecisionDetailDTO>();

		try {
			PreparedStatement ps = null;
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				DecisionDetailDTO dto = new DecisionDetailDTO();
				dto.setIdNumAmount(rs.getString("i_drafting_id"));
				dto.setIdNumAmount(rs.getString("a_drafting_id"));
				dto.setIdNumAmount(rs.getString("i_a_d_id"));

				idNumList.add( dto );
			  }

			rs.close();
			ps.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return idNumList;
	}







	/**
     * 実施決裁の申請情報更新メソッド  更新したい内容を、DBへ転送する為のメソッド
     */
	public int updateAJ( String iDraftingId, int decisionId ) {

		int count = 0;

		/*if(decisionStatus2 == 1) {
			decisionStatus1 = 2;
		}*/

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");
		Connection con = db.getConnection();

		String sql = "UPDATE decision SET decision_status1 = 1, i_drafting_id = ? where decision_id = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, iDraftingId);
			ps.setInt(2, decisionId);

			count =ps.executeUpdate();

		}catch (SQLException e) {
			e.printStackTrace();
		}finally{

				try {
					con.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}

		}
		return count;
	}



	/**
     * 契約決裁の申請情報更新メソッド  更新したい内容を、DBへ転送する為のメソッド
     */
	public int updateAK( String aDraftingId, int decisionId ) {

		int count = 0;

	/*	if(decisionStatus2 == 1) {
			decisionStatus1 = 2;
		}*/

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");
		Connection con = db.getConnection();

		String sql = "UPDATE decision SET decision_status2 = 1, a_drafting_id = ? where decision_id = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, aDraftingId);
			ps.setInt(2, decisionId);

			count =ps.executeUpdate();

		}catch (SQLException e) {
			e.printStackTrace();
		}finally{

				try {
					con.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}

		}
		return count;
	}



	/**
     * 実施兼契約決裁の申請情報更新メソッド  更新したい内容を、DBへ転送する為のメソッド
     */
	public int updateAJK( String iADId, int decisionId ) {

		int count = 0;

	/*	if(decisionStatus2 == 1) {
			decisionStatus1 = 2;
		}*/

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");
		Connection con = db.getConnection();

		String sql = "UPDATE decision SET decision_status2 = 1, i_a_d_id = ? where decision_id = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, iADId);
			ps.setInt(2, decisionId);

			count =ps.executeUpdate();

		}catch (SQLException e) {
			e.printStackTrace();
		}finally{

				try {
					con.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}

		}
		return count;
	}



}