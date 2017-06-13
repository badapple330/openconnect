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
 *
 * @author KOTA MIYAZATO
 *
 */

public class DecisionDAO {

	/**
	 * 決裁手続きの情報をリスト化
	 *
	 */
	public ArrayList<DecisionDTO> decisionList = new ArrayList<DecisionDTO>();

	public ArrayList<DecisionDTO> nameList = new ArrayList<DecisionDTO>();

	/**
	 * 情報を引き出すメソッド
	 *
	 * @param
	 * @return Decision
	 */
	public ArrayList<DecisionDTO> select() {

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");
		Connection con = db.getConnection();

		ArrayList<DecisionDTO> decisionList = new ArrayList<DecisionDTO>();

		String sql = "select * from decision";

		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				DecisionDTO dto = new DecisionDTO();

				dto.setUserId(rs.getInt("user_id")); // ユーザーID

				dto.setDecisionName(rs.getString("decision_name")); // 案件名

				dto.setIDraftingId(rs.getString("i_drafting_id")); // 実施起案番号

				dto.setIApprovalId(rs.getString("i_approval_id")); // 実施決裁番号

				dto.setADraftingId(rs.getString("a_drafting_id")); // 契約起案番号

				dto.setCdId(rs.getString("cd_id")); // 契約決裁番号

				dto.setIADId(rs.getString("i_a_d_id")); // 実施兼契約起案番号

				dto.setIAId(rs.getString("i_a_id")); // 実施兼契約番号

				dto.setHead(rs.getString("head")); // 頭紙文章

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

				decisionList.add(dto);

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
		return decisionList;

	}

	/**
	 * ユーザーIDから名前を引き出すメソッド
	 *
	 * @param userId
	 * @param
	 * @return Decision
	 */
	public ArrayList<DecisionDTO> selectByUserId(int userId) {
		DecisionDTO dto = new DecisionDTO();
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/",
				"openconnect", "root", "mysql");
		Connection con = db.getConnection();
		ArrayList<DecisionDTO> nameList = new ArrayList<DecisionDTO>();
		String sql = "select * from users";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				dto.setUserId(rs.getInt("user_id")); // ユーザーID
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

	/**
	 * 表示メソッド 表示したい内容を、DBから取り出しDTOへ転送する為のメソッド
	 *
	 * @author TATUHUMI ITOU
	 * @param etc
	 * @param human
	 * @param room
	 * @param line
	 * @param re
	 * @param prove
	 * @return projectList 抽出に成功したらSUCCESS、失敗したらERROR
	 */

	public int update(int userId, String decisionName, String iDraftingId, String summary, String cause,
			String startDay, String endDay, String iApprovalId, String aDraftingId, String cdId, String iADId,
			String iAId, String head, float amountAll, float benefit, float bildCost, int prove, float re, int line,
			float room, int human, float etc) {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");
		Connection con = db.getConnection();
		int count = 0;
		String sql = "UPDATE decision SET user_id=?,dicision_name=?,i_drafting_id=?,summary=?,cause=?,start_day=?,end_day=? ,"
				+ "i_approve_id,=? ,a_drafting_id=?,cd_id=? ,i_a_d_id=?,i_a_id=?, head=?, amount_all=?,benefit=?, bild_cost=? ";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, userId);
			ps.setString(2, decisionName);
			ps.setString(3, iDraftingId);
			ps.setString(4, summary);
			ps.setString(5, cause);
			ps.setString(6, startDay);
			ps.setString(7, endDay);
			ps.setString(8, iApprovalId);
			ps.setString(9, aDraftingId);
			ps.setString(10, cdId);
			ps.setString(11, iADId);
			ps.setString(12, head);
			ps.setFloat(13, amountAll);
			ps.setFloat(14, benefit);
			ps.setFloat(15, bildCost);

			count = ps.executeUpdate();

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
