package com.internousdev.openconnect.projectProgress.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.projectProgress.dto.GetAddressDTO;
import com.internousdev.util.DBConnector;

public class ProjectProgressDAO {

	private List<GetAddressDTO>projectList=new ArrayList<GetAddressDTO>();

	public List<GetAddressDTO> select() {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
		Connection con = db.getConnection();

		try {
			String sql="SELECT*FROM project_progress";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				GetAddressDTO dto = new GetAddressDTO();
				dto.setProjectId(rs.getInt("project_id"));
				dto.setProjectDay(rs.getString("project_day"));
				dto.setProject(rs.getString("project"));
				dto.setProjectPlan(rs.getString("project_plan"));
				dto.setProjectResult(rs.getString("project_result"));
				dto.setOther(rs.getString("other"));

				projectList.add(dto);
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
		return projectList;
	}



}