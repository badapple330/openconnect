package com.internousdev.openconnect.decision.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.decision.dto.DecisionDTO;
import com.internousdev.util.DBConnector;

public class DecisionDisplayDAO {

	private List<DecisionDTO> DecisiontList = new ArrayList<DecisionDTO>();

	public List<DecisionDTO> select() {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
		Connection con = db.getConnection();

		try {
			String sql="SELECT * FROM decision";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			System.err.println(rs);
			while (rs.next()) {
				DecisionDTO dto = new DecisionDTO();

				dto.setRegistration(rs.getDate("registration"));
				dto.setUserId(rs.getInt("user_id"));
				dto.setProjectId(rs.getInt("project_id"));
				dto.setDecisionId(rs.getInt("decision_id"));
				dto.setDecisionName(rs.getString("decision_name"));
				dto.setDetail(rs.getString("detail"));
				dto.setiDraftingId(rs.getString("i_drafting_id"));
				dto.setiApprovalId(rs.getString("i_approval_id"));
				dto.setaDraftingId(rs.getString("a_drafting_id"));
				dto.setCdId(rs.getString("cd_id"));
				dto.setiADId(rs.getString("i_a_d_id"));
				dto.setiAId(rs.getString("i_a_id"));

				DecisiontList.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("1");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("2");
			}
		}
		return DecisiontList;
	}

	/**
	 * 取得メソッド
	 * @author KENICHI HORIGUCHI
	 * @return DecisiontList
	 */
	public List<DecisionDisplayDTO> getDecisiontList() {
		return DecisiontList;
	}

	/**
	 * 設定メソッド
	 * @author KENICHI HORIGUCHI
	 * @param decisiontList
	 */
	public void setDecisiontList(List<DecisionDisplayDTO> decisiontList) {
		DecisiontList = decisiontList;
	}



}
