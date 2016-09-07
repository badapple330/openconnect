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
 * 表示したい内容を、DBから取り出しDTOへ転送する為のクラス
 * @author TATUHUMI ITOU
 * @since 2016/09/04
 * @version 1.0
 */
public class ProjectProgressDAO {

	private List<ProjectProgressDTO>projectList=new ArrayList<ProjectProgressDTO>();
	 /**
     * 表示メソッド  表示したい内容を、DBから取り出しDTOへ転送する為のメソッド
     * @author TATUHUMI ITOU
     * @return  projectList 抽出に成功したらSUCCESS、失敗したらERROR
     */
	public List<ProjectProgressDTO> select() {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
		Connection con = db.getConnection();

		try {
			String sql="select*from project_progress inner join projects on project_progress.project_id = projects.project_id";
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
	/**
	* 取得メソッド
	* @author KOHEI NITABARU
	* @return projectList
	*/
	public List<ProjectProgressDTO> getProjectList() {
		return projectList;
	}
	/**
	* 設定メソッド
	* @author KOHEI NITABARU
	* @param projectList
	*/
	public void setProjectList(List<ProjectProgressDTO> projectList) {
		this.projectList = projectList;
	}


}