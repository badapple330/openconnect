package com.internousdev.openconnect.projects.dao;

import com.internousdev.openconnect.projects.dto.ProjectsSearchDTO;
import com.internousdev.util.DBConnector;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;


/**
 * 検索したＤＢ情報をリスト化して抽出し、ＤＴＯに格納するクラス
 *
 * @author YUICHI KIRIU
 * @since 2016/09/07
 */

public class ProjectsSerachDAO {

	 /**
     * 検索したＤＢ情報をリスト化して抽出し、ＤＴＯに格納する
     *
     * @author YUICHI KIRIU
     * @param search
     * @return  searchList
     */

	public List<ProjectsSearchDTO> searchList = new ArrayList<ProjectsSearchDTO>();

    public List<ProjectsSearchDTO> select(String search) {
        DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
                "mysql");
        Connection con = db.getConnection();

        try {
            String sql = "SELECT*FROM projects WHERE project_name LIKE '%" + search + "%'";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
            	ProjectsSearchDTO dto = new ProjectsSearchDTO();

            	dto.setProjectId(rs.getInt("project_id"));
            	dto.setProjectName(rs.getString("project_name"));
            	dto.setStartDate(rs.getString("start_date"));
            	dto.setEndDate(rs.getString("end_date"));
            	dto.setNote(rs.getString("note"));
            	dto.setManagerId(rs.getInt("manager_id"));
            	dto.setSubManagerId(rs.getInt("sub_manager_id"));
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

}
