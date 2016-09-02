package com.internousdev.openconnect.projectList.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.projectList.dto.ProjectListDTO;
import com.internousdev.util.DBConnector;

public class ProjectListDAO {
	    /**
	     * 抽出メソッド ログインした際にDBからサイト情報をリスト化して抽出し、DTOに格納する
	     *
	     * @author YUKI MAEDA
	     * @return articleList 抽出に成功したらSUCCESS、失敗したらERROR
	     */
	    public List<ProjectListDTO> projectList = new ArrayList<ProjectListDTO>();


	    public List<ProjectListDTO> select() {

	        DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
	                "mysql");
	        Connection con = db.getConnection();

	        try {
	            String sql = "SELECT*FROM project";
	            PreparedStatement ps = con.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();

	            while (rs.next()) {
	            	ProjectListDTO dto = new ProjectListDTO();

	            	dto.setUserId(rs.getString("user_id"));
	            	dto.setProjectName(rs.getString("project_name"));
	            	dto.setManager(rs.getString("manager"));
	            	dto.setSubManager(rs.getString("sub_manager"));
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


		public List<ProjectListDTO> getProjectList() {
			return projectList;
		}


		public void setProjectList(List<ProjectListDTO> projectList) {
			this.projectList = projectList;
		}





	}
