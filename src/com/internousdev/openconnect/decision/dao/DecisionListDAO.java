package com.internousdev.openconnect.decision.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.openconnect.decision.dto.DecisionListDTO;
import com.internousdev.util.DBConnector;

public class DecisionListDAO {
	/**
	 * ユーザー一覧情報を格納するリスト
	 */
	private ArrayList<DecisionListDTO> list = new ArrayList<DecisionListDTO>();

	/**
	 * 画面にユーザー情報一覧を表示させる為のメソッド
	 *
	 * @return result データベースからのユーザー一覧情報を格納できたか否か
	 * @throws SQLException
	 */
	public boolean select(String searchString ) {
		boolean result = false;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();

		//		String sql = "select * from decision where project_list=? or project_name=? or Registration=?";
		String sql = "select * from decision where decision_name like'%" + searchString + "%'";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);

//			ps.setString(1,searchString);
			//			ps.setString(2,searchString);
			//			ps.setString(3,searchString);


			ResultSet rs = ps.executeQuery();


			while(rs.next()) {
				DecisionListDTO dto = new DecisionListDTO();

				dto.setRegistration(rs.getDate("registration"));
				dto.setUser_id(rs.getInt("user_id"));
				dto.setProject_id(rs.getInt("project_id"));
				dto.setDecision_id(rs.getInt("decision_id"));
				dto.setDecision_name(rs.getString("decision_name"));
				dto.setDetail(rs.getString("detail"));
				dto.setI_drafthing_id(rs.getString("i_drafting_id"));
				dto.setI_approval_id(rs.getString("i_approval_id"));
				dto.setCd_id(rs.getString("cd_id"));
				dto.setI_a_d_id(rs.getString("i_a_d_id"));
				dto.setI_a_id(rs.getString("i_a_id"));
				list.add(dto);
				result = true;
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try{
				conn.close();
			}catch (SQLException e){
				e.printStackTrace();
			}
		}

		System.out.println(list.size());
		return result;

	}

	/**
	 * 取得メソッド
	 * @author KENICHI HORIGUCHI
	 * @return list
	 */
	public ArrayList<DecisionListDTO> getList() {
		return list;
	}

	/**
	 * 設定メソッド
	 * @author KENICHI HORIGUCHI
	 * @param list
	 */
	public void setList(ArrayList<DecisionListDTO> list) {
		this.list = list;
	}




}
