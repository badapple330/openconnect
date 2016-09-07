package com.internousdev.openconnect.decision.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.decision.dto.DecisionDisplayDTO;
import com.internousdev.util.DBConnector;

public class DecisionDisplayDAO {

	private List<DecisionDisplayDTO> DecisiontList = new ArrayList<DecisionDisplayDTO>();

	public List<DecisionDisplayDTO> select() {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
		Connection con = db.getConnection();

		try {
			String sql="SELECT * FROM decision";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				DecisionDisplayDTO dto = new DecisionDisplayDTO();

				dto.setRegistration(rs.getDate("registration"));
				dto.setUser_id(rs.getInt("user_id"));
				dto.setProject_id(rs.getInt("project_id"));
				dto.setDecision_id(rs.getInt("decision_id"));
				dto.setDecision_name(rs.getString("decision_name"));
				dto.setDetail(rs.getString("detail"));
				dto.setI_drafting_id(rs.getString("i_drafting_id"));
				dto.setI_approval_id(rs.getString("i_approval_id"));
				dto.setA_drafting_id(rs.getString("a_drafting_id"));
				dto.setCd_id(rs.getString("cd_id"));
				dto.setI_a_d_id(rs.getString("i_a_d_id"));
				dto.setI_a_id(rs.getString("i_a_id"));

				DecisiontList.add(dto);
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
