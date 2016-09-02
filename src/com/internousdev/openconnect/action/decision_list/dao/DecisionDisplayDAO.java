package com.internousdev.openconnect.action.decision_list.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.action.decision_list.dto.DecisionDisplayDTO;
import com.internousdev.util.DBConnector;

public class DecisionDisplayDAO {

	private List<DecisionDisplayDTO>DecisiontList=new ArrayList<DecisionDisplayDTO>();

	public List<DecisionDisplayDTO> select() {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
		Connection con = db.getConnection();

		try {
			String sql="SELECT*FROM decision";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				DecisionDisplayDTO dto = new DecisionDisplayDTO();

				dto.setRegistration(rs.getInt("Registration"));
				dto.setUser(rs.getString("user"));
				dto.setProjectLst(rs.getString("project_list"));
				dto.setProjectId(rs.getString("project_id"));
				dto.setProjectName(rs.getString("project_name"));
				dto.setDetail(rs.getString("detail"));
				dto.setIDraftingId(rs.getString("i_drafting_id"));
				dto.setIApprovalId(rs.getString("i_approval_id"));
				dto.setADraftingId(rs.getString("a_drafting_id"));
				dto.setCdId(rs.getString("cd_id"));
				dto.setIADId(rs.getString("i_a_d_id"));
				dto.setIAId(rs.getString("i_a_id"));

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


}
