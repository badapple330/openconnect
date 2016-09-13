/**
 *
 */
package com.internousdev.openconnect.decision.update.dao;

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
public class DecisionDetailUpdateDAO {

	List<DecisionDetailDTO> decisionDetailList  = new ArrayList<DecisionDetailDTO>();
	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 * @author TATUHUMI ITOU
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public List<DecisionDetailDTO> select( int decisionDetailId ){
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection con = db.getConnection();

		try{
			String sql = "select*from decision_detail inner join projects on decision_detail.project_id = projects.project_id where decision_detail_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,decisionDetailId);
			ResultSet rs = ps.executeQuery();
			while( rs.next() ){

				DecisionDetailDTO dto = new DecisionDetailDTO();
				 dto.setDecisionDetailId(rs.getInt("decision_detail_id"));
					dto.setProjectName(rs.getString("project_name"));
					dto.setDecisionId(rs.getInt("decision_id"));
					dto.setDecisionType(rs.getString("decision_type"));
					dto.setDecisionStatus(rs.getString("decision_status"));
					dto.setProjectId(rs.getInt("project_id"));
					dto.setDay(rs.getString("day"));
					dto.setUserId(rs.getInt("user_id"));
					dto.setItemName(rs.getString("item_name"));
					dto.setSummary(rs.getString("summary"));
					dto.setCause(rs.getString("cause"));
					dto.setStartDay(rs.getString("start_day"));
					dto.setEndDay(rs.getString("end_day"));
					dto.setPlan(rs.getString("plan"));
					dto.setPersons(rs.getInt("persons"));
					dto.setPassword(rs.getString("password"));
				decisionDetailList .add( dto );
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

		return decisionDetailList ;
	}

}
