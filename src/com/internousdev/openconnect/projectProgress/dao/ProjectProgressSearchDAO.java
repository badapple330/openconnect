package com.internousdev.openconnect.projectProgress.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.projectProgress.dto.ProjectProgressDTO;
import com.internousdev.util.DBConnector;

/**
 * 似たようなキーワードをDBから検索する為のクラス
 *
 * @author TATUHUMI ITOU
 * @since 2016/09/04
 * @version 1.0
 */
public class ProjectProgressSearchDAO {

	/**
	 * 抽出メソッド 似たようなキーワードの検索結果情報をリスト化して抽出し、DTOに格納する
	 *
	 * @author TATUHUMI ITOU
	 * @return  searchList 抽出に成功したらSUCCESS、失敗したらERROR
	 */
	public List<ProjectProgressDTO> searchList = new ArrayList<ProjectProgressDTO>();



	public List<ProjectProgressDTO> select(String search) {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
				"mysql");
		Connection con = db.getConnection();

		try {
			String sql = "select*from project_progress inner join projects on project_progress.project_id = projects.project_id WHERE project_name LIKE '%" + search + "%'";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				ProjectProgressDTO dto = new ProjectProgressDTO();
				dto.setProgressId(rs.getInt("progress_id"));
				dto.setProjectId(rs.getInt("project_id"));
				dto.setProjectDay(rs.getString("project_day"));
				dto.setProjectPlan(rs.getString("project_plan"));
				dto.setProjectResult(rs.getString("project_result"));
				dto.setOther(rs.getString("other"));
				dto.setProjectName(rs.getString("project_name"));
				dto.setManagerId(rs.getInt("manager_id"));
				dto.setSubManagerId(rs.getInt("sub_manager_id"));
				dto.setStartDate(rs.getString("start_date"));
				dto.setEndDate(rs.getString("end_date"));
				dto.setNote(rs.getString("note"));
				searchList.add(dto);
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
		return searchList;
	}

	/**
	 * @return  searchList
	 */




}