package com.internousdev.openconnect.projects.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.projects.dto.ProjectSearchDTO;
import com.internousdev.util.DBConnector;

public class ProjectSerachDAO {

	public List<ProjectSearchDTO> searchList = new ArrayList<ProjectSearchDTO>();



    public List<ProjectSearchDTO> select(String search) {
        DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
                "mysql");
        Connection con = db.getConnection();

        try {
            String sql = "SELECT*FROM project WHERE project_name LIKE '%" + search + "%'";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
            	ProjectSearchDTO dto = new ProjectSearchDTO();

            	dto.setUserId(rs.getString("user_id"));
            	dto.setProjectName(rs.getString("project_name"));
            	dto.setManager(rs.getString("manager"));
            	dto.setSubManager(rs.getString("sub_manager"));
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
     * @return selectList
     */




}
