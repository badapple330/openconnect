package com.internousdev.openconnect.action.decision_list.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.openconnect.action.decision_list.dto.DecisionListDTO;
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
	public boolean select(String searchString ) throws SQLException {
		//「searchString」←これは自由に決めて良い(わかり易い名前にする)。
		boolean result = false;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection conn = db.getConnection();
		//上記はお決まり文
//		String sql = "select * from decision where project_list=? or project_name=? or Registration=?";
		String sql = "select * from decision where project_list=?";
		//String sql = "select * from 何を？";//全て表示
		try {
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1,searchString);
//			ps.setString(2,searchString);
//			ps.setString(3,searchString);

			//ここでいう1｢project_list｣にあたる。2は｢project_name｣にあたる。3は｢Registration｣にあたる。
			ResultSet rs = ps.executeQuery();
			//上記もお決まり文

            while(rs.next()) {
            	//括弧内はお決まり文。「終わるまで」という意味
            	DecisionListDTO dto = new DecisionListDTO();
            	//DTOに覚えてもらうためのセットする文
            	dto.setRegistration(rs.getDate("Registration"));
            	dto.setProject_list(rs.getString("project_list"));
            	dto.setUser(rs.getString("user"));
            	dto.setProject_id(rs.getInt("project_id"));
            	dto.setProject_name(rs.getString("project_name"));
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

	public ArrayList<DecisionListDTO> getList() {
		return list;
	}

	public void setList(ArrayList<DecisionListDTO> list) {
		this.list = list;
	}

	public ArrayList<DecisionListDTO> getProjectlistSelect() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}






}
