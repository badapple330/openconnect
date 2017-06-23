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
 * @author TATUHUMI ITOU, SOSHI AZUMA
 * @since 2016/09/04
 * @version 1.0
 */
public class DecisionDetailSelectDAO {

	/**
	 * 実行メソッド DAOに入力されたデータを元に検索を行いその結果をDTOに転送する
	 * 自プロジェクト以外を呼び出す専用
	 * @author TATUHUMI ITOU, SOSHI AZUMA
	 */
	public List<DecisionDetailDTO> selectAnotherD( String searchString, int userId, int userId1 ){

		Connection con = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql").getConnection();

		String sql = "select * from decision inner join projects on decision.project_id = projects.project_id "
				+"where decision_status2 != 4 and ( manager_id != ? and sub_manager_id != ? ) and project_name LIKE '%" + searchString + "%'";

		List<DecisionDetailDTO> decisionDetailList1 = new ArrayList<DecisionDetailDTO>();

		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, userId);
			ps.setInt(2, userId1);

			ResultSet rs = ps.executeQuery();

			while( rs.next() ){
				DecisionDetailDTO dto = new DecisionDetailDTO();
				dto.setDecisionId(rs.getInt("decision_id"));
				dto.setProjectId(rs.getInt("project_Id"));
				dto.setProjectName(rs.getString("project_name"));
				dto.setDecisionType(rs.getString("decision_type"));
				dto.setDecisionStatus1(rs.getInt("decision_status1"));
				dto.setDecisionStatus2(rs.getInt("decision_status2"));

				dto.setManagerId(rs.getInt("manager_id"));
				dto.setSubManagerId(rs.getInt("sub_manager_id"));
				dto.setPermitStatus(rs.getInt("permit_status"));
				dto.setjPermiterId1(rs.getInt("j_permiter_id1"));
				dto.setjPermiterId2(rs.getInt("j_permiter_id2"));
				dto.setjPermiterId3(rs.getInt("j_permiter_id3"));
				dto.setkPermiterId1(rs.getInt("k_permiter_id1"));
				dto.setkPermiterId2(rs.getInt("k_permiter_id2"));
				dto.setkPermiterId3(rs.getInt("k_permiter_id3"));

				decisionDetailList1.add( dto );
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch (SQLException e){
				e.printStackTrace();
			}
		}

		return decisionDetailList1 ;
	}


	/**
	 * 実行メソッド DAOに入力されたデータを元に検索を行いその結果をDTOに転送する
	 * ログインユーザーの自プロジェクトを呼び出す専用
	 * @author TATUHUMI ITOU, SOSHI AZUMA
	 */
	public List<DecisionDetailDTO> selectMyD( int userId, int userId1 ){

		Connection con = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql").getConnection();

		String sql = "select * from decision inner join projects on decision.project_id = projects.project_id "
				+"where decision_status2 != 4 and ( manager_id = ? or sub_manager_id = ? )";

		List<DecisionDetailDTO> decisionDetailList2  = new ArrayList<DecisionDetailDTO>();


		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, userId);
			ps.setInt(2, userId1);

			ResultSet rs = ps.executeQuery();

			while( rs.next() ){
				DecisionDetailDTO dto = new DecisionDetailDTO();
				dto.setDecisionId(rs.getInt("decision_id"));
				dto.setProjectId(rs.getInt("project_Id"));
				dto.setProjectName(rs.getString("project_name"));
				dto.setDecisionType(rs.getString("decision_type"));
				dto.setDecisionStatus1(rs.getInt("decision_status1"));
				dto.setDecisionStatus2(rs.getInt("decision_status2"));

				dto.setManagerId(rs.getInt("manager_id"));
				dto.setSubManagerId(rs.getInt("sub_manager_id"));
				dto.setjImpId(rs.getString("j_imp_id"));
				dto.setkImpId(rs.getString("k_imp_id"));
				dto.setJkImpId(rs.getString("jk_imp_id"));

				decisionDetailList2.add( dto );
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch (SQLException e){
				e.printStackTrace();
			}
		}

		return decisionDetailList2;
	}


	/**
	 * 実行メソッド DAOに入力されたデータを元に検索を行いその結果をDTOに転送する
	 * ログインユーザーの決裁未作成の自プロジェクトを呼び出す専用
	 * @author SOSHI AZUMA
	 */
 	public List<DecisionDetailDTO> selectP(int userId, int userId1){
		Connection con = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql").getConnection();

		String sql = "select * from projects left outer join decision on projects.project_id = decision.project_id "
				+"where decision_id is null and ( manager_id = ? or sub_manager_id = ? )";

		List<DecisionDetailDTO> decisionBeginList = new ArrayList<DecisionDetailDTO>();

		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, userId);
			ps.setInt(2, userId1);

			ResultSet rs = ps.executeQuery();

			while( rs.next() ){
				DecisionDetailDTO dto = new DecisionDetailDTO();

				dto.setProjectId(rs.getInt("project_id"));
				dto.setProjectName(rs.getString("project_name"));
				dto.setManagerId(rs.getInt("manager_id"));
				dto.setSubManagerId(rs.getInt("sub_manager_id"));
				dto.setDecisionId(rs.getInt("decision_id"));


				decisionBeginList.add( dto );
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch (SQLException e){
				e.printStackTrace();
			}
		}

		return decisionBeginList ;
	}


 /*public DecisionDetailDTO selectUserId( int sessionUserId ){

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");

		Connection con = db.getConnection();

		DecisionDetailDTO dto = new DecisionDetailDTO();

		String sql ="select user_id from users where user_id = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, sessionUserId);

			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				dto.setUserId(rs.getInt("user_id"));
			}

		}catch (SQLException e) {
			e.printStackTrace();
		}try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}return dto;
		}
*/


}
