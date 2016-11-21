package com.internousdev.openconnect.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.dto.GetAddressDTO;
import com.internousdev.util.DBConnector;
/**
 * AdminUserDAO
 * 管理者がユーザーのレビューを管理するクラス
 * @author TATUHUMI ITO
 * @since 2016/08/18
 * @version1.0
 */
public class AdminUserDAO {
	/**
	 * データベースに格納されていユーザーリスト
	 */
	private List<GetAddressDTO>projectList=new ArrayList<GetAddressDTO>();
	/**
	 * DBから必要な情報を集めてくるメソッド
	 * @author TATUHUMI ITOU
	 * @since 2016/08/18
	 */
	public List<GetAddressDTO> select() {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
		Connection con = db.getConnection();

		try {
			String sql="SELECT*FROM project_progress_list ";
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
	/**
	 * ユーザーリスト取得メソッド
	 * @author TATUHUMI ITO
	 * @param UserList
	 */


}