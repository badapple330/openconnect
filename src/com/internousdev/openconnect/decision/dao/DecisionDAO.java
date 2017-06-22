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

/**
 * @author internousdev
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

				dto.setjImpId(rs.getString("j_imp_id")); // 実施起案番号

				dto.setjDecId(rs.getString("j_dec_id")); // 実施決裁番号

				dto.setkImpId(rs.getString("k_imp_id")); // 契約起案番号

				dto.setkDecId(rs.getString("k_dec_id")); // 契約決裁番号

				dto.setJkImpId(rs.getString("jk_imp_id")); // 実施兼契約起案番号

				dto.setJkDecId(rs.getString("jk_dec_id")); // 実施兼契約決裁番号

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

				dto.setTotalHuman(rs.getInt("total_human")); // 合計開発要員

				dto.setTotalEtc(rs.getFloat("total_etc")); // 合計雑費

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
	 * @return
	 */

	/**
	 * 決裁手続きの情報アップデート
	 *
	 */

	public int update(String decisionName,String summary,String cause,String startDay,String endDay,int persons,int totalProve,float totalRe,int totalLine,float totalRoom,int totalHuman,float totalEtc,float benefit,float bildCost,float amountAll) {
		int count = 0;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");
		Connection con = db.getConnection();

		String sql = "update decision set decision_name=?, summary=?, cause=?, start_day=?, end_day=?, persons=?, total_prove=?,"
				+ "total_re=?, total_line=?, total_room=?, total_human=?, total_etc=?, benefit=?, bild_cost=?, amount_all=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, decisionName);
			ps.setString(2, summary);
			ps.setString(3, cause);
			ps.setString(4, startDay);
			ps.setString(5, endDay);
			ps.setInt(6, persons);
			ps.setInt(7, totalProve);
			ps.setFloat(8, totalRe);
			ps.setInt(9, totalLine);
			ps.setFloat(10, totalRoom);
			ps.setInt(11, totalHuman);
			ps.setFloat(12, totalEtc);
			ps.setFloat(13, benefit);
			ps.setFloat(14, bildCost);
			ps.setFloat(15, amountAll);





            count = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(con!=null){
				try{
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		}
		return count;
		}


}











