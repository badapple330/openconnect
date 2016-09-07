package com.internousdev.openconnect.projects.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.projects.dto.ProjectsListDTO;
import com.internousdev.util.DBConnector;

public class ProjectsListDAO {
	    /**
	     * 表示メソッド ログインした際にDBからサイト情報をリスト化して抽出し、DTOに格納する
	     *
	     * @author YUICHI KIRIU
	     * @return  ProjectsList抽出に成功したらSUCCESS、失敗したらERROR
	     */
	    public List<ProjectsListDTO> projectList = new ArrayList<ProjectsListDTO>();


	    public List<ProjectsListDTO> select() {

	        DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
	                "mysql");
	        Connection con = db.getConnection();

	        try {
	            String sql = "SELECT*FROM projects";
	            PreparedStatement ps = con.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();

	            while (rs.next()) {
	            	ProjectsListDTO dto = new ProjectsListDTO();

	            	dto.setProjectId(rs.getString("project_id"));
	            	dto.setProjectName(rs.getString("project_name"));
	            	dto.setManagerName(rs.getString("manager_name"));
	            	dto.setSubManagerName(rs.getString("sub_manager_name"));
	            	dto.setStartDate(rs.getString("start_date"));
	            	dto.setEndDate(rs.getString("end_date"));
	            	dto.setNote(rs.getString("note"));
	            	dto.setManagerId(rs.getString("manager_id"));
	            	dto.setSubManagerId(rs.getString("sub_manager_id"));
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
		* @author YUICHI KIRIU
		* @return projectList
		*/
		public List<ProjectsListDTO> getProjectList() {
			return projectList;
		}

		/**
		* 設定メソッド
		* @author YUICHI KIRIU
		* @param projectList
		*/
		public void setProjectList(List<ProjectsListDTO> projectList) {
			this.projectList = projectList;
		}

	}