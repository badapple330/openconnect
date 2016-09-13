package com.internousdev.openconnect.decision.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.openconnect.decision.dto.DecisionDTO;
import com.internousdev.util.DBConnector;

public class DecisionSelectDAO {
	/**
	 * ユーザー一覧情報を格納するリスト
	 */
	private ArrayList<DecisionDTO> list = new ArrayList<DecisionDTO>();

	/**
	 * 画面にユーザー情報一覧を表示させる為のメソッド
	 * @return result データベースからのユーザー一覧情報を格納できたか否か
	 * @throws SQLException
	 */
	public boolean select(String searchString ) {
		boolean result = false;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();

		String sql = "select * from decision where decision_name like'%" + searchString + "%'";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				DecisionDTO dto = new DecisionDTO();
				/**
				 *登録日
				 */
				dto.setRegistration(rs.getString("registration"));
				/**
				 *ユーザーID
				 */
				dto.setUserId(rs.getInt("user_id"));
				/**
				 *プロジェクトID
				 */
				dto.setProjectId(rs.getInt("project_id"));
				/**
				 *案件名
				 */
				dto.setDecisionId(rs.getInt("decision_id"));
				/**
				 *詳細
				 */
				dto.setDecisionName(rs.getString("decision_name"));
				/**
				 *実施起案番号
				 */
				dto.setDetail(rs.getString("detail"));
				/**
				 *実施決裁番号
				 */
				dto.setIDraftingId(rs.getString("i_drafting_id"));
				/**
				 *実施起案番号
				 */
				dto.setIApprovalId(rs.getString("i_approval_id"));
				/**
				 *契約起案番号
				 */
				dto.setADraftingId(rs.getString("a_drafting_id"));
				/**
				 *契約決番号
				 */
				dto.setCdId(rs.getString("cd_id"));
				/**
				 *実施兼契約起案番号
				 */
				dto.setIADId(rs.getString("i_a_d_id"));
				/**
				 *実施兼契約番号
				 */
				dto.setIAId(rs.getString("i_a_id"));
				list.add(dto);
				result = true;
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try{
				conn.close();
			}catch (SQLException e){
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * 取得メソッド
	 * @author KENICHI HORIGUCHI
	 * @return list
	 */
	public ArrayList<DecisionDTO> getList() {
		return list;
	}

	/**
	 * 設定メソッド
	 * @author KENICHI HORIGUCHI
	 * @param list
	 */
	public void setList(ArrayList<DecisionDTO> list) {
		this.list = list;
	}

}
