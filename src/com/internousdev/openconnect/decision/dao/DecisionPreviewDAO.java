/**
 *
 */
package com.internousdev.openconnect.decision.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.openconnect.decision.dto.DecisionDTO;
import com.internousdev.util.DBConnector;

/**
 * @author Hideyuki Nozawa
 * @since 2017/06/19
 * @version 1.0
 *
 */
public class DecisionPreviewDAO {

	public ArrayList<DecisionDTO> decisionPreviewList = new ArrayList<DecisionDTO>();

	public ArrayList<DecisionDTO> nameList = new ArrayList<DecisionDTO>();

	public ArrayList<DecisionDTO> jPremiter1nameList = new ArrayList<DecisionDTO>();

	public ArrayList<DecisionDTO> jPremiter2nameList = new ArrayList<DecisionDTO>();

	public ArrayList<DecisionDTO> jPremiter3nameList = new ArrayList<DecisionDTO>();

	public ArrayList<DecisionDTO> select(int decisionId){

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");
		Connection con = db.getConnection();

		ArrayList<DecisionDTO> decisionPreviewList = new ArrayList<DecisionDTO>();

		String sql = "select * from decision where decision_id=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, decisionId);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				DecisionDTO dto = new DecisionDTO();

				dto.setjDraftUserId(rs.getInt("j_draft_user_id")); // 	実施起案者ユーザーID

				dto.setDecisionType(rs.getString("decision_type")); // 決裁種類

				dto.setDecisionName(rs.getString("decision_name")); // 案件名

				dto.setjImpId(rs.getString("j_imp_id")); // 実施起案番号

				dto.setjDecId(rs.getString("j_dec_id")); // 実施決裁番号

				dto.setSummary(rs.getString("summary")); // 概要

				dto.setCause(rs.getString("cause")); // 理由・目的

				dto.setStartDay(rs.getString("start_day")); // 開始日

				dto.setEndDay(rs.getString("end_day")); // 終了日

				dto.setAmountAll(rs.getFloat("amount_all")); // 合計金額

				dto.setBenefit(rs.getFloat("benefit")); // 損益費用

				dto.setBildCost(rs.getFloat("bild_cost")); // 建設費用

				dto.setProve(rs.getInt("prove")); // 開発端末料

				dto.setRe(rs.getFloat("re")); // リリース環境使用量

				dto.setLine(rs.getInt("line")); // 回線使用料

				dto.setRoom(rs.getFloat("room")); // 施設使用料

				dto.setHuman(rs.getInt("human")); // 開発要員

				dto.setEtc(rs.getFloat("etc")); // 雑費

				dto.setPersons(rs.getInt("persons")); // 人数

				dto.setTotalProve(rs.getInt("total_prove")); // 合計開発端末料

				dto.setTotalRe(rs.getFloat("total_re")); // 合計リリース環境使用料

				dto.setTotalLine(rs.getInt("total_line")); // 合計回線使用料

				dto.setTotalRoom(rs.getFloat("total_room")); // 合計施設使用料

				dto.setTotalHuman(rs.getInt("human")); // 合計開発要員

				dto.setTotalEtc(rs.getFloat("etc")); // 合計雑費

				dto.setjPermiterId1(rs.getInt("j_permiter_id1")); // 	承認者ユーザーID1（リーダー）

				dto.setjPermiterId2(rs.getInt("j_permiter_id2")); // 	承認者ユーザーID2（リーダー）

				dto.setjPermiterId3(rs.getInt("j_permiter_id3")); // 	承認者ユーザーID3（先生）

				decisionPreviewList.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return decisionPreviewList;

	}

	public ArrayList<DecisionDTO> selectByIds(int jDraftUserId) {
		DecisionDTO dto = new DecisionDTO();
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/",
				"openconnect", "root", "mysql");
		Connection con = db.getConnection();
		ArrayList<DecisionDTO> nameList = new ArrayList<DecisionDTO>();
		String sql = "(select * from users where user_id=?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,jDraftUserId);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				dto.setFamilyNameKanji(rs.getString("family_name_kanji")); // 姓（漢字）
				dto.setGivenNameKanji(rs.getString("given_name_kanji")); // 名（漢字）
				nameList.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return nameList;
	}

	public ArrayList<DecisionDTO> selectByjPremiterId1(int jPermiterId1) {
		DecisionDTO dto = new DecisionDTO();
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/",
				"openconnect", "root", "mysql");
		Connection con = db.getConnection();
		ArrayList<DecisionDTO> jPremiter1nameList = new ArrayList<DecisionDTO>();
		String sql = "(select * from users where user_id=?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,jPermiterId1);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				dto.setFamilyNameKanji(rs.getString("family_name_kanji")); // 姓（漢字）
				dto.setGivenNameKanji(rs.getString("given_name_kanji")); // 名（漢字）
				nameList.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return jPremiter1nameList;
	}

	public ArrayList<DecisionDTO> selectByjPremiterId2(int jPermiterId2) {
		DecisionDTO dto = new DecisionDTO();
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/",
				"openconnect", "root", "mysql");
		Connection con = db.getConnection();
		ArrayList<DecisionDTO> jPremiter2nameList = new ArrayList<DecisionDTO>();
		String sql = "(select * from users where user_id=?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,jPermiterId2);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				dto.setFamilyNameKanji(rs.getString("family_name_kanji")); // 姓（漢字）
				dto.setGivenNameKanji(rs.getString("given_name_kanji")); // 名（漢字）
				nameList.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return jPremiter2nameList;
	}

	public ArrayList<DecisionDTO> selectByjPremiterId3(int jPermiterId3) {
		DecisionDTO dto = new DecisionDTO();
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/",
				"openconnect", "root", "mysql");
		Connection con = db.getConnection();
		ArrayList<DecisionDTO> jPremiter3nameList = new ArrayList<DecisionDTO>();
		String sql = "(select * from users where user_id=?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,jPermiterId3);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				dto.setFamilyNameKanji(rs.getString("family_name_kanji")); // 姓（漢字）
				dto.setGivenNameKanji(rs.getString("given_name_kanji")); // 名（漢字）
				nameList.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return jPremiter3nameList;
	}

}
