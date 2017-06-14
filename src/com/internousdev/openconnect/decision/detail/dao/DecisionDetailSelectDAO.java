/**
 *
 */
package com.internousdev.openconnect.decision.detail.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.decision.detail.dto.DecisionDetailDTO;
import com.internousdev.util.DBConnector;

/**
 * 画面に検索結果を表示する為のクラス
 * @author TATUHUMI ITOU
 * @since 2016/09/04
 * @version 1.0
 */
public class DecisionDetailSelectDAO {

	/**
	 * 実行メソッド DAOに入力されたデータを元に検索を行いその結果をDTOに転送する
	 * @author TATUHUMI ITOU
	 */
	public List<DecisionDetailDTO> selectAnotherD( String searchString, int userIdM1, int userIdS1 ){

		Connection conn = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql").getConnection();

		String sql = "select * from decision inner join projects on decision.project_id = projects.project_id "
				+"where decision_status2 != 2 and ( manager_id != ? and sub_manager_id != ? ) and project_name LIKE '%" + searchString + "%'";

		List<DecisionDetailDTO> decisionDetailList1 = new ArrayList<DecisionDetailDTO>();

		try{

			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setInt(1, userIdM1);
			ps.setInt(2, userIdS1);

			ResultSet rs = ps.executeQuery();





			while( rs.next() ){

				DecisionDetailDTO dto = new DecisionDetailDTO();
				dto.setDecisionId(rs.getInt("decision_id"));
				dto.setProjectId(rs.getInt("project_Id"));
				dto.setDecisionName(rs.getString("decision_name"));
				dto.setProjectName(rs.getString("project_name"));
				dto.setDecisionIdNumber(String.format("%04d", rs.getInt("decision_id")));
				dto.setDecisionType(rs.getString("decision_type"));
				dto.setDecisionStatus1(rs.getInt("decision_status1"));
				dto.setDecisionStatus2(rs.getInt("decision_status2"));

				dto.setManagerId(rs.getInt("manager_id"));
				dto.setSubManagerId(rs.getInt("sub_manager_id"));

				decisionDetailList1.add( dto );
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

		return decisionDetailList1 ;
	}


	/**
	 * 実行メソッド DAOに入力されたデータを元に検索を行いその結果をDTOに転送する
	 * ログインユーザーの自プロジェクトを呼び出す専用
	 * @author TATUHUMI ITOU
	 */
	public List<DecisionDetailDTO> selectMyD( int userIdM2, int userIdS2 ){

		Connection conn = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql").getConnection();

		String sql = "select * from decision inner join projects on decision.project_id = projects.project_id "
				+"where decision_status2 != 2 and ( manager_id = ? or sub_manager_id = ? )";

		List<DecisionDetailDTO> decisionDetailList2  = new ArrayList<DecisionDetailDTO>();


		try{

			PreparedStatement ps = conn.prepareStatement(sql);


			ps.setInt(1, userIdM2);
			ps.setInt(2, userIdS2);

			ResultSet rs = ps.executeQuery();

			if( rs.next() ){

				DecisionDetailDTO dto = new DecisionDetailDTO();
				dto.setDecisionId(rs.getInt("decision_id"));
				dto.setProjectId(rs.getInt("project_Id"));
				dto.setDecisionName(rs.getString("decision_name"));
				dto.setProjectName(rs.getString("project_name"));
				dto.setDecisionIdNumber(String.format("%04d", rs.getInt("decision_id")));
				dto.setDecisionType(rs.getString("decision_type"));
				dto.setDecisionStatus1(rs.getInt("decision_status1"));
				dto.setDecisionStatus2(rs.getInt("decision_status2"));

				dto.setManagerId(rs.getInt("manager_id"));
				dto.setSubManagerId(rs.getInt("sub_manager_id"));

				decisionDetailList2.add( dto );
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

		return decisionDetailList2;
	}



 	public List<DecisionDetailDTO> selectP(int userIdM3, int userIdS3){
		Connection conn = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql").getConnection();

		String sql = "select project_id, project_name, manager_id, sub_manager_id from projects where ( manager_id = ? or sub_manager_id = ? )";

		List<DecisionDetailDTO> decisionBeginList = new ArrayList<DecisionDetailDTO>();

		try{

			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setInt(1, userIdM3);
			ps.setInt(2, userIdS3);

			ResultSet rs = ps.executeQuery();

			while( rs.next() ){

				DecisionDetailDTO dto = new DecisionDetailDTO();

				dto.setProjectId(rs.getInt("project_id"));
				dto.setProjectName(rs.getString("project_name"));
				dto.setManagerId(rs.getInt("manager_id"));
				dto.setSubManagerId(rs.getInt("sub_manager_id"));

				decisionBeginList.add( dto );
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

		return decisionBeginList ;
	}




 	public List<DecisionDetailDTO> select( int decisionId ){
		Connection conn = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql").getConnection();

		String sql = "select decision.day, decision.summary, projects.project_name , "
				+"projects.manager_id, projects.project_id from decision "
				+"inner join projects on decision.project_id = projects.project_id where decision_id LIKE '%" + decisionId + "%'";

		List<DecisionDetailDTO> decisionDetailInsList  = new ArrayList<DecisionDetailDTO>();

		try{

			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while( rs.next() ){

				DecisionDetailDTO dto = new DecisionDetailDTO();
				dto.setDay(rs.getString("day"));
				dto.setUserId(rs.getInt("manager_id"));
				dto.setProjectId(rs.getInt("project_id"));
				dto.setProjectName(rs.getString("project_name"));
				dto.setSummary(rs.getString("summary"));

				decisionDetailInsList .add( dto );
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

		return decisionDetailInsList ;
	}


}
