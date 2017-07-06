/**
 *
 */
package com.internousdev.openconnect.decision.detail.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.openconnect.decision.dto.DecisionDTO;
import com.internousdev.util.DBConnector;

/**
 * @author ShouheiKato
 * @since 2017/07/03
 *
 */
public class DecisionArchiveDAO {

	ArrayList<DecisionDTO> archiveList =new ArrayList<DecisionDTO>();

	public ArrayList<DecisionDTO> archive(int projectId, String projectName, String decisionType) {

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection con = db.getConnection();

		String sql ="select projects.project_id, projects.project_name, decision.decision_type from projects"
				+ " left outer join decision on projects.project_id = decision.decision_id";

		try {

			PreparedStatement ps = null;
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				DecisionDTO dto = new DecisionDTO();
				dto.setProjectId(rs.getInt("project_id"));
				dto.setProjectName(rs.getString("project_name"));
				dto.setDecisionType(rs.getString("decision_type"));

				archiveList.add(dto);
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

		return archiveList;
	}


}
