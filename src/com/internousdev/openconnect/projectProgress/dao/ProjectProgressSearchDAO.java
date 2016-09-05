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
 * AdminReviewDAO レビュー情報に接続する為のクラス
 *
 * @author YUKI MAEDA
 * @since 2016/08/18
 * @version 1.0
 */
public class ProjectProgressSearchDAO {

    /**
     * 抽出メソッド ログインした際にDBからサイト情報をリスト化して抽出し、DTOに格納する
     *
     * @author YUKI MAEDA
     * @return articleList 抽出に成功したらSUCCESS、失敗したらERROR
     */
    public List<ProjectProgressDTO> searchList = new ArrayList<ProjectProgressDTO>();



    public List<ProjectProgressDTO> select(String search) {
        DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root",
                "mysql");
        Connection con = db.getConnection();

        try {
            String sql = "SELECT*FROM project_progress WHERE project LIKE '%" + search + "%'";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
            	ProjectProgressDTO dto = new ProjectProgressDTO();

            	dto.setProjectId(rs.getInt("project_id"));
            	dto.setProjectDay(rs.getString("project_day"));
            	dto.setProject(rs.getString("project"));
            	dto.setProjectPlan(rs.getString("project_plan"));
            	dto.setProjectResult(rs.getString("project_result"));
            	dto.setOther(rs.getString("other"));
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